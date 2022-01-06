package org.ks.sys.group.ctrl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.group.dto.GroupDto;
import org.ks.sys.group.vo.GroupVo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.ks.sys.group.dto.FormInfoData;
import org.ks.sys.group.service.UserByNameService;
import org.ks.sys.po.TblGroup;
import org.ks.sys.group.service.GroupService;
import org.ks.sys.po.TblUser;

import java.util.List;

@RequestMapping("/groupCtrl")
@RestController
public class GroupCtrl {

    @Autowired
    private GroupService groupService;
    @Autowired
    private UserByNameService userByNameService;

    private static final Logger log = LoggerFactory.getLogger(GroupCtrl.class);

    /**
     * 通过id用户组信息
     *
     * @param groupId
     * @return
     */
    @RequestMapping("/getGroupById")
    public ResultInfo getTblGroup(String groupId) {
        Long longGroupId = Long.valueOf(groupId);
        ResultInfo resultInfo = null;
        try {
            resultInfo = groupService.selectByPrimaryKey(longGroupId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultInfo;
    }

    @RequestMapping("/insert")
    public ResultInfo insert(GroupDto groupDto) {
        ResultInfo insert = groupService.insertSelective(groupDto);
        return insert;
    }

    @RequestMapping("/getSelectGroup")
    public ResultInfo<List<TblGroup>> getSelectByExample(FormInfoData groupNameInfo) {
        ResultInfo<List<TblGroup>> tblGroups = null;
        try {
            tblGroups = groupService.selectListGroup(groupNameInfo);
            log.info("用户组查询数据:{}", tblGroups.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tblGroups;
    }

    @RequestMapping("/updateGroup")
    public ResultInfo updateGroupSelective(GroupDto groupDto) {
        try {
            return groupService.updateGroupSelective(groupDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultInfo(StatusCodeEnum.PROCESSING_EXCEPTION);
    }

    @RequestMapping("/updateFlag")
    public ResultInfo updateFlag(long groupId, int useFlag) {
        GroupVo groupVo = new GroupVo();
        try {
            groupVo.setGroupId(groupId);
            groupVo.setUseFlag(useFlag);
            return groupService.updateFlag(groupVo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultInfo(StatusCodeEnum.PROCESSING_EXCEPTION);
    }

    @RequestMapping("/getUserByName")
    public ResultInfo getUserByName(String name){
        try {
            List<TblUser> tblUserList = userByNameService.userByNameSelect(name);
            System.out.println(tblUserList);
            ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.OK,"根据用户名查询成功");
            resultInfo.setData(tblUserList);
            return resultInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultInfo(StatusCodeEnum.PROCESSING_EXCEPTION);
    }
}
