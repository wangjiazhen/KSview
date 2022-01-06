package org.ks.enums;

public enum PayStatus {
    /**
     * 1-未付款
     */
    ONE(1),
    /**
     *2-已付款
     */
    TWO(2),
    /**
     * 3-付款失败
     */
    THERE(3),
    /**
     *  4-已提交放款
     */
    FOUR(4);



    private int payStatus;

    PayStatus(int payStatus) {
        this.payStatus = payStatus;
    }

    public int getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(int payStatus) {
        this.payStatus = payStatus;
    }
}
