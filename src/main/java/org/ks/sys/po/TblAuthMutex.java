package org.ks.sys.po;

import java.io.Serializable;

public class TblAuthMutex implements Serializable {
    /**
     * 权限一id
     * tbl_auth_mutex.auth_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long authId;

    /**
     * 权限二id
     * tbl_auth_mutex.auth_other_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long authOtherId;

    /**
     * 系统代码
     * tbl_auth_mutex.sys_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String sysCode;

    /**
     * tbl_auth_mutex
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 权限一id
     * tbl_auth_mutex.auth_id
     *
     * @return the value of tbl_auth_mutex.auth_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getAuthId() {
        return authId;
    }

    /**
     * 权限一id
     * tbl_auth_mutex.auth_id
     *
     * @param authId the value for tbl_auth_mutex.auth_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    /**
     * 权限二id
     * tbl_auth_mutex.auth_other_id
     *
     * @return the value of tbl_auth_mutex.auth_other_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getAuthOtherId() {
        return authOtherId;
    }

    /**
     * 权限二id
     * tbl_auth_mutex.auth_other_id
     *
     * @param authOtherId the value for tbl_auth_mutex.auth_other_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setAuthOtherId(Long authOtherId) {
        this.authOtherId = authOtherId;
    }

    /**
     * 系统代码
     * tbl_auth_mutex.sys_code
     *
     * @return the value of tbl_auth_mutex.sys_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 系统代码
     * tbl_auth_mutex.sys_code
     *
     * @param sysCode the value for tbl_auth_mutex.sys_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_auth_mutex
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authId=").append(authId);
        sb.append(", authOtherId=").append(authOtherId);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}