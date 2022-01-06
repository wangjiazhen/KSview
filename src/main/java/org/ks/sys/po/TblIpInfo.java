package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblIpInfo implements Serializable {
    /**
     * id
     * tbl_ip_info.iid
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Long iid;

    /**
     * ip
     * tbl_ip_info.ip
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String ip;

    /**
     * ip所属用户
     * tbl_ip_info.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String ctrlUserId;

    /**
     * 启用标志 0-否 1-是
     * tbl_ip_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_ip_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_ip_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_ip_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_ip_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_ip_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * tbl_ip_info.iid
     *
     * @return the value of tbl_ip_info.iid
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Long getIid() {
        return iid;
    }

    /**
     * id
     * tbl_ip_info.iid
     *
     * @param iid the value for tbl_ip_info.iid
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setIid(Long iid) {
        this.iid = iid;
    }

    /**
     * ip
     * tbl_ip_info.ip
     *
     * @return the value of tbl_ip_info.ip
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * ip
     * tbl_ip_info.ip
     *
     * @param ip the value for tbl_ip_info.ip
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * ip所属用户
     * tbl_ip_info.ctrl_user_id
     *
     * @return the value of tbl_ip_info.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCtrlUserId() {
        return ctrlUserId;
    }

    /**
     * ip所属用户
     * tbl_ip_info.ctrl_user_id
     *
     * @param ctrlUserId the value for tbl_ip_info.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlUserId(String ctrlUserId) {
        this.ctrlUserId = ctrlUserId;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_ip_info.use_flag
     *
     * @return the value of tbl_ip_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_ip_info.use_flag
     *
     * @param useFlag the value for tbl_ip_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_ip_info.create_time
     *
     * @return the value of tbl_ip_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_ip_info.create_time
     *
     * @param createTime the value for tbl_ip_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_ip_info.create_acct
     *
     * @return the value of tbl_ip_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_ip_info.create_acct
     *
     * @param createAcct the value for tbl_ip_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_ip_info.update_time
     *
     * @return the value of tbl_ip_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_ip_info.update_time
     *
     * @param updateTime the value for tbl_ip_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_ip_info.update_acct
     *
     * @return the value of tbl_ip_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_ip_info.update_acct
     *
     * @param updateAcct the value for tbl_ip_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ip_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", iid=").append(iid);
        sb.append(", ip=").append(ip);
        sb.append(", ctrlUserId=").append(ctrlUserId);
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