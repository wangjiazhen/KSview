package org.ks.sys.role.ctrl;

import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.ks.sys.po.TblRole;
import org.ks.sys.role.dto.RoleAddAndUpdateDto;
import org.ks.sys.role.service.RoleService;

import java.util.List;

/**
 * @author : mu
 * <p>
 * create at:  2020-04-21  8:00
 * <p>
 * description: 角色Ctrl
 */
@RequestMapping("/roleCtrl")
@RestController
public class RoleCtrl {

    private static final Logger log = LoggerFactory.getLogger(RoleCtrl.class);
    @Autowired
    private RoleService roleService;


    /**
     * 查询角色列表
     *
     * @param roleName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    @RequestMapping("/queryRoleList")
    public ResultInfo<List<TblRole>> queryRoleList(String roleName, String createAcct, String updateAcct) {
        ResultInfo<List<TblRole>> listResultInfo = roleService.queryRoleList(roleName, createAcct, updateAcct);
        log.info("查询角色数据:{}", listResultInfo.toString());
        return listResultInfo;

    }

    /**
     * 添加角色
     *
     * @param roleAddAndUpdateDto
     * @return resultInfo
     */
    @RequestMapping("/insertRole")
    public ResultInfo insertRole(RoleAddAndUpdateDto roleAddAndUpdateDto) {
        ResultInfo resultInfo = roleService.insertRole(roleAddAndUpdateDto);
        return resultInfo;
    }

    /**
     * 根据角色id查询角色
     *
     * @param roleId
     * @return
     */
    @RequestMapping("/selectRoleById")
    public ResultInfo selectRoleById(String roleId) {
        Long longRoleId = Long.valueOf(roleId);
        ResultInfo resultInfo = roleService.selectRoleById(longRoleId);
        return resultInfo;

    }

    /**
     * 更新角色
     *
     * @param roleAddAndUpdateDto
     * @return
     */

    @RequestMapping("/updateRole")
    public ResultInfo updateRoleSelective(RoleAddAndUpdateDto roleAddAndUpdateDto) {

        return roleService.updateRoleSelective(roleAddAndUpdateDto);
    }

    /**
     * 更新权限状态
     *
     * @param roleId
     * @param useFlag
     * @return
     */

    @RequestMapping("/updateUseFlagOfRole")
    public ResultInfo updateUseFlagOfRole(@RequestParam("roleId") Long roleId, @RequestParam("useFlag") Integer useFlag) {
        log.info("要更新的角色的ID是" + roleId + "," + "更新前角色的状态是" + useFlag);
        return roleService.updateUseFlagOfRole(roleId, useFlag);
    }

}
