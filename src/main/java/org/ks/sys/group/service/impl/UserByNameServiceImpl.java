package org.ks.sys.group.service.impl;

import org.ks.sys.group.mapper.UserByNameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ks.sys.group.service.UserByNameService;
import org.ks.sys.po.TblUser;

import java.util.List;

/**
 * @author wangbiao
 */
@Service
public class UserByNameServiceImpl implements UserByNameService {
    @Autowired
    private UserByNameMapper userByNameMapper;

    /**
     * 根据用户名查找用户
     * @param name
     * @return
     */
    @Override
    public List<TblUser> userByNameSelect(String name) {
        List<TblUser> userByName = null;
        if (name != null && !"".equals(name) ){
            userByName = userByNameMapper.getUserByName(name);
            System.out.println(userByName.toString());
            return userByName;
        }
        return userByName;
    }



}
