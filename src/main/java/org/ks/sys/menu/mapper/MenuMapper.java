package org.ks.sys.menu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ks.sys.menu.dto.MenuFlagDto;
import org.ks.sys.vo.MenuVo;

import java.util.List;

@Mapper
public interface MenuMapper {

    /**
     * 查询遍历节点
     * @return
     */
    List<MenuVo> selectVo();

    /**
     * 切换启用禁用
     * @param menuFlagDto
     * @return
     */
    int updateMenuFlag(MenuFlagDto menuFlagDto);
}
