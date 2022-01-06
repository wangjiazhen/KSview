package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblApprovaCustInfo implements Serializable {
    /**
     * 人员id
     * tbl_approva_cust_info.persion_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private Long persionId;

    /**
     * 姓名
     * tbl_approva_cust_info.persion_name
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String persionName;

    /**
     * 用户openid
     * tbl_approva_cust_info.open_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String openId;

    /**
     * 证件号码
     * tbl_approva_cust_info.cerd_no
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String cerdNo;

    /**
     * 手机号
     * tbl_approva_cust_info.phone
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String phone;

    /**
     * 银行卡号
     * tbl_approva_cust_info.card_no
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String cardNo;

    /**
     * 开户行
     * tbl_approva_cust_info.card_bank
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String cardBank;

    /**
     * 公众号微信号
     * tbl_approva_cust_info.jw_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String jwId;

    /**
     * 是否启用
     * tbl_approva_cust_info.use_flag
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private Integer useFlag;

    /**
     * 创建人
     * tbl_approva_cust_info.create_acct
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String createAcct;

    /**
     * 创建时间
     * tbl_approva_cust_info.create_time
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private Date createTime;

    /**
     * 修改人
     * tbl_approva_cust_info.update_acct
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private String updateAcct;

    /**
     * 修改时间
     * tbl_approva_cust_info.update_time
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private Date updateTime;

    /**
     * tbl_approva_cust_info
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 人员id
     * tbl_approva_cust_info.persion_id
     *
     * @return the value of tbl_approva_cust_info.persion_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public Long getPersionId() {
        return persionId;
    }

    /**
     * 人员id
     * tbl_approva_cust_info.persion_id
     *
     * @param persionId the value for tbl_approva_cust_info.persion_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setPersionId(Long persionId) {
        this.persionId = persionId;
    }

    /**
     * 姓名
     * tbl_approva_cust_info.persion_name
     *
     * @return the value of tbl_approva_cust_info.persion_name
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getPersionName() {
        return persionName;
    }

    /**
     * 姓名
     * tbl_approva_cust_info.persion_name
     *
     * @param persionName the value for tbl_approva_cust_info.persion_name
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setPersionName(String persionName) {
        this.persionName = persionName;
    }

    /**
     * 用户openid
     * tbl_approva_cust_info.open_id
     *
     * @return the value of tbl_approva_cust_info.open_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 用户openid
     * tbl_approva_cust_info.open_id
     *
     * @param openId the value for tbl_approva_cust_info.open_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 证件号码
     * tbl_approva_cust_info.cerd_no
     *
     * @return the value of tbl_approva_cust_info.cerd_no
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getCerdNo() {
        return cerdNo;
    }

    /**
     * 证件号码
     * tbl_approva_cust_info.cerd_no
     *
     * @param cerdNo the value for tbl_approva_cust_info.cerd_no
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setCerdNo(String cerdNo) {
        this.cerdNo = cerdNo;
    }

    /**
     * 手机号
     * tbl_approva_cust_info.phone
     *
     * @return the value of tbl_approva_cust_info.phone
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * tbl_approva_cust_info.phone
     *
     * @param phone the value for tbl_approva_cust_info.phone
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 银行卡号
     * tbl_approva_cust_info.card_no
     *
     * @return the value of tbl_approva_cust_info.card_no
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 银行卡号
     * tbl_approva_cust_info.card_no
     *
     * @param cardNo the value for tbl_approva_cust_info.card_no
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 开户行
     * tbl_approva_cust_info.card_bank
     *
     * @return the value of tbl_approva_cust_info.card_bank
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getCardBank() {
        return cardBank;
    }

    /**
     * 开户行
     * tbl_approva_cust_info.card_bank
     *
     * @param cardBank the value for tbl_approva_cust_info.card_bank
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setCardBank(String cardBank) {
        this.cardBank = cardBank;
    }

    /**
     * 公众号微信号
     * tbl_approva_cust_info.jw_id
     *
     * @return the value of tbl_approva_cust_info.jw_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getJwId() {
        return jwId;
    }

    /**
     * 公众号微信号
     * tbl_approva_cust_info.jw_id
     *
     * @param jwId the value for tbl_approva_cust_info.jw_id
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setJwId(String jwId) {
        this.jwId = jwId;
    }

    /**
     * 是否启用
     * tbl_approva_cust_info.use_flag
     *
     * @return the value of tbl_approva_cust_info.use_flag
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 是否启用
     * tbl_approva_cust_info.use_flag
     *
     * @param useFlag the value for tbl_approva_cust_info.use_flag
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 创建人
     * tbl_approva_cust_info.create_acct
     *
     * @return the value of tbl_approva_cust_info.create_acct
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人
     * tbl_approva_cust_info.create_acct
     *
     * @param createAcct the value for tbl_approva_cust_info.create_acct
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 创建时间
     * tbl_approva_cust_info.create_time
     *
     * @return the value of tbl_approva_cust_info.create_time
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_approva_cust_info.create_time
     *
     * @param createTime the value for tbl_approva_cust_info.create_time
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * tbl_approva_cust_info.update_acct
     *
     * @return the value of tbl_approva_cust_info.update_acct
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 修改人
     * tbl_approva_cust_info.update_acct
     *
     * @param updateAcct the value for tbl_approva_cust_info.update_acct
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * 修改时间
     * tbl_approva_cust_info.update_time
     *
     * @return the value of tbl_approva_cust_info.update_time
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * tbl_approva_cust_info.update_time
     *
     * @param updateTime the value for tbl_approva_cust_info.update_time
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_approva_cust_info
     *
     * @mbg.generated Mon Sep 21 10:19:24 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", persionId=").append(persionId);
        sb.append(", persionName=").append(persionName);
        sb.append(", openId=").append(openId);
        sb.append(", cerdNo=").append(cerdNo);
        sb.append(", phone=").append(phone);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", cardBank=").append(cardBank);
        sb.append(", jwId=").append(jwId);
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