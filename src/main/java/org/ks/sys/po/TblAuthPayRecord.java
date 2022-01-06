package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblAuthPayRecord implements Serializable {
    /**
     * tbl_auth_pay_record.register_id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private Long registerId;

    /**
     * tbl_auth_pay_record.person_id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String personId;

    /**
     * tbl_auth_pay_record.name
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String name;

    /**
     * tbl_auth_pay_record.card
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String card;

    /**
     * tbl_auth_pay_record.bank
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String bank;

    /**
     * tbl_auth_pay_record.phone
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String phone;

    /**
     * tbl_auth_pay_record.result_code
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String resultCode;

    /**
     * 启用标志 0-否 1-是
     * tbl_auth_pay_record.use_flag
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建时间
     * tbl_auth_pay_record.create_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_auth_pay_record.create_acct
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_auth_pay_record.update_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_auth_pay_record.update_acct
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private String updateAcct;

    /**
     * tbl_auth_pay_record
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * tbl_auth_pay_record.register_id
     *
     * @return the value of tbl_auth_pay_record.register_id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Long getRegisterId() {
        return registerId;
    }

    /**
     * tbl_auth_pay_record.register_id
     *
     * @param registerId the value for tbl_auth_pay_record.register_id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setRegisterId(Long registerId) {
        this.registerId = registerId;
    }

    /**
     * tbl_auth_pay_record.person_id
     *
     * @return the value of tbl_auth_pay_record.person_id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * tbl_auth_pay_record.person_id
     *
     * @param personId the value for tbl_auth_pay_record.person_id
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * tbl_auth_pay_record.name
     *
     * @return the value of tbl_auth_pay_record.name
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * tbl_auth_pay_record.name
     *
     * @param name the value for tbl_auth_pay_record.name
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * tbl_auth_pay_record.card
     *
     * @return the value of tbl_auth_pay_record.card
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getCard() {
        return card;
    }

    /**
     * tbl_auth_pay_record.card
     *
     * @param card the value for tbl_auth_pay_record.card
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setCard(String card) {
        this.card = card;
    }

    /**
     * tbl_auth_pay_record.bank
     *
     * @return the value of tbl_auth_pay_record.bank
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getBank() {
        return bank;
    }

    /**
     * tbl_auth_pay_record.bank
     *
     * @param bank the value for tbl_auth_pay_record.bank
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * tbl_auth_pay_record.phone
     *
     * @return the value of tbl_auth_pay_record.phone
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * tbl_auth_pay_record.phone
     *
     * @param phone the value for tbl_auth_pay_record.phone
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * tbl_auth_pay_record.result_code
     *
     * @return the value of tbl_auth_pay_record.result_code
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * tbl_auth_pay_record.result_code
     *
     * @param resultCode the value for tbl_auth_pay_record.result_code
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_auth_pay_record.use_flag
     *
     * @return the value of tbl_auth_pay_record.use_flag
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_auth_pay_record.use_flag
     *
     * @param useFlag the value for tbl_auth_pay_record.use_flag
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建时间
     * tbl_auth_pay_record.create_time
     *
     * @return the value of tbl_auth_pay_record.create_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_auth_pay_record.create_time
     *
     * @param createTime the value for tbl_auth_pay_record.create_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_auth_pay_record.create_acct
     *
     * @return the value of tbl_auth_pay_record.create_acct
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_auth_pay_record.create_acct
     *
     * @param createAcct the value for tbl_auth_pay_record.create_acct
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_auth_pay_record.update_time
     *
     * @return the value of tbl_auth_pay_record.update_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_auth_pay_record.update_time
     *
     * @param updateTime the value for tbl_auth_pay_record.update_time
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_auth_pay_record.update_acct
     *
     * @return the value of tbl_auth_pay_record.update_acct
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_auth_pay_record.update_acct
     *
     * @param updateAcct the value for tbl_auth_pay_record.update_acct
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_auth_pay_record
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", registerId=").append(registerId);
        sb.append(", personId=").append(personId);
        sb.append(", name=").append(name);
        sb.append(", card=").append(card);
        sb.append(", bank=").append(bank);
        sb.append(", phone=").append(phone);
        sb.append(", resultCode=").append(resultCode);
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