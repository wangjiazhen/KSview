package org.ks.sys.menu.ctrl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.menu.dto.FormInfoData;
import org.ks.sys.menu.dto.MenuFlagDto;
import org.ks.sys.menu.service.MenuService;
import org.ks.sys.vo.MenuVo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.ks.sys.menu.dto.MenuDto;
import org.ks.sys.po.TblMenu;

import java.util.List;

@RequestMapping("/menuCtrl")
@RestController
public class MenuCtrl {
    @Autowired
    private MenuService menuService;

    private static final Logger log = LoggerFactory.getLogger(MenuCtrl.class);


    @RequestMapping("/queryMenuList")
    public ResultInfo<List<TblMenu>> queryMenuList(FormInfoData menuNameInfo){
        ResultInfo<List<TblMenu>> resultInfo = null;
        try {
            resultInfo = menuService.selectListMenu(menuNameInfo);
            log.info("查询菜单数据:{}",resultInfo.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultInfo;
    }

    @RequestMapping("/insert")
    public ResultInfo insert(MenuDto menuDto){
        return menuService.insertSelective(menuDto);
    }

    @RequestMapping("/getMenuById")
    public ResultInfo getTblMenu(String menuId){
        Long longMenuId = Long.valueOf(menuId);
        ResultInfo resultInfo = null;
        try {
            resultInfo = menuService.queryByPrimaryKey(longMenuId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultInfo;
    }

    @RequestMapping("/updateMenu")
    public ResultInfo updateGroupSelective(MenuDto menuDto){
        return menuService.updateMenuSelective(menuDto);
    }

    @RequestMapping("/selectMenuVo")
    public ResultInfo<MenuVo[]> selectMenuVo(){
        ResultInfo resultInfo = new ResultInfo(StatusCodeEnum.OK, "查询菜单节点成功");
        try {
            List<MenuVo> menuVos = menuService.selectMenuVo();
            resultInfo.setData(menuVos.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultInfo;
    }

    @RequestMapping("/updateMenuFlag")
    public ResultInfo updateMenuFlag(long menuId,int useFlag){
        MenuFlagDto menuFlagDto = new MenuFlagDto();
        try {
            menuFlagDto.setMenuId(menuId);
            menuFlagDto.setUseFlag(useFlag);
            return menuService.updateMenuFlag(menuFlagDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResultInfo(StatusCodeEnum.PROCESSING_EXCEPTION);
    }
}
