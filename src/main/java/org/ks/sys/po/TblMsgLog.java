package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblMsgLog implements Serializable {
    /**
     * id
     * tbl_msg_log.id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String id;

    /**
     * 印章号
     * tbl_msg_log.api_no
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String apiNo;

    /**
     * 接口类型1-接收 2-发送
     * tbl_msg_log.api_type
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String apiType;

    /**
     * 接口名称
     * tbl_msg_log.api_desc
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String apiDesc;

    /**
     * 开始时间
     * tbl_msg_log.api_start_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private Date apiStartTime;

    /**
     * 发送报文
     * tbl_msg_log.api_req_msg
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String apiReqMsg;

    /**
     * 返回报文
     * tbl_msg_log.api_res_msg
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String apiResMsg;

    /**
     * 是否成功
     * tbl_msg_log.api_flag
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private Integer apiFlag;

    /**
     * 结束时间
     * tbl_msg_log.api_end_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private Date apiEndTime;

    /**
     * tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * id
     * tbl_msg_log.id
     *
     * @return the value of tbl_msg_log.id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * tbl_msg_log.id
     *
     * @param id the value for tbl_msg_log.id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 印章号
     * tbl_msg_log.api_no
     *
     * @return the value of tbl_msg_log.api_no
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getApiNo() {
        return apiNo;
    }

    /**
     * 印章号
     * tbl_msg_log.api_no
     *
     * @param apiNo the value for tbl_msg_log.api_no
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiNo(String apiNo) {
        this.apiNo = apiNo;
    }

    /**
     * 接口类型1-接收 2-发送
     * tbl_msg_log.api_type
     *
     * @return the value of tbl_msg_log.api_type
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getApiType() {
        return apiType;
    }

    /**
     * 接口类型1-接收 2-发送
     * tbl_msg_log.api_type
     *
     * @param apiType the value for tbl_msg_log.api_type
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    /**
     * 接口名称
     * tbl_msg_log.api_desc
     *
     * @return the value of tbl_msg_log.api_desc
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getApiDesc() {
        return apiDesc;
    }

    /**
     * 接口名称
     * tbl_msg_log.api_desc
     *
     * @param apiDesc the value for tbl_msg_log.api_desc
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc;
    }

    /**
     * 开始时间
     * tbl_msg_log.api_start_time
     *
     * @return the value of tbl_msg_log.api_start_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Date getApiStartTime() {
        return apiStartTime;
    }

    /**
     * 开始时间
     * tbl_msg_log.api_start_time
     *
     * @param apiStartTime the value for tbl_msg_log.api_start_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiStartTime(Date apiStartTime) {
        this.apiStartTime = apiStartTime;
    }

    /**
     * 发送报文
     * tbl_msg_log.api_req_msg
     *
     * @return the value of tbl_msg_log.api_req_msg
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getApiReqMsg() {
        return apiReqMsg;
    }

    /**
     * 发送报文
     * tbl_msg_log.api_req_msg
     *
     * @param apiReqMsg the value for tbl_msg_log.api_req_msg
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiReqMsg(String apiReqMsg) {
        this.apiReqMsg = apiReqMsg;
    }

    /**
     * 返回报文
     * tbl_msg_log.api_res_msg
     *
     * @return the value of tbl_msg_log.api_res_msg
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getApiResMsg() {
        return apiResMsg;
    }

    /**
     * 返回报文
     * tbl_msg_log.api_res_msg
     *
     * @param apiResMsg the value for tbl_msg_log.api_res_msg
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiResMsg(String apiResMsg) {
        this.apiResMsg = apiResMsg;
    }

    /**
     * 是否成功
     * tbl_msg_log.api_flag
     *
     * @return the value of tbl_msg_log.api_flag
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Integer getApiFlag() {
        return apiFlag;
    }

    /**
     * 是否成功
     * tbl_msg_log.api_flag
     *
     * @param apiFlag the value for tbl_msg_log.api_flag
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiFlag(Integer apiFlag) {
        this.apiFlag = apiFlag;
    }

    /**
     * 结束时间
     * tbl_msg_log.api_end_time
     *
     * @return the value of tbl_msg_log.api_end_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Date getApiEndTime() {
        return apiEndTime;
    }

    /**
     * 结束时间
     * tbl_msg_log.api_end_time
     *
     * @param apiEndTime the value for tbl_msg_log.api_end_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setApiEndTime(Date apiEndTime) {
        this.apiEndTime = apiEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", apiNo=").append(apiNo);
        sb.append(", apiType=").append(apiType);
        sb.append(", apiDesc=").append(apiDesc);
        sb.append(", apiStartTime=").append(apiStartTime);
        sb.append(", apiReqMsg=").append(apiReqMsg);
        sb.append(", apiResMsg=").append(apiResMsg);
        sb.append(", apiFlag=").append(apiFlag);
        sb.append(", apiEndTime=").append(apiEndTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}