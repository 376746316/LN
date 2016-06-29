package com.chinasofti.cetp.exam.model;

import java.util.ArrayList;
import java.util.List;

public class ExamQuesTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamQuesTypeExample() {
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

        public Criteria andQtIdIsNull() {
            addCriterion("QT_ID is null");
            return (Criteria) this;
        }

        public Criteria andQtIdIsNotNull() {
            addCriterion("QT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQtIdEqualTo(Long value) {
            addCriterion("QT_ID =", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotEqualTo(Long value) {
            addCriterion("QT_ID <>", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdGreaterThan(Long value) {
            addCriterion("QT_ID >", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QT_ID >=", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdLessThan(Long value) {
            addCriterion("QT_ID <", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdLessThanOrEqualTo(Long value) {
            addCriterion("QT_ID <=", value, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdIn(List<Long> values) {
            addCriterion("QT_ID in", values, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotIn(List<Long> values) {
            addCriterion("QT_ID not in", values, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdBetween(Long value1, Long value2) {
            addCriterion("QT_ID between", value1, value2, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtIdNotBetween(Long value1, Long value2) {
            addCriterion("QT_ID not between", value1, value2, "qtId");
            return (Criteria) this;
        }

        public Criteria andQtNameIsNull() {
            addCriterion("QT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andQtNameIsNotNull() {
            addCriterion("QT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andQtNameEqualTo(String value) {
            addCriterion("QT_NAME =", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotEqualTo(String value) {
            addCriterion("QT_NAME <>", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameGreaterThan(String value) {
            addCriterion("QT_NAME >", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameGreaterThanOrEqualTo(String value) {
            addCriterion("QT_NAME >=", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLessThan(String value) {
            addCriterion("QT_NAME <", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLessThanOrEqualTo(String value) {
            addCriterion("QT_NAME <=", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameLike(String value) {
            addCriterion("QT_NAME like", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotLike(String value) {
            addCriterion("QT_NAME not like", value, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameIn(List<String> values) {
            addCriterion("QT_NAME in", values, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotIn(List<String> values) {
            addCriterion("QT_NAME not in", values, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameBetween(String value1, String value2) {
            addCriterion("QT_NAME between", value1, value2, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtNameNotBetween(String value1, String value2) {
            addCriterion("QT_NAME not between", value1, value2, "qtName");
            return (Criteria) this;
        }

        public Criteria andQtCodeIsNull() {
            addCriterion("QT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andQtCodeIsNotNull() {
            addCriterion("QT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andQtCodeEqualTo(String value) {
            addCriterion("QT_CODE =", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeNotEqualTo(String value) {
            addCriterion("QT_CODE <>", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeGreaterThan(String value) {
            addCriterion("QT_CODE >", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("QT_CODE >=", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeLessThan(String value) {
            addCriterion("QT_CODE <", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeLessThanOrEqualTo(String value) {
            addCriterion("QT_CODE <=", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeLike(String value) {
            addCriterion("QT_CODE like", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeNotLike(String value) {
            addCriterion("QT_CODE not like", value, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeIn(List<String> values) {
            addCriterion("QT_CODE in", values, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeNotIn(List<String> values) {
            addCriterion("QT_CODE not in", values, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeBetween(String value1, String value2) {
            addCriterion("QT_CODE between", value1, value2, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtCodeNotBetween(String value1, String value2) {
            addCriterion("QT_CODE not between", value1, value2, "qtCode");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeIsNull() {
            addCriterion("QT_OUTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeIsNotNull() {
            addCriterion("QT_OUTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeEqualTo(String value) {
            addCriterion("QT_OUTTYPE =", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeNotEqualTo(String value) {
            addCriterion("QT_OUTTYPE <>", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeGreaterThan(String value) {
            addCriterion("QT_OUTTYPE >", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeGreaterThanOrEqualTo(String value) {
            addCriterion("QT_OUTTYPE >=", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeLessThan(String value) {
            addCriterion("QT_OUTTYPE <", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeLessThanOrEqualTo(String value) {
            addCriterion("QT_OUTTYPE <=", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeLike(String value) {
            addCriterion("QT_OUTTYPE like", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeNotLike(String value) {
            addCriterion("QT_OUTTYPE not like", value, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeIn(List<String> values) {
            addCriterion("QT_OUTTYPE in", values, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeNotIn(List<String> values) {
            addCriterion("QT_OUTTYPE not in", values, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeBetween(String value1, String value2) {
            addCriterion("QT_OUTTYPE between", value1, value2, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtOuttypeNotBetween(String value1, String value2) {
            addCriterion("QT_OUTTYPE not between", value1, value2, "qtOuttype");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveIsNull() {
            addCriterion("QT_SUBJECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveIsNotNull() {
            addCriterion("QT_SUBJECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveEqualTo(Boolean value) {
            addCriterion("QT_SUBJECTIVE =", value, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveNotEqualTo(Boolean value) {
            addCriterion("QT_SUBJECTIVE <>", value, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveGreaterThan(Boolean value) {
            addCriterion("QT_SUBJECTIVE >", value, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("QT_SUBJECTIVE >=", value, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveLessThan(Boolean value) {
            addCriterion("QT_SUBJECTIVE <", value, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveLessThanOrEqualTo(Boolean value) {
            addCriterion("QT_SUBJECTIVE <=", value, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveIn(List<Boolean> values) {
            addCriterion("QT_SUBJECTIVE in", values, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveNotIn(List<Boolean> values) {
            addCriterion("QT_SUBJECTIVE not in", values, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveBetween(Boolean value1, Boolean value2) {
            addCriterion("QT_SUBJECTIVE between", value1, value2, "qtSubjective");
            return (Criteria) this;
        }

        public Criteria andQtSubjectiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("QT_SUBJECTIVE not between", value1, value2, "qtSubjective");
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