package org.ks.sys.usergroup.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.vo.UserGroupVo;
import org.ks.sys.vo.UserNameVo;
import org.ks.sys.vo.UserVoTo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.ks.sys.usergroup.mapper.TblUserGroupMapper;
import org.ks.sys.usergroup.service.UserGroupService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private TblUserGroupMapper tblUserGroupMapper;

    private static final Logger log = LoggerFactory.getLogger(UserGroupServiceImpl.class);

    /**
     * 查询所有用户名
     * @return
     */
    @Override
    public ResultInfo<List<UserVoTo>> selectAllUser() {
        List<UserVoTo> userVoTos = tblUserGroupMapper.selectAllUserTo();
        UserVoTo userVoTo = new UserVoTo();
        userVoTo.setId(0);
        userVoTo.setName("所有用户：");
        userVoTo.setPid(-1);
        userVoTos.add(userVoTo);
        ResultInfo<List<UserVoTo>> info = new ResultInfo<>(StatusCodeEnum.OK, "查询用户名成功");
        info.setData(userVoTos);
        log.info(info.toString());
        return info;
    }

    /**
     * 通过用户组id查询有哪些用户
     * @param groupId
     * @return
     */
    @Override
    public ResultInfo<List<UserNameVo>> selectUserByGroupId(long groupId) {
        if (groupId == 0){
            log.info("用户名id是0");
            return new ResultInfo(StatusCodeEnum.UNPROCESSABLE_ENTITY,"用户名id是0");
        }
        List<UserNameVo> user = tblUserGroupMapper.selectAllUser();
        List<UserNameVo> group = tblUserGroupMapper.selectUserByGroupId(groupId);
        for (UserNameVo user1 : user){
            for (UserNameVo group1 : group){
                if (user1.getUserId() == group1.getUserId()){
                    user1.setCheck(true);
                }
            }
        }
        ResultInfo<List<UserNameVo>> info = new ResultInfo<>(StatusCodeEnum.OK, "查询所有用户名成功");
        info.setData(user);
        log.info(info.toString());
        return info;
    }

    /**
     * 通过传参id，放入数据库绑定，给用户组添加用户
     * @param groupId
     * @param args
     * @return
     */
    @Override
    public ResultInfo<Integer> insertGroupByUserId(long groupId, String args) {
        if (groupId != 0){
            tblUserGroupMapper.deleteGroupByUserId(groupId);
        }
        String[] split = args.split(",");
        long[] arr = new long[split.length];
        for(int j = 0;j < split.length; j++){
            arr[j]=Long.valueOf(split[j]);
        }
        List<UserGroupVo> userGroupVos = new ArrayList<UserGroupVo>();
        for (long l : arr) {
            UserGroupVo userGroupVo = new UserGroupVo();
            userGroupVo.setUserId(l);
            userGroupVo.setGroupId(groupId);
            userGroupVos.add(userGroupVo);
        }
        int i = tblUserGroupMapper.insertGroupByUserId(userGroupVos);
        ResultInfo<Integer> info = new ResultInfo<>(StatusCodeEnum.OK, "修改分组成功");
        info.setData(i);
        log.info(info.toString());
        return info;
    }

    /**
     * 删除用户组里面的用户
     * @param userId
     * @return
     */
    @Override
    public int deleteGroupByUserId(long userId) {
        return tblUserGroupMapper.deleteGroupByUserId(userId);
    }


}
