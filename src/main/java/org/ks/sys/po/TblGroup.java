package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblGroup implements Serializable {
    /**
     * tbl_group.group_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long groupId;

    /**
     * 用户组名称
     * tbl_group.group_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String groupName;

    /**
     * 用户组代码
     * tbl_group.group_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String groupCode;

    /**
     * 启用标志 0-否 1-是
     * tbl_group.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_group.create_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_group.create_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_group.update_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_group.update_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_group
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * tbl_group.group_id
     *
     * @return the value of tbl_group.group_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * tbl_group.group_id
     *
     * @param groupId the value for tbl_group.group_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 用户组名称
     * tbl_group.group_name
     *
     * @return the value of tbl_group.group_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 用户组名称
     * tbl_group.group_name
     *
     * @param groupName the value for tbl_group.group_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 用户组代码
     * tbl_group.group_code
     *
     * @return the value of tbl_group.group_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 用户组代码
     * tbl_group.group_code
     *
     * @param groupCode the value for tbl_group.group_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_group.use_flag
     *
     * @return the value of tbl_group.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_group.use_flag
     *
     * @param useFlag the value for tbl_group.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_group.create_time
     *
     * @return the value of tbl_group.create_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_group.create_time
     *
     * @param createTime the value for tbl_group.create_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_group.create_acct
     *
     * @return the value of tbl_group.create_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_group.create_acct
     *
     * @param createAcct the value for tbl_group.create_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_group.update_time
     *
     * @return the value of tbl_group.update_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_group.update_time
     *
     * @param updateTime the value for tbl_group.update_time
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_group.update_acct
     *
     * @return the value of tbl_group.update_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_group.update_acct
     *
     * @param updateAcct the value for tbl_group.update_acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_group
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", groupCode=").append(groupCode);
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