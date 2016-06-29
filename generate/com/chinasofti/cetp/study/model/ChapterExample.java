package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChapterExample() {
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

        public Criteria andChapIdIsNull() {
            addCriterion("CHAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andChapIdIsNotNull() {
            addCriterion("CHAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChapIdEqualTo(Integer value) {
            addCriterion("CHAP_ID =", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotEqualTo(Integer value) {
            addCriterion("CHAP_ID <>", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdGreaterThan(Integer value) {
            addCriterion("CHAP_ID >", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAP_ID >=", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdLessThan(Integer value) {
            addCriterion("CHAP_ID <", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHAP_ID <=", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdIn(List<Integer> values) {
            addCriterion("CHAP_ID in", values, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotIn(List<Integer> values) {
            addCriterion("CHAP_ID not in", values, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_ID between", value1, value2, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_ID not between", value1, value2, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapSeqIsNull() {
            addCriterion("CHAP_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andChapSeqIsNotNull() {
            addCriterion("CHAP_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andChapSeqEqualTo(Integer value) {
            addCriterion("CHAP_SEQ =", value, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqNotEqualTo(Integer value) {
            addCriterion("CHAP_SEQ <>", value, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqGreaterThan(Integer value) {
            addCriterion("CHAP_SEQ >", value, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAP_SEQ >=", value, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqLessThan(Integer value) {
            addCriterion("CHAP_SEQ <", value, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqLessThanOrEqualTo(Integer value) {
            addCriterion("CHAP_SEQ <=", value, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqIn(List<Integer> values) {
            addCriterion("CHAP_SEQ in", values, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqNotIn(List<Integer> values) {
            addCriterion("CHAP_SEQ not in", values, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_SEQ between", value1, value2, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_SEQ not between", value1, value2, "chapSeq");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdIsNull() {
            addCriterion("CHAP_SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdIsNotNull() {
            addCriterion("CHAP_SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdEqualTo(Integer value) {
            addCriterion("CHAP_SPEC_ID =", value, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdNotEqualTo(Integer value) {
            addCriterion("CHAP_SPEC_ID <>", value, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdGreaterThan(Integer value) {
            addCriterion("CHAP_SPEC_ID >", value, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAP_SPEC_ID >=", value, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdLessThan(Integer value) {
            addCriterion("CHAP_SPEC_ID <", value, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHAP_SPEC_ID <=", value, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdIn(List<Integer> values) {
            addCriterion("CHAP_SPEC_ID in", values, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdNotIn(List<Integer> values) {
            addCriterion("CHAP_SPEC_ID not in", values, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_SPEC_ID between", value1, value2, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_SPEC_ID not between", value1, value2, "chapSpecId");
            return (Criteria) this;
        }

        public Criteria andChapNameIsNull() {
            addCriterion("CHAP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChapNameIsNotNull() {
            addCriterion("CHAP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChapNameEqualTo(String value) {
            addCriterion("CHAP_NAME =", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotEqualTo(String value) {
            addCriterion("CHAP_NAME <>", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameGreaterThan(String value) {
            addCriterion("CHAP_NAME >", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHAP_NAME >=", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLessThan(String value) {
            addCriterion("CHAP_NAME <", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLessThanOrEqualTo(String value) {
            addCriterion("CHAP_NAME <=", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLike(String value) {
            addCriterion("CHAP_NAME like", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotLike(String value) {
            addCriterion("CHAP_NAME not like", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameIn(List<String> values) {
            addCriterion("CHAP_NAME in", values, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotIn(List<String> values) {
            addCriterion("CHAP_NAME not in", values, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameBetween(String value1, String value2) {
            addCriterion("CHAP_NAME between", value1, value2, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotBetween(String value1, String value2) {
            addCriterion("CHAP_NAME not between", value1, value2, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapExamIsNull() {
            addCriterion("CHAP_EXAM is null");
            return (Criteria) this;
        }

        public Criteria andChapExamIsNotNull() {
            addCriterion("CHAP_EXAM is not null");
            return (Criteria) this;
        }

        public Criteria andChapExamEqualTo(Long value) {
            addCriterion("CHAP_EXAM =", value, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamNotEqualTo(Long value) {
            addCriterion("CHAP_EXAM <>", value, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamGreaterThan(Long value) {
            addCriterion("CHAP_EXAM >", value, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamGreaterThanOrEqualTo(Long value) {
            addCriterion("CHAP_EXAM >=", value, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamLessThan(Long value) {
            addCriterion("CHAP_EXAM <", value, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamLessThanOrEqualTo(Long value) {
            addCriterion("CHAP_EXAM <=", value, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamIn(List<Long> values) {
            addCriterion("CHAP_EXAM in", values, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamNotIn(List<Long> values) {
            addCriterion("CHAP_EXAM not in", values, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamBetween(Long value1, Long value2) {
            addCriterion("CHAP_EXAM between", value1, value2, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapExamNotBetween(Long value1, Long value2) {
            addCriterion("CHAP_EXAM not between", value1, value2, "chapExam");
            return (Criteria) this;
        }

        public Criteria andChapUserNoIsNull() {
            addCriterion("CHAP_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andChapUserNoIsNotNull() {
            addCriterion("CHAP_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChapUserNoEqualTo(Integer value) {
            addCriterion("CHAP_USER_NO =", value, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoNotEqualTo(Integer value) {
            addCriterion("CHAP_USER_NO <>", value, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoGreaterThan(Integer value) {
            addCriterion("CHAP_USER_NO >", value, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAP_USER_NO >=", value, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoLessThan(Integer value) {
            addCriterion("CHAP_USER_NO <", value, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("CHAP_USER_NO <=", value, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoIn(List<Integer> values) {
            addCriterion("CHAP_USER_NO in", values, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoNotIn(List<Integer> values) {
            addCriterion("CHAP_USER_NO not in", values, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_USER_NO between", value1, value2, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAP_USER_NO not between", value1, value2, "chapUserNo");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeIsNull() {
            addCriterion("CHAP_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeIsNotNull() {
            addCriterion("CHAP_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeEqualTo(Date value) {
            addCriterion("CHAP_REGTIME =", value, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeNotEqualTo(Date value) {
            addCriterion("CHAP_REGTIME <>", value, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeGreaterThan(Date value) {
            addCriterion("CHAP_REGTIME >", value, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHAP_REGTIME >=", value, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeLessThan(Date value) {
            addCriterion("CHAP_REGTIME <", value, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("CHAP_REGTIME <=", value, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeIn(List<Date> values) {
            addCriterion("CHAP_REGTIME in", values, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeNotIn(List<Date> values) {
            addCriterion("CHAP_REGTIME not in", values, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeBetween(Date value1, Date value2) {
            addCriterion("CHAP_REGTIME between", value1, value2, "chapRegtime");
            return (Criteria) this;
        }

        public Criteria andChapRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("CHAP_REGTIME not between", value1, value2, "chapRegtime");
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