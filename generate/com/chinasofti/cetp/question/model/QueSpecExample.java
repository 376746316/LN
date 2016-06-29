package com.chinasofti.cetp.question.model;

import java.util.ArrayList;
import java.util.List;

public class QueSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueSpecExample() {
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

        public Criteria andQsQueIdIsNull() {
            addCriterion("QS_QUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andQsQueIdIsNotNull() {
            addCriterion("QS_QUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQsQueIdEqualTo(Integer value) {
            addCriterion("QS_QUE_ID =", value, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdNotEqualTo(Integer value) {
            addCriterion("QS_QUE_ID <>", value, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdGreaterThan(Integer value) {
            addCriterion("QS_QUE_ID >", value, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QS_QUE_ID >=", value, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdLessThan(Integer value) {
            addCriterion("QS_QUE_ID <", value, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdLessThanOrEqualTo(Integer value) {
            addCriterion("QS_QUE_ID <=", value, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdIn(List<Integer> values) {
            addCriterion("QS_QUE_ID in", values, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdNotIn(List<Integer> values) {
            addCriterion("QS_QUE_ID not in", values, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdBetween(Integer value1, Integer value2) {
            addCriterion("QS_QUE_ID between", value1, value2, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsQueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QS_QUE_ID not between", value1, value2, "qsQueId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdIsNull() {
            addCriterion("QS_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdIsNotNull() {
            addCriterion("QS_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdEqualTo(Integer value) {
            addCriterion("QS_SPEC_ID =", value, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdNotEqualTo(Integer value) {
            addCriterion("QS_SPEC_ID <>", value, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdGreaterThan(Integer value) {
            addCriterion("QS_SPEC_ID >", value, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("QS_SPEC_ID >=", value, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdLessThan(Integer value) {
            addCriterion("QS_SPEC_ID <", value, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("QS_SPEC_ID <=", value, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdIn(List<Integer> values) {
            addCriterion("QS_SPEC_ID in", values, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdNotIn(List<Integer> values) {
            addCriterion("QS_SPEC_ID not in", values, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("QS_SPEC_ID between", value1, value2, "qsSpecId");
            return (Criteria) this;
        }

        public Criteria andQsSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("QS_SPEC_ID not between", value1, value2, "qsSpecId");
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