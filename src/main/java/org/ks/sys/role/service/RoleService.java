package org.ks.sys.role.service;

import java.util.List;

import org.ks.sys.po.TblRoleAuthRel;
import org.ks.sys.role.dto.RoleAddAndUpdateDto;
import org.ks.util.ResultInfo;
import org.springframework.stereotype.Service;

import org.ks.sys.po.TblRole;

/**
 * @author : Aaron
 * <p>
 * create at:  2020-04-15  20:27
 * <p>
 * description: 角色
 */
@Service
public interface RoleService {

    /**
     * 根据用户id查询角色结合
     *
     * @param userId
     * @return
     */
    List<TblRoleAuthRel> queryRoleByUserId(long userId);


    /**
     * 模糊查询角色列表
     *
     * @param roleName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    List<TblRole> roleList(String roleName, String createAcct, String updateAcct);


    /**
     * 查询角色列表
     *
     * @param roleName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    ResultInfo<List<TblRole>> queryRoleList(String roleName, String createAcct, String updateAcct);

    /**
     * 添加角色
     *
     * @param roleAddAndUpdateDto
     * @return ResultInfo
     */
    ResultInfo insertRole(RoleAddAndUpdateDto roleAddAndUpdateDto);

    /**
     * 根据id查询角色
     *
     * @param roleId
     * @return ResultInfo
     */

    ResultInfo selectRoleById(Long roleId);

    /**
     * 更新
     *
     * @param roleAddAndUpdateDto
     * @return ResultInfo
     */

    ResultInfo updateRoleSelective(RoleAddAndUpdateDto roleAddAndUpdateDto);

    /**
     * 更新或者添加时根据角色名称和角色代码查询角色
     *
     * @param roleAddAndUpdateDto
     * @return
     */
    ResultInfo selectRoleByNameAndCode(RoleAddAndUpdateDto roleAddAndUpdateDto);

    /**
     * 更新角色状态
     *
     * @param roleId
     * @param useFlag
     * @return
     */
    ResultInfo updateUseFlagOfRole(Long roleId, Integer useFlag);
}
