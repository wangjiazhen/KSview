package org.ks.sys.mapper;

import org.ks.sys.menu.dto.FormInfoData;
import org.ks.sys.po.TblMenu;

import java.util.List;

public interface TblMenuGustomMapper {

    /**
     * 排序查询所有用户组信息
     * @return
     */
    List<TblMenu> selectListMenu(FormInfoData menuNameInfo);

}
