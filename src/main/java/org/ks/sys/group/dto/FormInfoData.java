package org.ks.sys.group.dto;

import java.io.Serializable;

public class FormInfoData implements Serializable {
    private String groupNameInfo;

    @Override
    public String toString() {
        return "FormInfoData{" +
                "groupNameInfo='" + groupNameInfo + '\'' +
                '}';
    }

    public String getGroupNameInfo() {
        return groupNameInfo;
    }

    public void setGroupNameInfo(String groupNameInfo) {
        this.groupNameInfo = groupNameInfo;
    }
}
