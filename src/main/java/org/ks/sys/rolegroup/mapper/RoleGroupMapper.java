package org.ks.sys.rolegroup.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.ks.sys.po.TblGroupRoleRel;
import org.ks.sys.vo.GroupVo;

import java.util.List;

/**
 * @author mulishaui
 */
@Mapper
public interface RoleGroupMapper {
    /**
     * 查詢用戶組中所有id 和 name 并封装到GroupVo中
     *
     * @return List<GroupVo>
     */
    List<GroupVo> selectAllGroup();

    /**
     * 根据用户的id查詢用戶組中所有id 和 name并封装到GroupVo中
     *
     * @param roleId
     * @return List<GroupVo>
     */
    List<GroupVo> selectGroupByRoleId(Long roleId);


    /**
     * 根据roleId添加用户组
     * @param groupRoleRels
     * @return
     */
    int insertGroupByRoleId(@Param("groupRoleRels") List<TblGroupRoleRel> groupRoleRels);
}
