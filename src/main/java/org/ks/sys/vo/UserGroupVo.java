package org.ks.sys.vo;

import java.io.Serializable;

/**
 * @ClassName UserGroupVo
 * @DescripTion TODO
 * @Author wangbiao
 * @Date 2020/04/26 11:30
 * @Version 1.0
 */
public class UserGroupVo implements Serializable {
    private long groupId;
    private long userId;

    @Override
    public String toString() {
        return "UserGroupVo{" +
                "userId=" + userId +
                ", groupId=" + groupId +
                '}';
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
