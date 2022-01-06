package org.ks.sys.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangsong
 */
public class RoleAuthVo implements Serializable {
    private long authId;
    private long roleId;

    public long getAuthId() {
        return authId;
    }

    public void setAuthId(long authId) {
        this.authId = authId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "RoleAuthVo{" +
                "authId=" + authId +
                ", roleId=" + roleId +
                '}';
    }
}
