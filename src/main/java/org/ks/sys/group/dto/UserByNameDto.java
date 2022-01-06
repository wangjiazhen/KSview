package org.ks.sys.group.dto;

import java.io.Serializable;

/**
 * @author wangbiao
 */
public class UserByNameDto implements Serializable {

    private Long userId;
    private String acct;
    private String name;
    private String realName;

    @Override
    public String toString() {
        return "UserByNameDto{" +
                "userId=" + userId +
                ", acct='" + acct + '\'' +
                ", name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
