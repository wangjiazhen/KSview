package org.ks.enums;

public enum ApiTypeEnum {

    /**
     * 放款状态同步给电销
     */

    LOAN_STATUS("LoanStatus", "放款状态"),

    /**
     * 放款全量数据推送到融资租赁主系统
     */

    PUSH_ALL_MAIN("PushAllMain", "全量推送主系统");

    private String code;

    private String value;


    ApiTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
