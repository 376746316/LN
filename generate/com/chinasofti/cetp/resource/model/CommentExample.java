package com.chinasofti.cetp.resource.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCoIdIsNull() {
            addCriterion("CO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("CO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(Long value) {
            addCriterion("CO_ID =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(Long value) {
            addCriterion("CO_ID <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(Long value) {
            addCriterion("CO_ID >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_ID >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(Long value) {
            addCriterion("CO_ID <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(Long value) {
            addCriterion("CO_ID <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<Long> values) {
            addCriterion("CO_ID in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<Long> values) {
            addCriterion("CO_ID not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(Long value1, Long value2) {
            addCriterion("CO_ID between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(Long value1, Long value2) {
            addCriterion("CO_ID not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoVideoIsNull() {
            addCriterion("CO_VIDEO is null");
            return (Criteria) this;
        }

        public Criteria andCoVideoIsNotNull() {
            addCriterion("CO_VIDEO is not null");
            return (Criteria) this;
        }

        public Criteria andCoVideoEqualTo(Integer value) {
            addCriterion("CO_VIDEO =", value, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoNotEqualTo(Integer value) {
            addCriterion("CO_VIDEO <>", value, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoGreaterThan(Integer value) {
            addCriterion("CO_VIDEO >", value, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CO_VIDEO >=", value, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoLessThan(Integer value) {
            addCriterion("CO_VIDEO <", value, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoLessThanOrEqualTo(Integer value) {
            addCriterion("CO_VIDEO <=", value, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoIn(List<Integer> values) {
            addCriterion("CO_VIDEO in", values, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoNotIn(List<Integer> values) {
            addCriterion("CO_VIDEO not in", values, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoBetween(Integer value1, Integer value2) {
            addCriterion("CO_VIDEO between", value1, value2, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoVideoNotBetween(Integer value1, Integer value2) {
            addCriterion("CO_VIDEO not between", value1, value2, "coVideo");
            return (Criteria) this;
        }

        public Criteria andCoTeacherIsNull() {
            addCriterion("CO_TEACHER is null");
            return (Criteria) this;
        }

        public Criteria andCoTeacherIsNotNull() {
            addCriterion("CO_TEACHER is not null");
            return (Criteria) this;
        }

        public Criteria andCoTeacherEqualTo(Integer value) {
            addCriterion("CO_TEACHER =", value, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherNotEqualTo(Integer value) {
            addCriterion("CO_TEACHER <>", value, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherGreaterThan(Integer value) {
            addCriterion("CO_TEACHER >", value, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherGreaterThanOrEqualTo(Integer value) {
            addCriterion("CO_TEACHER >=", value, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherLessThan(Integer value) {
            addCriterion("CO_TEACHER <", value, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherLessThanOrEqualTo(Integer value) {
            addCriterion("CO_TEACHER <=", value, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherIn(List<Integer> values) {
            addCriterion("CO_TEACHER in", values, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherNotIn(List<Integer> values) {
            addCriterion("CO_TEACHER not in", values, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherBetween(Integer value1, Integer value2) {
            addCriterion("CO_TEACHER between", value1, value2, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoTeacherNotBetween(Integer value1, Integer value2) {
            addCriterion("CO_TEACHER not between", value1, value2, "coTeacher");
            return (Criteria) this;
        }

        public Criteria andCoContentIsNull() {
            addCriterion("CO_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCoContentIsNotNull() {
            addCriterion("CO_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCoContentEqualTo(Integer value) {
            addCriterion("CO_CONTENT =", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotEqualTo(Integer value) {
            addCriterion("CO_CONTENT <>", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentGreaterThan(Integer value) {
            addCriterion("CO_CONTENT >", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentGreaterThanOrEqualTo(Integer value) {
            addCriterion("CO_CONTENT >=", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLessThan(Integer value) {
            addCriterion("CO_CONTENT <", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentLessThanOrEqualTo(Integer value) {
            addCriterion("CO_CONTENT <=", value, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentIn(List<Integer> values) {
            addCriterion("CO_CONTENT in", values, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotIn(List<Integer> values) {
            addCriterion("CO_CONTENT not in", values, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentBetween(Integer value1, Integer value2) {
            addCriterion("CO_CONTENT between", value1, value2, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoContentNotBetween(Integer value1, Integer value2) {
            addCriterion("CO_CONTENT not between", value1, value2, "coContent");
            return (Criteria) this;
        }

        public Criteria andCoTotalIsNull() {
            addCriterion("CO_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andCoTotalIsNotNull() {
            addCriterion("CO_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andCoTotalEqualTo(Integer value) {
            addCriterion("CO_TOTAL =", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalNotEqualTo(Integer value) {
            addCriterion("CO_TOTAL <>", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalGreaterThan(Integer value) {
            addCriterion("CO_TOTAL >", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("CO_TOTAL >=", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalLessThan(Integer value) {
            addCriterion("CO_TOTAL <", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalLessThanOrEqualTo(Integer value) {
            addCriterion("CO_TOTAL <=", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalIn(List<Integer> values) {
            addCriterion("CO_TOTAL in", values, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalNotIn(List<Integer> values) {
            addCriterion("CO_TOTAL not in", values, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalBetween(Integer value1, Integer value2) {
            addCriterion("CO_TOTAL between", value1, value2, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("CO_TOTAL not between", value1, value2, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoStuNoIsNull() {
            addCriterion("CO_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andCoStuNoIsNotNull() {
            addCriterion("CO_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCoStuNoEqualTo(Integer value) {
            addCriterion("CO_STU_NO =", value, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoNotEqualTo(Integer value) {
            addCriterion("CO_STU_NO <>", value, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoGreaterThan(Integer value) {
            addCriterion("CO_STU_NO >", value, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CO_STU_NO >=", value, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoLessThan(Integer value) {
            addCriterion("CO_STU_NO <", value, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("CO_STU_NO <=", value, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoIn(List<Integer> values) {
            addCriterion("CO_STU_NO in", values, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoNotIn(List<Integer> values) {
            addCriterion("CO_STU_NO not in", values, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoBetween(Integer value1, Integer value2) {
            addCriterion("CO_STU_NO between", value1, value2, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CO_STU_NO not between", value1, value2, "coStuNo");
            return (Criteria) this;
        }

        public Criteria andCoCommentIsNull() {
            addCriterion("CO_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andCoCommentIsNotNull() {
            addCriterion("CO_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCoCommentEqualTo(String value) {
            addCriterion("CO_COMMENT =", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentNotEqualTo(String value) {
            addCriterion("CO_COMMENT <>", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentGreaterThan(String value) {
            addCriterion("CO_COMMENT >", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentGreaterThanOrEqualTo(String value) {
            addCriterion("CO_COMMENT >=", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentLessThan(String value) {
            addCriterion("CO_COMMENT <", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentLessThanOrEqualTo(String value) {
            addCriterion("CO_COMMENT <=", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentLike(String value) {
            addCriterion("CO_COMMENT like", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentNotLike(String value) {
            addCriterion("CO_COMMENT not like", value, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentIn(List<String> values) {
            addCriterion("CO_COMMENT in", values, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentNotIn(List<String> values) {
            addCriterion("CO_COMMENT not in", values, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentBetween(String value1, String value2) {
            addCriterion("CO_COMMENT between", value1, value2, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoCommentNotBetween(String value1, String value2) {
            addCriterion("CO_COMMENT not between", value1, value2, "coComment");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeIsNull() {
            addCriterion("CO_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeIsNotNull() {
            addCriterion("CO_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeEqualTo(Date value) {
            addCriterion("CO_REGTIME =", value, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeNotEqualTo(Date value) {
            addCriterion("CO_REGTIME <>", value, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeGreaterThan(Date value) {
            addCriterion("CO_REGTIME >", value, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CO_REGTIME >=", value, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeLessThan(Date value) {
            addCriterion("CO_REGTIME <", value, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("CO_REGTIME <=", value, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeIn(List<Date> values) {
            addCriterion("CO_REGTIME in", values, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeNotIn(List<Date> values) {
            addCriterion("CO_REGTIME not in", values, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeBetween(Date value1, Date value2) {
            addCriterion("CO_REGTIME between", value1, value2, "coRegtime");
            return (Criteria) this;
        }

        public Criteria andCoRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("CO_REGTIME not between", value1, value2, "coRegtime");
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