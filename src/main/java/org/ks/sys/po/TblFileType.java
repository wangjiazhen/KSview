package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblFileType implements Serializable {
    /**
     * 附件类型id
     * tbl_file_type.type_id
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private Long typeId;

    /**
     * 附件类型名称
     * tbl_file_type.type_name
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private String typeName;

    /**
     * 上级id
     * tbl_file_type.parent_id
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private Long parentId;

    /**
     * 系统代码
     * tbl_file_type.sys_code
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private String sysCode;

    /**
     * 启用标志 0-否 1-是
     * tbl_file_type.use_flag
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_file_type.create_time
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_file_type.create_acct
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_file_type.update_time
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_file_type.update_acct
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_file_type
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 附件类型id
     * tbl_file_type.type_id
     *
     * @return the value of tbl_file_type.type_id
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 附件类型id
     * tbl_file_type.type_id
     *
     * @param typeId the value for tbl_file_type.type_id
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 附件类型名称
     * tbl_file_type.type_name
     *
     * @return the value of tbl_file_type.type_name
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 附件类型名称
     * tbl_file_type.type_name
     *
     * @param typeName the value for tbl_file_type.type_name
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 上级id
     * tbl_file_type.parent_id
     *
     * @return the value of tbl_file_type.parent_id
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 上级id
     * tbl_file_type.parent_id
     *
     * @param parentId the value for tbl_file_type.parent_id
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 系统代码
     * tbl_file_type.sys_code
     *
     * @return the value of tbl_file_type.sys_code
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 系统代码
     * tbl_file_type.sys_code
     *
     * @param sysCode the value for tbl_file_type.sys_code
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_file_type.use_flag
     *
     * @return the value of tbl_file_type.use_flag
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_file_type.use_flag
     *
     * @param useFlag the value for tbl_file_type.use_flag
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_file_type.create_time
     *
     * @return the value of tbl_file_type.create_time
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_file_type.create_time
     *
     * @param createTime the value for tbl_file_type.create_time
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_file_type.create_acct
     *
     * @return the value of tbl_file_type.create_acct
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_file_type.create_acct
     *
     * @param createAcct the value for tbl_file_type.create_acct
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_file_type.update_time
     *
     * @return the value of tbl_file_type.update_time
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_file_type.update_time
     *
     * @param updateTime the value for tbl_file_type.update_time
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_file_type.update_acct
     *
     * @return the value of tbl_file_type.update_acct
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_file_type.update_acct
     *
     * @param updateAcct the value for tbl_file_type.update_acct
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_file_type
     *
     * @mbg.generated Thu May 21 17:17:28 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeId=").append(typeId);
        sb.append(", typeName=").append(typeName);
        sb.append(", parentId=").append(parentId);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAcct=").append(createAcct);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateAcct=").append(updateAcct);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}