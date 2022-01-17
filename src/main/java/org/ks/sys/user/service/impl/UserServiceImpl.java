package org.ks.sys.user.service.impl;

import com.alibaba.fastjson.JSON;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.cache.service.RedisService;
import org.ks.sys.po.TblMenuExample;
import org.ks.sys.po.TblOrg;
import org.ks.sys.po.TblUser;
import org.ks.sys.po.TblUserExample;
import org.ks.sys.user.pojo.UserBean;
import org.ks.sys.vo.MenuVo;
import org.ks.sys.vo.UserVo;
import org.ks.system.UserInfo;
import org.ks.util.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import org.ks.sys.authmenu.service.AuthMenuService;
import org.ks.sys.mapper.TblMenuMapper;
import org.ks.sys.mapper.TblUserMapper;

import org.ks.sys.user.mapper.UserMapper;
import org.ks.sys.user.pojo.User;
import org.ks.sys.user.service.UserService;
import org.ks.sys.user.util.Md5Utils;
import org.ks.sys.user.vo.ConditionalQuery;
import org.ks.sys.user.vo.UserVoFlag;
import org.ks.sys.user.vo.UserVoUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@Service
public class UserServiceImpl implements UserService{

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private  TblUserMapper tblUserMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisService redisService;
    @Autowired
    private TblMenuMapper tblMenuMapper;
    @Autowired
    private AuthMenuService authMenuService;
    @Autowired
    private UserInfo userInfo;

    /**
     * 根据id查询用户名
     * @param id
     * @return
     */
    @Override
    public UserBean queryUser(String id) {
        UserBean userBean = new UserBean();
        try {
            TblUser tblUser = tblUserMapper.selectByPrimaryKey(Long.valueOf(id));
            BeanUtils.copyProperties(tblUser,userBean);
        } catch (Exception e) {
            log.error("查询用户异常", e);
            userBean.setName(id);
        }
        return userBean;
    }

    /**
     * 根据id查询用户名
     * @param acct
     * @param pwd
     * @return
     */
    @Override
    public UserBean queryUser(String acct, String pwd) {
        TblUserExample tblUserExample = new TblUserExample();
        tblUserExample.createCriteria().andAcctEqualTo(acct).andPwdEqualTo(pwd).andUseFlagEqualTo(Constant.INT_YES);
        tblUserExample.setOrderByClause("update_time desc");
        List<TblUser> tblUsers = tblUserMapper.selectByExample(tblUserExample);
        if (CollectionUtils.isEmpty(tblUsers)) {
            return null;
        } else {
            UserBean userBean = new UserBean();
            BeanUtils.copyProperties(tblUsers.get(0), userBean);
            return userBean;
        }
    }

    /**
     * 插入User 数据
     * @param record
     * @return
     * @throws Exception
     */
    @Override
    public ResultInfo insertSelective(TblUser record) throws Exception  {

        UserVoUser voUser = new UserVoUser();
        voUser.setAcct(record.getAcct());

        List<UserVoUser> userVoUser = userMapper.ckUser(voUser);


        ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.OK,"成功");
        if(userVoUser.size() == 0 ){

//            record.setUserId(SeqUtil.getNextId());

            String acct = record.getAcct();
            String pwd = record.getPwd();

            String md5 = Md5Utils.getSaltMd5(pwd);
            record.setPwd(md5);
            record.setUseFlag(1);
            record.setCreateAcct(userInfo.getUserId());
            LocalDateTime now = LocalDateTime.now();
            record.setCreateTime(LocalDateTimeUtil.getDate(now));
            int count = tblUserMapper.insertSelective(record);
            resultInfo = new ResultInfo(StatusCodeEnum.OK, "成功");
            resultInfo.setData(count);


        }else {
            resultInfo = new ResultInfo(StatusCodeEnum.OK,"成功");
            resultInfo.setData("chongfu");
        }
        return resultInfo;
    }
    /**
     * 查询用户集合
     */
    @Override
    public List<User> selectUser(ConditionalQuery conditionalQuery) {
        return userMapper.selectUser(conditionalQuery);
    }

    /**
     * 根据Id查询对象
     * @param userId
     * @return
     */
    @Override
    public TblUser selectByPrimaryKey(Long userId) {

        TblUser tblUser = tblUserMapper.selectByPrimaryKey(userId);

        return tblUser;
    }

    /**
     *修改用户
     * @param record
     * @return
     */
    @Override
    public ResultInfo updateByPrimaryKeySelective(TblUser record) {

        ResultInfo re = null;
        try {
            UserVoUser voUser = new UserVoUser();
            voUser.setAcct(record.getAcct());
            Long qid = record.getUserId();

            re = new ResultInfo(StatusCodeEnum.OK,"成功");

            List<UserVoUser> userVoUser = userMapper.ckUser(voUser);
            Long id=null;
            if(userVoUser.size()  ==0){
                re.setData(tblUserMapper.updateByPrimaryKeySelective(record));

            }else{
                id = userVoUser.get(0).getUserId();
                if(qid.equals(id)){
                    re.setData(tblUserMapper.updateByPrimaryKeySelective(record));
                }else {
                    re.setData("chongfu");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return re;
    }

    /**
     * 查询所有数据供user使用-->
     */
    @Override
    public List<TblOrg> selectOrg() {

        List<TblOrg> tblOrgList = userMapper.selectOrg();

        return tblOrgList;
    }




    /**
     * 根据用户名和密码 验证是否登陆
     *
     * @param username 用户名
     * @param  password 用户密码
     */
    @Override
    public ResultInfo<UserVo> loginByUserNameAndPwd(String username, String  password) throws Exception{


        boolean paramIsNull = StringUtil.isNull(username) || StringUtil.isNull( password);

        if (paramIsNull) {
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.UNPROCESSABLE_ENTITY,
                "用户名密码不能为空");
            return resultInfo;
        }

        TblUser tblUser = getUserPoByUserName(username);


        if (tblUser == null) {

            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.NOT_FOUND, "查询不到此用户");
            return resultInfo;
        }
        boolean verify = Md5Utils.verify(password, tblUser.getPwd());
        System.out.println(verify);
        if (verify) {
            ResultInfo<UserVo> resultInfo = new ResultInfo<UserVo>(StatusCodeEnum.OK);
            //此处省略 vo对象的赋值 原因位 vo对象可能存在多个对象的拼接 暂时省略
            UserVo userVo = new UserVo();
            userVo.setAcct(tblUser.getAcct());
            userVo.setRealUserName(tblUser.getRealName());
            userVo.setUserName(tblUser.getName());
            userVo.setUserId(tblUser.getOrgId());
            resultInfo.setData(userVo);
            //增加token
            Long expire = 2 * 60 * 60L * 1000L;
            JwtModel jwtModel = new JwtModel();
            jwtModel.setUserId(tblUser.getUserId());
            jwtModel.setAcct(tblUser.getAcct());
            jwtModel.setAutoRefresh(Constant.INT_YES);
            try {
                String token = JwtUtil.createJWT(SeqUtil.getNextId().toString(), jwtModel.getUserId()+"", JSON.toJSONString(jwtModel), expire);
                //log.info("token===>"+token);
                userVo.setToken(token);
                redisService.setString(token, JSON.toJSONString(jwtModel));
                redisService.expire(token, expire, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                log.error("token生成异常", e);
            }
            return resultInfo;
        }else {
            return null;
        }
    }

    /**
     * 根据用户名查询用户对象
     */
    @Override
    public TblUser getUserPoByUserName(String userName) {
        boolean userNameNull = StringUtil.isNull(userName);
        if (userNameNull) {
            return null;
        }
        TblUserExample tblUserExample = new TblUserExample();
        TblUserExample.Criteria criteria = tblUserExample.createCriteria();
        criteria.andAcctEqualTo(userName);
        List<TblUser> tblUsers = tblUserMapper.selectByExample(tblUserExample);
        if (CollectionUtils.isEmpty(tblUsers)) {

            return null;
        }
        return tblUsers.get(0);
    }

    /**
     * 查询用户集合
     */
    @Override
    public List<TblUser> userList() {
        return tblUserMapper.selectByExample(new TblUserExample());
    }

    /**
     * 查询用户集合
     */
    @Override
    public ResultInfo<List<TblUser>> queryUserList() {
        List<TblUser> tblUsers = userList();
        log.info(tblUsers.toString());
        if (CollectionUtils.isEmpty(tblUsers)) {
            log.info("用户列表为空");
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.NOT_FOUND,
                "用户列表为空");
            return resultInfo;
        }

        ResultInfo<List<TblUser>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询用户列表成功");
        resultInfo.setTotal(100L);
        resultInfo.setData(tblUsers);
        return resultInfo;
    }

    @Override
    public List<MenuVo> selectOrgVo() {

        return  userMapper.selectOrgVo();
    }

    @Override
    public ResultInfo<List<User>> selectUserNull() {
        List<User> users = userMapper.selectUserNull();

        if (users == null) {
            return new ResultInfo(StatusCodeEnum.OK,"查无此人");
        }

        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"success");
        re.setData(users);
        return re;
    }

    /**
     * 空机构添加
     * @param
     * @return
     */
    @Override
    public ResultInfo updataUserOrg(List<Map<String,Object>> list) {
        ResultInfo re = null;
        int i = 0;
        try {
            re = new ResultInfo(StatusCodeEnum.OK,"success");
            i = userMapper.updataUserOrg(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        re.setData(i);

        return re;
    }

    @Override
    public ResultInfo updatePasswordByAcct(String acct,String password) {
        TblUser user = new TblUser();
        user.setAcct(acct);
        TblUserExample example = new TblUserExample();
        TblUserExample.Criteria criteria = example.createCriteria();
        criteria.andAcctEqualTo(acct);
        List<TblUser> tblUsers = tblUserMapper.selectByExample(example);
        if (tblUsers.isEmpty()){
            return new ResultInfo(StatusCodeEnum.OK,"输入的账号有误,请重新输入");
        }
        try {
            String md5Pwd = Md5Utils.getSaltMd5(password);
            user.setPwd(md5Pwd);
        } catch (Exception e) {
            log.info("账户或者密码为空");
            e.printStackTrace();
        }
        int i = tblUserMapper.updateByExampleSelective(user, example);
        if (i == 0) {
            return new ResultInfo(StatusCodeEnum.OK, "更新密码失败");
        }
        return new ResultInfo(StatusCodeEnum.OK, "更新密码成功");
    }

    /**
     * 禁用修改
     * @param userVoFlag
     * @return
     */
    @Override
    public ResultInfo upFlag(UserVoFlag userVoFlag) {
        userVoFlag.setUpdateAcct(userInfo.getUserId());
        userVoFlag.setUpdateTime(new Date());
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        re.setData(userMapper.upFlag(userVoFlag));
        return re;
    }

    /**
     * 根据token 获取用户信息
     */
    @Override
    public ResultInfo<UserVo> userInfoBytoken(String token) throws Exception {
        String jwtModal = redisService.getString(token);
        UserVo userVo = JSON.parseObject(jwtModal,UserVo.class);
        TblMenuExample tblMenuExample = new TblMenuExample();
        TblMenuExample.Criteria criteria = tblMenuExample.createCriteria();
        criteria.andMenuIdEqualTo(userVo.getUserId());
        ResultInfo<List<MenuVo>> list = authMenuService.selectIndexMenu(userVo.getUserId());
        userVo.setMenus(list.getData());
        log.info("获取到的菜单:{}",list.getData());
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        re.setData(userVo);
        return re;
    }

}
