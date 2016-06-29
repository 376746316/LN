package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.List;

public class RqaParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RqaParamExample() {
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

        public Criteria andRpIdIsNull() {
            addCriterion("RP_ID is null");
            return (Criteria) this;
        }

        public Criteria andRpIdIsNotNull() {
            addCriterion("RP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRpIdEqualTo(Integer value) {
            addCriterion("RP_ID =", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotEqualTo(Integer value) {
            addCriterion("RP_ID <>", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdGreaterThan(Integer value) {
            addCriterion("RP_ID >", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RP_ID >=", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdLessThan(Integer value) {
            addCriterion("RP_ID <", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdLessThanOrEqualTo(Integer value) {
            addCriterion("RP_ID <=", value, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdIn(List<Integer> values) {
            addCriterion("RP_ID in", values, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotIn(List<Integer> values) {
            addCriterion("RP_ID not in", values, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdBetween(Integer value1, Integer value2) {
            addCriterion("RP_ID between", value1, value2, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RP_ID not between", value1, value2, "rpId");
            return (Criteria) this;
        }

        public Criteria andRpNameIsNull() {
            addCriterion("RP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRpNameIsNotNull() {
            addCriterion("RP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRpNameEqualTo(String value) {
            addCriterion("RP_NAME =", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameNotEqualTo(String value) {
            addCriterion("RP_NAME <>", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameGreaterThan(String value) {
            addCriterion("RP_NAME >", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameGreaterThanOrEqualTo(String value) {
            addCriterion("RP_NAME >=", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameLessThan(String value) {
            addCriterion("RP_NAME <", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameLessThanOrEqualTo(String value) {
            addCriterion("RP_NAME <=", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameLike(String value) {
            addCriterion("RP_NAME like", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameNotLike(String value) {
            addCriterion("RP_NAME not like", value, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameIn(List<String> values) {
            addCriterion("RP_NAME in", values, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameNotIn(List<String> values) {
            addCriterion("RP_NAME not in", values, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameBetween(String value1, String value2) {
            addCriterion("RP_NAME between", value1, value2, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpNameNotBetween(String value1, String value2) {
            addCriterion("RP_NAME not between", value1, value2, "rpName");
            return (Criteria) this;
        }

        public Criteria andRpValueIsNull() {
            addCriterion("RP_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRpValueIsNotNull() {
            addCriterion("RP_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRpValueEqualTo(String value) {
            addCriterion("RP_VALUE =", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueNotEqualTo(String value) {
            addCriterion("RP_VALUE <>", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueGreaterThan(String value) {
            addCriterion("RP_VALUE >", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueGreaterThanOrEqualTo(String value) {
            addCriterion("RP_VALUE >=", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueLessThan(String value) {
            addCriterion("RP_VALUE <", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueLessThanOrEqualTo(String value) {
            addCriterion("RP_VALUE <=", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueLike(String value) {
            addCriterion("RP_VALUE like", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueNotLike(String value) {
            addCriterion("RP_VALUE not like", value, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueIn(List<String> values) {
            addCriterion("RP_VALUE in", values, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueNotIn(List<String> values) {
            addCriterion("RP_VALUE not in", values, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueBetween(String value1, String value2) {
            addCriterion("RP_VALUE between", value1, value2, "rpValue");
            return (Criteria) this;
        }

        public Criteria andRpValueNotBetween(String value1, String value2) {
            addCriterion("RP_VALUE not between", value1, value2, "rpValue");
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