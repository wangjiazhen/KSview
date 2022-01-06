package org.ks.sys.menu.service;

import org.ks.sys.vo.MenuVo;
import org.ks.util.ResultInfo;
import org.springframework.stereotype.Service;
import org.ks.sys.menu.dto.FormInfoData;
import org.ks.sys.menu.dto.MenuDto;
import org.ks.sys.menu.dto.MenuFlagDto;
import org.ks.sys.po.TblMenu;

import java.util.List;

/**
 * @author wangbiao
 * create at:  2020-04-21   18:30
 * description: 菜单管理
 */
@Service
public interface MenuService {

    /**
     * 遍历菜单信息
     * @return
     */
    ResultInfo<List<TblMenu>> selectByExample();

    /**
     * 自定义的排序查询
     * @param menuNameInfo
     * @return
     */
    ResultInfo<List<TblMenu>> selectListMenu(FormInfoData menuNameInfo);

    /**
     * 添加一条菜单数据
     * @param menuDto
     * @return
     */
    ResultInfo insertSelective(MenuDto menuDto);

    /**
     * 修改菜单信息
     * @param tblMenu
     * @return
     */
    ResultInfo updateMenuSelective(MenuDto tblMenu);

    /**
     * 根据id查询一条菜单信息
     * @param menuId
     * @return
     */
    ResultInfo queryByPrimaryKey(Long menuId);

    /**
     * 查询菜单节点
     * @return
     */
    List<MenuVo> selectMenuVo();

    /**
     * 根据名字查找是否存在
     * @param menuDto
     * @return
     */
    ResultInfo queryByName(MenuDto menuDto);

    /**
     * 切换是否启用
     * @param menuFlagDto
     * @return
     */
    ResultInfo updateMenuFlag(MenuFlagDto menuFlagDto);
}
