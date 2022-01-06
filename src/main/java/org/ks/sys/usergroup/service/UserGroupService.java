package org.ks.sys.usergroup.service;

import org.ks.sys.vo.UserNameVo;
import org.ks.sys.vo.UserVoTo;
import org.ks.util.ResultInfo;

import java.util.List;

public interface UserGroupService {

    /**
     * 查询所有用户名
     * @return
     */
    ResultInfo<List<UserVoTo>> selectAllUser();
    /**
     * 通过用户组id查询有哪些用户
     * @param groupId
     * @return
     */
    ResultInfo<List<UserNameVo>> selectUserByGroupId(long groupId);

    /**
     * 通过传参id，放入数据库绑定，给用户组添加用户
     * @param userId
     * @param a
     * @return
     */
    ResultInfo<Integer> insertGroupByUserId(long userId,String a);

    /**
     * 删除用户组里面的用户
     * @param userId
     * @return
     */
    int deleteGroupByUserId(long userId);

}
