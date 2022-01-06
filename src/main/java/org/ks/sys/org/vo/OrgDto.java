package org.ks.sys.org.vo;

public class OrgDto {

    private String orgName;

    private String orgCode;
    private String orgTypeName;

    @Override
    public String toString() {
        return "OrgDto{" +
                "orgName='" + orgName + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", orgTypeName='" + orgTypeName + '\'' +
                '}';
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgTypeName() {
        return orgTypeName;
    }

    public void setOrgTypeName(String orgTypeName) {
        this.orgTypeName = orgTypeName;
    }
}
