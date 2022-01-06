package org.ks.sys.user.vo;

import java.util.Date;

public class UserVoFlag {

    /**
     *  标识
     */
    private  Integer useFlag;
    /**
     * 主键
     */
    private  Long userId;
    /**
     * 创建账号
     * tbl_bk_prd.create_acct
     *
     * @mbg.generated Thu May 21 17:51:21 CST 2020
     */
    private String createAcct;

    /**
     * 创建时间
     * tbl_bk_prd.create_time
     *
     * @mbg.generated Thu May 21 17:51:21 CST 2020
     */
    private Date createTime;

    /**
     * 更新账号
     * tbl_bk_prd.update_acct
     *
     * @mbg.generated Thu May 21 17:51:21 CST 2020
     */
    private String updateAcct;

    /**
     * 更新时间
     * tbl_bk_prd.update_time
     *
     * @mbg.generated Thu May 21 17:51:21 CST 2020
     */
    private Date updateTime;

    @Override
    public String toString() {
        return "UserVoFlag{" +
                "useFlag=" + useFlag +
                ", userId=" + userId +
                ", createAcct='" + createAcct + '\'' +
                ", createTime=" + createTime +
                ", updateAcct='" + updateAcct + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCreateAcct() {
        return createAcct;
    }

    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateAcct() {
        return updateAcct;
    }

    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
