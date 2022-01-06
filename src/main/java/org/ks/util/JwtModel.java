package org.ks.util;

/**
 * 描述:jwt 模型
 *
 * @Auther: lzx
 * @Date: 2019/7/9 13:42
 */
public class JwtModel {

    private long userId;

    private String acct;

    /**
     * 是否自动生成新token
     */
    private Integer autoRefresh;

    public Integer getAutoRefresh() {
        return autoRefresh;
    }

    public void setAutoRefresh(Integer autoRefresh) {
        this.autoRefresh = autoRefresh;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }
}
