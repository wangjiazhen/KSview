package org.ks.sys.mapper;

import org.ks.sys.group.dto.FormInfoData;
import org.ks.sys.po.TblGroup;

import java.util.List;

public interface TblGroupCustomMapper {
    /**
     * 排序查询所有用户组信息
     * @return
     */
    List<TblGroup> selectListGroup(FormInfoData groupNameInfo);

}
