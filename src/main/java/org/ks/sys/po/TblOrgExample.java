package org.ks.sys.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblOrgExample implements Serializable {
    /**
     * tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    protected String orderByClause;

    /**
     * tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    protected boolean distinct;

    /**
     * tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public TblOrgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
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
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
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

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNull() {
            addCriterion("father_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherIdIsNotNull() {
            addCriterion("father_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherIdEqualTo(Long value) {
            addCriterion("father_id =", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotEqualTo(Long value) {
            addCriterion("father_id <>", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThan(Long value) {
            addCriterion("father_id >", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("father_id >=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThan(Long value) {
            addCriterion("father_id <", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdLessThanOrEqualTo(Long value) {
            addCriterion("father_id <=", value, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdIn(List<Long> values) {
            addCriterion("father_id in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotIn(List<Long> values) {
            addCriterion("father_id not in", values, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdBetween(Long value1, Long value2) {
            addCriterion("father_id between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andFatherIdNotBetween(Long value1, Long value2) {
            addCriterion("father_id not between", value1, value2, "fatherId");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeIsNull() {
            addCriterion("org_type_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeIsNotNull() {
            addCriterion("org_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeEqualTo(String value) {
            addCriterion("org_type_code =", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotEqualTo(String value) {
            addCriterion("org_type_code <>", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeGreaterThan(String value) {
            addCriterion("org_type_code >", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_type_code >=", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeLessThan(String value) {
            addCriterion("org_type_code <", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("org_type_code <=", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeLike(String value) {
            addCriterion("org_type_code like", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotLike(String value) {
            addCriterion("org_type_code not like", value, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeIn(List<String> values) {
            addCriterion("org_type_code in", values, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotIn(List<String> values) {
            addCriterion("org_type_code not in", values, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeBetween(String value1, String value2) {
            addCriterion("org_type_code between", value1, value2, "orgTypeCode");
            return (Criteria) this;
        }

        public Criteria andOrgTypeCodeNotBetween(String value1, String value2) {
            addCriterion("org_type_code not between", value1, value2, "orgTypeCode");
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
     * This class corresponds to the database table tbl_org
     *
     * @mbg.generated do_not_delete_during_merge Mon May 11 19:18:45 CST 2020
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_org
     *
     * @mbg.generated Mon May 11 19:18:45 CST 2020
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