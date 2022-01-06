package org.ks.sys.po;

import java.io.Serializable;

public class TblUserOrgRel implements Serializable {
    /**
     * 用户id
     * tbl_user_org_rel.user_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long userId;

    /**
     * 机构id
     * tbl_user_org_rel.org_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long orgId;

    /**
     * tbl_user_org_rel
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     * tbl_user_org_rel.user_id
     *
     * @return the value of tbl_user_org_rel.user_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     * tbl_user_org_rel.user_id
     *
     * @param userId the value for tbl_user_org_rel.user_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 机构id
     * tbl_user_org_rel.org_id
     *
     * @return the value of tbl_user_org_rel.org_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 机构id
     * tbl_user_org_rel.org_id
     *
     * @param orgId the value for tbl_user_org_rel.org_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_org_rel
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", orgId=").append(orgId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}