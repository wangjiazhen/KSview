package org.ks.sys.authmenu.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.ks.sys.vo.AuthMenuVo;
import org.ks.sys.vo.MenuVo;

import java.util.List;

/**
 * @author wangsong
 */
@Mapper
public interface AuthMenuMapper {
    /**
     * 方法实现说明 ： 查询所有的菜单
     *
     * @return
     * @throws
     * @author ws
     * @date 2020/4/23 15:33
     */
    public List<MenuVo> selectAllMenu();

    /**
     * 方法实现说明 ： 根据权限Id查询拥有的菜单
     *
     * @param authId
     * @return
     */
    public List<MenuVo> selectMenuByAuthId(@Param("authId") long authId);

    /**
     * 根据权限id删除所有关联的菜单
     *
     * @param authId
     * @return
     */
    @Delete("delete from tbl_auth_menu_rel where auth_id = #{authId}")
    public int deleteMenuByAuthId(long authId);

    /**
     * g给权限分配菜单
     *
     * @param authMenuVos
     * @return
     */
    public int insertMenuByAuthId(@Param("authMenuVos") List<AuthMenuVo> authMenuVos);


    /**
     * 根据权限id查询该权限所拥有菜单的父级菜单
     * @param authId
     * @return
     */
    List<Long> getFatherId(Long authId);
//    /**
//     * 查询一级的菜单  用来生成主页的菜单
//     *
//     * @return
//     */
//    public List<MenuVo> selectIndexMenu(@Param("userId")long userId,@Param("pId")long pId);

    /**
     * 根据用户id查询这个用户有没有角色
     *
     * @param userId
     * @return
     */
    public List<Long> selectRoleByUserId(long userId);

    /**
     * 荣如果有角色  在根据角色查询所对应的列表
     * @param roleIds
     *
     * @return
     */
    public List<MenuVo> selectMenuByRoleId(@Param("roleIds") List<Long> roleIds);
}
