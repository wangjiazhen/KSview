package org.ks.sys.usergroup.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.ks.sys.vo.UserGroupVo;
import org.ks.sys.vo.UserNameVo;
import org.ks.sys.vo.UserVoTo;

import java.util.List;

@Mapper
public interface TblUserGroupMapper {

    /**
     * 获取所有用户
     * @return
     */
    List<UserNameVo> selectAllUser();

    /**
     * 获取所有用户节点
     * @return
     */
    List<UserVoTo> selectAllUserTo();

    /**
     * 根据用户组id获取用户
     * @param groupId
     * @return
     */
    List<UserNameVo> selectUserByGroupId(long groupId);

    /**
     * 给用户组添加用户
     * @param userGroupVos
     * @return
     */
    int insertGroupByUserId(@Param("userGroupVos") List<UserGroupVo> userGroupVos);

    /**
     * 根据用户id从用户组里删除
     * @param userId
     * @return
     */
    int deleteGroupByUserId(long userId);
}
