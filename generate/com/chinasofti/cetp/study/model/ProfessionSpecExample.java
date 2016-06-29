package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.List;

public class ProfessionSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfessionSpecExample() {
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

        public Criteria andPsProfIdIsNull() {
            addCriterion("PS_PROF_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsProfIdIsNotNull() {
            addCriterion("PS_PROF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsProfIdEqualTo(Integer value) {
            addCriterion("PS_PROF_ID =", value, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdNotEqualTo(Integer value) {
            addCriterion("PS_PROF_ID <>", value, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdGreaterThan(Integer value) {
            addCriterion("PS_PROF_ID >", value, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_PROF_ID >=", value, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdLessThan(Integer value) {
            addCriterion("PS_PROF_ID <", value, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdLessThanOrEqualTo(Integer value) {
            addCriterion("PS_PROF_ID <=", value, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdIn(List<Integer> values) {
            addCriterion("PS_PROF_ID in", values, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdNotIn(List<Integer> values) {
            addCriterion("PS_PROF_ID not in", values, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdBetween(Integer value1, Integer value2) {
            addCriterion("PS_PROF_ID between", value1, value2, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsProfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_PROF_ID not between", value1, value2, "psProfId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdIsNull() {
            addCriterion("PS_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdIsNotNull() {
            addCriterion("PS_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdEqualTo(Integer value) {
            addCriterion("PS_SPEC_ID =", value, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdNotEqualTo(Integer value) {
            addCriterion("PS_SPEC_ID <>", value, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdGreaterThan(Integer value) {
            addCriterion("PS_SPEC_ID >", value, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_SPEC_ID >=", value, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdLessThan(Integer value) {
            addCriterion("PS_SPEC_ID <", value, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("PS_SPEC_ID <=", value, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdIn(List<Integer> values) {
            addCriterion("PS_SPEC_ID in", values, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdNotIn(List<Integer> values) {
            addCriterion("PS_SPEC_ID not in", values, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("PS_SPEC_ID between", value1, value2, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_SPEC_ID not between", value1, value2, "psSpecId");
            return (Criteria) this;
        }

        public Criteria andPsSeqIsNull() {
            addCriterion("PS_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPsSeqIsNotNull() {
            addCriterion("PS_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPsSeqEqualTo(Integer value) {
            addCriterion("PS_SEQ =", value, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqNotEqualTo(Integer value) {
            addCriterion("PS_SEQ <>", value, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqGreaterThan(Integer value) {
            addCriterion("PS_SEQ >", value, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_SEQ >=", value, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqLessThan(Integer value) {
            addCriterion("PS_SEQ <", value, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqLessThanOrEqualTo(Integer value) {
            addCriterion("PS_SEQ <=", value, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqIn(List<Integer> values) {
            addCriterion("PS_SEQ in", values, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqNotIn(List<Integer> values) {
            addCriterion("PS_SEQ not in", values, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqBetween(Integer value1, Integer value2) {
            addCriterion("PS_SEQ between", value1, value2, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_SEQ not between", value1, value2, "psSeq");
            return (Criteria) this;
        }

        public Criteria andPsPointXIsNull() {
            addCriterion("PS_POINT_X is null");
            return (Criteria) this;
        }

        public Criteria andPsPointXIsNotNull() {
            addCriterion("PS_POINT_X is not null");
            return (Criteria) this;
        }

        public Criteria andPsPointXEqualTo(Integer value) {
            addCriterion("PS_POINT_X =", value, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXNotEqualTo(Integer value) {
            addCriterion("PS_POINT_X <>", value, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXGreaterThan(Integer value) {
            addCriterion("PS_POINT_X >", value, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_POINT_X >=", value, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXLessThan(Integer value) {
            addCriterion("PS_POINT_X <", value, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXLessThanOrEqualTo(Integer value) {
            addCriterion("PS_POINT_X <=", value, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXIn(List<Integer> values) {
            addCriterion("PS_POINT_X in", values, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXNotIn(List<Integer> values) {
            addCriterion("PS_POINT_X not in", values, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXBetween(Integer value1, Integer value2) {
            addCriterion("PS_POINT_X between", value1, value2, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointXNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_POINT_X not between", value1, value2, "psPointX");
            return (Criteria) this;
        }

        public Criteria andPsPointYIsNull() {
            addCriterion("PS_POINT_Y is null");
            return (Criteria) this;
        }

        public Criteria andPsPointYIsNotNull() {
            addCriterion("PS_POINT_Y is not null");
            return (Criteria) this;
        }

        public Criteria andPsPointYEqualTo(Integer value) {
            addCriterion("PS_POINT_Y =", value, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYNotEqualTo(Integer value) {
            addCriterion("PS_POINT_Y <>", value, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYGreaterThan(Integer value) {
            addCriterion("PS_POINT_Y >", value, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_POINT_Y >=", value, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYLessThan(Integer value) {
            addCriterion("PS_POINT_Y <", value, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYLessThanOrEqualTo(Integer value) {
            addCriterion("PS_POINT_Y <=", value, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYIn(List<Integer> values) {
            addCriterion("PS_POINT_Y in", values, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYNotIn(List<Integer> values) {
            addCriterion("PS_POINT_Y not in", values, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYBetween(Integer value1, Integer value2) {
            addCriterion("PS_POINT_Y between", value1, value2, "psPointY");
            return (Criteria) this;
        }

        public Criteria andPsPointYNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_POINT_Y not between", value1, value2, "psPointY");
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