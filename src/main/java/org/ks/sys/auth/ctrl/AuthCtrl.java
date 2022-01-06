package org.ks.sys.auth.ctrl;

import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ks.sys.auth.dto.AuthAddAndUpdateDto;
import org.ks.sys.auth.service.AuthService;
import org.ks.sys.po.TblAuth;


import java.util.List;

/**
 * @author : mu
 * <p>
 * create at:  2020-04-22  17:30
 * <p>
 * description: 权限Ctrl
 */
@RequestMapping("/authCtrl")
@RestController
public class AuthCtrl {

    private static final Logger log = LoggerFactory.getLogger(AuthCtrl.class);
    @Autowired
    private AuthService authService;


    /**
     * 查询权限列表
     *
     * @param authName
     * @param createAcct
     * @param updateAcct
     * @return
     */
    @RequestMapping("/queryAuthList")
    public ResultInfo<List<TblAuth>> queryAuthList(String authName, String createAcct, String updateAcct) {
        ResultInfo<List<TblAuth>> listResultInfo = authService.queryAuthList(authName, createAcct, updateAcct);
        log.info("查询权限数据:{}", listResultInfo.toString());
        return listResultInfo;

    }

    /**
     * @param authAddAndUpdateDto
     * @return resultInfo
     */
    @RequestMapping("/insertAuth")
    public ResultInfo insertAuth(AuthAddAndUpdateDto authAddAndUpdateDto) {
        ResultInfo resultInfo = authService.insertAuth(authAddAndUpdateDto);
        return resultInfo;
    }

    /**
     * 根据权限id查询权限
     *
     * @param authId
     * @return
     */
    @RequestMapping("/selectAuthById")
    public ResultInfo selectAuthById(String authId) {
        Long longAuthId = Long.valueOf(authId);
        ResultInfo resultInfo = authService.selectAuthById(longAuthId);
        return resultInfo;

    }

    /**
     * 更新权限
     *
     * @param authAddAndUpdateDto
     * @return
     */

    @RequestMapping("/updateAuth")
    public ResultInfo updateAuthSelective(AuthAddAndUpdateDto authAddAndUpdateDto) {
        return authService.updateAuthSelective(authAddAndUpdateDto);
    }

    /**
     * 更新权限状态
     *
     * @param authId
     * @param useFlag
     * @return
     */
    @RequestMapping("/updateUseFlagOfAuth")
    public ResultInfo updateUseFlagOfAuth(@RequestParam("authId") Long authId, @RequestParam("useFlag") Integer useFlag) {
        log.info("要更新的角色的ID是" + authId + "," + "更新前角色的状态是" + useFlag);
        return authService.updateUseFlagOfAuth(authId, useFlag);
    }
}
