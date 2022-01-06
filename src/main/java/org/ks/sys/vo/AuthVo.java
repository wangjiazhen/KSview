package org.ks.sys.vo;

import java.io.Serializable;

/**
 * @author mulishuai
 */
public class AuthVo implements Serializable {
    private long authId;
    private String authName;
    private boolean check = false;

    public long getAuthId() {
        return authId;
    }

    public void setAuthId(long authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "AuthVo{" +
                "authId=" + authId +
                ", authName='" + authName + '\'' +
                ", check=" + check +
                '}';
    }
}
