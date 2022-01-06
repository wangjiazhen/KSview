package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblOrg implements Serializable {
    /**
     * tbl_org.org_id
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private Long orgId;

    /**
     * 组织名称
     * tbl_org.org_name
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private String orgName;

    /**
     * 组织代码
     * tbl_org.org_code
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private String orgCode;

    /**
     * 上级机构id
     * tbl_org.father_id
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private Long fatherId;

    /**
     * 组织类型代码
     * tbl_org.org_type_code
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private String orgTypeCode;

    /**
     * 启用标志 0-否 1-是
     * tbl_org.use_flag
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_org.create_time
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_org.create_acct
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_org.update_time
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_org.update_acct
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * tbl_org.org_id
     *
     * @return the value of tbl_org.org_id
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * tbl_org.org_id
     *
     * @param orgId the value for tbl_org.org_id
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 组织名称
     * tbl_org.org_name
     *
     * @return the value of tbl_org.org_name
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 组织名称
     * tbl_org.org_name
     *
     * @param orgName the value for tbl_org.org_name
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 组织代码
     * tbl_org.org_code
     *
     * @return the value of tbl_org.org_code
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 组织代码
     * tbl_org.org_code
     *
     * @param orgCode the value for tbl_org.org_code
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 上级机构id
     * tbl_org.father_id
     *
     * @return the value of tbl_org.father_id
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public Long getFatherId() {
        return fatherId;
    }

    /**
     * 上级机构id
     * tbl_org.father_id
     *
     * @param fatherId the value for tbl_org.father_id
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 组织类型代码
     * tbl_org.org_type_code
     *
     * @return the value of tbl_org.org_type_code
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public String getOrgTypeCode() {
        return orgTypeCode;
    }

    /**
     * 组织类型代码
     * tbl_org.org_type_code
     *
     * @param orgTypeCode the value for tbl_org.org_type_code
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setOrgTypeCode(String orgTypeCode) {
        this.orgTypeCode = orgTypeCode;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_org.use_flag
     *
     * @return the value of tbl_org.use_flag
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_org.use_flag
     *
     * @param useFlag the value for tbl_org.use_flag
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_org.create_time
     *
     * @return the value of tbl_org.create_time
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_org.create_time
     *
     * @param createTime the value for tbl_org.create_time
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_org.create_acct
     *
     * @return the value of tbl_org.create_acct
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_org.create_acct
     *
     * @param createAcct the value for tbl_org.create_acct
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_org.update_time
     *
     * @return the value of tbl_org.update_time
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_org.update_time
     *
     * @param updateTime the value for tbl_org.update_time
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_org.update_acct
     *
     * @return the value of tbl_org.update_acct
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_org.update_acct
     *
     * @param updateAcct the value for tbl_org.update_acct
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", fatherId=").append(fatherId);
        sb.append(", orgTypeCode=").append(orgTypeCode);
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