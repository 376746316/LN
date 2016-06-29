package com.chinasofti.cetp.resource.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentVideoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCommvStuNoIsNull() {
            addCriterion("COMMV_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoIsNotNull() {
            addCriterion("COMMV_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoEqualTo(Integer value) {
            addCriterion("COMMV_STU_NO =", value, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoNotEqualTo(Integer value) {
            addCriterion("COMMV_STU_NO <>", value, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoGreaterThan(Integer value) {
            addCriterion("COMMV_STU_NO >", value, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMV_STU_NO >=", value, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoLessThan(Integer value) {
            addCriterion("COMMV_STU_NO <", value, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("COMMV_STU_NO <=", value, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoIn(List<Integer> values) {
            addCriterion("COMMV_STU_NO in", values, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoNotIn(List<Integer> values) {
            addCriterion("COMMV_STU_NO not in", values, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoBetween(Integer value1, Integer value2) {
            addCriterion("COMMV_STU_NO between", value1, value2, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMV_STU_NO not between", value1, value2, "commvStuNo");
            return (Criteria) this;
        }

        public Criteria andCommvVIdIsNull() {
            addCriterion("COMMV_V_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommvVIdIsNotNull() {
            addCriterion("COMMV_V_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommvVIdEqualTo(Integer value) {
            addCriterion("COMMV_V_ID =", value, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdNotEqualTo(Integer value) {
            addCriterion("COMMV_V_ID <>", value, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdGreaterThan(Integer value) {
            addCriterion("COMMV_V_ID >", value, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMV_V_ID >=", value, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdLessThan(Integer value) {
            addCriterion("COMMV_V_ID <", value, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMMV_V_ID <=", value, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdIn(List<Integer> values) {
            addCriterion("COMMV_V_ID in", values, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdNotIn(List<Integer> values) {
            addCriterion("COMMV_V_ID not in", values, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdBetween(Integer value1, Integer value2) {
            addCriterion("COMMV_V_ID between", value1, value2, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvVIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMV_V_ID not between", value1, value2, "commvVId");
            return (Criteria) this;
        }

        public Criteria andCommvFlagIsNull() {
            addCriterion("COMMV_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCommvFlagIsNotNull() {
            addCriterion("COMMV_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCommvFlagEqualTo(String value) {
            addCriterion("COMMV_FLAG =", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagNotEqualTo(String value) {
            addCriterion("COMMV_FLAG <>", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagGreaterThan(String value) {
            addCriterion("COMMV_FLAG >", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagGreaterThanOrEqualTo(String value) {
            addCriterion("COMMV_FLAG >=", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagLessThan(String value) {
            addCriterion("COMMV_FLAG <", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagLessThanOrEqualTo(String value) {
            addCriterion("COMMV_FLAG <=", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagLike(String value) {
            addCriterion("COMMV_FLAG like", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagNotLike(String value) {
            addCriterion("COMMV_FLAG not like", value, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagIn(List<String> values) {
            addCriterion("COMMV_FLAG in", values, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagNotIn(List<String> values) {
            addCriterion("COMMV_FLAG not in", values, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagBetween(String value1, String value2) {
            addCriterion("COMMV_FLAG between", value1, value2, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvFlagNotBetween(String value1, String value2) {
            addCriterion("COMMV_FLAG not between", value1, value2, "commvFlag");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeIsNull() {
            addCriterion("COMMV_UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeIsNotNull() {
            addCriterion("COMMV_UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeEqualTo(Date value) {
            addCriterion("COMMV_UPDATETIME =", value, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeNotEqualTo(Date value) {
            addCriterion("COMMV_UPDATETIME <>", value, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeGreaterThan(Date value) {
            addCriterion("COMMV_UPDATETIME >", value, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMMV_UPDATETIME >=", value, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeLessThan(Date value) {
            addCriterion("COMMV_UPDATETIME <", value, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("COMMV_UPDATETIME <=", value, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeIn(List<Date> values) {
            addCriterion("COMMV_UPDATETIME in", values, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeNotIn(List<Date> values) {
            addCriterion("COMMV_UPDATETIME not in", values, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("COMMV_UPDATETIME between", value1, value2, "commvUpdatetime");
            return (Criteria) this;
        }

        public Criteria andCommvUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("COMMV_UPDATETIME not between", value1, value2, "commvUpdatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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