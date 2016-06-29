package com.chinasofti.cetp.gensee.model;

import java.util.ArrayList;
import java.util.List;

public class GenseeTranscodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenseeTranscodeExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Long value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Long value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Long value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Long value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Long value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Long> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Long> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Long value1, Long value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Long value1, Long value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdIsNull() {
            addCriterion("COURSEWARE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdIsNotNull() {
            addCriterion("COURSEWARE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdEqualTo(Long value) {
            addCriterion("COURSEWARE_ID =", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdNotEqualTo(Long value) {
            addCriterion("COURSEWARE_ID <>", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdGreaterThan(Long value) {
            addCriterion("COURSEWARE_ID >", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COURSEWARE_ID >=", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdLessThan(Long value) {
            addCriterion("COURSEWARE_ID <", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdLessThanOrEqualTo(Long value) {
            addCriterion("COURSEWARE_ID <=", value, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdIn(List<Long> values) {
            addCriterion("COURSEWARE_ID in", values, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdNotIn(List<Long> values) {
            addCriterion("COURSEWARE_ID not in", values, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdBetween(Long value1, Long value2) {
            addCriterion("COURSEWARE_ID between", value1, value2, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareIdNotBetween(Long value1, Long value2) {
            addCriterion("COURSEWARE_ID not between", value1, value2, "coursewareId");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeIsNull() {
            addCriterion("COURSEWARE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeIsNotNull() {
            addCriterion("COURSEWARE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeEqualTo(String value) {
            addCriterion("COURSEWARE_CODE =", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeNotEqualTo(String value) {
            addCriterion("COURSEWARE_CODE <>", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeGreaterThan(String value) {
            addCriterion("COURSEWARE_CODE >", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COURSEWARE_CODE >=", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeLessThan(String value) {
            addCriterion("COURSEWARE_CODE <", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeLessThanOrEqualTo(String value) {
            addCriterion("COURSEWARE_CODE <=", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeLike(String value) {
            addCriterion("COURSEWARE_CODE like", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeNotLike(String value) {
            addCriterion("COURSEWARE_CODE not like", value, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeIn(List<String> values) {
            addCriterion("COURSEWARE_CODE in", values, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeNotIn(List<String> values) {
            addCriterion("COURSEWARE_CODE not in", values, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeBetween(String value1, String value2) {
            addCriterion("COURSEWARE_CODE between", value1, value2, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andCoursewareCodeNotBetween(String value1, String value2) {
            addCriterion("COURSEWARE_CODE not between", value1, value2, "coursewareCode");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(Integer value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(Integer value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(Integer value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(Integer value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<Integer> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<Integer> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
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