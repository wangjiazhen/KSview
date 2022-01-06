package org.ks.sys.vo;

import java.io.Serializable;

public class UserNameVo implements Serializable {
    private long userId;
    private String name;
    private boolean check = false;
    private String relaName;
    private String acct;

    @Override
    public String toString() {
        return "UserNameVo{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", check=" + check +
                ", realUserName='" + relaName + '\'' +
                ", acct='" + acct + '\'' +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getRealUserName() {
        return relaName;
    }

    public void setRealUserName(String relaName) {
        this.relaName = relaName;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }
}
