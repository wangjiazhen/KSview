package org.ks.sys.po;

import java.io.Serializable;

public class TblUserCtrlRel implements Serializable {
    /**
     * 用户id
     * tbl_user_ctrl_rel.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Long ctrlUserId;

    /**
     * 用户组id
     * tbl_user_ctrl_rel.ctrl_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Long ctrlId;

    /**
     * 调用次数
     * tbl_user_ctrl_rel.count
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private Integer count;

    /**
     * tbl_user_ctrl_rel
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     * tbl_user_ctrl_rel.ctrl_user_id
     *
     * @return the value of tbl_user_ctrl_rel.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Long getCtrlUserId() {
        return ctrlUserId;
    }

    /**
     * 用户id
     * tbl_user_ctrl_rel.ctrl_user_id
     *
     * @param ctrlUserId the value for tbl_user_ctrl_rel.ctrl_user_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlUserId(Long ctrlUserId) {
        this.ctrlUserId = ctrlUserId;
    }

    /**
     * 用户组id
     * tbl_user_ctrl_rel.ctrl_id
     *
     * @return the value of tbl_user_ctrl_rel.ctrl_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Long getCtrlId() {
        return ctrlId;
    }

    /**
     * 用户组id
     * tbl_user_ctrl_rel.ctrl_id
     *
     * @param ctrlId the value for tbl_user_ctrl_rel.ctrl_id
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCtrlId(Long ctrlId) {
        this.ctrlId = ctrlId;
    }

    /**
     * 调用次数
     * tbl_user_ctrl_rel.count
     *
     * @return the value of tbl_user_ctrl_rel.count
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 调用次数
     * tbl_user_ctrl_rel.count
     *
     * @param count the value for tbl_user_ctrl_rel.count
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_ctrl_rel
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ctrlUserId=").append(ctrlUserId);
        sb.append(", ctrlId=").append(ctrlId);
        sb.append(", count=").append(count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}