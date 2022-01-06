package org.ks.sys.auth.dto;

import java.io.Serializable;

/**
 * @author mulishaui
 */
public class AuthAddAndUpdateDto implements Serializable {
    /**
     * authAddAndUpdateDto
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;
    /**
     * tbl_role.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long authId;

    /**
     * 角色代码
     * tbl_role.role_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String authCode;

    /**
     * 角色名称
     * tbl_role.role_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String authName;

    /**
     * 启用标志 0-否 1-是
     * tbl_role.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Integer useFlag;

    /**
     * 系统代码
     * tbl_auth.sys_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String sysCode;

    /**
     * 排序
     * tbl_auth.seq
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Integer seq;

    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
