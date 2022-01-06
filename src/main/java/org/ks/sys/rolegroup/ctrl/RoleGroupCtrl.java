package org.ks.sys.rolegroup.ctrl;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.ks.sys.rolegroup.service.RoleGroupService;
import org.ks.sys.vo.GroupVo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色用户组Ctrl
 *
 * @author mulishuai
 */

@RestController
@RequestMapping("/roleGroupCtrl")
public class RoleGroupCtrl {
    private static final Logger log = LoggerFactory.getLogger(RoleGroupCtrl.class);
    @Autowired
    RoleGroupService roleGroupService;

    /**
     * 查询出所有的group列表 并且使roleId已有的权限处于被选中的状态
     *
     * @param roleId
     * @return
     */
    @RequestMapping("/selectGroup")
    public ResultInfo<List<GroupVo>> selectGroup(Long roleId) {
        ResultInfo<List<GroupVo>> listResultInfo = roleGroupService.selectGroupsByRoleId(roleId);
        log.info(listResultInfo.toString());
        return listResultInfo;
    }

    /**
     * 根据用户id和用户组的id在角色和用户组的关系表中添加数据
     *
     * @param roleId
     * @param args
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping("/updateRoleGroup")
    public ResultInfo updateGroupOfRole(Long roleId, @RequestParam("args") String args) throws JsonProcessingException {
        roleGroupService.delectGroupOfRole(roleId);
        ResultInfo listResultInfo = roleGroupService.insertGroupToRole(roleId, args);
        log.info(listResultInfo.toString());
        return listResultInfo;
    }

}
