package org.ks.sys.authmenu.service;

import org.ks.sys.vo.MenuVo;
import org.ks.util.ResultInfo;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author wangsong
 */
@Service
public interface AuthMenuService {
    /**
     *方法实现说明 查询所有的菜单(当前权限拥有的菜单check=false)
     * @param authId
     * @return
     */
    public ResultInfo<List<MenuVo>> selectAllMenu(long authId);

    /**
     * 插入权限菜单的中间表
     * @param authId 权限id
     * @param args  权限关联的菜单
     * @return
     */
    public ResultInfo<Integer> updateAuthMenu(String authId,String args);

    /**
     * 查询所有的菜单  用来生成主页的菜单
     * @param userId
     * @return
     */
    public ResultInfo<List<MenuVo>> selectIndexMenu(long userId);

    /**
     * 清除缓存
     */
    public void deleteCache();
}
