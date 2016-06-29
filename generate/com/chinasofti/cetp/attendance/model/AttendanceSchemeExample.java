package com.chinasofti.cetp.attendance.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceSchemeExample() {
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

        public Criteria andAsIdIsNull() {
            addCriterion("AS_ID is null");
            return (Criteria) this;
        }

        public Criteria andAsIdIsNotNull() {
            addCriterion("AS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAsIdEqualTo(Integer value) {
            addCriterion("AS_ID =", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdNotEqualTo(Integer value) {
            addCriterion("AS_ID <>", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdGreaterThan(Integer value) {
            addCriterion("AS_ID >", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AS_ID >=", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdLessThan(Integer value) {
            addCriterion("AS_ID <", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdLessThanOrEqualTo(Integer value) {
            addCriterion("AS_ID <=", value, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdIn(List<Integer> values) {
            addCriterion("AS_ID in", values, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdNotIn(List<Integer> values) {
            addCriterion("AS_ID not in", values, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdBetween(Integer value1, Integer value2) {
            addCriterion("AS_ID between", value1, value2, "asId");
            return (Criteria) this;
        }

        public Criteria andAsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AS_ID not between", value1, value2, "asId");
            return (Criteria) this;
        }

        public Criteria andAsNameIsNull() {
            addCriterion("AS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAsNameIsNotNull() {
            addCriterion("AS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAsNameEqualTo(String value) {
            addCriterion("AS_NAME =", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotEqualTo(String value) {
            addCriterion("AS_NAME <>", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameGreaterThan(String value) {
            addCriterion("AS_NAME >", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameGreaterThanOrEqualTo(String value) {
            addCriterion("AS_NAME >=", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameLessThan(String value) {
            addCriterion("AS_NAME <", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameLessThanOrEqualTo(String value) {
            addCriterion("AS_NAME <=", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameLike(String value) {
            addCriterion("AS_NAME like", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotLike(String value) {
            addCriterion("AS_NAME not like", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameIn(List<String> values) {
            addCriterion("AS_NAME in", values, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotIn(List<String> values) {
            addCriterion("AS_NAME not in", values, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameBetween(String value1, String value2) {
            addCriterion("AS_NAME between", value1, value2, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotBetween(String value1, String value2) {
            addCriterion("AS_NAME not between", value1, value2, "asName");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagIsNull() {
            addCriterion("AS_AM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagIsNotNull() {
            addCriterion("AS_AM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagEqualTo(String value) {
            addCriterion("AS_AM_FLAG =", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagNotEqualTo(String value) {
            addCriterion("AS_AM_FLAG <>", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagGreaterThan(String value) {
            addCriterion("AS_AM_FLAG >", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AS_AM_FLAG >=", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagLessThan(String value) {
            addCriterion("AS_AM_FLAG <", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagLessThanOrEqualTo(String value) {
            addCriterion("AS_AM_FLAG <=", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagLike(String value) {
            addCriterion("AS_AM_FLAG like", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagNotLike(String value) {
            addCriterion("AS_AM_FLAG not like", value, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagIn(List<String> values) {
            addCriterion("AS_AM_FLAG in", values, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagNotIn(List<String> values) {
            addCriterion("AS_AM_FLAG not in", values, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagBetween(String value1, String value2) {
            addCriterion("AS_AM_FLAG between", value1, value2, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmFlagNotBetween(String value1, String value2) {
            addCriterion("AS_AM_FLAG not between", value1, value2, "asAmFlag");
            return (Criteria) this;
        }

        public Criteria andAsAmStartIsNull() {
            addCriterion("AS_AM_START is null");
            return (Criteria) this;
        }

        public Criteria andAsAmStartIsNotNull() {
            addCriterion("AS_AM_START is not null");
            return (Criteria) this;
        }

        public Criteria andAsAmStartEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_START =", value, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartNotEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_START <>", value, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartGreaterThan(Date value) {
            addCriterionForJDBCTime("AS_AM_START >", value, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_START >=", value, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartLessThan(Date value) {
            addCriterionForJDBCTime("AS_AM_START <", value, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_START <=", value, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartIn(List<Date> values) {
            addCriterionForJDBCTime("AS_AM_START in", values, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartNotIn(List<Date> values) {
            addCriterionForJDBCTime("AS_AM_START not in", values, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_AM_START between", value1, value2, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_AM_START not between", value1, value2, "asAmStart");
            return (Criteria) this;
        }

        public Criteria andAsAmEndIsNull() {
            addCriterion("AS_AM_END is null");
            return (Criteria) this;
        }

        public Criteria andAsAmEndIsNotNull() {
            addCriterion("AS_AM_END is not null");
            return (Criteria) this;
        }

        public Criteria andAsAmEndEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_END =", value, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndNotEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_END <>", value, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndGreaterThan(Date value) {
            addCriterionForJDBCTime("AS_AM_END >", value, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_END >=", value, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndLessThan(Date value) {
            addCriterionForJDBCTime("AS_AM_END <", value, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_AM_END <=", value, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndIn(List<Date> values) {
            addCriterionForJDBCTime("AS_AM_END in", values, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndNotIn(List<Date> values) {
            addCriterionForJDBCTime("AS_AM_END not in", values, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_AM_END between", value1, value2, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsAmEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_AM_END not between", value1, value2, "asAmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagIsNull() {
            addCriterion("AS_PM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagIsNotNull() {
            addCriterion("AS_PM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagEqualTo(String value) {
            addCriterion("AS_PM_FLAG =", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagNotEqualTo(String value) {
            addCriterion("AS_PM_FLAG <>", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagGreaterThan(String value) {
            addCriterion("AS_PM_FLAG >", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AS_PM_FLAG >=", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagLessThan(String value) {
            addCriterion("AS_PM_FLAG <", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagLessThanOrEqualTo(String value) {
            addCriterion("AS_PM_FLAG <=", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagLike(String value) {
            addCriterion("AS_PM_FLAG like", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagNotLike(String value) {
            addCriterion("AS_PM_FLAG not like", value, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagIn(List<String> values) {
            addCriterion("AS_PM_FLAG in", values, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagNotIn(List<String> values) {
            addCriterion("AS_PM_FLAG not in", values, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagBetween(String value1, String value2) {
            addCriterion("AS_PM_FLAG between", value1, value2, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmFlagNotBetween(String value1, String value2) {
            addCriterion("AS_PM_FLAG not between", value1, value2, "asPmFlag");
            return (Criteria) this;
        }

        public Criteria andAsPmStartIsNull() {
            addCriterion("AS_PM_START is null");
            return (Criteria) this;
        }

        public Criteria andAsPmStartIsNotNull() {
            addCriterion("AS_PM_START is not null");
            return (Criteria) this;
        }

        public Criteria andAsPmStartEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_START =", value, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartNotEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_START <>", value, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartGreaterThan(Date value) {
            addCriterionForJDBCTime("AS_PM_START >", value, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_START >=", value, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartLessThan(Date value) {
            addCriterionForJDBCTime("AS_PM_START <", value, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_START <=", value, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartIn(List<Date> values) {
            addCriterionForJDBCTime("AS_PM_START in", values, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartNotIn(List<Date> values) {
            addCriterionForJDBCTime("AS_PM_START not in", values, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_PM_START between", value1, value2, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_PM_START not between", value1, value2, "asPmStart");
            return (Criteria) this;
        }

        public Criteria andAsPmEndIsNull() {
            addCriterion("AS_PM_END is null");
            return (Criteria) this;
        }

        public Criteria andAsPmEndIsNotNull() {
            addCriterion("AS_PM_END is not null");
            return (Criteria) this;
        }

        public Criteria andAsPmEndEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_END =", value, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndNotEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_END <>", value, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndGreaterThan(Date value) {
            addCriterionForJDBCTime("AS_PM_END >", value, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_END >=", value, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndLessThan(Date value) {
            addCriterionForJDBCTime("AS_PM_END <", value, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_PM_END <=", value, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndIn(List<Date> values) {
            addCriterionForJDBCTime("AS_PM_END in", values, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndNotIn(List<Date> values) {
            addCriterionForJDBCTime("AS_PM_END not in", values, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_PM_END between", value1, value2, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsPmEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_PM_END not between", value1, value2, "asPmEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagIsNull() {
            addCriterion("AS_NIGHT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagIsNotNull() {
            addCriterion("AS_NIGHT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagEqualTo(String value) {
            addCriterion("AS_NIGHT_FLAG =", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagNotEqualTo(String value) {
            addCriterion("AS_NIGHT_FLAG <>", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagGreaterThan(String value) {
            addCriterion("AS_NIGHT_FLAG >", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AS_NIGHT_FLAG >=", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagLessThan(String value) {
            addCriterion("AS_NIGHT_FLAG <", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagLessThanOrEqualTo(String value) {
            addCriterion("AS_NIGHT_FLAG <=", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagLike(String value) {
            addCriterion("AS_NIGHT_FLAG like", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagNotLike(String value) {
            addCriterion("AS_NIGHT_FLAG not like", value, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagIn(List<String> values) {
            addCriterion("AS_NIGHT_FLAG in", values, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagNotIn(List<String> values) {
            addCriterion("AS_NIGHT_FLAG not in", values, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagBetween(String value1, String value2) {
            addCriterion("AS_NIGHT_FLAG between", value1, value2, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightFlagNotBetween(String value1, String value2) {
            addCriterion("AS_NIGHT_FLAG not between", value1, value2, "asNightFlag");
            return (Criteria) this;
        }

        public Criteria andAsNightStartIsNull() {
            addCriterion("AS_NIGHT_START is null");
            return (Criteria) this;
        }

        public Criteria andAsNightStartIsNotNull() {
            addCriterion("AS_NIGHT_START is not null");
            return (Criteria) this;
        }

        public Criteria andAsNightStartEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_START =", value, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartNotEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_START <>", value, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartGreaterThan(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_START >", value, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_START >=", value, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartLessThan(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_START <", value, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_START <=", value, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartIn(List<Date> values) {
            addCriterionForJDBCTime("AS_NIGHT_START in", values, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartNotIn(List<Date> values) {
            addCriterionForJDBCTime("AS_NIGHT_START not in", values, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_NIGHT_START between", value1, value2, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_NIGHT_START not between", value1, value2, "asNightStart");
            return (Criteria) this;
        }

        public Criteria andAsNightEndIsNull() {
            addCriterion("AS_NIGHT_END is null");
            return (Criteria) this;
        }

        public Criteria andAsNightEndIsNotNull() {
            addCriterion("AS_NIGHT_END is not null");
            return (Criteria) this;
        }

        public Criteria andAsNightEndEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_END =", value, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndNotEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_END <>", value, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndGreaterThan(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_END >", value, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_END >=", value, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndLessThan(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_END <", value, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("AS_NIGHT_END <=", value, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndIn(List<Date> values) {
            addCriterionForJDBCTime("AS_NIGHT_END in", values, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndNotIn(List<Date> values) {
            addCriterionForJDBCTime("AS_NIGHT_END not in", values, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_NIGHT_END between", value1, value2, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsNightEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("AS_NIGHT_END not between", value1, value2, "asNightEnd");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagIsNull() {
            addCriterion("AS_SIGNIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagIsNotNull() {
            addCriterion("AS_SIGNIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagEqualTo(String value) {
            addCriterion("AS_SIGNIN_FLAG =", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagNotEqualTo(String value) {
            addCriterion("AS_SIGNIN_FLAG <>", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagGreaterThan(String value) {
            addCriterion("AS_SIGNIN_FLAG >", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AS_SIGNIN_FLAG >=", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagLessThan(String value) {
            addCriterion("AS_SIGNIN_FLAG <", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagLessThanOrEqualTo(String value) {
            addCriterion("AS_SIGNIN_FLAG <=", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagLike(String value) {
            addCriterion("AS_SIGNIN_FLAG like", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagNotLike(String value) {
            addCriterion("AS_SIGNIN_FLAG not like", value, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagIn(List<String> values) {
            addCriterion("AS_SIGNIN_FLAG in", values, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagNotIn(List<String> values) {
            addCriterion("AS_SIGNIN_FLAG not in", values, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagBetween(String value1, String value2) {
            addCriterion("AS_SIGNIN_FLAG between", value1, value2, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsSigninFlagNotBetween(String value1, String value2) {
            addCriterion("AS_SIGNIN_FLAG not between", value1, value2, "asSigninFlag");
            return (Criteria) this;
        }

        public Criteria andAsUserNoIsNull() {
            addCriterion("AS_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andAsUserNoIsNotNull() {
            addCriterion("AS_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAsUserNoEqualTo(Integer value) {
            addCriterion("AS_USER_NO =", value, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoNotEqualTo(Integer value) {
            addCriterion("AS_USER_NO <>", value, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoGreaterThan(Integer value) {
            addCriterion("AS_USER_NO >", value, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("AS_USER_NO >=", value, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoLessThan(Integer value) {
            addCriterion("AS_USER_NO <", value, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("AS_USER_NO <=", value, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoIn(List<Integer> values) {
            addCriterion("AS_USER_NO in", values, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoNotIn(List<Integer> values) {
            addCriterion("AS_USER_NO not in", values, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoBetween(Integer value1, Integer value2) {
            addCriterion("AS_USER_NO between", value1, value2, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("AS_USER_NO not between", value1, value2, "asUserNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoIsNull() {
            addCriterion("AS_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andAsStuNoIsNotNull() {
            addCriterion("AS_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAsStuNoEqualTo(Integer value) {
            addCriterion("AS_STU_NO =", value, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoNotEqualTo(Integer value) {
            addCriterion("AS_STU_NO <>", value, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoGreaterThan(Integer value) {
            addCriterion("AS_STU_NO >", value, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("AS_STU_NO >=", value, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoLessThan(Integer value) {
            addCriterion("AS_STU_NO <", value, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("AS_STU_NO <=", value, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoIn(List<Integer> values) {
            addCriterion("AS_STU_NO in", values, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoNotIn(List<Integer> values) {
            addCriterion("AS_STU_NO not in", values, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoBetween(Integer value1, Integer value2) {
            addCriterion("AS_STU_NO between", value1, value2, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("AS_STU_NO not between", value1, value2, "asStuNo");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeIsNull() {
            addCriterion("AS_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeIsNotNull() {
            addCriterion("AS_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeEqualTo(Date value) {
            addCriterion("AS_REGTIME =", value, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeNotEqualTo(Date value) {
            addCriterion("AS_REGTIME <>", value, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeGreaterThan(Date value) {
            addCriterion("AS_REGTIME >", value, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AS_REGTIME >=", value, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeLessThan(Date value) {
            addCriterion("AS_REGTIME <", value, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("AS_REGTIME <=", value, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeIn(List<Date> values) {
            addCriterion("AS_REGTIME in", values, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeNotIn(List<Date> values) {
            addCriterion("AS_REGTIME not in", values, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeBetween(Date value1, Date value2) {
            addCriterion("AS_REGTIME between", value1, value2, "asRegtime");
            return (Criteria) this;
        }

        public Criteria andAsRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("AS_REGTIME not between", value1, value2, "asRegtime");
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