package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecCourseViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecCourseViewExample() {
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

        public Criteria andSpecIdIsNull() {
            addCriterion("SPEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpecIdIsNotNull() {
            addCriterion("SPEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpecIdEqualTo(Integer value) {
            addCriterion("SPEC_ID =", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotEqualTo(Integer value) {
            addCriterion("SPEC_ID <>", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThan(Integer value) {
            addCriterion("SPEC_ID >", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPEC_ID >=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThan(Integer value) {
            addCriterion("SPEC_ID <", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("SPEC_ID <=", value, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdIn(List<Integer> values) {
            addCriterion("SPEC_ID in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotIn(List<Integer> values) {
            addCriterion("SPEC_ID not in", values, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_ID between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_ID not between", value1, value2, "specId");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNull() {
            addCriterion("SPEC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("SPEC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("SPEC_NAME =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("SPEC_NAME <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("SPEC_NAME >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_NAME >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("SPEC_NAME <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("SPEC_NAME <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("SPEC_NAME like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("SPEC_NAME not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("SPEC_NAME in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("SPEC_NAME not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("SPEC_NAME between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("SPEC_NAME not between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andSpecCostIsNull() {
            addCriterion("SPEC_COST is null");
            return (Criteria) this;
        }

        public Criteria andSpecCostIsNotNull() {
            addCriterion("SPEC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andSpecCostEqualTo(Integer value) {
            addCriterion("SPEC_COST =", value, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostNotEqualTo(Integer value) {
            addCriterion("SPEC_COST <>", value, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostGreaterThan(Integer value) {
            addCriterion("SPEC_COST >", value, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPEC_COST >=", value, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostLessThan(Integer value) {
            addCriterion("SPEC_COST <", value, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostLessThanOrEqualTo(Integer value) {
            addCriterion("SPEC_COST <=", value, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostIn(List<Integer> values) {
            addCriterion("SPEC_COST in", values, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostNotIn(List<Integer> values) {
            addCriterion("SPEC_COST not in", values, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_COST between", value1, value2, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecCostNotBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_COST not between", value1, value2, "specCost");
            return (Criteria) this;
        }

        public Criteria andSpecClassIsNull() {
            addCriterion("SPEC_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andSpecClassIsNotNull() {
            addCriterion("SPEC_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andSpecClassEqualTo(String value) {
            addCriterion("SPEC_CLASS =", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassNotEqualTo(String value) {
            addCriterion("SPEC_CLASS <>", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassGreaterThan(String value) {
            addCriterion("SPEC_CLASS >", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_CLASS >=", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassLessThan(String value) {
            addCriterion("SPEC_CLASS <", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassLessThanOrEqualTo(String value) {
            addCriterion("SPEC_CLASS <=", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassLike(String value) {
            addCriterion("SPEC_CLASS like", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassNotLike(String value) {
            addCriterion("SPEC_CLASS not like", value, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassIn(List<String> values) {
            addCriterion("SPEC_CLASS in", values, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassNotIn(List<String> values) {
            addCriterion("SPEC_CLASS not in", values, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassBetween(String value1, String value2) {
            addCriterion("SPEC_CLASS between", value1, value2, "specClass");
            return (Criteria) this;
        }

        public Criteria andSpecClassNotBetween(String value1, String value2) {
            addCriterion("SPEC_CLASS not between", value1, value2, "specClass");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andSpecStatusIsNull() {
            addCriterion("SPEC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSpecStatusIsNotNull() {
            addCriterion("SPEC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSpecStatusEqualTo(String value) {
            addCriterion("SPEC_STATUS =", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusNotEqualTo(String value) {
            addCriterion("SPEC_STATUS <>", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusGreaterThan(String value) {
            addCriterion("SPEC_STATUS >", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_STATUS >=", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusLessThan(String value) {
            addCriterion("SPEC_STATUS <", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusLessThanOrEqualTo(String value) {
            addCriterion("SPEC_STATUS <=", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusLike(String value) {
            addCriterion("SPEC_STATUS like", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusNotLike(String value) {
            addCriterion("SPEC_STATUS not like", value, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusIn(List<String> values) {
            addCriterion("SPEC_STATUS in", values, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusNotIn(List<String> values) {
            addCriterion("SPEC_STATUS not in", values, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusBetween(String value1, String value2) {
            addCriterion("SPEC_STATUS between", value1, value2, "specStatus");
            return (Criteria) this;
        }

        public Criteria andSpecStatusNotBetween(String value1, String value2) {
            addCriterion("SPEC_STATUS not between", value1, value2, "specStatus");
            return (Criteria) this;
        }

        public Criteria andHitnumIsNull() {
            addCriterion("hitNum is null");
            return (Criteria) this;
        }

        public Criteria andHitnumIsNotNull() {
            addCriterion("hitNum is not null");
            return (Criteria) this;
        }

        public Criteria andHitnumEqualTo(Long value) {
            addCriterion("hitNum =", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotEqualTo(Long value) {
            addCriterion("hitNum <>", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThan(Long value) {
            addCriterion("hitNum >", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThanOrEqualTo(Long value) {
            addCriterion("hitNum >=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThan(Long value) {
            addCriterion("hitNum <", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThanOrEqualTo(Long value) {
            addCriterion("hitNum <=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumIn(List<Long> values) {
            addCriterion("hitNum in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotIn(List<Long> values) {
            addCriterion("hitNum not in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumBetween(Long value1, Long value2) {
            addCriterion("hitNum between", value1, value2, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotBetween(Long value1, Long value2) {
            addCriterion("hitNum not between", value1, value2, "hitnum");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andStunumIsNull() {
            addCriterion("stuNum is null");
            return (Criteria) this;
        }

        public Criteria andStunumIsNotNull() {
            addCriterion("stuNum is not null");
            return (Criteria) this;
        }

        public Criteria andStunumEqualTo(Long value) {
            addCriterion("stuNum =", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotEqualTo(Long value) {
            addCriterion("stuNum <>", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThan(Long value) {
            addCriterion("stuNum >", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumGreaterThanOrEqualTo(Long value) {
            addCriterion("stuNum >=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThan(Long value) {
            addCriterion("stuNum <", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumLessThanOrEqualTo(Long value) {
            addCriterion("stuNum <=", value, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumIn(List<Long> values) {
            addCriterion("stuNum in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotIn(List<Long> values) {
            addCriterion("stuNum not in", values, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumBetween(Long value1, Long value2) {
            addCriterion("stuNum between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andStunumNotBetween(Long value1, Long value2) {
            addCriterion("stuNum not between", value1, value2, "stunum");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andComnumIsNull() {
            addCriterion("comNum is null");
            return (Criteria) this;
        }

        public Criteria andComnumIsNotNull() {
            addCriterion("comNum is not null");
            return (Criteria) this;
        }

        public Criteria andComnumEqualTo(Long value) {
            addCriterion("comNum =", value, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumNotEqualTo(Long value) {
            addCriterion("comNum <>", value, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumGreaterThan(Long value) {
            addCriterion("comNum >", value, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumGreaterThanOrEqualTo(Long value) {
            addCriterion("comNum >=", value, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumLessThan(Long value) {
            addCriterion("comNum <", value, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumLessThanOrEqualTo(Long value) {
            addCriterion("comNum <=", value, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumIn(List<Long> values) {
            addCriterion("comNum in", values, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumNotIn(List<Long> values) {
            addCriterion("comNum not in", values, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumBetween(Long value1, Long value2) {
            addCriterion("comNum between", value1, value2, "comnum");
            return (Criteria) this;
        }

        public Criteria andComnumNotBetween(Long value1, Long value2) {
            addCriterion("comNum not between", value1, value2, "comnum");
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