package org.ks.sys.user.ctrl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.ks.enums.StatusCodeEnum;
import org.ks.sys.user.pojo.UserBean;
import org.ks.sys.user.service.UserService;
import org.ks.sys.user.service.impl.UserServiceImpl;
import org.ks.sys.vo.MenuVo;
import org.ks.sys.vo.UserVo;
import org.ks.system.UserInfo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.ks.sys.po.TblOrg;
import org.ks.sys.po.TblUser;
import org.ks.sys.user.pojo.User;
import org.ks.sys.user.vo.ConditionalQuery;
import org.ks.sys.user.vo.UserVoFlag;
import org.ks.sys.user.vo.UserVoUser;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @author : Aaron
 *
 * create at:
 *
 * description: 用户控制类
 */



@RestController
@RequestMapping("/user")
@Api(tags = "APP接口")
public class UserCtrl {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserService userService;
    @Autowired
    private UserInfo userInfo;


    @GetMapping("/queryUserByAcctAndPwd")
    public UserBean queryUser(@RequestParam("acct") String acct, @RequestParam("pwd") String pwd){
        return userService.queryUser(acct, pwd);
    }

    /**
     * 根据id查询用户姓名
     * @param id
     * @return
     */
    @GetMapping("/queryUser")
    public UserBean queryUser(String id){
        return userService.queryUser(id);
    }

    /**
     * 添加用户
     * @param
     * @return
     */
    @RequestMapping("/userInsert")
    public ResultInfo userInsert(UserVoUser userVo) throws Exception{

        TblUser t = new TblUser();
        BeanUtils.copyProperties(userVo,t);


        return userService.insertSelective(t);
    }

    /**
     * 查询用户
     * @param conditionalQuery
     * @return
     */
    @RequestMapping("/userlist")
    public ResultInfo userShow(ConditionalQuery conditionalQuery){
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        List<User> tblUsers = userService.selectUser(conditionalQuery);
        re.setData(tblUsers);
        re.setTotal((long) tblUsers.size());

        return re;
    }

    /**
     * 根据ID 查询对象
     */
    @RequestMapping("/selectUserById")
    public ResultInfo userShowId(Long userId){
        System.out.println(userId);
        TblUser tblUser = userService.selectByPrimaryKey(userId);
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        re.setData(tblUser);

        return re;
    }

    /**
     * 修改
     * @return
     */
    @RequestMapping("/userupdate")
    public ResultInfo userUpdate(UserVoUser userVo){

        TblUser t = new TblUser();
        BeanUtils.copyProperties(userVo,t);

        return userService.updateByPrimaryKeySelective(t);
    }
    /**
     * 查询所有数据供user使用-->
     */
    @RequestMapping("/UserAndOrd")
    public ResultInfo userAndOrd(){
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"成功");
        List<TblOrg> tblOrgList = userService.selectOrg();
        re.setData(tblOrgList);
        return re;
    }



    @Autowired
    HttpServletRequest request;
    @RequestMapping("/loginByUserNameAndPwd")
    @ApiOperation(value = "用户名密码登陆",produces = MediaType.APPLICATION_JSON_VALUE,httpMethod = "POST")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType="query",name="username",dataType="String",required=true,value="用户名"),
        @ApiImplicitParam(paramType="query",name="password",dataType="String",required=true,value="用户密码",defaultValue = ""),
        @ApiImplicitParam(paramType="header",name="token",dataType="String",required=false,value="演示token",defaultValue = "")
    })
    public ResultInfo<UserVo> loginByUserNameAndPwd(String username, String password) throws Exception{

        log.error("传入的用户名：{},用户密码:{}",username,password);


        return userService.loginByUserNameAndPwd(username,password);
    }

    @RequestMapping("/queryUserList")
    public ResultInfo<List<TblUser>> queryUserList(){
        log.info("header:{}",request.getHeader("pageNum"));
        log.info("header:{}",request.getHeader("pageSize"));
        log.info("header:{}",request.getHeader("isPage"));

        return userService.queryUserList();
    }

    /**
     *  ztree 回显数据的方法
     * @return
     */
    @RequestMapping("/selMenuVo")
    public ResultInfo<MenuVo[]> selMenuVo(){
        ResultInfo re = new ResultInfo(StatusCodeEnum.OK,"chenggong");
        List<MenuVo> menuVos = userService.selectOrgVo();

        re.setData(menuVos.toArray());
        return re;
    }

    /**
     * 查询没有机构的用户
     * @return
     */
    @RequestMapping("/selectUserNull")
    public ResultInfo selectUserNull(){
        return userService.selectUserNull();
    }

    /**
     * 修改没有用户的机构
     * @param
     * @return
     */
    @RequestMapping("/updataUserOrg")
    public ResultInfo updataUserOrg(String args){

        List lists=JSONObject.parseArray(args,String.class);
        Map mapTypes = new HashMap(1);


        for (int i = 0; i <lists.size() ; i++) {
            if (i == lists.size()-1){
                mapTypes = JSON.parseObject((String) lists.get(i));
            }
        }

        List s = new ArrayList();
        s.add(mapTypes);

//        for (Object obj : mapTypes.keySet()){
//            System.out.println("key为："+obj+"值为："+mapTypes.get(obj));
//
//        }
        return userService.updataUserOrg(s);
    }
    @RequestMapping("/updatepassword")
    public ResultInfo updataUserOrg(String acct,String password ) {

        return userService.updatePasswordByAcct(acct,password);
    }

    /**
     * 禁用修改
     * @param userId
     * @param useFlag
     * @return
     */
    @RequestMapping("/userupflag")
    public ResultInfo upflag(Long userId,int useFlag){

        UserVoFlag o = new UserVoFlag();
        o.setUserId(userId);
        o.setUseFlag(useFlag);

        return userService.upFlag(o);
    }

    @RequestMapping("/userInfoBYToken")
    public ResultInfo userInfoBYToken(String token) throws Exception{
        log.error("传入的token：{},用户密码:{}",token);
        log.error("传入的userInfo：{},用户密码:{}",userInfo.getUserId());

        return userService.userInfoBytoken(token);

    }
}

