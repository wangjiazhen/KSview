package org.ks.enums;

public enum ContractStatus {
    /**
     * w未生成合同
     */
    ZERO(0),
    /**
     * 1-已生成待签署
     */
    ONE(1),
    /**
     *2-已签署待归档
     */
    TWO(2),
    /**
     * 3-已归档
     */
    THERE(3);
    private int contractStatus;

    ContractStatus(int contractStatus) {
        this.contractStatus = contractStatus;
    }

    public int getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(int contractStatus) {
        this.contractStatus = contractStatus;
    }
}
