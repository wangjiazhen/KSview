package org.ks.sys.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblCtrlUserInfoExample implements Serializable {
    /**
     * tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected String orderByClause;

    /**
     * tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected boolean distinct;

    /**
     * tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:18 CST 2020
     */
    public TblCtrlUserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCtrlUserIdIsNull() {
            addCriterion("ctrl_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdIsNotNull() {
            addCriterion("ctrl_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdEqualTo(Long value) {
            addCriterion("ctrl_user_id =", value, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdNotEqualTo(Long value) {
            addCriterion("ctrl_user_id <>", value, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdGreaterThan(Long value) {
            addCriterion("ctrl_user_id >", value, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ctrl_user_id >=", value, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdLessThan(Long value) {
            addCriterion("ctrl_user_id <", value, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdLessThanOrEqualTo(Long value) {
            addCriterion("ctrl_user_id <=", value, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdIn(List<Long> values) {
            addCriterion("ctrl_user_id in", values, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdNotIn(List<Long> values) {
            addCriterion("ctrl_user_id not in", values, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdBetween(Long value1, Long value2) {
            addCriterion("ctrl_user_id between", value1, value2, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andCtrlUserIdNotBetween(Long value1, Long value2) {
            addCriterion("ctrl_user_id not between", value1, value2, "ctrlUserId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNull() {
            addCriterion("app_secret is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("app_secret =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("app_secret <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("app_secret >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("app_secret >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("app_secret <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("app_secret <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("app_secret like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("app_secret not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("app_secret in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("app_secret not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("app_secret between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("app_secret not between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNull() {
            addCriterion("use_flag is null");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNotNull() {
            addCriterion("use_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUseFlagEqualTo(Integer value) {
            addCriterion("use_flag =", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotEqualTo(Integer value) {
            addCriterion("use_flag <>", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThan(Integer value) {
            addCriterion("use_flag >", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_flag >=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThan(Integer value) {
            addCriterion("use_flag <", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThanOrEqualTo(Integer value) {
            addCriterion("use_flag <=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagIn(List<Integer> values) {
            addCriterion("use_flag in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotIn(List<Integer> values) {
            addCriterion("use_flag not in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagBetween(Integer value1, Integer value2) {
            addCriterion("use_flag between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("use_flag not between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andMailAddrIsNull() {
            addCriterion("mail_addr is null");
            return (Criteria) this;
        }

        public Criteria andMailAddrIsNotNull() {
            addCriterion("mail_addr is not null");
            return (Criteria) this;
        }

        public Criteria andMailAddrEqualTo(String value) {
            addCriterion("mail_addr =", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrNotEqualTo(String value) {
            addCriterion("mail_addr <>", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrGreaterThan(String value) {
            addCriterion("mail_addr >", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrGreaterThanOrEqualTo(String value) {
            addCriterion("mail_addr >=", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrLessThan(String value) {
            addCriterion("mail_addr <", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrLessThanOrEqualTo(String value) {
            addCriterion("mail_addr <=", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrLike(String value) {
            addCriterion("mail_addr like", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrNotLike(String value) {
            addCriterion("mail_addr not like", value, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrIn(List<String> values) {
            addCriterion("mail_addr in", values, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrNotIn(List<String> values) {
            addCriterion("mail_addr not in", values, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrBetween(String value1, String value2) {
            addCriterion("mail_addr between", value1, value2, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andMailAddrNotBetween(String value1, String value2) {
            addCriterion("mail_addr not between", value1, value2, "mailAddr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateAcctIsNull() {
            addCriterion("create_acct is null");
            return (Criteria) this;
        }

        public Criteria andCreateAcctIsNotNull() {
            addCriterion("create_acct is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAcctEqualTo(String value) {
            addCriterion("create_acct =", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctNotEqualTo(String value) {
            addCriterion("create_acct <>", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctGreaterThan(String value) {
            addCriterion("create_acct >", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctGreaterThanOrEqualTo(String value) {
            addCriterion("create_acct >=", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctLessThan(String value) {
            addCriterion("create_acct <", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctLessThanOrEqualTo(String value) {
            addCriterion("create_acct <=", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctLike(String value) {
            addCriterion("create_acct like", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctNotLike(String value) {
            addCriterion("create_acct not like", value, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctIn(List<String> values) {
            addCriterion("create_acct in", values, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctNotIn(List<String> values) {
            addCriterion("create_acct not in", values, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctBetween(String value1, String value2) {
            addCriterion("create_acct between", value1, value2, "createAcct");
            return (Criteria) this;
        }

        public Criteria andCreateAcctNotBetween(String value1, String value2) {
            addCriterion("create_acct not between", value1, value2, "createAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctIsNull() {
            addCriterion("update_acct is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctIsNotNull() {
            addCriterion("update_acct is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctEqualTo(String value) {
            addCriterion("update_acct =", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctNotEqualTo(String value) {
            addCriterion("update_acct <>", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctGreaterThan(String value) {
            addCriterion("update_acct >", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctGreaterThanOrEqualTo(String value) {
            addCriterion("update_acct >=", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctLessThan(String value) {
            addCriterion("update_acct <", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctLessThanOrEqualTo(String value) {
            addCriterion("update_acct <=", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctLike(String value) {
            addCriterion("update_acct like", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctNotLike(String value) {
            addCriterion("update_acct not like", value, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctIn(List<String> values) {
            addCriterion("update_acct in", values, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctNotIn(List<String> values) {
            addCriterion("update_acct not in", values, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctBetween(String value1, String value2) {
            addCriterion("update_acct between", value1, value2, "updateAcct");
            return (Criteria) this;
        }

        public Criteria andUpdateAcctNotBetween(String value1, String value2) {
            addCriterion("update_acct not between", value1, value2, "updateAcct");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 12 17:40:19 CST 2020
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_ctrl_user_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}