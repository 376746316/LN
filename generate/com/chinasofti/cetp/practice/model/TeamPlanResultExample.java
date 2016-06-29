package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamPlanResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamPlanResultExample() {
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

        public Criteria andTprIdIsNull() {
            addCriterion("TPR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTprIdIsNotNull() {
            addCriterion("TPR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTprIdEqualTo(Integer value) {
            addCriterion("TPR_ID =", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdNotEqualTo(Integer value) {
            addCriterion("TPR_ID <>", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdGreaterThan(Integer value) {
            addCriterion("TPR_ID >", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPR_ID >=", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdLessThan(Integer value) {
            addCriterion("TPR_ID <", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPR_ID <=", value, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdIn(List<Integer> values) {
            addCriterion("TPR_ID in", values, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdNotIn(List<Integer> values) {
            addCriterion("TPR_ID not in", values, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdBetween(Integer value1, Integer value2) {
            addCriterion("TPR_ID between", value1, value2, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPR_ID not between", value1, value2, "tprId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdIsNull() {
            addCriterion("TPR_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdIsNotNull() {
            addCriterion("TPR_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdEqualTo(Integer value) {
            addCriterion("TPR_PLAN_ID =", value, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdNotEqualTo(Integer value) {
            addCriterion("TPR_PLAN_ID <>", value, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdGreaterThan(Integer value) {
            addCriterion("TPR_PLAN_ID >", value, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TPR_PLAN_ID >=", value, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdLessThan(Integer value) {
            addCriterion("TPR_PLAN_ID <", value, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("TPR_PLAN_ID <=", value, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdIn(List<Integer> values) {
            addCriterion("TPR_PLAN_ID in", values, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdNotIn(List<Integer> values) {
            addCriterion("TPR_PLAN_ID not in", values, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("TPR_PLAN_ID between", value1, value2, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TPR_PLAN_ID not between", value1, value2, "tprPlanId");
            return (Criteria) this;
        }

        public Criteria andTprNameIsNull() {
            addCriterion("TPR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTprNameIsNotNull() {
            addCriterion("TPR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTprNameEqualTo(String value) {
            addCriterion("TPR_NAME =", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameNotEqualTo(String value) {
            addCriterion("TPR_NAME <>", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameGreaterThan(String value) {
            addCriterion("TPR_NAME >", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameGreaterThanOrEqualTo(String value) {
            addCriterion("TPR_NAME >=", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameLessThan(String value) {
            addCriterion("TPR_NAME <", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameLessThanOrEqualTo(String value) {
            addCriterion("TPR_NAME <=", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameLike(String value) {
            addCriterion("TPR_NAME like", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameNotLike(String value) {
            addCriterion("TPR_NAME not like", value, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameIn(List<String> values) {
            addCriterion("TPR_NAME in", values, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameNotIn(List<String> values) {
            addCriterion("TPR_NAME not in", values, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameBetween(String value1, String value2) {
            addCriterion("TPR_NAME between", value1, value2, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprNameNotBetween(String value1, String value2) {
            addCriterion("TPR_NAME not between", value1, value2, "tprName");
            return (Criteria) this;
        }

        public Criteria andTprStyleIsNull() {
            addCriterion("TPR_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andTprStyleIsNotNull() {
            addCriterion("TPR_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andTprStyleEqualTo(String value) {
            addCriterion("TPR_STYLE =", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleNotEqualTo(String value) {
            addCriterion("TPR_STYLE <>", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleGreaterThan(String value) {
            addCriterion("TPR_STYLE >", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleGreaterThanOrEqualTo(String value) {
            addCriterion("TPR_STYLE >=", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleLessThan(String value) {
            addCriterion("TPR_STYLE <", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleLessThanOrEqualTo(String value) {
            addCriterion("TPR_STYLE <=", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleLike(String value) {
            addCriterion("TPR_STYLE like", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleNotLike(String value) {
            addCriterion("TPR_STYLE not like", value, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleIn(List<String> values) {
            addCriterion("TPR_STYLE in", values, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleNotIn(List<String> values) {
            addCriterion("TPR_STYLE not in", values, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleBetween(String value1, String value2) {
            addCriterion("TPR_STYLE between", value1, value2, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprStyleNotBetween(String value1, String value2) {
            addCriterion("TPR_STYLE not between", value1, value2, "tprStyle");
            return (Criteria) this;
        }

        public Criteria andTprResultIsNull() {
            addCriterion("TPR_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andTprResultIsNotNull() {
            addCriterion("TPR_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andTprResultEqualTo(String value) {
            addCriterion("TPR_RESULT =", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultNotEqualTo(String value) {
            addCriterion("TPR_RESULT <>", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultGreaterThan(String value) {
            addCriterion("TPR_RESULT >", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultGreaterThanOrEqualTo(String value) {
            addCriterion("TPR_RESULT >=", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultLessThan(String value) {
            addCriterion("TPR_RESULT <", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultLessThanOrEqualTo(String value) {
            addCriterion("TPR_RESULT <=", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultLike(String value) {
            addCriterion("TPR_RESULT like", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultNotLike(String value) {
            addCriterion("TPR_RESULT not like", value, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultIn(List<String> values) {
            addCriterion("TPR_RESULT in", values, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultNotIn(List<String> values) {
            addCriterion("TPR_RESULT not in", values, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultBetween(String value1, String value2) {
            addCriterion("TPR_RESULT between", value1, value2, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprResultNotBetween(String value1, String value2) {
            addCriterion("TPR_RESULT not between", value1, value2, "tprResult");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeIsNull() {
            addCriterion("TPR_COMMIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeIsNotNull() {
            addCriterion("TPR_COMMIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeEqualTo(Date value) {
            addCriterion("TPR_COMMIT_TIME =", value, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeNotEqualTo(Date value) {
            addCriterion("TPR_COMMIT_TIME <>", value, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeGreaterThan(Date value) {
            addCriterion("TPR_COMMIT_TIME >", value, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TPR_COMMIT_TIME >=", value, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeLessThan(Date value) {
            addCriterion("TPR_COMMIT_TIME <", value, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("TPR_COMMIT_TIME <=", value, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeIn(List<Date> values) {
            addCriterion("TPR_COMMIT_TIME in", values, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeNotIn(List<Date> values) {
            addCriterion("TPR_COMMIT_TIME not in", values, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeBetween(Date value1, Date value2) {
            addCriterion("TPR_COMMIT_TIME between", value1, value2, "tprCommitTime");
            return (Criteria) this;
        }

        public Criteria andTprCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("TPR_COMMIT_TIME not between", value1, value2, "tprCommitTime");
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