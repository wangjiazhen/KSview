package org.ks.sys.group.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ks.sys.group.vo.GroupVo;

/**
 * @author wangbiao
 */
@Mapper
public interface GroupMapper {
    /**
     * 是否启用状态切换
     * @param groupVo
     * @return
     */
    int updateFalg(GroupVo groupVo);

}
