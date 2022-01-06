package org.ks.enums;

/**
 * 人工付款状态
 */
public enum ManualPayStatus {
    /**
     * 0-不需要制单
     */
    NOT(0),
    /**
     * 1-待制单
     */
    WAIT(1),
    /**
     * 2-已制单
     */
    READY(2),
    /**
     * 3-已放款
     */
    PAY_END(3);


    private int manualPayStatus;

    ManualPayStatus(int manualPayStatus) {
        this.manualPayStatus = manualPayStatus;
    }

    public int getManualPayStatus() {
        return manualPayStatus;
    }

    public void setManualPayStatus(int manualPayStatus) {
        this.manualPayStatus = manualPayStatus;
    }
}
