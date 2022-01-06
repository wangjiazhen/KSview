package org.ks.sys.ctrlauth.ctrl;

import io.swagger.annotations.ApiOperation;
import org.ks.sys.ctrlauth.service.QueryService;
import org.ks.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ks.sys.po.TblCtrlInfo;
import org.ks.sys.po.TblCtrlUserInfo;

import java.util.List;

/**
 * @author ws
 * @version 1.0
 * @date 2020/8/12 11:50
 */
@RestController
@RequestMapping("/query")
public class QurtyCtrl {

    @Autowired
    private QueryService queryService;

    @GetMapping("/queryAllCtrl")
    @ApiOperation(value = "查询所有接口信息", httpMethod = "GET")
    public ResultInfo<List<TblCtrlInfo>> queryAllCtrl(){
        return queryService.queryAllCtrl();
    }
    @GetMapping("/queryAllUser")
    @ApiOperation(value = "查询所有接口用户信息", httpMethod = "GET")
    public ResultInfo<List<TblCtrlUserInfo>> queryAllUser(String appId,String name,String mailAddr){
        return queryService.queryAllUser(appId,name,mailAddr);
    }

    @GetMapping("/getToken")
    @ApiOperation(value = "获取token", httpMethod = "GET")
    public ResultInfo<String> getToken(String appId,String appSecret){
        return queryService.getToken(appId,appSecret);
    }

    @GetMapping("/getCtrlByUserId")
    @ApiOperation(value = "根据登录人员查询拥有的权限", httpMethod = "GET")
    public ResultInfo<String> getCtrlByUserId(){
        return queryService.getCtrlByUserId();
    }
}
