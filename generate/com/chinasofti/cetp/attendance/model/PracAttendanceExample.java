package com.chinasofti.cetp.attendance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PracAttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PracAttendanceExample() {
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

        public Criteria andPatIdIsNull() {
            addCriterion("PAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatIdIsNotNull() {
            addCriterion("PAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatIdEqualTo(Integer value) {
            addCriterion("PAT_ID =", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotEqualTo(Integer value) {
            addCriterion("PAT_ID <>", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThan(Integer value) {
            addCriterion("PAT_ID >", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAT_ID >=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThan(Integer value) {
            addCriterion("PAT_ID <", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAT_ID <=", value, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdIn(List<Integer> values) {
            addCriterion("PAT_ID in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotIn(List<Integer> values) {
            addCriterion("PAT_ID not in", values, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdBetween(Integer value1, Integer value2) {
            addCriterion("PAT_ID between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAT_ID not between", value1, value2, "patId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdIsNull() {
            addCriterion("PAT_PRAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatPracIdIsNotNull() {
            addCriterion("PAT_PRAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatPracIdEqualTo(Integer value) {
            addCriterion("PAT_PRAC_ID =", value, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdNotEqualTo(Integer value) {
            addCriterion("PAT_PRAC_ID <>", value, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdGreaterThan(Integer value) {
            addCriterion("PAT_PRAC_ID >", value, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAT_PRAC_ID >=", value, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdLessThan(Integer value) {
            addCriterion("PAT_PRAC_ID <", value, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAT_PRAC_ID <=", value, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdIn(List<Integer> values) {
            addCriterion("PAT_PRAC_ID in", values, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdNotIn(List<Integer> values) {
            addCriterion("PAT_PRAC_ID not in", values, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdBetween(Integer value1, Integer value2) {
            addCriterion("PAT_PRAC_ID between", value1, value2, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatPracIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAT_PRAC_ID not between", value1, value2, "patPracId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdIsNull() {
            addCriterion("PAT_STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatStuIdIsNotNull() {
            addCriterion("PAT_STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatStuIdEqualTo(Integer value) {
            addCriterion("PAT_STU_ID =", value, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdNotEqualTo(Integer value) {
            addCriterion("PAT_STU_ID <>", value, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdGreaterThan(Integer value) {
            addCriterion("PAT_STU_ID >", value, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAT_STU_ID >=", value, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdLessThan(Integer value) {
            addCriterion("PAT_STU_ID <", value, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAT_STU_ID <=", value, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdIn(List<Integer> values) {
            addCriterion("PAT_STU_ID in", values, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdNotIn(List<Integer> values) {
            addCriterion("PAT_STU_ID not in", values, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdBetween(Integer value1, Integer value2) {
            addCriterion("PAT_STU_ID between", value1, value2, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAT_STU_ID not between", value1, value2, "patStuId");
            return (Criteria) this;
        }

        public Criteria andPatCodeIsNull() {
            addCriterion("PAT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPatCodeIsNotNull() {
            addCriterion("PAT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPatCodeEqualTo(String value) {
            addCriterion("PAT_CODE =", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeNotEqualTo(String value) {
            addCriterion("PAT_CODE <>", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeGreaterThan(String value) {
            addCriterion("PAT_CODE >", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAT_CODE >=", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeLessThan(String value) {
            addCriterion("PAT_CODE <", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeLessThanOrEqualTo(String value) {
            addCriterion("PAT_CODE <=", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeLike(String value) {
            addCriterion("PAT_CODE like", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeNotLike(String value) {
            addCriterion("PAT_CODE not like", value, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeIn(List<String> values) {
            addCriterion("PAT_CODE in", values, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeNotIn(List<String> values) {
            addCriterion("PAT_CODE not in", values, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeBetween(String value1, String value2) {
            addCriterion("PAT_CODE between", value1, value2, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatCodeNotBetween(String value1, String value2) {
            addCriterion("PAT_CODE not between", value1, value2, "patCode");
            return (Criteria) this;
        }

        public Criteria andPatClassIdIsNull() {
            addCriterion("PAT_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatClassIdIsNotNull() {
            addCriterion("PAT_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatClassIdEqualTo(Integer value) {
            addCriterion("PAT_CLASS_ID =", value, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdNotEqualTo(Integer value) {
            addCriterion("PAT_CLASS_ID <>", value, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdGreaterThan(Integer value) {
            addCriterion("PAT_CLASS_ID >", value, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAT_CLASS_ID >=", value, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdLessThan(Integer value) {
            addCriterion("PAT_CLASS_ID <", value, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAT_CLASS_ID <=", value, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdIn(List<Integer> values) {
            addCriterion("PAT_CLASS_ID in", values, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdNotIn(List<Integer> values) {
            addCriterion("PAT_CLASS_ID not in", values, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdBetween(Integer value1, Integer value2) {
            addCriterion("PAT_CLASS_ID between", value1, value2, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAT_CLASS_ID not between", value1, value2, "patClassId");
            return (Criteria) this;
        }

        public Criteria andPatUserNoIsNull() {
            addCriterion("PAT_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPatUserNoIsNotNull() {
            addCriterion("PAT_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPatUserNoEqualTo(Integer value) {
            addCriterion("PAT_USER_NO =", value, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoNotEqualTo(Integer value) {
            addCriterion("PAT_USER_NO <>", value, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoGreaterThan(Integer value) {
            addCriterion("PAT_USER_NO >", value, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAT_USER_NO >=", value, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoLessThan(Integer value) {
            addCriterion("PAT_USER_NO <", value, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("PAT_USER_NO <=", value, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoIn(List<Integer> values) {
            addCriterion("PAT_USER_NO in", values, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoNotIn(List<Integer> values) {
            addCriterion("PAT_USER_NO not in", values, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoBetween(Integer value1, Integer value2) {
            addCriterion("PAT_USER_NO between", value1, value2, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PAT_USER_NO not between", value1, value2, "patUserNo");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeIsNull() {
            addCriterion("PAT_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeIsNotNull() {
            addCriterion("PAT_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeEqualTo(Date value) {
            addCriterion("PAT_REGTIME =", value, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeNotEqualTo(Date value) {
            addCriterion("PAT_REGTIME <>", value, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeGreaterThan(Date value) {
            addCriterion("PAT_REGTIME >", value, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PAT_REGTIME >=", value, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeLessThan(Date value) {
            addCriterion("PAT_REGTIME <", value, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("PAT_REGTIME <=", value, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeIn(List<Date> values) {
            addCriterion("PAT_REGTIME in", values, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeNotIn(List<Date> values) {
            addCriterion("PAT_REGTIME not in", values, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeBetween(Date value1, Date value2) {
            addCriterion("PAT_REGTIME between", value1, value2, "patRegtime");
            return (Criteria) this;
        }

        public Criteria andPatRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("PAT_REGTIME not between", value1, value2, "patRegtime");
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