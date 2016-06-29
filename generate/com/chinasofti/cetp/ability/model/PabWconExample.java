package com.chinasofti.cetp.ability.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PabWconExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public PabWconExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
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
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    protected abstract static class GeneratedCriteria {
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

        public Criteria andPabwPabIdIsNull() {
            addCriterion("PABW_PAB_ID is null");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdIsNotNull() {
            addCriterion("PABW_PAB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdEqualTo(Integer value) {
            addCriterion("PABW_PAB_ID =", value, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdNotEqualTo(Integer value) {
            addCriterion("PABW_PAB_ID <>", value, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdGreaterThan(Integer value) {
            addCriterion("PABW_PAB_ID >", value, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PABW_PAB_ID >=", value, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdLessThan(Integer value) {
            addCriterion("PABW_PAB_ID <", value, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdLessThanOrEqualTo(Integer value) {
            addCriterion("PABW_PAB_ID <=", value, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdIn(List<Integer> values) {
            addCriterion("PABW_PAB_ID in", values, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdNotIn(List<Integer> values) {
            addCriterion("PABW_PAB_ID not in", values, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdBetween(Integer value1, Integer value2) {
            addCriterion("PABW_PAB_ID between", value1, value2, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwPabIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PABW_PAB_ID not between", value1, value2, "pabwPabId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdIsNull() {
            addCriterion("PABW_WCON_ID is null");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdIsNotNull() {
            addCriterion("PABW_WCON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdEqualTo(Integer value) {
            addCriterion("PABW_WCON_ID =", value, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdNotEqualTo(Integer value) {
            addCriterion("PABW_WCON_ID <>", value, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdGreaterThan(Integer value) {
            addCriterion("PABW_WCON_ID >", value, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PABW_WCON_ID >=", value, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdLessThan(Integer value) {
            addCriterion("PABW_WCON_ID <", value, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdLessThanOrEqualTo(Integer value) {
            addCriterion("PABW_WCON_ID <=", value, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdIn(List<Integer> values) {
            addCriterion("PABW_WCON_ID in", values, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdNotIn(List<Integer> values) {
            addCriterion("PABW_WCON_ID not in", values, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdBetween(Integer value1, Integer value2) {
            addCriterion("PABW_WCON_ID between", value1, value2, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwWconIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PABW_WCON_ID not between", value1, value2, "pabwWconId");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeIsNull() {
            addCriterion("PABW_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeIsNotNull() {
            addCriterion("PABW_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeEqualTo(Date value) {
            addCriterion("PABW_REGTIME =", value, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeNotEqualTo(Date value) {
            addCriterion("PABW_REGTIME <>", value, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeGreaterThan(Date value) {
            addCriterion("PABW_REGTIME >", value, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PABW_REGTIME >=", value, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeLessThan(Date value) {
            addCriterion("PABW_REGTIME <", value, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("PABW_REGTIME <=", value, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeIn(List<Date> values) {
            addCriterion("PABW_REGTIME in", values, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeNotIn(List<Date> values) {
            addCriterion("PABW_REGTIME not in", values, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeBetween(Date value1, Date value2) {
            addCriterion("PABW_REGTIME between", value1, value2, "pabwRegtime");
            return (Criteria) this;
        }

        public Criteria andPabwRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("PABW_REGTIME not between", value1, value2, "pabwRegtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated do_not_delete_during_merge Fri Aug 09 09:51:47 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tp_pab_wcon
     *
     * @mbggenerated Fri Aug 09 09:51:47 CST 2013
     */
    public static class Criterion {
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