package org.ks.sys.po;

import java.io.Serializable;

public class TblOrgRoleRel implements Serializable {
    /**
     * 组织id
     * tbl_org_role_rel.org_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long orgId;

    /**
     * 角色id
     * tbl_org_role_rel.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long roleId;

    /**
     * tbl_org_role_rel
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 组织id
     * tbl_org_role_rel.org_id
     *
     * @return the value of tbl_org_role_rel.org_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 组织id
     * tbl_org_role_rel.org_id
     *
     * @param orgId the value for tbl_org_role_rel.org_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 角色id
     * tbl_org_role_rel.role_id
     *
     * @return the value of tbl_org_role_rel.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * tbl_org_role_rel.role_id
     *
     * @param roleId the value for tbl_org_role_rel.role_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org_role_rel
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}