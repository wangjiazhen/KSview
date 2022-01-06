package org.ks.sys.declaration.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.ks.sys.declaration.bean.TblDeclaration;
import org.ks.sys.declaration.bean.TblDeclarationExample;

public interface TblDeclarationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    long countByExample(TblDeclarationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int deleteByExample(TblDeclarationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int deleteByPrimaryKey(Long declId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int insert(TblDeclaration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int insertSelective(TblDeclaration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    List<TblDeclaration> selectByExample(TblDeclarationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    TblDeclaration selectByPrimaryKey(Long declId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int updateByExampleSelective(@Param("record") TblDeclaration record, @Param("example") TblDeclarationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int updateByExample(@Param("record") TblDeclaration record, @Param("example") TblDeclarationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int updateByPrimaryKeySelective(TblDeclaration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Thu Jan 06 17:25:37 CST 2022
     */
    int updateByPrimaryKey(TblDeclaration record);
}