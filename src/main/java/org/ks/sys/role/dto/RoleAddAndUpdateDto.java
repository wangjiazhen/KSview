package org.ks.sys.role.dto;

import java.io.Serializable;


public class RoleAddAndUpdateDto implements Serializable {
    /**
     * roleAddAndUpdateDto
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * tbl_role.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long roleId;

    /**
     * 角色代码
     * tbl_role.role_code
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String roleCode;

    /**
     * 角色名称
     * tbl_role.role_name
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private String roleName;

    /**
     * 启用标志 0-否 1-是
     * tbl_role.use_flag
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Integer useFlag;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
