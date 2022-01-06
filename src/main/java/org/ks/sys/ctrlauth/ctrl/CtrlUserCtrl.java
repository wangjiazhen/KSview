package org.ks.sys.ctrlauth.ctrl;

import io.swagger.annotations.ApiOperation;
import org.ks.sys.ctrlauth.service.CtrlUserService;
import org.ks.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ks.sys.po.TblCtrlUserInfo;

/**
 * @author ws
 * @version 1.0
 * @date 2020/8/12 13:16
 */
@RestController
@RequestMapping("/CtrlUserCtrl")
public class CtrlUserCtrl {
    @Autowired
    private CtrlUserService ctrlUserService;

    @PostMapping("/createCtrlUser")
    @ApiOperation(value = "添加新的接口用户接口", httpMethod = "POST")
    public ResultInfo<TblCtrlUserInfo> createCtrlUser(String name, String mailAddr){
        return ctrlUserService.createCtrlUser(name,mailAddr);
    }

    @PostMapping("/addIpWhite")
    @ApiOperation(value = "添加IP白名单", httpMethod = "POST")
    public ResultInfo addIpWhite(String ctrlUserId,String ip){
        return ctrlUserService.addIpWhite(ctrlUserId,ip);
    }

    @PostMapping("/addUserCtrlRel")
    @ApiOperation(value = "给用户添加接口", httpMethod = "POST")
    public ResultInfo addUserCtrlRel(String ctrlUserId,String ctrlId){
        return ctrlUserService.addUserCtrlRel(ctrlUserId,ctrlId);
    }

    @PostMapping("/updateStatus")
    @ApiOperation(value = "修改用户状态（是否启用）", httpMethod = "POST")
    public ResultInfo updateStatus(String ctrlUserId){
        return ctrlUserService.updateStatus(ctrlUserId);
    }
}
