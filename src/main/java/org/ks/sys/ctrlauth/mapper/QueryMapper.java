package org.ks.sys.ctrlauth.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QueryMapper {
    /**
     * queryCtrlByUserId
     * @param ctrlUserId
     * @return
     */
    @Select("select tci.ctrl_addr from tbl_user_ctrl_rel tcur \n" +
            "LEFT JOIN tbl_ctrl_info tci on tci.ctrl_id = tcur.ctrl_id\n" +
            "where tcur.ctrl_user_id = #{ctrlUserId}")
    List<String> queryCtrlByUserId(long ctrlUserId);
}
