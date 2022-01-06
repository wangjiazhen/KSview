package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblCtrlUserInfo implements Serializable {
    /**
     * id
     * tbl_ctrl_user_info.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Long ctrlUserId;

    /**
     * 账号
     * tbl_ctrl_user_info.app_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String appId;

    /**
     * 密码
     * tbl_ctrl_user_info.app_secret
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String appSecret;

    /**
     * 用户描述
     * tbl_ctrl_user_info.name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String name;

    /**
     * 启用标志 0-否 1-是
     * tbl_ctrl_user_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Integer useFlag;

    /**
     * 用户类型
     * tbl_ctrl_user_info.user_type
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Integer userType;

    /**
     * 预留邮箱
     * tbl_ctrl_user_info.mail_addr
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String mailAddr;

    /**
     * 创建时间
     * tbl_ctrl_user_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_ctrl_user_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_ctrl_user_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_ctrl_user_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * tbl_ctrl_user_info.ctrl_user_id
     *
     * @return the value of tbl_ctrl_user_info.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Long getCtrlUserId() {
        return ctrlUserId;
    }

    /**
     * id
     * tbl_ctrl_user_info.ctrl_user_id
     *
     * @param ctrlUserId the value for tbl_ctrl_user_info.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlUserId(Long ctrlUserId) {
        this.ctrlUserId = ctrlUserId;
    }

    /**
     * 账号
     * tbl_ctrl_user_info.app_id
     *
     * @return the value of tbl_ctrl_user_info.app_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 账号
     * tbl_ctrl_user_info.app_id
     *
     * @param appId the value for tbl_ctrl_user_info.app_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 密码
     * tbl_ctrl_user_info.app_secret
     *
     * @return the value of tbl_ctrl_user_info.app_secret
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * 密码
     * tbl_ctrl_user_info.app_secret
     *
     * @param appSecret the value for tbl_ctrl_user_info.app_secret
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    /**
     * 用户描述
     * tbl_ctrl_user_info.name
     *
     * @return the value of tbl_ctrl_user_info.name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * 用户描述
     * tbl_ctrl_user_info.name
     *
     * @param name the value for tbl_ctrl_user_info.name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_ctrl_user_info.use_flag
     *
     * @return the value of tbl_ctrl_user_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_ctrl_user_info.use_flag
     *
     * @param useFlag the value for tbl_ctrl_user_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 用户类型
     * tbl_ctrl_user_info.user_type
     *
     * @return the value of tbl_ctrl_user_info.user_type
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型
     * tbl_ctrl_user_info.user_type
     *
     * @param userType the value for tbl_ctrl_user_info.user_type
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 预留邮箱
     * tbl_ctrl_user_info.mail_addr
     *
     * @return the value of tbl_ctrl_user_info.mail_addr
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getMailAddr() {
        return mailAddr;
    }

    /**
     * 预留邮箱
     * tbl_ctrl_user_info.mail_addr
     *
     * @param mailAddr the value for tbl_ctrl_user_info.mail_addr
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    /**
     * 创建时间
     * tbl_ctrl_user_info.create_time
     *
     * @return the value of tbl_ctrl_user_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_ctrl_user_info.create_time
     *
     * @param createTime the value for tbl_ctrl_user_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_ctrl_user_info.create_acct
     *
     * @return the value of tbl_ctrl_user_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_ctrl_user_info.create_acct
     *
     * @param createAcct the value for tbl_ctrl_user_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_ctrl_user_info.update_time
     *
     * @return the value of tbl_ctrl_user_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_ctrl_user_info.update_time
     *
     * @param updateTime the value for tbl_ctrl_user_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_ctrl_user_info.update_acct
     *
     * @return the value of tbl_ctrl_user_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_ctrl_user_info.update_acct
     *
     * @param updateAcct the value for tbl_ctrl_user_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ctrlUserId=").append(ctrlUserId);
        sb.append(", appId=").append(appId);
        sb.append(", appSecret=").append(appSecret);
        sb.append(", name=").append(name);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", userType=").append(userType);
        sb.append(", mailAddr=").append(mailAddr);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAcct=").append(createAcct);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateAcct=").append(updateAcct);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}