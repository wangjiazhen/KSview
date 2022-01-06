package org.ks.sys.group.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ks.sys.po.TblUser;

import java.util.List;

/**
 * @author wangbiao
 */
@Mapper
public interface UserByNameMapper {
    /**
     * 根据用户名查找出用户
     * @param name
     * @return
     */
    List<TblUser> getUserByName(String name);
}
