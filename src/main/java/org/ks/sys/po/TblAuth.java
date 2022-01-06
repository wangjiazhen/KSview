package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblAuth implements Serializable {
    /**
     * tbl_auth.auth_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Long authId;

    /**
     * 权限代码
     * tbl_auth.auth_code
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String authCode;

    /**
     * 权限名称
     * tbl_auth.auth_name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String authName;

    /**
     * 系统代码
     * tbl_auth.sys_code
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String sysCode;

    /**
     * 排序
     * tbl_auth.seq
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Integer seq;

    /**
     * 启用标志 0-否 1-是
     * tbl_auth.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_auth.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_auth.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_auth.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_auth.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_auth
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * tbl_auth.auth_id
     *
     * @return the value of tbl_auth.auth_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Long getAuthId() {
        return authId;
    }

    /**
     * tbl_auth.auth_id
     *
     * @param authId the value for tbl_auth.auth_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    /**
     * 权限代码
     * tbl_auth.auth_code
     *
     * @return the value of tbl_auth.auth_code
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * 权限代码
     * tbl_auth.auth_code
     *
     * @param authCode the value for tbl_auth.auth_code
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * 权限名称
     * tbl_auth.auth_name
     *
     * @return the value of tbl_auth.auth_name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getAuthName() {
        return authName;
    }

    /**
     * 权限名称
     * tbl_auth.auth_name
     *
     * @param authName the value for tbl_auth.auth_name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setAuthName(String authName) {
        this.authName = authName;
    }

    /**
     * 系统代码
     * tbl_auth.sys_code
     *
     * @return the value of tbl_auth.sys_code
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 系统代码
     * tbl_auth.sys_code
     *
     * @param sysCode the value for tbl_auth.sys_code
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * 排序
     * tbl_auth.seq
     *
     * @return the value of tbl_auth.seq
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 排序
     * tbl_auth.seq
     *
     * @param seq the value for tbl_auth.seq
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_auth.use_flag
     *
     * @return the value of tbl_auth.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_auth.use_flag
     *
     * @param useFlag the value for tbl_auth.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_auth.create_time
     *
     * @return the value of tbl_auth.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_auth.create_time
     *
     * @param createTime the value for tbl_auth.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_auth.create_acct
     *
     * @return the value of tbl_auth.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_auth.create_acct
     *
     * @param createAcct the value for tbl_auth.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_auth.update_time
     *
     * @return the value of tbl_auth.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_auth.update_time
     *
     * @param updateTime the value for tbl_auth.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_auth.update_acct
     *
     * @return the value of tbl_auth.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_auth.update_acct
     *
     * @param updateAcct the value for tbl_auth.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_auth
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authId=").append(authId);
        sb.append(", authCode=").append(authCode);
        sb.append(", authName=").append(authName);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", seq=").append(seq);
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