package com.chinasofti.cetp.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AwardStuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardStuExample() {
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

        public Criteria andAwsIdIsNull() {
            addCriterion("AWS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAwsIdIsNotNull() {
            addCriterion("AWS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAwsIdEqualTo(Integer value) {
            addCriterion("AWS_ID =", value, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdNotEqualTo(Integer value) {
            addCriterion("AWS_ID <>", value, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdGreaterThan(Integer value) {
            addCriterion("AWS_ID >", value, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWS_ID >=", value, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdLessThan(Integer value) {
            addCriterion("AWS_ID <", value, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdLessThanOrEqualTo(Integer value) {
            addCriterion("AWS_ID <=", value, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdIn(List<Integer> values) {
            addCriterion("AWS_ID in", values, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdNotIn(List<Integer> values) {
            addCriterion("AWS_ID not in", values, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdBetween(Integer value1, Integer value2) {
            addCriterion("AWS_ID between", value1, value2, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AWS_ID not between", value1, value2, "awsId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdIsNull() {
            addCriterion("AWS_AWARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdIsNotNull() {
            addCriterion("AWS_AWARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdEqualTo(Integer value) {
            addCriterion("AWS_AWARD_ID =", value, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdNotEqualTo(Integer value) {
            addCriterion("AWS_AWARD_ID <>", value, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdGreaterThan(Integer value) {
            addCriterion("AWS_AWARD_ID >", value, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWS_AWARD_ID >=", value, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdLessThan(Integer value) {
            addCriterion("AWS_AWARD_ID <", value, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdLessThanOrEqualTo(Integer value) {
            addCriterion("AWS_AWARD_ID <=", value, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdIn(List<Integer> values) {
            addCriterion("AWS_AWARD_ID in", values, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdNotIn(List<Integer> values) {
            addCriterion("AWS_AWARD_ID not in", values, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdBetween(Integer value1, Integer value2) {
            addCriterion("AWS_AWARD_ID between", value1, value2, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsAwardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AWS_AWARD_ID not between", value1, value2, "awsAwardId");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoIsNull() {
            addCriterion("AWS_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoIsNotNull() {
            addCriterion("AWS_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoEqualTo(Integer value) {
            addCriterion("AWS_STU_NO =", value, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoNotEqualTo(Integer value) {
            addCriterion("AWS_STU_NO <>", value, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoGreaterThan(Integer value) {
            addCriterion("AWS_STU_NO >", value, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWS_STU_NO >=", value, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoLessThan(Integer value) {
            addCriterion("AWS_STU_NO <", value, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("AWS_STU_NO <=", value, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoIn(List<Integer> values) {
            addCriterion("AWS_STU_NO in", values, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoNotIn(List<Integer> values) {
            addCriterion("AWS_STU_NO not in", values, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoBetween(Integer value1, Integer value2) {
            addCriterion("AWS_STU_NO between", value1, value2, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("AWS_STU_NO not between", value1, value2, "awsStuNo");
            return (Criteria) this;
        }

        public Criteria andAwsCountIsNull() {
            addCriterion("AWS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAwsCountIsNotNull() {
            addCriterion("AWS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAwsCountEqualTo(Integer value) {
            addCriterion("AWS_COUNT =", value, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountNotEqualTo(Integer value) {
            addCriterion("AWS_COUNT <>", value, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountGreaterThan(Integer value) {
            addCriterion("AWS_COUNT >", value, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("AWS_COUNT >=", value, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountLessThan(Integer value) {
            addCriterion("AWS_COUNT <", value, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountLessThanOrEqualTo(Integer value) {
            addCriterion("AWS_COUNT <=", value, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountIn(List<Integer> values) {
            addCriterion("AWS_COUNT in", values, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountNotIn(List<Integer> values) {
            addCriterion("AWS_COUNT not in", values, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountBetween(Integer value1, Integer value2) {
            addCriterion("AWS_COUNT between", value1, value2, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("AWS_COUNT not between", value1, value2, "awsCount");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeIsNull() {
            addCriterion("AWS_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeIsNotNull() {
            addCriterion("AWS_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeEqualTo(Date value) {
            addCriterion("AWS_SEND_TIME =", value, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeNotEqualTo(Date value) {
            addCriterion("AWS_SEND_TIME <>", value, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeGreaterThan(Date value) {
            addCriterion("AWS_SEND_TIME >", value, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AWS_SEND_TIME >=", value, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeLessThan(Date value) {
            addCriterion("AWS_SEND_TIME <", value, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("AWS_SEND_TIME <=", value, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeIn(List<Date> values) {
            addCriterion("AWS_SEND_TIME in", values, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeNotIn(List<Date> values) {
            addCriterion("AWS_SEND_TIME not in", values, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeBetween(Date value1, Date value2) {
            addCriterion("AWS_SEND_TIME between", value1, value2, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("AWS_SEND_TIME not between", value1, value2, "awsSendTime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeIsNull() {
            addCriterion("AWS_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeIsNotNull() {
            addCriterion("AWS_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeEqualTo(Date value) {
            addCriterion("AWS_REGTIME =", value, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeNotEqualTo(Date value) {
            addCriterion("AWS_REGTIME <>", value, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeGreaterThan(Date value) {
            addCriterion("AWS_REGTIME >", value, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AWS_REGTIME >=", value, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeLessThan(Date value) {
            addCriterion("AWS_REGTIME <", value, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("AWS_REGTIME <=", value, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeIn(List<Date> values) {
            addCriterion("AWS_REGTIME in", values, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeNotIn(List<Date> values) {
            addCriterion("AWS_REGTIME not in", values, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeBetween(Date value1, Date value2) {
            addCriterion("AWS_REGTIME between", value1, value2, "awsRegtime");
            return (Criteria) this;
        }

        public Criteria andAwsRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("AWS_REGTIME not between", value1, value2, "awsRegtime");
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