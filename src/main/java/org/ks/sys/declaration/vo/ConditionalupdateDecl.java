package org.ks.sys.declaration.vo;

public class ConditionalupdateDecl {
    private Long declId;
    private String declUrl;
    private String declUrlAcct;
    private String declUrlImage;


    public String getDeclUrlImage() {
        return declUrlImage;
    }

    public void setDeclUrlImage(String declUrlImage) {
        this.declUrlImage = declUrlImage;
    }

    public Long getDeclId() {
        return declId;
    }

    public void setDeclId(Long declId) {
        this.declId = declId;
    }

    public String getDeclUrl() {
        return declUrl;
    }

    public void setDeclUrl(String declUrl) {
        this.declUrl = declUrl;
    }

    public String getDeclUrlAcct() {
        return declUrlAcct;
    }

    public void setDeclUrlAcct(String declUrlAcct) {
        this.declUrlAcct = declUrlAcct;
    }
}
