package org.ks.sys.menu.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.vo.MenuVo;
import org.ks.system.UserInfo;
import org.ks.util.ResultInfo;
import org.ks.util.SeqUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.ks.sys.menu.dto.FormInfoData;

import org.ks.sys.mapper.TblMenuGustomMapper;
import org.ks.sys.mapper.TblMenuMapper;
import org.ks.sys.menu.dto.MenuDto;
import org.ks.sys.menu.dto.MenuFlagDto;
import org.ks.sys.menu.mapper.MenuMapper;
import org.ks.sys.menu.service.MenuService;
import org.ks.sys.po.TblMenu;
import org.ks.sys.po.TblMenuExample;

import java.util.Date;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private TblMenuMapper tblMenuMapper;
    @Autowired
    private TblMenuGustomMapper tblMenuGustomMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Autowired
    private UserInfo userInfo;

    private static final Logger log = LoggerFactory.getLogger(MenuServiceImpl.class);

    /**
     * 遍历菜单信息
     * @return
     */
    @Override
    public ResultInfo<List<TblMenu>> selectByExample() {
        TblMenuExample tblMenuExample = new TblMenuExample();
        List<TblMenu> tblMenus = tblMenuMapper.selectByExample(tblMenuExample);
        if (CollectionUtils.isEmpty(tblMenus)){
            log.info("菜单列表为空");
            ResultInfo<List<TblMenu>> resultInfo = new ResultInfo<List<TblMenu>>(StatusCodeEnum.NOT_FOUND, "菜单列表为空");
            return resultInfo;
        }
        ResultInfo<List<TblMenu>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK,"菜单查询成功");
        long size = tblMenus.size();
        resultInfo.setTotal(size);
        resultInfo.setData(tblMenus);
        log.debug(resultInfo.toString());
        return resultInfo;
    }
    /**
     * 自定义的排序查询
     * @return
     */
    @Override
    public ResultInfo<List<TblMenu>> selectListMenu(FormInfoData menuNameInfo) {
        List<TblMenu> tblMenus = tblMenuGustomMapper.selectListMenu(menuNameInfo);
        if (CollectionUtils.isEmpty(tblMenus)) {
            log.info("菜单列表为空");
            ResultInfo<List<TblMenu>> info = new ResultInfo<>(StatusCodeEnum.NOT_FOUND, "菜单列表为空");
            return info;
        }
        ResultInfo<List<TblMenu>> info = new ResultInfo<>(StatusCodeEnum.OK, "菜单列表查询成功");
        long size = tblMenus.size();
        info.setTotal(size);
        info.setData(tblMenus);
        log.debug(info.toString());
        return info;
    }

    /**
     * 添加一条数据
     * @param menuDto
     * @return
     */
    @Override
    public ResultInfo insertSelective(MenuDto menuDto) {
        if (queryByName(menuDto)==null){
            TblMenu tblMenu = new TblMenu();
            BeanUtils.copyProperties(menuDto,tblMenu);
            // 创建人
            tblMenu.setCreateAcct(userInfo.getUserId());
            tblMenu.setUpdateAcct(userInfo.getUserId());
            tblMenu.setCreateTime(new Date());
            tblMenu.setUpdateTime(new Date());
            tblMenu.setUseFlag(1);
            tblMenu.setMenuId(SeqUtil.getNextId());
            int insert = tblMenuMapper.insert(tblMenu);
            if (insert == 0){
                log.info("插入菜单失败");
                return new ResultInfo(StatusCodeEnum.NOT_FOUND,"插入菜单失败");
            }
            return new ResultInfo(StatusCodeEnum.OK,"插入菜单成功");
        }
        return queryByName(menuDto);
    }

    /**
     * 修改菜单
     * @param menuDto
     * @return
     */
    @Override
    public ResultInfo updateMenuSelective(MenuDto menuDto) {
        TblMenuExample example = new TblMenuExample();
        TblMenu tblMenu = new TblMenu();
        BeanUtils.copyProperties(menuDto,tblMenu);
        TblMenuExample.Criteria criteria = example.createCriteria();
        criteria.andMenuIdEqualTo(tblMenu.getMenuId());
        tblMenu.setUpdateTime(new Date());
        // 修改人
        tblMenu.setUpdateAcct(userInfo.getUserId());
        if (queryByName(menuDto) == null){

            int updateMenu = tblMenuMapper.updateByExampleSelective(tblMenu, example);
            if(updateMenu == 0){
                return new ResultInfo(StatusCodeEnum.NOT_FOUND,"修改菜单失败");
            }
            return new ResultInfo(StatusCodeEnum.OK,"修改菜单成功");
        }
        return queryByName(menuDto);
    }

    /**
     * 查询一条菜单数据
     * @param menuId
     * @return
     */
    @Override
    public ResultInfo queryByPrimaryKey(Long menuId) {
        TblMenuExample tblMenuExample = new TblMenuExample();
        TblMenuExample.Criteria criteria = tblMenuExample.createCriteria();
        criteria.andMenuIdEqualTo(menuId);
        List<TblMenu> tblMenus = tblMenuMapper.selectByExample(tblMenuExample);
        if (tblMenus.isEmpty()){
            log.info("查询菜单信息失败");
            return new ResultInfo(StatusCodeEnum.NOT_FOUND,"查询菜单信息失败");
        }
        ResultInfo<List<TblMenu>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询菜单信息成功");
        resultInfo.setData(tblMenus);
        log.debug(resultInfo.toString());
        return resultInfo;
    }

    /**
     * 查询菜单节点
     * @return
     */
    @Override
    public List<MenuVo> selectMenuVo() {
        return menuMapper.selectVo();
    }

    /**
     * 查询数据库是否有名字一样的
     * @param menuDto
     * @return
     */
    @Override
    public ResultInfo queryByName(MenuDto menuDto) {
        TblMenu tblMenu = new TblMenu();
        BeanUtils.copyProperties(menuDto,tblMenu);
        Long menuId = tblMenu.getMenuId();
        TblMenuExample tblMenuExample = new TblMenuExample();
        TblMenuExample.Criteria criteria = tblMenuExample.createCriteria();
        criteria.andMenuNameEqualTo(tblMenu.getMenuName());
        List<TblMenu> tblMenus = tblMenuMapper.selectByExample(tblMenuExample);
        ResultInfo resultInfo = null;
        if (!tblMenus.isEmpty()){
            Long id = tblMenus.get(0).getMenuId();
            if (id.equals(menuId)){
                log.info("开始编辑");
                return null;
            }
            resultInfo = new ResultInfo(StatusCodeEnum.UNSUPPORTED_MEDIA_TYPE, "该名称已存在，不可以重复");
            resultInfo.setData(tblMenus);
            log.info(resultInfo.toString());
            return resultInfo;
        }
        return resultInfo;
    }

    /**
     * 切换是否启用的方法
     * @param menuFlagDto
     * @return
     */
    @Override
    public ResultInfo updateMenuFlag(MenuFlagDto menuFlagDto) {
        ResultInfo resultInfo = null;
        if (menuFlagDto !=null ){
            resultInfo = new ResultInfo(StatusCodeEnum.OK,"修改成功");
            resultInfo.setData(menuMapper.updateMenuFlag(menuFlagDto));
        }
        return resultInfo;
    }


}
