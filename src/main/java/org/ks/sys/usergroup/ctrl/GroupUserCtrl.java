package org.ks.sys.usergroup.ctrl;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.ks.sys.usergroup.service.UserGroupService;
import org.ks.sys.vo.UserNameVo;
import org.ks.util.ResultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/groupUserCtrl")
@RestController
public class GroupUserCtrl {

    @Autowired
    private UserGroupService userGroupService;

    @RequestMapping("/selectUser")
    public ResultInfo<List<UserNameVo>> selectUserByGroupId(@RequestParam("groupId") String groupId){
        ResultInfo<List<UserNameVo>> resultInfo = null;
        try {
            if (groupId != null & !"".equals(groupId)){
                resultInfo = userGroupService.selectUserByGroupId(Long.valueOf(groupId));
                return resultInfo;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return resultInfo;
    }

    @RequestMapping("/updateUserGroup")
    public ResultInfo<Integer> updateUserGroup(String groupId,@RequestParam("args") String args) throws JsonProcessingException {
        ResultInfo<Integer> integerResultInfo = null;
        try {
            if(groupId != null && !"".equals(groupId) && !"".equals(args)){
                integerResultInfo = userGroupService.insertGroupByUserId(Long.valueOf(groupId), args);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return integerResultInfo;
    }
}

