package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblRole implements Serializable {
    /**
     * tbl_role.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long roleId;

    /**
     * 角色代码
     * tbl_role.role_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String roleCode;

    /**
     * 角色名称
     * tbl_role.role_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String roleName;

    /**
     * 启用标志 0-否 1-是
     * tbl_role.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_role.create_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_role.create_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_role.update_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_role.update_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_role
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * tbl_role.role_id
     *
     * @return the value of tbl_role.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * tbl_role.role_id
     *
     * @param roleId the value for tbl_role.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 角色代码
     * tbl_role.role_code
     *
     * @return the value of tbl_role.role_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 角色代码
     * tbl_role.role_code
     *
     * @param roleCode the value for tbl_role.role_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 角色名称
     * tbl_role.role_name
     *
     * @return the value of tbl_role.role_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * tbl_role.role_name
     *
     * @param roleName the value for tbl_role.role_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_role.use_flag
     *
     * @return the value of tbl_role.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_role.use_flag
     *
     * @param useFlag the value for tbl_role.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_role.create_time
     *
     * @return the value of tbl_role.create_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_role.create_time
     *
     * @param createTime the value for tbl_role.create_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_role.create_acct
     *
     * @return the value of tbl_role.create_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_role.create_acct
     *
     * @param createAcct the value for tbl_role.create_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_role.update_time
     *
     * @return the value of tbl_role.update_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_role.update_time
     *
     * @param updateTime the value for tbl_role.update_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_role.update_acct
     *
     * @return the value of tbl_role.update_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_role.update_acct
     *
     * @param updateAcct the value for tbl_role.update_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_role
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleName=").append(roleName);
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