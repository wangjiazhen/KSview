package org.ks.sys.user.service;

import org.ks.sys.user.pojo.UserBean;
import org.ks.sys.vo.MenuVo;
import org.ks.sys.vo.UserVo;

import org.ks.sys.po.TblOrg;
import org.ks.sys.po.TblUser;
import org.ks.sys.user.pojo.User;
import org.ks.sys.user.vo.ConditionalQuery;
import org.ks.sys.user.vo.UserVoFlag;
import org.ks.util.ResultInfo;

import java.util.List;
import java.util.Map;

public interface UserService {

    /**
     * 根据id查询用户名
     * @param id
     * @return
     */
    UserBean queryUser(String id);

    /**
     * 根据id查询用户名
     * @param acct 账号
     * @param pwd 秘钥
     * @return
     */
    UserBean queryUser(String acct,String pwd);

    /**
     * 添加用户
     * @param record
     * @return
     * @throws Exception
     */

    ResultInfo insertSelective(TblUser record) throws Exception;

    /**
     * 查询用户集合
     * @param conditionalQuery
     * @return
     */
    List<User> selectUser(ConditionalQuery conditionalQuery);

    /**
     * 根据ID查询对象
     * @param userId
     * @return
     */
    TblUser selectByPrimaryKey(Long userId);


    /**
     * 修改用户
     * @param record
     * @return
     */
    ResultInfo updateByPrimaryKeySelective(TblUser record);

    /**
     * 查询Org 所有数据到 user 添加页面
     * @return
     */
    List<TblOrg> selectOrg();


    /**
     * 根据用户名和密码 验证是否登陆
     * @param userName
     * @param pwd
     * @return
     * @throws Exception
     */
    ResultInfo<UserVo> loginByUserNameAndPwd(String userName, String pwd) throws Exception;


    /**
     * 根据用户名查询用户对象
     * @param userName
     * @return
     */
    TblUser getUserPoByUserName(String userName);


    /**
     * 查询用户集合
     * @return
     */
    List<TblUser> userList();


    /**
     * 查询用户集合
     * @return
     */
    ResultInfo<List<TblUser>> queryUserList();

    /**
     * 查询机构
     * @return
     */
    List<MenuVo> selectOrgVo();

    /**
     * 查询为空的user
     * @return
     */
    ResultInfo<List<User>> selectUserNull();

    /**
     * 修改用户为空的机构数据
     * @param list
     * @return
     */
    ResultInfo updataUserOrg(List<Map<String,Object>> list);

    /**
     * 管理员根据用户账号强制更新密码
     * @param acct
     * @param password
     * @return
     */
    ResultInfo updatePasswordByAcct(String acct,String password);

    /**
     * 禁用修改
     * @param userVoFlag
     * @return
     */
    ResultInfo upFlag(UserVoFlag userVoFlag);

    /**根据token 获取用户信息
     *
     * @param token
     * @return
     * @throws Exception
     */
    ResultInfo<UserVo> userInfoBytoken(String token) throws Exception;
}
