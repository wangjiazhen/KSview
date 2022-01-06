package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblPreapprovalLog implements Serializable {
    /**
     * 日志id
     * tbl_preapproval_log.log_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private Long logId;

    /**
     * 接口代码
     * tbl_preapproval_log.api_code
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String apiCode;

    /**
     * 接口描述
     * tbl_preapproval_log.api_desc
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String apiDesc;

    /**
     * 接口类型（0-发送，1-接受）
     * tbl_preapproval_log.api_type
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private Integer apiType;

    /**
     * 人员id
     * tbl_preapproval_log.persion_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String persionId;

    /**
     * 申请id
     * tbl_preapproval_log.apply_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String applyId;

    /**
     * 接口开始时间
     * tbl_preapproval_log.api_start_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private Date apiStartTime;

    /**
     * 接口结束时间
     * tbl_preapproval_log.api_end_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private Date apiEndTime;

    /**
     * 发送报文
     * tbl_preapproval_log.req_msg
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String reqMsg;

    /**
     * 接受报文
     * tbl_preapproval_log.res_msg
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String resMsg;

    /**
     * 创建人
     * tbl_preapproval_log.create_acct
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String createAcct;

    /**
     * 创建时间
     * tbl_preapproval_log.create_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private Date createTime;

    /**
     * 修改人
     * tbl_preapproval_log.update_acct
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private String updateAcct;

    /**
     * 修改时间
     * tbl_preapproval_log.update_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private Date updateTime;

    /**
     * tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 日志id
     * tbl_preapproval_log.log_id
     *
     * @return the value of tbl_preapproval_log.log_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * 日志id
     * tbl_preapproval_log.log_id
     *
     * @param logId the value for tbl_preapproval_log.log_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * 接口代码
     * tbl_preapproval_log.api_code
     *
     * @return the value of tbl_preapproval_log.api_code
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getApiCode() {
        return apiCode;
    }

    /**
     * 接口代码
     * tbl_preapproval_log.api_code
     *
     * @param apiCode the value for tbl_preapproval_log.api_code
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setApiCode(String apiCode) {
        this.apiCode = apiCode;
    }

    /**
     * 接口描述
     * tbl_preapproval_log.api_desc
     *
     * @return the value of tbl_preapproval_log.api_desc
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getApiDesc() {
        return apiDesc;
    }

    /**
     * 接口描述
     * tbl_preapproval_log.api_desc
     *
     * @param apiDesc the value for tbl_preapproval_log.api_desc
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc;
    }

    /**
     * 接口类型（0-发送，1-接受）
     * tbl_preapproval_log.api_type
     *
     * @return the value of tbl_preapproval_log.api_type
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public Integer getApiType() {
        return apiType;
    }

    /**
     * 接口类型（0-发送，1-接受）
     * tbl_preapproval_log.api_type
     *
     * @param apiType the value for tbl_preapproval_log.api_type
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    /**
     * 人员id
     * tbl_preapproval_log.persion_id
     *
     * @return the value of tbl_preapproval_log.persion_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getPersionId() {
        return persionId;
    }

    /**
     * 人员id
     * tbl_preapproval_log.persion_id
     *
     * @param persionId the value for tbl_preapproval_log.persion_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setPersionId(String persionId) {
        this.persionId = persionId;
    }

    /**
     * 申请id
     * tbl_preapproval_log.apply_id
     *
     * @return the value of tbl_preapproval_log.apply_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 申请id
     * tbl_preapproval_log.apply_id
     *
     * @param applyId the value for tbl_preapproval_log.apply_id
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * 接口开始时间
     * tbl_preapproval_log.api_start_time
     *
     * @return the value of tbl_preapproval_log.api_start_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public Date getApiStartTime() {
        return apiStartTime;
    }

    /**
     * 接口开始时间
     * tbl_preapproval_log.api_start_time
     *
     * @param apiStartTime the value for tbl_preapproval_log.api_start_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setApiStartTime(Date apiStartTime) {
        this.apiStartTime = apiStartTime;
    }

    /**
     * 接口结束时间
     * tbl_preapproval_log.api_end_time
     *
     * @return the value of tbl_preapproval_log.api_end_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public Date getApiEndTime() {
        return apiEndTime;
    }

    /**
     * 接口结束时间
     * tbl_preapproval_log.api_end_time
     *
     * @param apiEndTime the value for tbl_preapproval_log.api_end_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setApiEndTime(Date apiEndTime) {
        this.apiEndTime = apiEndTime;
    }

    /**
     * 发送报文
     * tbl_preapproval_log.req_msg
     *
     * @return the value of tbl_preapproval_log.req_msg
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getReqMsg() {
        return reqMsg;
    }

    /**
     * 发送报文
     * tbl_preapproval_log.req_msg
     *
     * @param reqMsg the value for tbl_preapproval_log.req_msg
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg;
    }

    /**
     * 接受报文
     * tbl_preapproval_log.res_msg
     *
     * @return the value of tbl_preapproval_log.res_msg
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getResMsg() {
        return resMsg;
    }

    /**
     * 接受报文
     * tbl_preapproval_log.res_msg
     *
     * @param resMsg the value for tbl_preapproval_log.res_msg
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    /**
     * 创建人
     * tbl_preapproval_log.create_acct
     *
     * @return the value of tbl_preapproval_log.create_acct
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人
     * tbl_preapproval_log.create_acct
     *
     * @param createAcct the value for tbl_preapproval_log.create_acct
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 创建时间
     * tbl_preapproval_log.create_time
     *
     * @return the value of tbl_preapproval_log.create_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_preapproval_log.create_time
     *
     * @param createTime the value for tbl_preapproval_log.create_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * tbl_preapproval_log.update_acct
     *
     * @return the value of tbl_preapproval_log.update_acct
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 修改人
     * tbl_preapproval_log.update_acct
     *
     * @param updateAcct the value for tbl_preapproval_log.update_acct
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * 修改时间
     * tbl_preapproval_log.update_time
     *
     * @return the value of tbl_preapproval_log.update_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * tbl_preapproval_log.update_time
     *
     * @param updateTime the value for tbl_preapproval_log.update_time
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_preapproval_log
     *
     * @mbg.generated Fri Sep 18 10:58:35 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", apiCode=").append(apiCode);
        sb.append(", apiDesc=").append(apiDesc);
        sb.append(", apiType=").append(apiType);
        sb.append(", persionId=").append(persionId);
        sb.append(", applyId=").append(applyId);
        sb.append(", apiStartTime=").append(apiStartTime);
        sb.append(", apiEndTime=").append(apiEndTime);
        sb.append(", reqMsg=").append(reqMsg);
        sb.append(", resMsg=").append(resMsg);
        sb.append(", createAcct=").append(createAcct);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateAcct=").append(updateAcct);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}