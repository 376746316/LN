package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonPlanResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonPlanResultExample() {
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

        public Criteria andPrpIdIsNull() {
            addCriterion("PRP_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrpIdIsNotNull() {
            addCriterion("PRP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrpIdEqualTo(Integer value) {
            addCriterion("PRP_ID =", value, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdNotEqualTo(Integer value) {
            addCriterion("PRP_ID <>", value, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdGreaterThan(Integer value) {
            addCriterion("PRP_ID >", value, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRP_ID >=", value, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdLessThan(Integer value) {
            addCriterion("PRP_ID <", value, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRP_ID <=", value, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdIn(List<Integer> values) {
            addCriterion("PRP_ID in", values, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdNotIn(List<Integer> values) {
            addCriterion("PRP_ID not in", values, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdBetween(Integer value1, Integer value2) {
            addCriterion("PRP_ID between", value1, value2, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRP_ID not between", value1, value2, "prpId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdIsNull() {
            addCriterion("PRP_PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdIsNotNull() {
            addCriterion("PRP_PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdEqualTo(Integer value) {
            addCriterion("PRP_PLAN_ID =", value, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdNotEqualTo(Integer value) {
            addCriterion("PRP_PLAN_ID <>", value, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdGreaterThan(Integer value) {
            addCriterion("PRP_PLAN_ID >", value, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRP_PLAN_ID >=", value, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdLessThan(Integer value) {
            addCriterion("PRP_PLAN_ID <", value, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRP_PLAN_ID <=", value, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdIn(List<Integer> values) {
            addCriterion("PRP_PLAN_ID in", values, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdNotIn(List<Integer> values) {
            addCriterion("PRP_PLAN_ID not in", values, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("PRP_PLAN_ID between", value1, value2, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRP_PLAN_ID not between", value1, value2, "prpPlanId");
            return (Criteria) this;
        }

        public Criteria andPrpNameIsNull() {
            addCriterion("PRP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrpNameIsNotNull() {
            addCriterion("PRP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrpNameEqualTo(String value) {
            addCriterion("PRP_NAME =", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameNotEqualTo(String value) {
            addCriterion("PRP_NAME <>", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameGreaterThan(String value) {
            addCriterion("PRP_NAME >", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRP_NAME >=", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameLessThan(String value) {
            addCriterion("PRP_NAME <", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameLessThanOrEqualTo(String value) {
            addCriterion("PRP_NAME <=", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameLike(String value) {
            addCriterion("PRP_NAME like", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameNotLike(String value) {
            addCriterion("PRP_NAME not like", value, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameIn(List<String> values) {
            addCriterion("PRP_NAME in", values, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameNotIn(List<String> values) {
            addCriterion("PRP_NAME not in", values, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameBetween(String value1, String value2) {
            addCriterion("PRP_NAME between", value1, value2, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpNameNotBetween(String value1, String value2) {
            addCriterion("PRP_NAME not between", value1, value2, "prpName");
            return (Criteria) this;
        }

        public Criteria andPrpStyleIsNull() {
            addCriterion("PRP_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andPrpStyleIsNotNull() {
            addCriterion("PRP_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andPrpStyleEqualTo(String value) {
            addCriterion("PRP_STYLE =", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleNotEqualTo(String value) {
            addCriterion("PRP_STYLE <>", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleGreaterThan(String value) {
            addCriterion("PRP_STYLE >", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleGreaterThanOrEqualTo(String value) {
            addCriterion("PRP_STYLE >=", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleLessThan(String value) {
            addCriterion("PRP_STYLE <", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleLessThanOrEqualTo(String value) {
            addCriterion("PRP_STYLE <=", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleLike(String value) {
            addCriterion("PRP_STYLE like", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleNotLike(String value) {
            addCriterion("PRP_STYLE not like", value, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleIn(List<String> values) {
            addCriterion("PRP_STYLE in", values, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleNotIn(List<String> values) {
            addCriterion("PRP_STYLE not in", values, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleBetween(String value1, String value2) {
            addCriterion("PRP_STYLE between", value1, value2, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpStyleNotBetween(String value1, String value2) {
            addCriterion("PRP_STYLE not between", value1, value2, "prpStyle");
            return (Criteria) this;
        }

        public Criteria andPrpResultIsNull() {
            addCriterion("PRP_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPrpResultIsNotNull() {
            addCriterion("PRP_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPrpResultEqualTo(String value) {
            addCriterion("PRP_RESULT =", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultNotEqualTo(String value) {
            addCriterion("PRP_RESULT <>", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultGreaterThan(String value) {
            addCriterion("PRP_RESULT >", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultGreaterThanOrEqualTo(String value) {
            addCriterion("PRP_RESULT >=", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultLessThan(String value) {
            addCriterion("PRP_RESULT <", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultLessThanOrEqualTo(String value) {
            addCriterion("PRP_RESULT <=", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultLike(String value) {
            addCriterion("PRP_RESULT like", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultNotLike(String value) {
            addCriterion("PRP_RESULT not like", value, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultIn(List<String> values) {
            addCriterion("PRP_RESULT in", values, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultNotIn(List<String> values) {
            addCriterion("PRP_RESULT not in", values, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultBetween(String value1, String value2) {
            addCriterion("PRP_RESULT between", value1, value2, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpResultNotBetween(String value1, String value2) {
            addCriterion("PRP_RESULT not between", value1, value2, "prpResult");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeIsNull() {
            addCriterion("PRP_COMMIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeIsNotNull() {
            addCriterion("PRP_COMMIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeEqualTo(Date value) {
            addCriterion("PRP_COMMIT_TIME =", value, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeNotEqualTo(Date value) {
            addCriterion("PRP_COMMIT_TIME <>", value, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeGreaterThan(Date value) {
            addCriterion("PRP_COMMIT_TIME >", value, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PRP_COMMIT_TIME >=", value, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeLessThan(Date value) {
            addCriterion("PRP_COMMIT_TIME <", value, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("PRP_COMMIT_TIME <=", value, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeIn(List<Date> values) {
            addCriterion("PRP_COMMIT_TIME in", values, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeNotIn(List<Date> values) {
            addCriterion("PRP_COMMIT_TIME not in", values, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeBetween(Date value1, Date value2) {
            addCriterion("PRP_COMMIT_TIME between", value1, value2, "prpCommitTime");
            return (Criteria) this;
        }

        public Criteria andPrpCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("PRP_COMMIT_TIME not between", value1, value2, "prpCommitTime");
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