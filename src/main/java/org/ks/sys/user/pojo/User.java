package org.ks.sys.user.pojo;

import org.ks.sys.org.pojo.Org;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
        /**
         * 多对一关联机制表
         */
        private Org org;

        private  String orgName;

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

        /**
         * 创建人员
         * tbl_user.create_acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        private String createAcct;

        /**
         * 创建时间
         * tbl_user.create_time
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        private Date createTime;

        /**
         * 更新人员
         * tbl_user.update_acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        private String updateAcct;

        /**
         * 更新时间
         * tbl_user.update_time
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        private Date updateTime;

        /**
         * tbl_user
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        private static final long serialVersionUID = 1L;

        /**
         * tbl_user.user_id
         *
         * @return the value of tbl_user.user_id
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public Long getUserId() {
            return userId;
        }

        /**
         * tbl_user.user_id
         *
         * @param userId the value for tbl_user.user_id
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setUserId(Long userId) {
            this.userId = userId;
        }

        /**
         * 账号
         * tbl_user.acct
         *
         * @return the value of tbl_user.acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getAcct() {
            return acct;
        }

        /**
         * 账号
         * tbl_user.acct
         *
         * @param acct the value for tbl_user.acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setAcct(String acct) {
            this.acct = acct;
        }

        /**
         * 密码
         * tbl_user.pwd
         *
         * @return the value of tbl_user.pwd
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getPwd() {
            return pwd;
        }

        /**
         * 密码
         * tbl_user.pwd
         *
         * @param pwd the value for tbl_user.pwd
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setPwd(String pwd) {
            this.pwd = pwd;
        }

        /**
         * 用户名
         * tbl_user.name
         *
         * @return the value of tbl_user.name
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getName() {
            return name;
        }

        /**
         * 用户名
         * tbl_user.name
         *
         * @param name the value for tbl_user.name
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 启用标志 0-否 1-是
         * tbl_user.use_flag
         *
         * @return the value of tbl_user.use_flag
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public Integer getUseFlag() {
            return useFlag;
        }

        /**
         * 启用标志 0-否 1-是
         * tbl_user.use_flag
         *
         * @param useFlag the value for tbl_user.use_flag
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setUseFlag(Integer useFlag) {
            this.useFlag = useFlag;
        }

        /**
         * 组织id
         * tbl_user.org_id
         *
         * @return the value of tbl_user.org_id
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public Long getOrgId() {
            return orgId;
        }

        /**
         * 组织id
         * tbl_user.org_id
         *
         * @param orgId the value for tbl_user.org_id
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setOrgId(Long orgId) {
            this.orgId = orgId;
        }

        /**
         * 预留手机号
         * tbl_user.mobile_phone
         *
         * @return the value of tbl_user.mobile_phone
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getMobilePhone() {
            return mobilePhone;
        }

        public String getOrgName() {
            return orgName;
        }

        public void setOrgName(String orgName) {
            this.orgName = orgName;
        }

        public Org getOrg() {
            return org;
        }

        public void setOrg(Org org) {
            this.org = org;
        }

    /**
         * 预留手机号
         * tbl_user.mobile_phone
         *
         * @param mobilePhone the value for tbl_user.mobile_phone
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        /**
         * 真实姓名
         * tbl_user.real_name
         *
         * @return the value of tbl_user.real_name
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getRealName() {
            return realName;
        }

        /**
         * 真实姓名
         * tbl_user.real_name
         *
         * @param realName the value for tbl_user.real_name
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setRealName(String realName) {
            this.realName = realName;
        }

        /**
         * 预留邮箱
         * tbl_user.mail_addr
         *
         * @return the value of tbl_user.mail_addr
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getMailAddr() {
            return mailAddr;
        }

        /**
         * 预留邮箱
         * tbl_user.mail_addr
         *
         * @param mailAddr the value for tbl_user.mail_addr
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setMailAddr(String mailAddr) {
            this.mailAddr = mailAddr;
        }

        /**
         * 创建人员
         * tbl_user.create_acct
         *
         * @return the value of tbl_user.create_acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getCreateAcct() {
            return createAcct;
        }

        /**
         * 创建人员
         * tbl_user.create_acct
         *
         * @param createAcct the value for tbl_user.create_acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setCreateAcct(String createAcct) {
            this.createAcct = createAcct;
        }

        /**
         * 创建时间
         * tbl_user.create_time
         *
         * @return the value of tbl_user.create_time
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public Date getCreateTime() {
            return createTime;
        }

        /**
         * 创建时间
         * tbl_user.create_time
         *
         * @param createTime the value for tbl_user.create_time
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        /**
         * 更新人员
         * tbl_user.update_acct
         *
         * @return the value of tbl_user.update_acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public String getUpdateAcct() {
            return updateAcct;
        }

        /**
         * 更新人员
         * tbl_user.update_acct
         *
         * @param updateAcct the value for tbl_user.update_acct
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setUpdateAcct(String updateAcct) {
            this.updateAcct = updateAcct;
        }

        /**
         * 更新时间
         * tbl_user.update_time
         *
         * @return the value of tbl_user.update_time
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public Date getUpdateTime() {
            return updateTime;
        }

        /**
         * 更新时间
         * tbl_user.update_time
         *
         * @param updateTime the value for tbl_user.update_time
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table tbl_user
         *
         * @mbg.generated Mon Apr 20 18:14:45 CST 2020
         */
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" [");
            sb.append("Hash = ").append(hashCode());
            sb.append(", userId=").append(userId);
            sb.append(", orgName=").append(orgName);
            sb.append(", org=").append(org);
            sb.append(", acct=").append(acct);
            sb.append(", pwd=").append(pwd);
            sb.append(", name=").append(name);
            sb.append(", useFlag=").append(useFlag);
            sb.append(", orgId=").append(orgId);
            sb.append(", mobilePhone=").append(mobilePhone);
            sb.append(", realName=").append(realName);
            sb.append(", mailAddr=").append(mailAddr);
            sb.append(", createAcct=").append(createAcct);
            sb.append(", createTime=").append(createTime);
            sb.append(", updateAcct=").append(updateAcct);
            sb.append(", updateTime=").append(updateTime);
            sb.append(", serialVersionUID=").append(serialVersionUID);
            sb.append("]");
            return sb.toString();
        }
    }
