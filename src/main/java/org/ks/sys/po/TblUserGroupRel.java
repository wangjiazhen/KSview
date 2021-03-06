package org.ks.sys.po;

import java.io.Serializable;

public class TblUserGroupRel implements Serializable {
    /**
     * 用户id
     * tbl_user_group_rel.user_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long userId;

    /**
     * 用户组id
     * tbl_user_group_rel.group_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private Long groupId;

    /**
     * tbl_user_group_rel
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     * tbl_user_group_rel.user_id
     *
     * @return the value of tbl_user_group_rel.user_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户id
     * tbl_user_group_rel.user_id
     *
     * @param userId the value for tbl_user_group_rel.user_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户组id
     * tbl_user_group_rel.group_id
     *
     * @return the value of tbl_user_group_rel.group_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 用户组id
     * tbl_user_group_rel.group_id
     *
     * @param groupId the value for tbl_user_group_rel.group_id
     *
     * @mbg.generated Mon Apr 20 18:14:45 CST 2020
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_group_rel
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
        sb.append(", groupId=").append(groupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}