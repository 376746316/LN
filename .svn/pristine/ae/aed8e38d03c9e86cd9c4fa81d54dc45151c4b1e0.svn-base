package com.chinasofti.cetp.attendance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PracCalendarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PracCalendarExample() {
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

        public Criteria andPacIdIsNull() {
            addCriterion("PAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacIdIsNotNull() {
            addCriterion("PAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacIdEqualTo(Integer value) {
            addCriterion("PAC_ID =", value, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdNotEqualTo(Integer value) {
            addCriterion("PAC_ID <>", value, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdGreaterThan(Integer value) {
            addCriterion("PAC_ID >", value, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAC_ID >=", value, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdLessThan(Integer value) {
            addCriterion("PAC_ID <", value, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAC_ID <=", value, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdIn(List<Integer> values) {
            addCriterion("PAC_ID in", values, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdNotIn(List<Integer> values) {
            addCriterion("PAC_ID not in", values, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdBetween(Integer value1, Integer value2) {
            addCriterion("PAC_ID between", value1, value2, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAC_ID not between", value1, value2, "pacId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdIsNull() {
            addCriterion("PAC_PRAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacPracIdIsNotNull() {
            addCriterion("PAC_PRAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacPracIdEqualTo(Integer value) {
            addCriterion("PAC_PRAC_ID =", value, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdNotEqualTo(Integer value) {
            addCriterion("PAC_PRAC_ID <>", value, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdGreaterThan(Integer value) {
            addCriterion("PAC_PRAC_ID >", value, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAC_PRAC_ID >=", value, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdLessThan(Integer value) {
            addCriterion("PAC_PRAC_ID <", value, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAC_PRAC_ID <=", value, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdIn(List<Integer> values) {
            addCriterion("PAC_PRAC_ID in", values, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdNotIn(List<Integer> values) {
            addCriterion("PAC_PRAC_ID not in", values, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdBetween(Integer value1, Integer value2) {
            addCriterion("PAC_PRAC_ID between", value1, value2, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacPracIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAC_PRAC_ID not between", value1, value2, "pacPracId");
            return (Criteria) this;
        }

        public Criteria andPacDateIsNull() {
            addCriterion("PAC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPacDateIsNotNull() {
            addCriterion("PAC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPacDateEqualTo(Date value) {
            addCriterionForJDBCDate("PAC_DATE =", value, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PAC_DATE <>", value, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PAC_DATE >", value, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAC_DATE >=", value, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateLessThan(Date value) {
            addCriterionForJDBCDate("PAC_DATE <", value, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PAC_DATE <=", value, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateIn(List<Date> values) {
            addCriterionForJDBCDate("PAC_DATE in", values, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PAC_DATE not in", values, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAC_DATE between", value1, value2, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PAC_DATE not between", value1, value2, "pacDate");
            return (Criteria) this;
        }

        public Criteria andPacAsIdIsNull() {
            addCriterion("PAC_AS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPacAsIdIsNotNull() {
            addCriterion("PAC_AS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPacAsIdEqualTo(Integer value) {
            addCriterion("PAC_AS_ID =", value, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdNotEqualTo(Integer value) {
            addCriterion("PAC_AS_ID <>", value, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdGreaterThan(Integer value) {
            addCriterion("PAC_AS_ID >", value, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAC_AS_ID >=", value, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdLessThan(Integer value) {
            addCriterion("PAC_AS_ID <", value, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAC_AS_ID <=", value, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdIn(List<Integer> values) {
            addCriterion("PAC_AS_ID in", values, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdNotIn(List<Integer> values) {
            addCriterion("PAC_AS_ID not in", values, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdBetween(Integer value1, Integer value2) {
            addCriterion("PAC_AS_ID between", value1, value2, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacAsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAC_AS_ID not between", value1, value2, "pacAsId");
            return (Criteria) this;
        }

        public Criteria andPacUserNoIsNull() {
            addCriterion("PAC_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPacUserNoIsNotNull() {
            addCriterion("PAC_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPacUserNoEqualTo(Integer value) {
            addCriterion("PAC_USER_NO =", value, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoNotEqualTo(Integer value) {
            addCriterion("PAC_USER_NO <>", value, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoGreaterThan(Integer value) {
            addCriterion("PAC_USER_NO >", value, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAC_USER_NO >=", value, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoLessThan(Integer value) {
            addCriterion("PAC_USER_NO <", value, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("PAC_USER_NO <=", value, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoIn(List<Integer> values) {
            addCriterion("PAC_USER_NO in", values, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoNotIn(List<Integer> values) {
            addCriterion("PAC_USER_NO not in", values, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoBetween(Integer value1, Integer value2) {
            addCriterion("PAC_USER_NO between", value1, value2, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PAC_USER_NO not between", value1, value2, "pacUserNo");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeIsNull() {
            addCriterion("PAC_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeIsNotNull() {
            addCriterion("PAC_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeEqualTo(Date value) {
            addCriterion("PAC_REGTIME =", value, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeNotEqualTo(Date value) {
            addCriterion("PAC_REGTIME <>", value, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeGreaterThan(Date value) {
            addCriterion("PAC_REGTIME >", value, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAC_REGTIME >=", value, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeLessThan(Date value) {
            addCriterion("PAC_REGTIME <", value, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("PAC_REGTIME <=", value, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeIn(List<Date> values) {
            addCriterion("PAC_REGTIME in", values, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeNotIn(List<Date> values) {
            addCriterion("PAC_REGTIME not in", values, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeBetween(Date value1, Date value2) {
            addCriterion("PAC_REGTIME between", value1, value2, "pacRegtime");
            return (Criteria) this;
        }

        public Criteria andPacRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("PAC_REGTIME not between", value1, value2, "pacRegtime");
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