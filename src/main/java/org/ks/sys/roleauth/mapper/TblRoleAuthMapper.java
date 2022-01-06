package org.ks.sys.roleauth.mapper;

import org.apache.ibatis.annotations.*;
import org.ks.sys.vo.AuthVo;
import org.ks.sys.vo.AuthVoTo;
import org.ks.sys.vo.RoleAuthVo;
import org.ks.sys.authmenu.dto.InfoDto;

import java.util.List;

/**
 * @author wangsong
 */
@Mapper
public interface TblRoleAuthMapper {
    /**
     * 获取所有权限
     * @return
     */
    public List<AuthVo> selectAllAuth();

    /**
     * 获取所有权限
     * @param infoName
     * @return
     */
    public List<AuthVoTo> selectAllAuthTo(InfoDto infoName);
    /**
     * 根据角色获取当前用户的权限selectAllAuth
     * @param roleId 角色id
     * @return
     */
    public List<AuthVo> selectAuthByRoleId(long roleId);

    /**
     * 给角色添加权限
     * @param roleAuthVos
     * @return
     */
    public int insertAuthByRoleId(@Param("roleAuthVos") List<RoleAuthVo> roleAuthVos);

    /**
     * 根据角色id删除这个用户得所有权限
     * @param roleId
     * @return
     */
    @Update("DELETE FROM tbl_role_auth_rel where role_id=#{roleId}")
    public int deleteAuthByRoleId(long roleId);


}
