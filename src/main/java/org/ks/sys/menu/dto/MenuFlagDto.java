package org.ks.sys.menu.dto;

import java.io.Serializable;

/**
 * @author wangbiao
 */
public class MenuFlagDto implements Serializable {

    private Long menuId;
    private Integer useFlag;

    @Override
    public String toString() {
        return "MenuFlagDto{" +
                "menuId=" + menuId +
                ", useFlag=" + useFlag +
                '}';
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }
}
