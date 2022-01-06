package org.ks.sys.org.service;

import org.ks.sys.org.vo.OrgDto;
import org.ks.sys.org.vo.OrgVo;
import org.ks.util.ResultInfo;

import org.ks.sys.po.TblOrg;

public interface OrgService {

    /**
     * 查询所有的机制
     * @param orgDto
     * @return
     */

    ResultInfo selectTiaojian(OrgDto orgDto);



    /**
     * 插入数据
     * @param record
     * @return
     */
    ResultInfo insertSelective(TblOrg record);

    /**
     * 根据Id查询对象
     * @param orgId
     * @return
     */
    ResultInfo selectByPrimaryKey(Long orgId);

    /**
     * 修改
     * @param record
     * @return
     */
    ResultInfo updateByPrimaryKeySelective(TblOrg record);


    /**
     * 修改flag
     * @param orgVo
     * @return
     */
    ResultInfo upFlag(OrgVo orgVo);
}
