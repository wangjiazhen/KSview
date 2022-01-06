package org.ks.sys.roleauth.service;

import org.ks.sys.authmenu.dto.InfoDto;
import org.ks.sys.vo.AuthVo;
import org.ks.sys.vo.AuthVoTo;
import org.ks.util.ResultInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangsong
 */
@Service
public interface RoleAuthService {
    /**
     * 获取所有权限
     *      根据角色Id判断
     *          有这个权限check属性为true
     *          没有则为false
     *
     * @param roleId 角色id
     * @return
     */
    ResultInfo<List<AuthVo>> selectAuthByRoleId(long roleId);

    /**
     *  给角色添加权限
     * @param roleId 角色id
     * @param arr 所要添加的权限
     * @return
     */
    ResultInfo<Integer> insertAuthByRoleId(long roleId,String arr);


    /**
     * 查询所有权限 zTree需要的类型
     * @param infoName
     * @return
     */
    ResultInfo<List<AuthVoTo>> selectAllAuth(InfoDto infoName);

}
