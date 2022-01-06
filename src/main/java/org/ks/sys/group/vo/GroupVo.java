package org.ks.sys.group.vo;

import java.io.Serializable;

/**
 * @author wangbiao
 */
public class GroupVo implements Serializable {

    private  int useFlag;

    private  long groupId;

    @Override
    public String toString() {
        return "GroupVo{" +
                "useFlag=" + useFlag +
                ", groupId=" + groupId +
                '}';
    }

    public int getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(int useFlag) {
        this.useFlag = useFlag;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
