package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.List;

public class StuTechTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StuTechTypeExample() {
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

        public Criteria andStStuNoIsNull() {
            addCriterion("ST_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andStStuNoIsNotNull() {
            addCriterion("ST_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStStuNoEqualTo(Integer value) {
            addCriterion("ST_STU_NO =", value, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoNotEqualTo(Integer value) {
            addCriterion("ST_STU_NO <>", value, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoGreaterThan(Integer value) {
            addCriterion("ST_STU_NO >", value, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ST_STU_NO >=", value, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoLessThan(Integer value) {
            addCriterion("ST_STU_NO <", value, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("ST_STU_NO <=", value, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoIn(List<Integer> values) {
            addCriterion("ST_STU_NO in", values, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoNotIn(List<Integer> values) {
            addCriterion("ST_STU_NO not in", values, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoBetween(Integer value1, Integer value2) {
            addCriterion("ST_STU_NO between", value1, value2, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ST_STU_NO not between", value1, value2, "stStuNo");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdIsNull() {
            addCriterion("ST_TECHTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdIsNotNull() {
            addCriterion("ST_TECHTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdEqualTo(Integer value) {
            addCriterion("ST_TECHTYPE_ID =", value, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdNotEqualTo(Integer value) {
            addCriterion("ST_TECHTYPE_ID <>", value, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdGreaterThan(Integer value) {
            addCriterion("ST_TECHTYPE_ID >", value, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ST_TECHTYPE_ID >=", value, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdLessThan(Integer value) {
            addCriterion("ST_TECHTYPE_ID <", value, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ST_TECHTYPE_ID <=", value, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdIn(List<Integer> values) {
            addCriterion("ST_TECHTYPE_ID in", values, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdNotIn(List<Integer> values) {
            addCriterion("ST_TECHTYPE_ID not in", values, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("ST_TECHTYPE_ID between", value1, value2, "stTechtypeId");
            return (Criteria) this;
        }

        public Criteria andStTechtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ST_TECHTYPE_ID not between", value1, value2, "stTechtypeId");
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