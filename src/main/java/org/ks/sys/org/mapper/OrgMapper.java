package org.ks.sys.org.mapper;

import org.ks.sys.org.vo.OrgDto;
import org.ks.sys.org.vo.OrgVo;
import org.ks.sys.po.TblOrg;

import java.util.List;

public interface OrgMapper {
    /**
     * 修改flag
     * @param orgVo
     * @return
     */
    int upFlag(OrgVo orgVo);


    /**
     * 是否重复
     * @param tblOrg
     * @return
     */
    List<TblOrg> ckChongFu(TblOrg tblOrg);

    /**
     * 添加查询
     * @param orgDto
     * @return
     */
    List<TblOrg> selectTiaojian(OrgDto orgDto);
}
