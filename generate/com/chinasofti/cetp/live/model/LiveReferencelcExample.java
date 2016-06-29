package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveReferencelcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveReferencelcExample() {
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

        public Criteria andRlcLcIdIsNull() {
            addCriterion("RLC_LC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdIsNotNull() {
            addCriterion("RLC_LC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdEqualTo(Integer value) {
            addCriterion("RLC_LC_ID =", value, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdNotEqualTo(Integer value) {
            addCriterion("RLC_LC_ID <>", value, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdGreaterThan(Integer value) {
            addCriterion("RLC_LC_ID >", value, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RLC_LC_ID >=", value, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdLessThan(Integer value) {
            addCriterion("RLC_LC_ID <", value, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdLessThanOrEqualTo(Integer value) {
            addCriterion("RLC_LC_ID <=", value, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdIn(List<Integer> values) {
            addCriterion("RLC_LC_ID in", values, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdNotIn(List<Integer> values) {
            addCriterion("RLC_LC_ID not in", values, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdBetween(Integer value1, Integer value2) {
            addCriterion("RLC_LC_ID between", value1, value2, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcLcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RLC_LC_ID not between", value1, value2, "rlcLcId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdIsNull() {
            addCriterion("RLC_REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdIsNotNull() {
            addCriterion("RLC_REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdEqualTo(Integer value) {
            addCriterion("RLC_REF_ID =", value, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdNotEqualTo(Integer value) {
            addCriterion("RLC_REF_ID <>", value, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdGreaterThan(Integer value) {
            addCriterion("RLC_REF_ID >", value, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RLC_REF_ID >=", value, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdLessThan(Integer value) {
            addCriterion("RLC_REF_ID <", value, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdLessThanOrEqualTo(Integer value) {
            addCriterion("RLC_REF_ID <=", value, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdIn(List<Integer> values) {
            addCriterion("RLC_REF_ID in", values, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdNotIn(List<Integer> values) {
            addCriterion("RLC_REF_ID not in", values, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdBetween(Integer value1, Integer value2) {
            addCriterion("RLC_REF_ID between", value1, value2, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRefIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RLC_REF_ID not between", value1, value2, "rlcRefId");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeIsNull() {
            addCriterion("RLC_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeIsNotNull() {
            addCriterion("RLC_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeEqualTo(Date value) {
            addCriterion("RLC_REGTIME =", value, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeNotEqualTo(Date value) {
            addCriterion("RLC_REGTIME <>", value, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeGreaterThan(Date value) {
            addCriterion("RLC_REGTIME >", value, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RLC_REGTIME >=", value, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeLessThan(Date value) {
            addCriterion("RLC_REGTIME <", value, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("RLC_REGTIME <=", value, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeIn(List<Date> values) {
            addCriterion("RLC_REGTIME in", values, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeNotIn(List<Date> values) {
            addCriterion("RLC_REGTIME not in", values, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeBetween(Date value1, Date value2) {
            addCriterion("RLC_REGTIME between", value1, value2, "rlcRegtime");
            return (Criteria) this;
        }

        public Criteria andRlcRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("RLC_REGTIME not between", value1, value2, "rlcRegtime");
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