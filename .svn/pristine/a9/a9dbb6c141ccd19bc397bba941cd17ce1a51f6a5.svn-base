package com.chinasofti.cetp.attendance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VacationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VacationExample() {
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

        public Criteria andVnIdIsNull() {
            addCriterion("VN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVnIdIsNotNull() {
            addCriterion("VN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVnIdEqualTo(Integer value) {
            addCriterion("VN_ID =", value, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdNotEqualTo(Integer value) {
            addCriterion("VN_ID <>", value, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdGreaterThan(Integer value) {
            addCriterion("VN_ID >", value, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VN_ID >=", value, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdLessThan(Integer value) {
            addCriterion("VN_ID <", value, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdLessThanOrEqualTo(Integer value) {
            addCriterion("VN_ID <=", value, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdIn(List<Integer> values) {
            addCriterion("VN_ID in", values, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdNotIn(List<Integer> values) {
            addCriterion("VN_ID not in", values, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdBetween(Integer value1, Integer value2) {
            addCriterion("VN_ID between", value1, value2, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VN_ID not between", value1, value2, "vnId");
            return (Criteria) this;
        }

        public Criteria andVnStateIsNull() {
            addCriterion("VN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andVnStateIsNotNull() {
            addCriterion("VN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andVnStateEqualTo(String value) {
            addCriterion("VN_STATE =", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateNotEqualTo(String value) {
            addCriterion("VN_STATE <>", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateGreaterThan(String value) {
            addCriterion("VN_STATE >", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateGreaterThanOrEqualTo(String value) {
            addCriterion("VN_STATE >=", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateLessThan(String value) {
            addCriterion("VN_STATE <", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateLessThanOrEqualTo(String value) {
            addCriterion("VN_STATE <=", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateLike(String value) {
            addCriterion("VN_STATE like", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateNotLike(String value) {
            addCriterion("VN_STATE not like", value, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateIn(List<String> values) {
            addCriterion("VN_STATE in", values, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateNotIn(List<String> values) {
            addCriterion("VN_STATE not in", values, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateBetween(String value1, String value2) {
            addCriterion("VN_STATE between", value1, value2, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnStateNotBetween(String value1, String value2) {
            addCriterion("VN_STATE not between", value1, value2, "vnState");
            return (Criteria) this;
        }

        public Criteria andVnTypeIsNull() {
            addCriterion("VN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVnTypeIsNotNull() {
            addCriterion("VN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVnTypeEqualTo(String value) {
            addCriterion("VN_TYPE =", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeNotEqualTo(String value) {
            addCriterion("VN_TYPE <>", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeGreaterThan(String value) {
            addCriterion("VN_TYPE >", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VN_TYPE >=", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeLessThan(String value) {
            addCriterion("VN_TYPE <", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeLessThanOrEqualTo(String value) {
            addCriterion("VN_TYPE <=", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeLike(String value) {
            addCriterion("VN_TYPE like", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeNotLike(String value) {
            addCriterion("VN_TYPE not like", value, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeIn(List<String> values) {
            addCriterion("VN_TYPE in", values, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeNotIn(List<String> values) {
            addCriterion("VN_TYPE not in", values, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeBetween(String value1, String value2) {
            addCriterion("VN_TYPE between", value1, value2, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnTypeNotBetween(String value1, String value2) {
            addCriterion("VN_TYPE not between", value1, value2, "vnType");
            return (Criteria) this;
        }

        public Criteria andVnPracIdIsNull() {
            addCriterion("VN_PRAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andVnPracIdIsNotNull() {
            addCriterion("VN_PRAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVnPracIdEqualTo(Integer value) {
            addCriterion("VN_PRAC_ID =", value, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdNotEqualTo(Integer value) {
            addCriterion("VN_PRAC_ID <>", value, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdGreaterThan(Integer value) {
            addCriterion("VN_PRAC_ID >", value, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VN_PRAC_ID >=", value, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdLessThan(Integer value) {
            addCriterion("VN_PRAC_ID <", value, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdLessThanOrEqualTo(Integer value) {
            addCriterion("VN_PRAC_ID <=", value, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdIn(List<Integer> values) {
            addCriterion("VN_PRAC_ID in", values, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdNotIn(List<Integer> values) {
            addCriterion("VN_PRAC_ID not in", values, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdBetween(Integer value1, Integer value2) {
            addCriterion("VN_PRAC_ID between", value1, value2, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnPracIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VN_PRAC_ID not between", value1, value2, "vnPracId");
            return (Criteria) this;
        }

        public Criteria andVnStartDateIsNull() {
            addCriterion("VN_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVnStartDateIsNotNull() {
            addCriterion("VN_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVnStartDateEqualTo(Date value) {
            addCriterion("VN_START_DATE =", value, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateNotEqualTo(Date value) {
            addCriterion("VN_START_DATE <>", value, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateGreaterThan(Date value) {
            addCriterion("VN_START_DATE >", value, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VN_START_DATE >=", value, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateLessThan(Date value) {
            addCriterion("VN_START_DATE <", value, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateLessThanOrEqualTo(Date value) {
            addCriterion("VN_START_DATE <=", value, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateIn(List<Date> values) {
            addCriterion("VN_START_DATE in", values, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateNotIn(List<Date> values) {
            addCriterion("VN_START_DATE not in", values, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateBetween(Date value1, Date value2) {
            addCriterion("VN_START_DATE between", value1, value2, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnStartDateNotBetween(Date value1, Date value2) {
            addCriterion("VN_START_DATE not between", value1, value2, "vnStartDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateIsNull() {
            addCriterion("VN_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVnEndDateIsNotNull() {
            addCriterion("VN_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVnEndDateEqualTo(Date value) {
            addCriterion("VN_END_DATE =", value, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateNotEqualTo(Date value) {
            addCriterion("VN_END_DATE <>", value, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateGreaterThan(Date value) {
            addCriterion("VN_END_DATE >", value, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VN_END_DATE >=", value, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateLessThan(Date value) {
            addCriterion("VN_END_DATE <", value, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateLessThanOrEqualTo(Date value) {
            addCriterion("VN_END_DATE <=", value, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateIn(List<Date> values) {
            addCriterion("VN_END_DATE in", values, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateNotIn(List<Date> values) {
            addCriterion("VN_END_DATE not in", values, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateBetween(Date value1, Date value2) {
            addCriterion("VN_END_DATE between", value1, value2, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnEndDateNotBetween(Date value1, Date value2) {
            addCriterion("VN_END_DATE not between", value1, value2, "vnEndDate");
            return (Criteria) this;
        }

        public Criteria andVnStuNoIsNull() {
            addCriterion("VN_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andVnStuNoIsNotNull() {
            addCriterion("VN_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVnStuNoEqualTo(Integer value) {
            addCriterion("VN_STU_NO =", value, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoNotEqualTo(Integer value) {
            addCriterion("VN_STU_NO <>", value, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoGreaterThan(Integer value) {
            addCriterion("VN_STU_NO >", value, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("VN_STU_NO >=", value, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoLessThan(Integer value) {
            addCriterion("VN_STU_NO <", value, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("VN_STU_NO <=", value, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoIn(List<Integer> values) {
            addCriterion("VN_STU_NO in", values, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoNotIn(List<Integer> values) {
            addCriterion("VN_STU_NO not in", values, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoBetween(Integer value1, Integer value2) {
            addCriterion("VN_STU_NO between", value1, value2, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("VN_STU_NO not between", value1, value2, "vnStuNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoIsNull() {
            addCriterion("VN_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andVnUserNoIsNotNull() {
            addCriterion("VN_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVnUserNoEqualTo(Integer value) {
            addCriterion("VN_USER_NO =", value, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoNotEqualTo(Integer value) {
            addCriterion("VN_USER_NO <>", value, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoGreaterThan(Integer value) {
            addCriterion("VN_USER_NO >", value, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("VN_USER_NO >=", value, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoLessThan(Integer value) {
            addCriterion("VN_USER_NO <", value, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("VN_USER_NO <=", value, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoIn(List<Integer> values) {
            addCriterion("VN_USER_NO in", values, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoNotIn(List<Integer> values) {
            addCriterion("VN_USER_NO not in", values, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoBetween(Integer value1, Integer value2) {
            addCriterion("VN_USER_NO between", value1, value2, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("VN_USER_NO not between", value1, value2, "vnUserNo");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeIsNull() {
            addCriterion("VN_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeIsNotNull() {
            addCriterion("VN_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeEqualTo(Date value) {
            addCriterionForJDBCDate("VN_REGTIME =", value, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("VN_REGTIME <>", value, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("VN_REGTIME >", value, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VN_REGTIME >=", value, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeLessThan(Date value) {
            addCriterionForJDBCDate("VN_REGTIME <", value, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VN_REGTIME <=", value, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeIn(List<Date> values) {
            addCriterionForJDBCDate("VN_REGTIME in", values, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("VN_REGTIME not in", values, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VN_REGTIME between", value1, value2, "vnRegtime");
            return (Criteria) this;
        }

        public Criteria andVnRegtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VN_REGTIME not between", value1, value2, "vnRegtime");
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