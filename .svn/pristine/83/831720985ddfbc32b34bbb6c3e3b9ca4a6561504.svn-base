package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RedeemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RedeemExample() {
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

        public Criteria andReIdIsNull() {
            addCriterion("RE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReIdIsNotNull() {
            addCriterion("RE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReIdEqualTo(Integer value) {
            addCriterion("RE_ID =", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotEqualTo(Integer value) {
            addCriterion("RE_ID <>", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThan(Integer value) {
            addCriterion("RE_ID >", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RE_ID >=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThan(Integer value) {
            addCriterion("RE_ID <", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThanOrEqualTo(Integer value) {
            addCriterion("RE_ID <=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdIn(List<Integer> values) {
            addCriterion("RE_ID in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotIn(List<Integer> values) {
            addCriterion("RE_ID not in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdBetween(Integer value1, Integer value2) {
            addCriterion("RE_ID between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RE_ID not between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReValidityIsNull() {
            addCriterion("RE_VALIDITY is null");
            return (Criteria) this;
        }

        public Criteria andReValidityIsNotNull() {
            addCriterion("RE_VALIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andReValidityEqualTo(Date value) {
            addCriterionForJDBCDate("RE_VALIDITY =", value, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityNotEqualTo(Date value) {
            addCriterionForJDBCDate("RE_VALIDITY <>", value, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityGreaterThan(Date value) {
            addCriterionForJDBCDate("RE_VALIDITY >", value, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RE_VALIDITY >=", value, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityLessThan(Date value) {
            addCriterionForJDBCDate("RE_VALIDITY <", value, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RE_VALIDITY <=", value, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityIn(List<Date> values) {
            addCriterionForJDBCDate("RE_VALIDITY in", values, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityNotIn(List<Date> values) {
            addCriterionForJDBCDate("RE_VALIDITY not in", values, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RE_VALIDITY between", value1, value2, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReValidityNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RE_VALIDITY not between", value1, value2, "reValidity");
            return (Criteria) this;
        }

        public Criteria andReUserIdIsNull() {
            addCriterion("RE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andReUserIdIsNotNull() {
            addCriterion("RE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReUserIdEqualTo(Integer value) {
            addCriterion("RE_USER_ID =", value, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdNotEqualTo(Integer value) {
            addCriterion("RE_USER_ID <>", value, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdGreaterThan(Integer value) {
            addCriterion("RE_USER_ID >", value, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RE_USER_ID >=", value, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdLessThan(Integer value) {
            addCriterion("RE_USER_ID <", value, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("RE_USER_ID <=", value, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdIn(List<Integer> values) {
            addCriterion("RE_USER_ID in", values, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdNotIn(List<Integer> values) {
            addCriterion("RE_USER_ID not in", values, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdBetween(Integer value1, Integer value2) {
            addCriterion("RE_USER_ID between", value1, value2, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RE_USER_ID not between", value1, value2, "reUserId");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeIsNull() {
            addCriterion("RE_PROVIDETIME is null");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeIsNotNull() {
            addCriterion("RE_PROVIDETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeEqualTo(Date value) {
            addCriterionForJDBCDate("RE_PROVIDETIME =", value, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RE_PROVIDETIME <>", value, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RE_PROVIDETIME >", value, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RE_PROVIDETIME >=", value, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeLessThan(Date value) {
            addCriterionForJDBCDate("RE_PROVIDETIME <", value, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RE_PROVIDETIME <=", value, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeIn(List<Date> values) {
            addCriterionForJDBCDate("RE_PROVIDETIME in", values, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RE_PROVIDETIME not in", values, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RE_PROVIDETIME between", value1, value2, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReProvidetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RE_PROVIDETIME not between", value1, value2, "reProvidetime");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeIsNull() {
            addCriterion("RE_REDEEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeIsNotNull() {
            addCriterion("RE_REDEEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeEqualTo(String value) {
            addCriterion("RE_REDEEMCODE =", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeNotEqualTo(String value) {
            addCriterion("RE_REDEEMCODE <>", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeGreaterThan(String value) {
            addCriterion("RE_REDEEMCODE >", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RE_REDEEMCODE >=", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeLessThan(String value) {
            addCriterion("RE_REDEEMCODE <", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeLessThanOrEqualTo(String value) {
            addCriterion("RE_REDEEMCODE <=", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeLike(String value) {
            addCriterion("RE_REDEEMCODE like", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeNotLike(String value) {
            addCriterion("RE_REDEEMCODE not like", value, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeIn(List<String> values) {
            addCriterion("RE_REDEEMCODE in", values, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeNotIn(List<String> values) {
            addCriterion("RE_REDEEMCODE not in", values, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeBetween(String value1, String value2) {
            addCriterion("RE_REDEEMCODE between", value1, value2, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReRedeemcodeNotBetween(String value1, String value2) {
            addCriterion("RE_REDEEMCODE not between", value1, value2, "reRedeemcode");
            return (Criteria) this;
        }

        public Criteria andReStatusIsNull() {
            addCriterion("RE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReStatusIsNotNull() {
            addCriterion("RE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReStatusEqualTo(Integer value) {
            addCriterion("RE_STATUS =", value, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusNotEqualTo(Integer value) {
            addCriterion("RE_STATUS <>", value, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusGreaterThan(Integer value) {
            addCriterion("RE_STATUS >", value, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RE_STATUS >=", value, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusLessThan(Integer value) {
            addCriterion("RE_STATUS <", value, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RE_STATUS <=", value, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusIn(List<Integer> values) {
            addCriterion("RE_STATUS in", values, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusNotIn(List<Integer> values) {
            addCriterion("RE_STATUS not in", values, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusBetween(Integer value1, Integer value2) {
            addCriterion("RE_STATUS between", value1, value2, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RE_STATUS not between", value1, value2, "reStatus");
            return (Criteria) this;
        }

        public Criteria andReCoinamountIsNull() {
            addCriterion("RE_COINAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReCoinamountIsNotNull() {
            addCriterion("RE_COINAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReCoinamountEqualTo(Integer value) {
            addCriterion("RE_COINAMOUNT =", value, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountNotEqualTo(Integer value) {
            addCriterion("RE_COINAMOUNT <>", value, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountGreaterThan(Integer value) {
            addCriterion("RE_COINAMOUNT >", value, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RE_COINAMOUNT >=", value, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountLessThan(Integer value) {
            addCriterion("RE_COINAMOUNT <", value, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountLessThanOrEqualTo(Integer value) {
            addCriterion("RE_COINAMOUNT <=", value, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountIn(List<Integer> values) {
            addCriterion("RE_COINAMOUNT in", values, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountNotIn(List<Integer> values) {
            addCriterion("RE_COINAMOUNT not in", values, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountBetween(Integer value1, Integer value2) {
            addCriterion("RE_COINAMOUNT between", value1, value2, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCoinamountNotBetween(Integer value1, Integer value2) {
            addCriterion("RE_COINAMOUNT not between", value1, value2, "reCoinamount");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeIsNull() {
            addCriterion("RE_CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeIsNotNull() {
            addCriterion("RE_CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("RE_CREATETIME =", value, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RE_CREATETIME <>", value, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RE_CREATETIME >", value, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RE_CREATETIME >=", value, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("RE_CREATETIME <", value, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RE_CREATETIME <=", value, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("RE_CREATETIME in", values, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RE_CREATETIME not in", values, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RE_CREATETIME between", value1, value2, "reCreatetime");
            return (Criteria) this;
        }

        public Criteria andReCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RE_CREATETIME not between", value1, value2, "reCreatetime");
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