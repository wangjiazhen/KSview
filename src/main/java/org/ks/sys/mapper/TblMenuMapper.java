package org.ks.sys.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.ks.sys.po.TblMenu;
import org.ks.sys.po.TblMenuExample;

public interface TblMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    long countByExample(TblMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int deleteByExample(TblMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int deleteByPrimaryKey(Long menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int insert(TblMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int insertSelective(TblMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    List<TblMenu> selectByExample(TblMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    TblMenu selectByPrimaryKey(Long menuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int updateByExampleSelective(@Param("record") TblMenu record, @Param("example") TblMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int updateByExample(@Param("record") TblMenu record, @Param("example") TblMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int updateByPrimaryKeySelective(TblMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    int updateByPrimaryKey(TblMenu record);
}