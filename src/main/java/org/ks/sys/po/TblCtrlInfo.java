package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblCtrlInfo implements Serializable {
    /**
     * id
     * tbl_ctrl_info.ctrl_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Long ctrlId;

    /**
     * 账号
     * tbl_ctrl_info.ctrl_addr
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String ctrlAddr;

    /**
     * 密码
     * tbl_ctrl_info.ctrl_name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String ctrlName;

    /**
     * 用户描述
     * tbl_ctrl_info.ctrl_desc
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String ctrlDesc;

    /**
     * 启用标志 0-否 1-是
     * tbl_ctrl_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_ctrl_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_ctrl_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_ctrl_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_ctrl_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * tbl_ctrl_info.ctrl_id
     *
     * @return the value of tbl_ctrl_info.ctrl_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Long getCtrlId() {
        return ctrlId;
    }

    /**
     * id
     * tbl_ctrl_info.ctrl_id
     *
     * @param ctrlId the value for tbl_ctrl_info.ctrl_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlId(Long ctrlId) {
        this.ctrlId = ctrlId;
    }

    /**
     * 账号
     * tbl_ctrl_info.ctrl_addr
     *
     * @return the value of tbl_ctrl_info.ctrl_addr
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCtrlAddr() {
        return ctrlAddr;
    }

    /**
     * 账号
     * tbl_ctrl_info.ctrl_addr
     *
     * @param ctrlAddr the value for tbl_ctrl_info.ctrl_addr
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlAddr(String ctrlAddr) {
        this.ctrlAddr = ctrlAddr;
    }

    /**
     * 密码
     * tbl_ctrl_info.ctrl_name
     *
     * @return the value of tbl_ctrl_info.ctrl_name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCtrlName() {
        return ctrlName;
    }

    /**
     * 密码
     * tbl_ctrl_info.ctrl_name
     *
     * @param ctrlName the value for tbl_ctrl_info.ctrl_name
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlName(String ctrlName) {
        this.ctrlName = ctrlName;
    }

    /**
     * 用户描述
     * tbl_ctrl_info.ctrl_desc
     *
     * @return the value of tbl_ctrl_info.ctrl_desc
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCtrlDesc() {
        return ctrlDesc;
    }

    /**
     * 用户描述
     * tbl_ctrl_info.ctrl_desc
     *
     * @param ctrlDesc the value for tbl_ctrl_info.ctrl_desc
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlDesc(String ctrlDesc) {
        this.ctrlDesc = ctrlDesc;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_ctrl_info.use_flag
     *
     * @return the value of tbl_ctrl_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_ctrl_info.use_flag
     *
     * @param useFlag the value for tbl_ctrl_info.use_flag
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_ctrl_info.create_time
     *
     * @return the value of tbl_ctrl_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_ctrl_info.create_time
     *
     * @param createTime the value for tbl_ctrl_info.create_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_ctrl_info.create_acct
     *
     * @return the value of tbl_ctrl_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_ctrl_info.create_acct
     *
     * @param createAcct the value for tbl_ctrl_info.create_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_ctrl_info.update_time
     *
     * @return the value of tbl_ctrl_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_ctrl_info.update_time
     *
     * @param updateTime the value for tbl_ctrl_info.update_time
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_ctrl_info.update_acct
     *
     * @return the value of tbl_ctrl_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_ctrl_info.update_acct
     *
     * @param updateAcct the value for tbl_ctrl_info.update_acct
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ctrlId=").append(ctrlId);
        sb.append(", ctrlAddr=").append(ctrlAddr);
        sb.append(", ctrlName=").append(ctrlName);
        sb.append(", ctrlDesc=").append(ctrlDesc);
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