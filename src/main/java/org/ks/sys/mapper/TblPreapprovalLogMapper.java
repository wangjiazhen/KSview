package org.ks.sys.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.ks.sys.po.TblPreapprovalLog;
import org.ks.sys.po.TblPreapprovalLogExample;

public interface TblPreapprovalLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    long countByExample(TblPreapprovalLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int deleteByExample(TblPreapprovalLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int deleteByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int insert(TblPreapprovalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int insertSelective(TblPreapprovalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    List<TblPreapprovalLog> selectByExample(TblPreapprovalLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    TblPreapprovalLog selectByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int updateByExampleSelective(@Param("record") TblPreapprovalLog record, @Param("example") TblPreapprovalLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int updateByExample(@Param("record") TblPreapprovalLog record, @Param("example") TblPreapprovalLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int updateByPrimaryKeySelective(TblPreapprovalLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    int updateByPrimaryKey(TblPreapprovalLog record);
}