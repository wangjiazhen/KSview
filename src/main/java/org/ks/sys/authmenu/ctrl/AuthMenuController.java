package org.ks.sys.authmenu.ctrl;

import org.ks.sys.vo.AuthVoTo;
import org.ks.sys.vo.MenuVo;
import org.ks.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.ks.sys.authmenu.dto.InfoDto;
import org.ks.sys.authmenu.service.AuthMenuService;
import org.ks.sys.roleauth.service.RoleAuthService;

import java.util.List;

/**
 * @ClassName AuthMenuController
 * @Description TODO
 * @Author wangsong
 * @Date 2020/4/23 15:27
 * @Version 1.0
 **/
@RestController
@RequestMapping("/authMenuCtrl")
public class AuthMenuController {
    @Autowired
    private AuthMenuService authMenuService;
    @Autowired
    private RoleAuthService roleAuthService;

    /**
     *
     * 获取所有的权限
     *
     * @return
     */
    @RequestMapping("getAllAuth")
    public ResultInfo<List<AuthVoTo>> getAllAuth(InfoDto infoName) {
        ResultInfo<List<AuthVoTo>> listResultInfo = roleAuthService.selectAllAuth(infoName);
        return listResultInfo;

    }

    /**
     * 获取所有菜单
     *
     * @param authId
     * @return
     */
    @RequestMapping("/getAllMenu")
    public ResultInfo<List<MenuVo>> getAllMenu(long authId) {
        System.out.println(2222);
        ResultInfo<List<MenuVo>> resultInfo = authMenuService.selectAllMenu(authId);
        return resultInfo;
    }

    /**
     * 给权限分配菜单
     *
     * @param authId
     * @param args
     * @return
     */
    @RequestMapping("/updateAuthMenu")
    public ResultInfo<Integer> updateAuthMenu(@RequestParam("authId") String authId, @RequestParam("args") String args) {
        ResultInfo<Integer> integerResultInfo = authMenuService.updateAuthMenu(authId, args);
        return integerResultInfo;
    }

    /**
     * 获取菜单  用于动态生成index菜单
     *
     * @param userId
     * @return
     */
    @RequestMapping("/selectIndexMenu")
    public ResultInfo<List<MenuVo>> selectIndexMenu(@RequestParam("userId")String userId) {
        System.out.println(userId);
        ResultInfo<List<MenuVo>> resultInfo = authMenuService.selectIndexMenu(Long.valueOf(userId));
        return resultInfo;
    }


}
