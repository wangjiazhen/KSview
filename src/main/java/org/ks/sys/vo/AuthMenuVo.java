package org.ks.sys.vo;

import java.io.Serializable;

/**
 * @ClassName AuthMenuVo
 * @Description TODO
 * @Author wangsong
 * @Date 2020/4/24 15:33
 * @Version 1.0
 **/
public class AuthMenuVo implements Serializable {
    private long authId;
    private long menuId;

    @Override
    public String toString() {
        return "AuthMenuVo{" +
                "authId=" + authId +
                ", menuId=" + menuId +
                '}';
    }

    public long getAuthId() {
        return authId;
    }

    public void setAuthId(long authId) {
        this.authId = authId;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public AuthMenuVo(long authId, long menuId) {
        this.authId = authId;
        this.menuId = menuId;
    }
    public AuthMenuVo(){

    }
}
