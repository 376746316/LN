package com.chinasofti.cetp.attendance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andAeIdIsNull() {
            addCriterion("AE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAeIdIsNotNull() {
            addCriterion("AE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAeIdEqualTo(Integer value) {
            addCriterion("AE_ID =", value, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdNotEqualTo(Integer value) {
            addCriterion("AE_ID <>", value, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdGreaterThan(Integer value) {
            addCriterion("AE_ID >", value, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AE_ID >=", value, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdLessThan(Integer value) {
            addCriterion("AE_ID <", value, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdLessThanOrEqualTo(Integer value) {
            addCriterion("AE_ID <=", value, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdIn(List<Integer> values) {
            addCriterion("AE_ID in", values, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdNotIn(List<Integer> values) {
            addCriterion("AE_ID not in", values, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdBetween(Integer value1, Integer value2) {
            addCriterion("AE_ID between", value1, value2, "aeId");
            return (Criteria) this;
        }

        public Criteria andAeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AE_ID not between", value1, value2, "aeId");
            return (Criteria) this;
        }

        public Criteria andAePatIdIsNull() {
            addCriterion("AE_PAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAePatIdIsNotNull() {
            addCriterion("AE_PAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAePatIdEqualTo(Integer value) {
            addCriterion("AE_PAT_ID =", value, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdNotEqualTo(Integer value) {
            addCriterion("AE_PAT_ID <>", value, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdGreaterThan(Integer value) {
            addCriterion("AE_PAT_ID >", value, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AE_PAT_ID >=", value, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdLessThan(Integer value) {
            addCriterion("AE_PAT_ID <", value, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdLessThanOrEqualTo(Integer value) {
            addCriterion("AE_PAT_ID <=", value, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdIn(List<Integer> values) {
            addCriterion("AE_PAT_ID in", values, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdNotIn(List<Integer> values) {
            addCriterion("AE_PAT_ID not in", values, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdBetween(Integer value1, Integer value2) {
            addCriterion("AE_PAT_ID between", value1, value2, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAePatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AE_PAT_ID not between", value1, value2, "aePatId");
            return (Criteria) this;
        }

        public Criteria andAeDateIsNull() {
            addCriterion("AE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAeDateIsNotNull() {
            addCriterion("AE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAeDateEqualTo(Date value) {
            addCriterionForJDBCDate("AE_DATE =", value, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AE_DATE <>", value, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("AE_DATE >", value, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AE_DATE >=", value, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateLessThan(Date value) {
            addCriterionForJDBCDate("AE_DATE <", value, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AE_DATE <=", value, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateIn(List<Date> values) {
            addCriterionForJDBCDate("AE_DATE in", values, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AE_DATE not in", values, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AE_DATE between", value1, value2, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AE_DATE not between", value1, value2, "aeDate");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninIsNull() {
            addCriterion("AE_NEED_SIGNIN is null");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninIsNotNull() {
            addCriterion("AE_NEED_SIGNIN is not null");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninEqualTo(Date value) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN =", value, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninNotEqualTo(Date value) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN <>", value, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninGreaterThan(Date value) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN >", value, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN >=", value, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninLessThan(Date value) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN <", value, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN <=", value, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninIn(List<Date> values) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN in", values, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninNotIn(List<Date> values) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN not in", values, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN between", value1, value2, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeNeedSigninNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AE_NEED_SIGNIN not between", value1, value2, "aeNeedSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninIsNull() {
            addCriterion("AE_REAL_SIGNIN is null");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninIsNotNull() {
            addCriterion("AE_REAL_SIGNIN is not null");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninEqualTo(Date value) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN =", value, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninNotEqualTo(Date value) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN <>", value, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninGreaterThan(Date value) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN >", value, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN >=", value, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninLessThan(Date value) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN <", value, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN <=", value, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninIn(List<Date> values) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN in", values, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninNotIn(List<Date> values) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN not in", values, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN between", value1, value2, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeRealSigninNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AE_REAL_SIGNIN not between", value1, value2, "aeRealSignin");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeIsNull() {
            addCriterion("AE_DIFF_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeIsNotNull() {
            addCriterion("AE_DIFF_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeEqualTo(Integer value) {
            addCriterion("AE_DIFF_TIME =", value, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeNotEqualTo(Integer value) {
            addCriterion("AE_DIFF_TIME <>", value, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeGreaterThan(Integer value) {
            addCriterion("AE_DIFF_TIME >", value, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AE_DIFF_TIME >=", value, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeLessThan(Integer value) {
            addCriterion("AE_DIFF_TIME <", value, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeLessThanOrEqualTo(Integer value) {
            addCriterion("AE_DIFF_TIME <=", value, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeIn(List<Integer> values) {
            addCriterion("AE_DIFF_TIME in", values, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeNotIn(List<Integer> values) {
            addCriterion("AE_DIFF_TIME not in", values, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeBetween(Integer value1, Integer value2) {
            addCriterion("AE_DIFF_TIME between", value1, value2, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeDiffTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("AE_DIFF_TIME not between", value1, value2, "aeDiffTime");
            return (Criteria) this;
        }

        public Criteria andAeStatusIsNull() {
            addCriterion("AE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAeStatusIsNotNull() {
            addCriterion("AE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAeStatusEqualTo(String value) {
            addCriterion("AE_STATUS =", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusNotEqualTo(String value) {
            addCriterion("AE_STATUS <>", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusGreaterThan(String value) {
            addCriterion("AE_STATUS >", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AE_STATUS >=", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusLessThan(String value) {
            addCriterion("AE_STATUS <", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusLessThanOrEqualTo(String value) {
            addCriterion("AE_STATUS <=", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusLike(String value) {
            addCriterion("AE_STATUS like", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusNotLike(String value) {
            addCriterion("AE_STATUS not like", value, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusIn(List<String> values) {
            addCriterion("AE_STATUS in", values, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusNotIn(List<String> values) {
            addCriterion("AE_STATUS not in", values, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusBetween(String value1, String value2) {
            addCriterion("AE_STATUS between", value1, value2, "aeStatus");
            return (Criteria) this;
        }

        public Criteria andAeStatusNotBetween(String value1, String value2) {
            addCriterion("AE_STATUS not between", value1, value2, "aeStatus");
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