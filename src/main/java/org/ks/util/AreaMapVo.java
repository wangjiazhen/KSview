package org.ks.util;

import org.ks.system.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author wangsong
 */
public class AreaMapVo implements Serializable {
    private Integer pkId;
    private String areaCode;
    private String areaDesc;
    private String preCode;
    private String preDesc;
    private String levelCode;
    private Integer useFlag;
    private AreaMapVo[] childer;
    @Autowired
    private UserInfo userInfo;

    @Override
    public String toString() {
        return "AreaMapVo{" +
                "pkId=" + pkId +
                ", areaCode='" + areaCode + '\'' +
                ", areaDesc='" + areaDesc + '\'' +
                ", preCode='" + preCode + '\'' +
                ", preDesc='" + preDesc + '\'' +
                ", levelCode='" + levelCode + '\'' +
                ", useFlag=" + useFlag +
                ", childer=" + Arrays.toString(childer) +
                '}';
    }

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode;
    }

    public String getPreDesc() {
        return preDesc;
    }

    public void setPreDesc(String preDesc) {
        this.preDesc = preDesc;
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public AreaMapVo[] getChilder() {
        return childer;
    }

    public void setChilder(AreaMapVo[] childer) {
        this.childer = childer;
    }
}
