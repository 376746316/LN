package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DialogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DialogExample() {
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

        public Criteria andDialogIdIsNull() {
            addCriterion("dialog_id is null");
            return (Criteria) this;
        }

        public Criteria andDialogIdIsNotNull() {
            addCriterion("dialog_id is not null");
            return (Criteria) this;
        }

        public Criteria andDialogIdEqualTo(Integer value) {
            addCriterion("dialog_id =", value, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdNotEqualTo(Integer value) {
            addCriterion("dialog_id <>", value, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdGreaterThan(Integer value) {
            addCriterion("dialog_id >", value, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dialog_id >=", value, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdLessThan(Integer value) {
            addCriterion("dialog_id <", value, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdLessThanOrEqualTo(Integer value) {
            addCriterion("dialog_id <=", value, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdIn(List<Integer> values) {
            addCriterion("dialog_id in", values, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdNotIn(List<Integer> values) {
            addCriterion("dialog_id not in", values, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdBetween(Integer value1, Integer value2) {
            addCriterion("dialog_id between", value1, value2, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dialog_id not between", value1, value2, "dialogId");
            return (Criteria) this;
        }

        public Criteria andDialogNameIsNull() {
            addCriterion("dialog_name is null");
            return (Criteria) this;
        }

        public Criteria andDialogNameIsNotNull() {
            addCriterion("dialog_name is not null");
            return (Criteria) this;
        }

        public Criteria andDialogNameEqualTo(String value) {
            addCriterion("dialog_name =", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameNotEqualTo(String value) {
            addCriterion("dialog_name <>", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameGreaterThan(String value) {
            addCriterion("dialog_name >", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameGreaterThanOrEqualTo(String value) {
            addCriterion("dialog_name >=", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameLessThan(String value) {
            addCriterion("dialog_name <", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameLessThanOrEqualTo(String value) {
            addCriterion("dialog_name <=", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameLike(String value) {
            addCriterion("dialog_name like", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameNotLike(String value) {
            addCriterion("dialog_name not like", value, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameIn(List<String> values) {
            addCriterion("dialog_name in", values, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameNotIn(List<String> values) {
            addCriterion("dialog_name not in", values, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameBetween(String value1, String value2) {
            addCriterion("dialog_name between", value1, value2, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogNameNotBetween(String value1, String value2) {
            addCriterion("dialog_name not between", value1, value2, "dialogName");
            return (Criteria) this;
        }

        public Criteria andDialogTimeIsNull() {
            addCriterion("dialog_time is null");
            return (Criteria) this;
        }

        public Criteria andDialogTimeIsNotNull() {
            addCriterion("dialog_time is not null");
            return (Criteria) this;
        }

        public Criteria andDialogTimeEqualTo(Date value) {
            addCriterion("dialog_time =", value, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeNotEqualTo(Date value) {
            addCriterion("dialog_time <>", value, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeGreaterThan(Date value) {
            addCriterion("dialog_time >", value, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dialog_time >=", value, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeLessThan(Date value) {
            addCriterion("dialog_time <", value, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeLessThanOrEqualTo(Date value) {
            addCriterion("dialog_time <=", value, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeIn(List<Date> values) {
            addCriterion("dialog_time in", values, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeNotIn(List<Date> values) {
            addCriterion("dialog_time not in", values, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeBetween(Date value1, Date value2) {
            addCriterion("dialog_time between", value1, value2, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andDialogTimeNotBetween(Date value1, Date value2) {
            addCriterion("dialog_time not between", value1, value2, "dialogTime");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNull() {
            addCriterion("stu_no is null");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNotNull() {
            addCriterion("stu_no is not null");
            return (Criteria) this;
        }

        public Criteria andStuNoEqualTo(Integer value) {
            addCriterion("stu_no =", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotEqualTo(Integer value) {
            addCriterion("stu_no <>", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThan(Integer value) {
            addCriterion("stu_no >", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_no >=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThan(Integer value) {
            addCriterion("stu_no <", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("stu_no <=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoIn(List<Integer> values) {
            addCriterion("stu_no in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotIn(List<Integer> values) {
            addCriterion("stu_no not in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoBetween(Integer value1, Integer value2) {
            addCriterion("stu_no between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_no not between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
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