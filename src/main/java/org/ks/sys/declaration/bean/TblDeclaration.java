package org.ks.sys.declaration.bean;

import java.io.Serializable;
import java.util.Date;

public class TblDeclaration implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.decl_id
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private Long declId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.real_name
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.mobile_phone
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private String mobilePhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.decl_url
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private String declUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.create_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private String createAcct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.create_time
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.update_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private String updateAcct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.update_time
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.decl_url_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private String declUrlAcct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.flag
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private Integer flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_declaration.decl_url_image
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private String declUrlImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_declaration
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.decl_id
     *
     * @return the value of tbl_declaration.decl_id
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public Long getDeclId() {
        return declId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.decl_id
     *
     * @param declId the value for tbl_declaration.decl_id
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setDeclId(Long declId) {
        this.declId = declId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.real_name
     *
     * @return the value of tbl_declaration.real_name
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.real_name
     *
     * @param realName the value for tbl_declaration.real_name
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.mobile_phone
     *
     * @return the value of tbl_declaration.mobile_phone
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.mobile_phone
     *
     * @param mobilePhone the value for tbl_declaration.mobile_phone
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.decl_url
     *
     * @return the value of tbl_declaration.decl_url
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public String getDeclUrl() {
        return declUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.decl_url
     *
     * @param declUrl the value for tbl_declaration.decl_url
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setDeclUrl(String declUrl) {
        this.declUrl = declUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.create_acct
     *
     * @return the value of tbl_declaration.create_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.create_acct
     *
     * @param createAcct the value for tbl_declaration.create_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.create_time
     *
     * @return the value of tbl_declaration.create_time
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.create_time
     *
     * @param createTime the value for tbl_declaration.create_time
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.update_acct
     *
     * @return the value of tbl_declaration.update_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.update_acct
     *
     * @param updateAcct the value for tbl_declaration.update_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.update_time
     *
     * @return the value of tbl_declaration.update_time
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.update_time
     *
     * @param updateTime the value for tbl_declaration.update_time
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.decl_url_acct
     *
     * @return the value of tbl_declaration.decl_url_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public String getDeclUrlAcct() {
        return declUrlAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.decl_url_acct
     *
     * @param declUrlAcct the value for tbl_declaration.decl_url_acct
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setDeclUrlAcct(String declUrlAcct) {
        this.declUrlAcct = declUrlAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.flag
     *
     * @return the value of tbl_declaration.flag
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.flag
     *
     * @param flag the value for tbl_declaration.flag
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_declaration.decl_url_image
     *
     * @return the value of tbl_declaration.decl_url_image
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public String getDeclUrlImage() {
        return declUrlImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_declaration.decl_url_image
     *
     * @param declUrlImage the value for tbl_declaration.decl_url_image
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    public void setDeclUrlImage(String declUrlImage) {
        this.declUrlImage = declUrlImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_declaration
     *
     * @mbg.generated Tue Jan 18 18:34:30 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", declId=").append(declId);
        sb.append(", realName=").append(realName);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", declUrl=").append(declUrl);
        sb.append(", createAcct=").append(createAcct);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateAcct=").append(updateAcct);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", declUrlAcct=").append(declUrlAcct);
        sb.append(", flag=").append(flag);
        sb.append(", declUrlImage=").append(declUrlImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}