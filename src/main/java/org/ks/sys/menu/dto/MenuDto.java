package org.ks.sys.menu.dto;

import java.io.Serializable;

public class MenuDto implements Serializable {
    /**
     * 菜单id
     * tbl_menu.menu_id
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Long menuId;

    /**
     * 菜单名称
     * tbl_menu.menu_name
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private String menuName;

    /**
     * 菜单URL
     * tbl_menu.menu_url
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private String menuUrl;

    /**
     * 父id
     * tbl_menu.father_id
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Long fatherId;

    @Override
    public String toString() {
        return "MenuDto{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", fatherId=" + fatherId +
                ", useFlag=" + useFlag +
                ", icon='" + icon + '\'' +
                ", isJump=" + isJump +
                '}';
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getIsJump() {
        return isJump;
    }

    public void setIsJump(Integer isJump) {
        this.isJump = isJump;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_menu.use_flag
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Integer useFlag;

    /**
     * 图标
     * tbl_menu.icon
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private String icon;

    /**
     * 是否跳转新页面
     * tbl_menu.is_jump
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Integer isJump;


}
