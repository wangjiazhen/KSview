package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblApprovaFileInfo implements Serializable {
    /**
     * 主键id
     * tbl_approva_file_info.file_id
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private Long fileId;

    /**
     * 申请id
     * tbl_approva_file_info.apply_id
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private String applyId;

    /**
     * 附件下载地址
     * tbl_approva_file_info.file_url
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private String fileUrl;

    /**
     * 是否启用
     * tbl_approva_file_info.use_flag
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建人
     * tbl_approva_file_info.create_acct
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private String createAcct;

    /**
     * 创建时间
     * tbl_approva_file_info.create_time
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private Date createTime;

    /**
     * 修改人
     * tbl_approva_file_info.update_acct
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private String updateAcct;

    /**
     * 修改时间
     * tbl_approva_file_info.update_time
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private Date updateTime;

    /**
     * tbl_approva_file_info
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     * tbl_approva_file_info.file_id
     *
     * @return the value of tbl_approva_file_info.file_id
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * 主键id
     * tbl_approva_file_info.file_id
     *
     * @param fileId the value for tbl_approva_file_info.file_id
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * 申请id
     * tbl_approva_file_info.apply_id
     *
     * @return the value of tbl_approva_file_info.apply_id
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 申请id
     * tbl_approva_file_info.apply_id
     *
     * @param applyId the value for tbl_approva_file_info.apply_id
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * 附件下载地址
     * tbl_approva_file_info.file_url
     *
     * @return the value of tbl_approva_file_info.file_url
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 附件下载地址
     * tbl_approva_file_info.file_url
     *
     * @param fileUrl the value for tbl_approva_file_info.file_url
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * 是否启用
     * tbl_approva_file_info.use_flag
     *
     * @return the value of tbl_approva_file_info.use_flag
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 是否启用
     * tbl_approva_file_info.use_flag
     *
     * @param useFlag the value for tbl_approva_file_info.use_flag
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建人
     * tbl_approva_file_info.create_acct
     *
     * @return the value of tbl_approva_file_info.create_acct
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人
     * tbl_approva_file_info.create_acct
     *
     * @param createAcct the value for tbl_approva_file_info.create_acct
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 创建时间
     * tbl_approva_file_info.create_time
     *
     * @return the value of tbl_approva_file_info.create_time
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_approva_file_info.create_time
     *
     * @param createTime the value for tbl_approva_file_info.create_time
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * tbl_approva_file_info.update_acct
     *
     * @return the value of tbl_approva_file_info.update_acct
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 修改人
     * tbl_approva_file_info.update_acct
     *
     * @param updateAcct the value for tbl_approva_file_info.update_acct
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * 修改时间
     * tbl_approva_file_info.update_time
     *
     * @return the value of tbl_approva_file_info.update_time
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * tbl_approva_file_info.update_time
     *
     * @param updateTime the value for tbl_approva_file_info.update_time
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_approva_file_info
     *
     * @mbg.generated Thu Nov 19 15:58:49 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", applyId=").append(applyId);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", createAcct=").append(createAcct);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateAcct=").append(updateAcct);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}