package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.List;

public class RqaCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RqaCostExample() {
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

        public Criteria andRcIdIsNull() {
            addCriterion("RC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRcIdIsNotNull() {
            addCriterion("RC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRcIdEqualTo(Integer value) {
            addCriterion("RC_ID =", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdNotEqualTo(Integer value) {
            addCriterion("RC_ID <>", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdGreaterThan(Integer value) {
            addCriterion("RC_ID >", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RC_ID >=", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdLessThan(Integer value) {
            addCriterion("RC_ID <", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdLessThanOrEqualTo(Integer value) {
            addCriterion("RC_ID <=", value, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdIn(List<Integer> values) {
            addCriterion("RC_ID in", values, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdNotIn(List<Integer> values) {
            addCriterion("RC_ID not in", values, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdBetween(Integer value1, Integer value2) {
            addCriterion("RC_ID between", value1, value2, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RC_ID not between", value1, value2, "rcId");
            return (Criteria) this;
        }

        public Criteria andRcTimesIsNull() {
            addCriterion("RC_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRcTimesIsNotNull() {
            addCriterion("RC_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRcTimesEqualTo(Integer value) {
            addCriterion("RC_TIMES =", value, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesNotEqualTo(Integer value) {
            addCriterion("RC_TIMES <>", value, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesGreaterThan(Integer value) {
            addCriterion("RC_TIMES >", value, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RC_TIMES >=", value, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesLessThan(Integer value) {
            addCriterion("RC_TIMES <", value, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesLessThanOrEqualTo(Integer value) {
            addCriterion("RC_TIMES <=", value, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesIn(List<Integer> values) {
            addCriterion("RC_TIMES in", values, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesNotIn(List<Integer> values) {
            addCriterion("RC_TIMES not in", values, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesBetween(Integer value1, Integer value2) {
            addCriterion("RC_TIMES between", value1, value2, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("RC_TIMES not between", value1, value2, "rcTimes");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostIsNull() {
            addCriterion("RC_COIN_COST is null");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostIsNotNull() {
            addCriterion("RC_COIN_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostEqualTo(Integer value) {
            addCriterion("RC_COIN_COST =", value, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostNotEqualTo(Integer value) {
            addCriterion("RC_COIN_COST <>", value, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostGreaterThan(Integer value) {
            addCriterion("RC_COIN_COST >", value, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("RC_COIN_COST >=", value, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostLessThan(Integer value) {
            addCriterion("RC_COIN_COST <", value, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostLessThanOrEqualTo(Integer value) {
            addCriterion("RC_COIN_COST <=", value, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostIn(List<Integer> values) {
            addCriterion("RC_COIN_COST in", values, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostNotIn(List<Integer> values) {
            addCriterion("RC_COIN_COST not in", values, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostBetween(Integer value1, Integer value2) {
            addCriterion("RC_COIN_COST between", value1, value2, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcCoinCostNotBetween(Integer value1, Integer value2) {
            addCriterion("RC_COIN_COST not between", value1, value2, "rcCoinCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostIsNull() {
            addCriterion("RC_RMB_COST is null");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostIsNotNull() {
            addCriterion("RC_RMB_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostEqualTo(Double value) {
            addCriterion("RC_RMB_COST =", value, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostNotEqualTo(Double value) {
            addCriterion("RC_RMB_COST <>", value, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostGreaterThan(Double value) {
            addCriterion("RC_RMB_COST >", value, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostGreaterThanOrEqualTo(Double value) {
            addCriterion("RC_RMB_COST >=", value, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostLessThan(Double value) {
            addCriterion("RC_RMB_COST <", value, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostLessThanOrEqualTo(Double value) {
            addCriterion("RC_RMB_COST <=", value, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostIn(List<Double> values) {
            addCriterion("RC_RMB_COST in", values, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostNotIn(List<Double> values) {
            addCriterion("RC_RMB_COST not in", values, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostBetween(Double value1, Double value2) {
            addCriterion("RC_RMB_COST between", value1, value2, "rcRmbCost");
            return (Criteria) this;
        }

        public Criteria andRcRmbCostNotBetween(Double value1, Double value2) {
            addCriterion("RC_RMB_COST not between", value1, value2, "rcRmbCost");
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