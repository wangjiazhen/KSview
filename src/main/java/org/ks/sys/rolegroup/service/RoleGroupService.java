package org.ks.sys.rolegroup.service;

import org.ks.sys.vo.GroupVo;
import org.ks.util.ResultInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mulishuai
 */
@Service
public interface RoleGroupService {

    /**
     * 根据roleId查询所有的用户组
     *
     * @param roleId
     * @return ResultInfo<List                                                                                                                               <                                                                                                                               GroupVo>>
     */

    ResultInfo<List<GroupVo>> selectGroupsByRoleId(Long roleId);

    /**
     * 根据角色id删除所有的用户组
     *
     * @param roleId
     * @return
     */

    ResultInfo<List<GroupVo>> delectGroupOfRole(Long roleId);

    /**
     * 根据角色Id添加用户组
     *
     * @param roleId
     * @param args 前台传入多个用户组
     * @return
     */

    ResultInfo<Object> insertGroupToRole(Long roleId, String args);
}
