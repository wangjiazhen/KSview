package org.ks.sys.user.vo;

public class UserVoUser {

    /**
     * tbl_user.user_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long userId;

    /**
     * 账号
     * tbl_user.acct
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String acct;

    /**
     * 密码
     * tbl_user.pwd
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String pwd;

    /**
     * 用户名
     * tbl_user.name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String name;

    /**
     * 启用标志 0-否 1-是
     * tbl_user.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Integer useFlag;

    /**
     * 组织id
     * tbl_user.org_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long orgId;

    /**
     * 预留手机号
     * tbl_user.mobile_phone
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String mobilePhone;

    /**
     * 真实姓名
     * tbl_user.real_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String realName;

    /**
     * 预留邮箱
     * tbl_user.mail_addr
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String mailAddr;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userId=" + userId +
                ", acct='" + acct + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", useFlag=" + useFlag +
                ", orgId=" + orgId +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", realName='" + realName + '\'' +
                ", mailAddr='" + mailAddr + '\'' +
                '}';
    }
}
