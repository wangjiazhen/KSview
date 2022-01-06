package org.ks.sys.roleauth.ctrl;



import com.fasterxml.jackson.core.JsonProcessingException;
import org.ks.sys.vo.AuthVo;
import org.ks.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.ks.sys.roleauth.service.RoleAuthService;

import java.util.List;

/**
 * @author wangsong
 */
@RestController
@RequestMapping("/roleAuthCtrl")
public class RoleAuthController {
    @Autowired
    private RoleAuthService roleAuthService;

    /**
     * //获取所有的权限   一级角色拥有的角色
      * @param roleId
     * @return
     */
    @RequestMapping("/selectAuth")
    public ResultInfo<List<AuthVo>> selectAuthByRoleId(@RequestParam("roleId") String roleId){
        return roleAuthService.selectAuthByRoleId(Long.valueOf(roleId));
    }

    /**
     * 给权限分配权限
     * @param roleId
     * @param args
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping("/updateRoleAuth")
    public ResultInfo<Integer> updateRoleAuth(String roleId,@RequestParam("args") String args) throws JsonProcessingException {

        return roleAuthService.insertAuthByRoleId(Long.valueOf(roleId), args);
    }

}
