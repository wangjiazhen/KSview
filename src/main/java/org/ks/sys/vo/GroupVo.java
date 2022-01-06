package org.ks.sys.vo;

import java.io.Serializable;

/**
 * @ClassName AuthVoTo
 * @Description TODO
 * @Author mulishuai
 * @Date 2020/4/23 17:15
 * @Version 1.0
 **/

public class GroupVo implements Serializable {
    private Long groupId;
    private String groupName;
    private Boolean check = false;

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

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "GroupVo{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", check=" + check +
                '}';
    }
}
