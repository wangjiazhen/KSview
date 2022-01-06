package org.ks.sys.menu.dto;

import java.io.Serializable;

public class FormInfoData implements Serializable {
    private String menuNameInfo;

    @Override
    public String toString() {
        return "FormInfoData{" +
                "menuNameInfo='" + menuNameInfo + '\'' +
                '}';
    }

    public String getMenuNameInfo() {
        return menuNameInfo;
    }

    public void setMenuNameInfo(String menuNameInfo) {
        this.menuNameInfo = menuNameInfo;
    }
}
