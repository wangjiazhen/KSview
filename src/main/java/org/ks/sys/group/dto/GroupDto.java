package org.ks.sys.group.dto;

import java.io.Serializable;

/**
 * @author wangbiao
 */
public class GroupDto implements Serializable {
    private Long groupId;
    private String groupName;
    private String groupCode;
    private Integer useFlag;

    @Override
    public String toString() {
        return "GroupDto{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", groupCode='" + groupCode + '\'' +
                ", useFlag=" + useFlag +
                '}';
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }
}
