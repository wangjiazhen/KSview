package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblApprovaApplyInfo implements Serializable {
    /**
     * 申请id
     * tbl_approva_apply_info.apply_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String applyId;

    /**
     * 人员id
     * tbl_approva_apply_info.persion_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private Long persionId;

    /**
     * 业务员邀请码
     * tbl_approva_apply_info.invitation_code
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String invitationCode;

    /**
     * 产品大类id
     * tbl_approva_apply_info.pro_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String proId;

    /**
     * 产品大类名字
     * tbl_approva_apply_info.pro_name
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String proName;

    /**
     * 车辆大类
     * tbl_approva_apply_info.car_type
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String carType;

    /**
     * 车型
     * tbl_approva_apply_info.car_model
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String carModel;

    /**
     * 申请状态
     * tbl_approva_apply_info.status
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private Integer status;

    /**
     * 不通过原因
     * tbl_approva_apply_info.result_desc
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String resultDesc;

    /**
     * 是否启用
     * tbl_approva_apply_info.use_flag
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建人
     * tbl_approva_apply_info.create_acct
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String createAcct;

    /**
     * 创建时间
     * tbl_approva_apply_info.create_time
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private Date createTime;

    /**
     * 修改人
     * tbl_approva_apply_info.update_acct
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private String updateAcct;

    /**
     * 修改时间
     * tbl_approva_apply_info.update_time
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private Date updateTime;

    /**
     * tbl_approva_apply_info
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 申请id
     * tbl_approva_apply_info.apply_id
     *
     * @return the value of tbl_approva_apply_info.apply_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * 申请id
     * tbl_approva_apply_info.apply_id
     *
     * @param applyId the value for tbl_approva_apply_info.apply_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    /**
     * 人员id
     * tbl_approva_apply_info.persion_id
     *
     * @return the value of tbl_approva_apply_info.persion_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public Long getPersionId() {
        return persionId;
    }

    /**
     * 人员id
     * tbl_approva_apply_info.persion_id
     *
     * @param persionId the value for tbl_approva_apply_info.persion_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setPersionId(Long persionId) {
        this.persionId = persionId;
    }

    /**
     * 业务员邀请码
     * tbl_approva_apply_info.invitation_code
     *
     * @return the value of tbl_approva_apply_info.invitation_code
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * 业务员邀请码
     * tbl_approva_apply_info.invitation_code
     *
     * @param invitationCode the value for tbl_approva_apply_info.invitation_code
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    /**
     * 产品大类id
     * tbl_approva_apply_info.pro_id
     *
     * @return the value of tbl_approva_apply_info.pro_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getProId() {
        return proId;
    }

    /**
     * 产品大类id
     * tbl_approva_apply_info.pro_id
     *
     * @param proId the value for tbl_approva_apply_info.pro_id
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setProId(String proId) {
        this.proId = proId;
    }

    /**
     * 产品大类名字
     * tbl_approva_apply_info.pro_name
     *
     * @return the value of tbl_approva_apply_info.pro_name
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getProName() {
        return proName;
    }

    /**
     * 产品大类名字
     * tbl_approva_apply_info.pro_name
     *
     * @param proName the value for tbl_approva_apply_info.pro_name
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * 车辆大类
     * tbl_approva_apply_info.car_type
     *
     * @return the value of tbl_approva_apply_info.car_type
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getCarType() {
        return carType;
    }

    /**
     * 车辆大类
     * tbl_approva_apply_info.car_type
     *
     * @param carType the value for tbl_approva_apply_info.car_type
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * 车型
     * tbl_approva_apply_info.car_model
     *
     * @return the value of tbl_approva_apply_info.car_model
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 车型
     * tbl_approva_apply_info.car_model
     *
     * @param carModel the value for tbl_approva_apply_info.car_model
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * 申请状态
     * tbl_approva_apply_info.status
     *
     * @return the value of tbl_approva_apply_info.status
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 申请状态
     * tbl_approva_apply_info.status
     *
     * @param status the value for tbl_approva_apply_info.status
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 不通过原因
     * tbl_approva_apply_info.result_desc
     *
     * @return the value of tbl_approva_apply_info.result_desc
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * 不通过原因
     * tbl_approva_apply_info.result_desc
     *
     * @param resultDesc the value for tbl_approva_apply_info.result_desc
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    /**
     * 是否启用
     * tbl_approva_apply_info.use_flag
     *
     * @return the value of tbl_approva_apply_info.use_flag
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 是否启用
     * tbl_approva_apply_info.use_flag
     *
     * @param useFlag the value for tbl_approva_apply_info.use_flag
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建人
     * tbl_approva_apply_info.create_acct
     *
     * @return the value of tbl_approva_apply_info.create_acct
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人
     * tbl_approva_apply_info.create_acct
     *
     * @param createAcct the value for tbl_approva_apply_info.create_acct
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 创建时间
     * tbl_approva_apply_info.create_time
     *
     * @return the value of tbl_approva_apply_info.create_time
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_approva_apply_info.create_time
     *
     * @param createTime the value for tbl_approva_apply_info.create_time
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * tbl_approva_apply_info.update_acct
     *
     * @return the value of tbl_approva_apply_info.update_acct
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 修改人
     * tbl_approva_apply_info.update_acct
     *
     * @param updateAcct the value for tbl_approva_apply_info.update_acct
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * 修改时间
     * tbl_approva_apply_info.update_time
     *
     * @return the value of tbl_approva_apply_info.update_time
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * tbl_approva_apply_info.update_time
     *
     * @param updateTime the value for tbl_approva_apply_info.update_time
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_approva_apply_info
     *
     * @mbg.generated Thu Nov 19 15:20:51 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applyId=").append(applyId);
        sb.append(", persionId=").append(persionId);
        sb.append(", invitationCode=").append(invitationCode);
        sb.append(", proId=").append(proId);
        sb.append(", proName=").append(proName);
        sb.append(", carType=").append(carType);
        sb.append(", carModel=").append(carModel);
        sb.append(", status=").append(status);
        sb.append(", resultDesc=").append(resultDesc);
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