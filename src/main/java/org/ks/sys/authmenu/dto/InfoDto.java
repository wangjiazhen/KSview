package org.ks.sys.authmenu.dto;

import java.io.Serializable;

public class InfoDto implements Serializable {
    private String infoName;

    @Override
    public String toString() {
        return "InfoDto{" +
                "infoName='" + infoName + '\'' +
                '}';
    }

    public String getAuthName() {
        return infoName;
    }

    public void setAuthName(String infoName) {
        this.infoName = infoName;
    }
}
