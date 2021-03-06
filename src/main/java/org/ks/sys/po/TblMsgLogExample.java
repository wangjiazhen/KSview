package org.ks.sys.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblMsgLogExample implements Serializable {
    /**
     * tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    protected String orderByClause;

    /**
     * tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    protected boolean distinct;

    /**
     * tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:28 CST 2020
     */
    public TblMsgLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
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
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApiNoIsNull() {
            addCriterion("api_no is null");
            return (Criteria) this;
        }

        public Criteria andApiNoIsNotNull() {
            addCriterion("api_no is not null");
            return (Criteria) this;
        }

        public Criteria andApiNoEqualTo(String value) {
            addCriterion("api_no =", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoNotEqualTo(String value) {
            addCriterion("api_no <>", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoGreaterThan(String value) {
            addCriterion("api_no >", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoGreaterThanOrEqualTo(String value) {
            addCriterion("api_no >=", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoLessThan(String value) {
            addCriterion("api_no <", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoLessThanOrEqualTo(String value) {
            addCriterion("api_no <=", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoLike(String value) {
            addCriterion("api_no like", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoNotLike(String value) {
            addCriterion("api_no not like", value, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoIn(List<String> values) {
            addCriterion("api_no in", values, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoNotIn(List<String> values) {
            addCriterion("api_no not in", values, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoBetween(String value1, String value2) {
            addCriterion("api_no between", value1, value2, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiNoNotBetween(String value1, String value2) {
            addCriterion("api_no not between", value1, value2, "apiNo");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNull() {
            addCriterion("api_type is null");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNotNull() {
            addCriterion("api_type is not null");
            return (Criteria) this;
        }

        public Criteria andApiTypeEqualTo(String value) {
            addCriterion("api_type =", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotEqualTo(String value) {
            addCriterion("api_type <>", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThan(String value) {
            addCriterion("api_type >", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("api_type >=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThan(String value) {
            addCriterion("api_type <", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThanOrEqualTo(String value) {
            addCriterion("api_type <=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLike(String value) {
            addCriterion("api_type like", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotLike(String value) {
            addCriterion("api_type not like", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeIn(List<String> values) {
            addCriterion("api_type in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotIn(List<String> values) {
            addCriterion("api_type not in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeBetween(String value1, String value2) {
            addCriterion("api_type between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotBetween(String value1, String value2) {
            addCriterion("api_type not between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiDescIsNull() {
            addCriterion("api_desc is null");
            return (Criteria) this;
        }

        public Criteria andApiDescIsNotNull() {
            addCriterion("api_desc is not null");
            return (Criteria) this;
        }

        public Criteria andApiDescEqualTo(String value) {
            addCriterion("api_desc =", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotEqualTo(String value) {
            addCriterion("api_desc <>", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescGreaterThan(String value) {
            addCriterion("api_desc >", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescGreaterThanOrEqualTo(String value) {
            addCriterion("api_desc >=", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLessThan(String value) {
            addCriterion("api_desc <", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLessThanOrEqualTo(String value) {
            addCriterion("api_desc <=", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLike(String value) {
            addCriterion("api_desc like", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotLike(String value) {
            addCriterion("api_desc not like", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescIn(List<String> values) {
            addCriterion("api_desc in", values, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotIn(List<String> values) {
            addCriterion("api_desc not in", values, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescBetween(String value1, String value2) {
            addCriterion("api_desc between", value1, value2, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotBetween(String value1, String value2) {
            addCriterion("api_desc not between", value1, value2, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeIsNull() {
            addCriterion("api_start_time is null");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeIsNotNull() {
            addCriterion("api_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeEqualTo(Date value) {
            addCriterion("api_start_time =", value, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeNotEqualTo(Date value) {
            addCriterion("api_start_time <>", value, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeGreaterThan(Date value) {
            addCriterion("api_start_time >", value, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("api_start_time >=", value, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeLessThan(Date value) {
            addCriterion("api_start_time <", value, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("api_start_time <=", value, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeIn(List<Date> values) {
            addCriterion("api_start_time in", values, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeNotIn(List<Date> values) {
            addCriterion("api_start_time not in", values, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeBetween(Date value1, Date value2) {
            addCriterion("api_start_time between", value1, value2, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("api_start_time not between", value1, value2, "apiStartTime");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgIsNull() {
            addCriterion("api_req_msg is null");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgIsNotNull() {
            addCriterion("api_req_msg is not null");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgEqualTo(String value) {
            addCriterion("api_req_msg =", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgNotEqualTo(String value) {
            addCriterion("api_req_msg <>", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgGreaterThan(String value) {
            addCriterion("api_req_msg >", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgGreaterThanOrEqualTo(String value) {
            addCriterion("api_req_msg >=", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgLessThan(String value) {
            addCriterion("api_req_msg <", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgLessThanOrEqualTo(String value) {
            addCriterion("api_req_msg <=", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgLike(String value) {
            addCriterion("api_req_msg like", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgNotLike(String value) {
            addCriterion("api_req_msg not like", value, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgIn(List<String> values) {
            addCriterion("api_req_msg in", values, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgNotIn(List<String> values) {
            addCriterion("api_req_msg not in", values, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgBetween(String value1, String value2) {
            addCriterion("api_req_msg between", value1, value2, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiReqMsgNotBetween(String value1, String value2) {
            addCriterion("api_req_msg not between", value1, value2, "apiReqMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgIsNull() {
            addCriterion("api_res_msg is null");
            return (Criteria) this;
        }

        public Criteria andApiResMsgIsNotNull() {
            addCriterion("api_res_msg is not null");
            return (Criteria) this;
        }

        public Criteria andApiResMsgEqualTo(String value) {
            addCriterion("api_res_msg =", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgNotEqualTo(String value) {
            addCriterion("api_res_msg <>", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgGreaterThan(String value) {
            addCriterion("api_res_msg >", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgGreaterThanOrEqualTo(String value) {
            addCriterion("api_res_msg >=", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgLessThan(String value) {
            addCriterion("api_res_msg <", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgLessThanOrEqualTo(String value) {
            addCriterion("api_res_msg <=", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgLike(String value) {
            addCriterion("api_res_msg like", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgNotLike(String value) {
            addCriterion("api_res_msg not like", value, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgIn(List<String> values) {
            addCriterion("api_res_msg in", values, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgNotIn(List<String> values) {
            addCriterion("api_res_msg not in", values, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgBetween(String value1, String value2) {
            addCriterion("api_res_msg between", value1, value2, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiResMsgNotBetween(String value1, String value2) {
            addCriterion("api_res_msg not between", value1, value2, "apiResMsg");
            return (Criteria) this;
        }

        public Criteria andApiFlagIsNull() {
            addCriterion("api_flag is null");
            return (Criteria) this;
        }

        public Criteria andApiFlagIsNotNull() {
            addCriterion("api_flag is not null");
            return (Criteria) this;
        }

        public Criteria andApiFlagEqualTo(Integer value) {
            addCriterion("api_flag =", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagNotEqualTo(Integer value) {
            addCriterion("api_flag <>", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagGreaterThan(Integer value) {
            addCriterion("api_flag >", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("api_flag >=", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagLessThan(Integer value) {
            addCriterion("api_flag <", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagLessThanOrEqualTo(Integer value) {
            addCriterion("api_flag <=", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagIn(List<Integer> values) {
            addCriterion("api_flag in", values, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagNotIn(List<Integer> values) {
            addCriterion("api_flag not in", values, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagBetween(Integer value1, Integer value2) {
            addCriterion("api_flag between", value1, value2, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("api_flag not between", value1, value2, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeIsNull() {
            addCriterion("api_end_time is null");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeIsNotNull() {
            addCriterion("api_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeEqualTo(Date value) {
            addCriterion("api_end_time =", value, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeNotEqualTo(Date value) {
            addCriterion("api_end_time <>", value, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeGreaterThan(Date value) {
            addCriterion("api_end_time >", value, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("api_end_time >=", value, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeLessThan(Date value) {
            addCriterion("api_end_time <", value, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("api_end_time <=", value, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeIn(List<Date> values) {
            addCriterion("api_end_time in", values, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeNotIn(List<Date> values) {
            addCriterion("api_end_time not in", values, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeBetween(Date value1, Date value2) {
            addCriterion("api_end_time between", value1, value2, "apiEndTime");
            return (Criteria) this;
        }

        public Criteria andApiEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("api_end_time not between", value1, value2, "apiEndTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_msg_log
     *
     * @mbg.generated do_not_delete_during_merge Fri Aug 21 13:52:29 CST 2020
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_msg_log
     *
     * @mbg.generated Fri Aug 21 13:52:29 CST 2020
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