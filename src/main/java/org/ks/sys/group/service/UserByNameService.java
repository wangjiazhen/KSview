package org.ks.sys.group.service;

import org.ks.sys.po.TblUser;

import java.util.List;

/**
 * @author wangbiao
 */
public interface UserByNameService {
    /**
     * 根据用户名查找出用户
     * @param name
     * @return
     */
    List<TblUser> userByNameSelect(String name);
}
