package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreRecordExample() {
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

        public Criteria andSrecIdIsNull() {
            addCriterion("SREC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrecIdIsNotNull() {
            addCriterion("SREC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrecIdEqualTo(Long value) {
            addCriterion("SREC_ID =", value, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdNotEqualTo(Long value) {
            addCriterion("SREC_ID <>", value, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdGreaterThan(Long value) {
            addCriterion("SREC_ID >", value, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SREC_ID >=", value, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdLessThan(Long value) {
            addCriterion("SREC_ID <", value, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdLessThanOrEqualTo(Long value) {
            addCriterion("SREC_ID <=", value, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdIn(List<Long> values) {
            addCriterion("SREC_ID in", values, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdNotIn(List<Long> values) {
            addCriterion("SREC_ID not in", values, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdBetween(Long value1, Long value2) {
            addCriterion("SREC_ID between", value1, value2, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecIdNotBetween(Long value1, Long value2) {
            addCriterion("SREC_ID not between", value1, value2, "srecId");
            return (Criteria) this;
        }

        public Criteria andSrecRuleIsNull() {
            addCriterion("SREC_RULE is null");
            return (Criteria) this;
        }

        public Criteria andSrecRuleIsNotNull() {
            addCriterion("SREC_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andSrecRuleEqualTo(Integer value) {
            addCriterion("SREC_RULE =", value, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleNotEqualTo(Integer value) {
            addCriterion("SREC_RULE <>", value, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleGreaterThan(Integer value) {
            addCriterion("SREC_RULE >", value, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("SREC_RULE >=", value, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleLessThan(Integer value) {
            addCriterion("SREC_RULE <", value, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleLessThanOrEqualTo(Integer value) {
            addCriterion("SREC_RULE <=", value, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleIn(List<Integer> values) {
            addCriterion("SREC_RULE in", values, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleNotIn(List<Integer> values) {
            addCriterion("SREC_RULE not in", values, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleBetween(Integer value1, Integer value2) {
            addCriterion("SREC_RULE between", value1, value2, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("SREC_RULE not between", value1, value2, "srecRule");
            return (Criteria) this;
        }

        public Criteria andSrecScoreIsNull() {
            addCriterion("SREC_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andSrecScoreIsNotNull() {
            addCriterion("SREC_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andSrecScoreEqualTo(Integer value) {
            addCriterion("SREC_SCORE =", value, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreNotEqualTo(Integer value) {
            addCriterion("SREC_SCORE <>", value, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreGreaterThan(Integer value) {
            addCriterion("SREC_SCORE >", value, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("SREC_SCORE >=", value, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreLessThan(Integer value) {
            addCriterion("SREC_SCORE <", value, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreLessThanOrEqualTo(Integer value) {
            addCriterion("SREC_SCORE <=", value, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreIn(List<Integer> values) {
            addCriterion("SREC_SCORE in", values, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreNotIn(List<Integer> values) {
            addCriterion("SREC_SCORE not in", values, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreBetween(Integer value1, Integer value2) {
            addCriterion("SREC_SCORE between", value1, value2, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("SREC_SCORE not between", value1, value2, "srecScore");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoIsNull() {
            addCriterion("SREC_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoIsNotNull() {
            addCriterion("SREC_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoEqualTo(Integer value) {
            addCriterion("SREC_STU_NO =", value, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoNotEqualTo(Integer value) {
            addCriterion("SREC_STU_NO <>", value, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoGreaterThan(Integer value) {
            addCriterion("SREC_STU_NO >", value, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SREC_STU_NO >=", value, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoLessThan(Integer value) {
            addCriterion("SREC_STU_NO <", value, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("SREC_STU_NO <=", value, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoIn(List<Integer> values) {
            addCriterion("SREC_STU_NO in", values, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoNotIn(List<Integer> values) {
            addCriterion("SREC_STU_NO not in", values, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoBetween(Integer value1, Integer value2) {
            addCriterion("SREC_STU_NO between", value1, value2, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SREC_STU_NO not between", value1, value2, "srecStuNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoIsNull() {
            addCriterion("SREC_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoIsNotNull() {
            addCriterion("SREC_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoEqualTo(Integer value) {
            addCriterion("SREC_USER_NO =", value, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoNotEqualTo(Integer value) {
            addCriterion("SREC_USER_NO <>", value, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoGreaterThan(Integer value) {
            addCriterion("SREC_USER_NO >", value, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SREC_USER_NO >=", value, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoLessThan(Integer value) {
            addCriterion("SREC_USER_NO <", value, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("SREC_USER_NO <=", value, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoIn(List<Integer> values) {
            addCriterion("SREC_USER_NO in", values, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoNotIn(List<Integer> values) {
            addCriterion("SREC_USER_NO not in", values, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoBetween(Integer value1, Integer value2) {
            addCriterion("SREC_USER_NO between", value1, value2, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SREC_USER_NO not between", value1, value2, "srecUserNo");
            return (Criteria) this;
        }

        public Criteria andSrecReasonIsNull() {
            addCriterion("SREC_REASON is null");
            return (Criteria) this;
        }

        public Criteria andSrecReasonIsNotNull() {
            addCriterion("SREC_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andSrecReasonEqualTo(String value) {
            addCriterion("SREC_REASON =", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonNotEqualTo(String value) {
            addCriterion("SREC_REASON <>", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonGreaterThan(String value) {
            addCriterion("SREC_REASON >", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonGreaterThanOrEqualTo(String value) {
            addCriterion("SREC_REASON >=", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonLessThan(String value) {
            addCriterion("SREC_REASON <", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonLessThanOrEqualTo(String value) {
            addCriterion("SREC_REASON <=", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonLike(String value) {
            addCriterion("SREC_REASON like", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonNotLike(String value) {
            addCriterion("SREC_REASON not like", value, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonIn(List<String> values) {
            addCriterion("SREC_REASON in", values, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonNotIn(List<String> values) {
            addCriterion("SREC_REASON not in", values, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonBetween(String value1, String value2) {
            addCriterion("SREC_REASON between", value1, value2, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecReasonNotBetween(String value1, String value2) {
            addCriterion("SREC_REASON not between", value1, value2, "srecReason");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeIsNull() {
            addCriterion("SREC_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeIsNotNull() {
            addCriterion("SREC_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeEqualTo(Date value) {
            addCriterion("SREC_REGTIME =", value, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeNotEqualTo(Date value) {
            addCriterion("SREC_REGTIME <>", value, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeGreaterThan(Date value) {
            addCriterion("SREC_REGTIME >", value, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SREC_REGTIME >=", value, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeLessThan(Date value) {
            addCriterion("SREC_REGTIME <", value, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("SREC_REGTIME <=", value, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeIn(List<Date> values) {
            addCriterion("SREC_REGTIME in", values, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeNotIn(List<Date> values) {
            addCriterion("SREC_REGTIME not in", values, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeBetween(Date value1, Date value2) {
            addCriterion("SREC_REGTIME between", value1, value2, "srecRegtime");
            return (Criteria) this;
        }

        public Criteria andSrecRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("SREC_REGTIME not between", value1, value2, "srecRegtime");
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