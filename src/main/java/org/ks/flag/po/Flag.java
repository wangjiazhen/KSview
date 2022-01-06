package org.ks.flag.po;

import java.io.Serializable;

public class Flag implements Serializable {
    private Integer code;
    private String msg;
    private Integer count;
    private Double fee;
    private String unit;
    private String mobile;
    private Long sid;
    private String falg;

    @Override
    public String toString() {
        return "Flag{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", fee=" + fee +
                ", unit='" + unit + '\'' +
                ", mobile='" + mobile + '\'' +
                ", sid=" + sid +
                ", falg='" + falg + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getFalg() {
        return falg;
    }

    public void setFalg(String falg) {
        this.falg = falg;
    }
}
