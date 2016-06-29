package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectScExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectScExample() {
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

        public Criteria andCscSpecIdIsNull() {
            addCriterion("CSC_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdIsNotNull() {
            addCriterion("CSC_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdEqualTo(Integer value) {
            addCriterion("CSC_SPEC_ID =", value, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdNotEqualTo(Integer value) {
            addCriterion("CSC_SPEC_ID <>", value, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdGreaterThan(Integer value) {
            addCriterion("CSC_SPEC_ID >", value, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSC_SPEC_ID >=", value, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdLessThan(Integer value) {
            addCriterion("CSC_SPEC_ID <", value, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("CSC_SPEC_ID <=", value, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdIn(List<Integer> values) {
            addCriterion("CSC_SPEC_ID in", values, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdNotIn(List<Integer> values) {
            addCriterion("CSC_SPEC_ID not in", values, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("CSC_SPEC_ID between", value1, value2, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CSC_SPEC_ID not between", value1, value2, "cscSpecId");
            return (Criteria) this;
        }

        public Criteria andCscStuNoIsNull() {
            addCriterion("CSC_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andCscStuNoIsNotNull() {
            addCriterion("CSC_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCscStuNoEqualTo(Integer value) {
            addCriterion("CSC_STU_NO =", value, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoNotEqualTo(Integer value) {
            addCriterion("CSC_STU_NO <>", value, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoGreaterThan(Integer value) {
            addCriterion("CSC_STU_NO >", value, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CSC_STU_NO >=", value, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoLessThan(Integer value) {
            addCriterion("CSC_STU_NO <", value, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("CSC_STU_NO <=", value, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoIn(List<Integer> values) {
            addCriterion("CSC_STU_NO in", values, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoNotIn(List<Integer> values) {
            addCriterion("CSC_STU_NO not in", values, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoBetween(Integer value1, Integer value2) {
            addCriterion("CSC_STU_NO between", value1, value2, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CSC_STU_NO not between", value1, value2, "cscStuNo");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeIsNull() {
            addCriterion("CSC_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeIsNotNull() {
            addCriterion("CSC_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeEqualTo(Date value) {
            addCriterion("CSC_REGTIME =", value, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeNotEqualTo(Date value) {
            addCriterion("CSC_REGTIME <>", value, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeGreaterThan(Date value) {
            addCriterion("CSC_REGTIME >", value, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CSC_REGTIME >=", value, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeLessThan(Date value) {
            addCriterion("CSC_REGTIME <", value, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("CSC_REGTIME <=", value, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeIn(List<Date> values) {
            addCriterion("CSC_REGTIME in", values, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeNotIn(List<Date> values) {
            addCriterion("CSC_REGTIME not in", values, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeBetween(Date value1, Date value2) {
            addCriterion("CSC_REGTIME between", value1, value2, "cscRegtime");
            return (Criteria) this;
        }

        public Criteria andCscRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("CSC_REGTIME not between", value1, value2, "cscRegtime");
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