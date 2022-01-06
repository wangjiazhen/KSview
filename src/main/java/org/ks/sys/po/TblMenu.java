package org.ks.sys.po;

import java.io.Serializable;
import java.util.Date;

public class TblMenu implements Serializable {
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

    /**
     * 系统代码
     * tbl_menu.sys_code
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private String sysCode;

    /**
     * 启用标志 0-否 1-是
     * tbl_menu.use_flag
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Integer useFlag;

    /**
     * 排序
     * tbl_menu.seq
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Integer seq;

    /**
     * 图标
     * tbl_menu.icon
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private String icon;

    /**
     * 创建时间
     * tbl_menu.create_time
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Date createTime;

    /**
     * 创建人员
     * tbl_menu.create_acct
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private String createAcct;

    /**
     * 更新时间
     * tbl_menu.update_time
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Date updateTime;

    /**
     * 更新人员
     * tbl_menu.update_acct
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private String updateAcct;

    /**
     * 是否跳转新页面
     * tbl_menu.is_jump
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private Integer isJump;

    /**
     * tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     * tbl_menu.menu_id
     *
     * @return the value of tbl_menu.menu_id
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 菜单id
     * tbl_menu.menu_id
     *
     * @param menuId the value for tbl_menu.menu_id
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 菜单名称
     * tbl_menu.menu_name
     *
     * @return the value of tbl_menu.menu_name
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 菜单名称
     * tbl_menu.menu_name
     *
     * @param menuName the value for tbl_menu.menu_name
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 菜单URL
     * tbl_menu.menu_url
     *
     * @return the value of tbl_menu.menu_url
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * 菜单URL
     * tbl_menu.menu_url
     *
     * @param menuUrl the value for tbl_menu.menu_url
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     * 父id
     * tbl_menu.father_id
     *
     * @return the value of tbl_menu.father_id
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public Long getFatherId() {
        return fatherId;
    }

    /**
     * 父id
     * tbl_menu.father_id
     *
     * @param fatherId the value for tbl_menu.father_id
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 系统代码
     * tbl_menu.sys_code
     *
     * @return the value of tbl_menu.sys_code
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 系统代码
     * tbl_menu.sys_code
     *
     * @param sysCode the value for tbl_menu.sys_code
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_menu.use_flag
     *
     * @return the value of tbl_menu.use_flag
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public Integer getUseFlag() {
        return useFlag;
    }

    /**
     * 启用标志 0-否 1-是
     * tbl_menu.use_flag
     *
     * @param useFlag the value for tbl_menu.use_flag
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 排序
     * tbl_menu.seq
     *
     * @return the value of tbl_menu.seq
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 排序
     * tbl_menu.seq
     *
     * @param seq the value for tbl_menu.seq
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 图标
     * tbl_menu.icon
     *
     * @return the value of tbl_menu.icon
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * tbl_menu.icon
     *
     * @param icon the value for tbl_menu.icon
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 创建时间
     * tbl_menu.create_time
     *
     * @return the value of tbl_menu.create_time
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * tbl_menu.create_time
     *
     * @param createTime the value for tbl_menu.create_time
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人员
     * tbl_menu.create_acct
     *
     * @return the value of tbl_menu.create_acct
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public String getCreateAcct() {
        return createAcct;
    }

    /**
     * 创建人员
     * tbl_menu.create_acct
     *
     * @param createAcct the value for tbl_menu.create_acct
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setCreateAcct(String createAcct) {
        this.createAcct = createAcct;
    }

    /**
     * 更新时间
     * tbl_menu.update_time
     *
     * @return the value of tbl_menu.update_time
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * tbl_menu.update_time
     *
     * @param updateTime the value for tbl_menu.update_time
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 更新人员
     * tbl_menu.update_acct
     *
     * @return the value of tbl_menu.update_acct
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public String getUpdateAcct() {
        return updateAcct;
    }

    /**
     * 更新人员
     * tbl_menu.update_acct
     *
     * @param updateAcct the value for tbl_menu.update_acct
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setUpdateAcct(String updateAcct) {
        this.updateAcct = updateAcct;
    }

    /**
     * 是否跳转新页面
     * tbl_menu.is_jump
     *
     * @return the value of tbl_menu.is_jump
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public Integer getIsJump() {
        return isJump;
    }

    /**
     * 是否跳转新页面
     * tbl_menu.is_jump
     *
     * @param isJump the value for tbl_menu.is_jump
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    public void setIsJump(Integer isJump) {
        this.isJump = isJump;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_menu
     *
     * @mbg.generated Thu Apr 23 22:10:13 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", fatherId=").append(fatherId);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", seq=").append(seq);
        sb.append(", icon=").append(icon);
        sb.append(", createTime=").append(createTime);
        sb.append(", createAcct=").append(createAcct);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateAcct=").append(updateAcct);
        sb.append(", isJump=").append(isJump);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}