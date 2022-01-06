package org.ks.enums;

public enum FourResultStatus {
    /**
     * 四要素认证成功
     */
    ONE(1),
    /**
     * 四要素认证失败
     */
    ZERO(0)
    ;

    private int status;

    FourResultStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
