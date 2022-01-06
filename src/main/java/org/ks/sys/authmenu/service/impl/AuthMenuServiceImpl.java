package org.ks.sys.authmenu.service.impl;

import org.ks.enums.StatusCodeEnum;
import org.ks.sys.authmenu.util.MenuCache;
import org.ks.sys.authmenu.util.UtilConstants;
import org.ks.sys.vo.AuthMenuVo;
import org.ks.sys.vo.MenuVo;
import org.ks.system.UserInfo;
import org.ks.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ks.sys.po.TblAuthMenuRelExample;
import org.ks.sys.authmenu.mapper.AuthMenuMapper;
import org.ks.sys.authmenu.service.AuthMenuService;
import org.ks.sys.roleauth.service.impl.RoleAuthServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AuthMenuServiceImpl
 * @Description TODO
 * @Author wangsong
 * @Date 2020/4/23 15:29
 * @Version 1.0
 **/
@Service
public class AuthMenuServiceImpl implements AuthMenuService {
    @Autowired
    private AuthMenuMapper authMenuMapper;
    @Autowired
    private UserInfo userInfo;

    private static final Logger log = LoggerFactory.getLogger(RoleAuthServiceImpl.class);

    /**
     * 方法实现说明 查询所有的菜单 如果当前权限拥有这个菜单 checked属性赋值为true
     *
     * @return
     * @throws
     * @author
     * @date 2020/4/23 15:58
     */
    @Override
    public ResultInfo<List<MenuVo>> selectAllMenu(long authId) {
        List<MenuVo> menuVos = authMenuMapper.selectAllMenu();
        List<MenuVo> menuVos1 = authMenuMapper.selectMenuByAuthId(authId);
        for (MenuVo menuVo : menuVos) {
            if (menuVo.getpId()!=0) {
                for (MenuVo vo : menuVos1) {
                    if (menuVo.getId() == vo.getId()) {
                        menuVo.setChecked(true);
                    }
                }
            }
        }

        List<MenuVo> maxMenuVo = new ArrayList<>();
            for (MenuVo menuVo : menuVos) {
                for (MenuVo vo : menuVos) {
                    if (vo.getpId() == menuVo.getId()) {
                        menuVo.getChildren().add(vo);
                    }
                }
            }
            for (MenuVo menuVo : menuVos) {
                if (menuVo.getpId() == 0) {
                    maxMenuVo.add(menuVo);
                }
            }


        ResultInfo<List<MenuVo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询所有菜单Ok");
        resultInfo.setData(maxMenuVo);
        log.info(resultInfo .toString());
        return resultInfo;
    }

    /**
     * 分配菜单
     * 先删除拥有的菜单
     * 再给权限分配菜单
     *
     * @param authId 权限id
     * @param args   权限关联的菜单
     * @return
     */
    @Override
    public ResultInfo<Integer> updateAuthMenu(String authId, String args) {

        String[] split = args.split(",");
        long[] arr = new long[split.length];

        for (int i = 0; i < split.length; i++) {
            arr[i] = Long.valueOf(split[i]);
        }
        //删除当前权限拥有的菜单
        int i = authMenuMapper.deleteMenuByAuthId(Long.valueOf(authId));
        //新建一个集合   用来动态生成inser sql  所选菜单
        List<AuthMenuVo> authMenuVos = new ArrayList<AuthMenuVo>();
        for (long l : arr) {
            AuthMenuVo authMenuVo = new AuthMenuVo(Long.valueOf(authId), l);
            authMenuVos.add(authMenuVo);
        }
        ResultInfo<Integer> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "分配菜单Ok");
        int i1 = 0;
        if (authMenuVos.size() > 0) {
            i1 = authMenuMapper.insertMenuByAuthId(authMenuVos);
        }
        TblAuthMenuRelExample tblAuthMenuRelExample = new TblAuthMenuRelExample();
        List<Long> fatherId = authMenuMapper.getFatherId(Long.valueOf(authId));
        //新建一个集合   用来动态生成inser sql  所选菜单的父级菜单
        List<AuthMenuVo> authMenuVos2 = new ArrayList<AuthMenuVo>();
        for (long l : fatherId) {
            if(l!=0L&&args.indexOf(Long.toString(l))==-1){
                AuthMenuVo authMenuVo = new AuthMenuVo(Long.valueOf(authId), l);
                authMenuVos2.add(authMenuVo);
            }
        }
        if (authMenuVos2.size() > 0) {
            i1 = authMenuMapper.insertMenuByAuthId(authMenuVos2);
        }
        resultInfo.setData(i1);

        deleteCache();
        //返回
        log.info(resultInfo.toString());
        return resultInfo;
    }

    /**
     * 查询菜单 用来加载index页面的动态菜单
     *
     * @return
     */
    @Override
    public ResultInfo<List<MenuVo>> selectIndexMenu(long userId) {
        List<Long> longs = authMenuMapper.selectRoleByUserId(userId);
        if (longs.size() > 0) {
            List<MenuVo> menuVos = authMenuMapper.selectMenuByRoleId(longs);
            ResultInfo<List<MenuVo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询所有菜单Ok");
            resultInfo.setData(menuVos);
            return resultInfo;

        }else{
            ResultInfo<List<MenuVo>> resultInfo = new ResultInfo<>(StatusCodeEnum.OK, "查询所有菜单Ok");
            return resultInfo;
        }

    }

    @Override
    public void deleteCache() {
        MenuCache menuCache = MenuCache.getMenuCache();
        menuCache.setValue(UtilConstants.MENU_LIST, null);
    }

    /**
     * 方法声明： 将List<MenuVo> 转化成MenuVo[]
     *
     * @param menuVos
     * @return
     */
    public MenuVo[] listToArray(List<MenuVo> menuVos) {
        MenuVo[] maxMenuVo = new MenuVo[menuVos.size()];
        for (int i = 0; i < menuVos.size(); i++) {
            maxMenuVo[i] = menuVos.get(i);
        }
        return maxMenuVo;
    }

//    public List<MenuVo> forMenu(List<MenuVo> maxMenu, long userId) {
//        for (MenuVo menu : maxMenu) {
//            long id = menu.getId();
//            List<MenuVo> menuVos = authMenuMapper.selectIndexMenu(userId, id);
//            if (menuVos.size() > 0) {
//                forMenu(menuVos, userId);
//            }
//            menu.setChildren(listToArray(menuVos));
//        }
//
//        return maxMenu;
//    }

}
