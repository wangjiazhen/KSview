package org.ks.sys.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.ks.sys.po.TblInvitationCodeInfo;
import org.ks.sys.po.TblInvitationCodeInfoExample;

public interface TblInvitationCodeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    long countByExample(TblInvitationCodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int deleteByExample(TblInvitationCodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int insert(TblInvitationCodeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int insertSelective(TblInvitationCodeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    List<TblInvitationCodeInfo> selectByExample(TblInvitationCodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    TblInvitationCodeInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int updateByExampleSelective(@Param("record") TblInvitationCodeInfo record, @Param("example") TblInvitationCodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int updateByExample(@Param("record") TblInvitationCodeInfo record, @Param("example") TblInvitationCodeInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int updateByPrimaryKeySelective(TblInvitationCodeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invitation_code_info
     *
     * @mbg.generated Wed Sep 23 10:27:02 CST 2020
     */
    int updateByPrimaryKey(TblInvitationCodeInfo record);
}