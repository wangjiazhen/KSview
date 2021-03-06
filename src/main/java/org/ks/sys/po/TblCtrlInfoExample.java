package org.ks.sys.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblCtrlInfoExample implements Serializable {
    /**
     * tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected String orderByClause;

    /**
     * tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected boolean distinct;

    /**
     * tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public TblCtrlInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
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
     * This method corresponds to the database table tbl_ctrl_info
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
     * This method corresponds to the database table tbl_ctrl_info
     *
     * @mbg.generated Wed Aug 12 17:40:19 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_ctrl_info
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
     * This class corresponds to the database table tbl_ctrl_info
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

        public Criteria andCtrlIdIsNull() {
            addCriterion("ctrl_id is null");
            return (Criteria) this;
        }

        public Criteria andCtrlIdIsNotNull() {
            addCriterion("ctrl_id is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlIdEqualTo(Long value) {
            addCriterion("ctrl_id =", value, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdNotEqualTo(Long value) {
            addCriterion("ctrl_id <>", value, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdGreaterThan(Long value) {
            addCriterion("ctrl_id >", value, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ctrl_id >=", value, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdLessThan(Long value) {
            addCriterion("ctrl_id <", value, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdLessThanOrEqualTo(Long value) {
            addCriterion("ctrl_id <=", value, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdIn(List<Long> values) {
            addCriterion("ctrl_id in", values, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdNotIn(List<Long> values) {
            addCriterion("ctrl_id not in", values, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdBetween(Long value1, Long value2) {
            addCriterion("ctrl_id between", value1, value2, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlIdNotBetween(Long value1, Long value2) {
            addCriterion("ctrl_id not between", value1, value2, "ctrlId");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrIsNull() {
            addCriterion("ctrl_addr is null");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrIsNotNull() {
            addCriterion("ctrl_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrEqualTo(String value) {
            addCriterion("ctrl_addr =", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrNotEqualTo(String value) {
            addCriterion("ctrl_addr <>", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrGreaterThan(String value) {
            addCriterion("ctrl_addr >", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ctrl_addr >=", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrLessThan(String value) {
            addCriterion("ctrl_addr <", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrLessThanOrEqualTo(String value) {
            addCriterion("ctrl_addr <=", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrLike(String value) {
            addCriterion("ctrl_addr like", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrNotLike(String value) {
            addCriterion("ctrl_addr not like", value, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrIn(List<String> values) {
            addCriterion("ctrl_addr in", values, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrNotIn(List<String> values) {
            addCriterion("ctrl_addr not in", values, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrBetween(String value1, String value2) {
            addCriterion("ctrl_addr between", value1, value2, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlAddrNotBetween(String value1, String value2) {
            addCriterion("ctrl_addr not between", value1, value2, "ctrlAddr");
            return (Criteria) this;
        }

        public Criteria andCtrlNameIsNull() {
            addCriterion("ctrl_name is null");
            return (Criteria) this;
        }

        public Criteria andCtrlNameIsNotNull() {
            addCriterion("ctrl_name is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlNameEqualTo(String value) {
            addCriterion("ctrl_name =", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameNotEqualTo(String value) {
            addCriterion("ctrl_name <>", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameGreaterThan(String value) {
            addCriterion("ctrl_name >", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameGreaterThanOrEqualTo(String value) {
            addCriterion("ctrl_name >=", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameLessThan(String value) {
            addCriterion("ctrl_name <", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameLessThanOrEqualTo(String value) {
            addCriterion("ctrl_name <=", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameLike(String value) {
            addCriterion("ctrl_name like", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameNotLike(String value) {
            addCriterion("ctrl_name not like", value, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameIn(List<String> values) {
            addCriterion("ctrl_name in", values, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameNotIn(List<String> values) {
            addCriterion("ctrl_name not in", values, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameBetween(String value1, String value2) {
            addCriterion("ctrl_name between", value1, value2, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlNameNotBetween(String value1, String value2) {
            addCriterion("ctrl_name not between", value1, value2, "ctrlName");
            return (Criteria) this;
        }

        public Criteria andCtrlDescIsNull() {
            addCriterion("ctrl_desc is null");
            return (Criteria) this;
        }

        public Criteria andCtrlDescIsNotNull() {
            addCriterion("ctrl_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlDescEqualTo(String value) {
            addCriterion("ctrl_desc =", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescNotEqualTo(String value) {
            addCriterion("ctrl_desc <>", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescGreaterThan(String value) {
            addCriterion("ctrl_desc >", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescGreaterThanOrEqualTo(String value) {
            addCriterion("ctrl_desc >=", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescLessThan(String value) {
            addCriterion("ctrl_desc <", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescLessThanOrEqualTo(String value) {
            addCriterion("ctrl_desc <=", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescLike(String value) {
            addCriterion("ctrl_desc like", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescNotLike(String value) {
            addCriterion("ctrl_desc not like", value, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescIn(List<String> values) {
            addCriterion("ctrl_desc in", values, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescNotIn(List<String> values) {
            addCriterion("ctrl_desc not in", values, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescBetween(String value1, String value2) {
            addCriterion("ctrl_desc between", value1, value2, "ctrlDesc");
            return (Criteria) this;
        }

        public Criteria andCtrlDescNotBetween(String value1, String value2) {
            addCriterion("ctrl_desc not between", value1, value2, "ctrlDesc");
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
     * This class corresponds to the database table tbl_ctrl_info
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
     * This class corresponds to the database table tbl_ctrl_info
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