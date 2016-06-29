package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecCourseExample() {
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

        public Criteria andSpecCodeIsNull() {
            addCriterion("SPEC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpecCodeIsNotNull() {
            addCriterion("SPEC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecCodeEqualTo(String value) {
            addCriterion("SPEC_CODE =", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotEqualTo(String value) {
            addCriterion("SPEC_CODE <>", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeGreaterThan(String value) {
            addCriterion("SPEC_CODE >", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_CODE >=", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeLessThan(String value) {
            addCriterion("SPEC_CODE <", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeLessThanOrEqualTo(String value) {
            addCriterion("SPEC_CODE <=", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeLike(String value) {
            addCriterion("SPEC_CODE like", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotLike(String value) {
            addCriterion("SPEC_CODE not like", value, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeIn(List<String> values) {
            addCriterion("SPEC_CODE in", values, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotIn(List<String> values) {
            addCriterion("SPEC_CODE not in", values, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeBetween(String value1, String value2) {
            addCriterion("SPEC_CODE between", value1, value2, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecCodeNotBetween(String value1, String value2) {
            addCriterion("SPEC_CODE not between", value1, value2, "specCode");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseIsNull() {
            addCriterion("SPEC_PRE_COURSE is null");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseIsNotNull() {
            addCriterion("SPEC_PRE_COURSE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseEqualTo(String value) {
            addCriterion("SPEC_PRE_COURSE =", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseNotEqualTo(String value) {
            addCriterion("SPEC_PRE_COURSE <>", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseGreaterThan(String value) {
            addCriterion("SPEC_PRE_COURSE >", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_PRE_COURSE >=", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseLessThan(String value) {
            addCriterion("SPEC_PRE_COURSE <", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseLessThanOrEqualTo(String value) {
            addCriterion("SPEC_PRE_COURSE <=", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseLike(String value) {
            addCriterion("SPEC_PRE_COURSE like", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseNotLike(String value) {
            addCriterion("SPEC_PRE_COURSE not like", value, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseIn(List<String> values) {
            addCriterion("SPEC_PRE_COURSE in", values, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseNotIn(List<String> values) {
            addCriterion("SPEC_PRE_COURSE not in", values, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseBetween(String value1, String value2) {
            addCriterion("SPEC_PRE_COURSE between", value1, value2, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecPreCourseNotBetween(String value1, String value2) {
            addCriterion("SPEC_PRE_COURSE not between", value1, value2, "specPreCourse");
            return (Criteria) this;
        }

        public Criteria andSpecMajorIsNull() {
            addCriterion("SPEC_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andSpecMajorIsNotNull() {
            addCriterion("SPEC_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andSpecMajorEqualTo(String value) {
            addCriterion("SPEC_MAJOR =", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorNotEqualTo(String value) {
            addCriterion("SPEC_MAJOR <>", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorGreaterThan(String value) {
            addCriterion("SPEC_MAJOR >", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_MAJOR >=", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorLessThan(String value) {
            addCriterion("SPEC_MAJOR <", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorLessThanOrEqualTo(String value) {
            addCriterion("SPEC_MAJOR <=", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorLike(String value) {
            addCriterion("SPEC_MAJOR like", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorNotLike(String value) {
            addCriterion("SPEC_MAJOR not like", value, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorIn(List<String> values) {
            addCriterion("SPEC_MAJOR in", values, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorNotIn(List<String> values) {
            addCriterion("SPEC_MAJOR not in", values, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorBetween(String value1, String value2) {
            addCriterion("SPEC_MAJOR between", value1, value2, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecMajorNotBetween(String value1, String value2) {
            addCriterion("SPEC_MAJOR not between", value1, value2, "specMajor");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeIsNull() {
            addCriterion("SPEC_THEORY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeIsNotNull() {
            addCriterion("SPEC_THEORY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeEqualTo(Integer value) {
            addCriterion("SPEC_THEORY_TIME =", value, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeNotEqualTo(Integer value) {
            addCriterion("SPEC_THEORY_TIME <>", value, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeGreaterThan(Integer value) {
            addCriterion("SPEC_THEORY_TIME >", value, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPEC_THEORY_TIME >=", value, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeLessThan(Integer value) {
            addCriterion("SPEC_THEORY_TIME <", value, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeLessThanOrEqualTo(Integer value) {
            addCriterion("SPEC_THEORY_TIME <=", value, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeIn(List<Integer> values) {
            addCriterion("SPEC_THEORY_TIME in", values, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeNotIn(List<Integer> values) {
            addCriterion("SPEC_THEORY_TIME not in", values, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_THEORY_TIME between", value1, value2, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_THEORY_TIME not between", value1, value2, "specTheoryTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeIsNull() {
            addCriterion("SPEC_PRAC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeIsNotNull() {
            addCriterion("SPEC_PRAC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeEqualTo(Integer value) {
            addCriterion("SPEC_PRAC_TIME =", value, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeNotEqualTo(Integer value) {
            addCriterion("SPEC_PRAC_TIME <>", value, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeGreaterThan(Integer value) {
            addCriterion("SPEC_PRAC_TIME >", value, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPEC_PRAC_TIME >=", value, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeLessThan(Integer value) {
            addCriterion("SPEC_PRAC_TIME <", value, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeLessThanOrEqualTo(Integer value) {
            addCriterion("SPEC_PRAC_TIME <=", value, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeIn(List<Integer> values) {
            addCriterion("SPEC_PRAC_TIME in", values, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeNotIn(List<Integer> values) {
            addCriterion("SPEC_PRAC_TIME not in", values, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_PRAC_TIME between", value1, value2, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecPracTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_PRAC_TIME not between", value1, value2, "specPracTime");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditIsNull() {
            addCriterion("SPEC_THEORY_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditIsNotNull() {
            addCriterion("SPEC_THEORY_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditEqualTo(Double value) {
            addCriterion("SPEC_THEORY_CREDIT =", value, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditNotEqualTo(Double value) {
            addCriterion("SPEC_THEORY_CREDIT <>", value, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditGreaterThan(Double value) {
            addCriterion("SPEC_THEORY_CREDIT >", value, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("SPEC_THEORY_CREDIT >=", value, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditLessThan(Double value) {
            addCriterion("SPEC_THEORY_CREDIT <", value, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditLessThanOrEqualTo(Double value) {
            addCriterion("SPEC_THEORY_CREDIT <=", value, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditIn(List<Double> values) {
            addCriterion("SPEC_THEORY_CREDIT in", values, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditNotIn(List<Double> values) {
            addCriterion("SPEC_THEORY_CREDIT not in", values, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditBetween(Double value1, Double value2) {
            addCriterion("SPEC_THEORY_CREDIT between", value1, value2, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecTheoryCreditNotBetween(Double value1, Double value2) {
            addCriterion("SPEC_THEORY_CREDIT not between", value1, value2, "specTheoryCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditIsNull() {
            addCriterion("SPEC_PRAC_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditIsNotNull() {
            addCriterion("SPEC_PRAC_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditEqualTo(Double value) {
            addCriterion("SPEC_PRAC_CREDIT =", value, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditNotEqualTo(Double value) {
            addCriterion("SPEC_PRAC_CREDIT <>", value, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditGreaterThan(Double value) {
            addCriterion("SPEC_PRAC_CREDIT >", value, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("SPEC_PRAC_CREDIT >=", value, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditLessThan(Double value) {
            addCriterion("SPEC_PRAC_CREDIT <", value, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditLessThanOrEqualTo(Double value) {
            addCriterion("SPEC_PRAC_CREDIT <=", value, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditIn(List<Double> values) {
            addCriterion("SPEC_PRAC_CREDIT in", values, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditNotIn(List<Double> values) {
            addCriterion("SPEC_PRAC_CREDIT not in", values, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditBetween(Double value1, Double value2) {
            addCriterion("SPEC_PRAC_CREDIT between", value1, value2, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecPracCreditNotBetween(Double value1, Double value2) {
            addCriterion("SPEC_PRAC_CREDIT not between", value1, value2, "specPracCredit");
            return (Criteria) this;
        }

        public Criteria andSpecFlagIsNull() {
            addCriterion("SPEC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSpecFlagIsNotNull() {
            addCriterion("SPEC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSpecFlagEqualTo(String value) {
            addCriterion("SPEC_FLAG =", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagNotEqualTo(String value) {
            addCriterion("SPEC_FLAG <>", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagGreaterThan(String value) {
            addCriterion("SPEC_FLAG >", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_FLAG >=", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagLessThan(String value) {
            addCriterion("SPEC_FLAG <", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagLessThanOrEqualTo(String value) {
            addCriterion("SPEC_FLAG <=", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagLike(String value) {
            addCriterion("SPEC_FLAG like", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagNotLike(String value) {
            addCriterion("SPEC_FLAG not like", value, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagIn(List<String> values) {
            addCriterion("SPEC_FLAG in", values, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagNotIn(List<String> values) {
            addCriterion("SPEC_FLAG not in", values, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagBetween(String value1, String value2) {
            addCriterion("SPEC_FLAG between", value1, value2, "specFlag");
            return (Criteria) this;
        }

        public Criteria andSpecFlagNotBetween(String value1, String value2) {
            addCriterion("SPEC_FLAG not between", value1, value2, "specFlag");
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

        public Criteria andSpecTypeIdIsNull() {
            addCriterion("SPEC_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdIsNotNull() {
            addCriterion("SPEC_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdEqualTo(Integer value) {
            addCriterion("SPEC_TYPE_ID =", value, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdNotEqualTo(Integer value) {
            addCriterion("SPEC_TYPE_ID <>", value, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdGreaterThan(Integer value) {
            addCriterion("SPEC_TYPE_ID >", value, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPEC_TYPE_ID >=", value, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdLessThan(Integer value) {
            addCriterion("SPEC_TYPE_ID <", value, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SPEC_TYPE_ID <=", value, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdIn(List<Integer> values) {
            addCriterion("SPEC_TYPE_ID in", values, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdNotIn(List<Integer> values) {
            addCriterion("SPEC_TYPE_ID not in", values, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_TYPE_ID between", value1, value2, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_TYPE_ID not between", value1, value2, "specTypeId");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookIsNull() {
            addCriterion("SPEC_EDU_BOOK is null");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookIsNotNull() {
            addCriterion("SPEC_EDU_BOOK is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookEqualTo(String value) {
            addCriterion("SPEC_EDU_BOOK =", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookNotEqualTo(String value) {
            addCriterion("SPEC_EDU_BOOK <>", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookGreaterThan(String value) {
            addCriterion("SPEC_EDU_BOOK >", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_EDU_BOOK >=", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookLessThan(String value) {
            addCriterion("SPEC_EDU_BOOK <", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookLessThanOrEqualTo(String value) {
            addCriterion("SPEC_EDU_BOOK <=", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookLike(String value) {
            addCriterion("SPEC_EDU_BOOK like", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookNotLike(String value) {
            addCriterion("SPEC_EDU_BOOK not like", value, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookIn(List<String> values) {
            addCriterion("SPEC_EDU_BOOK in", values, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookNotIn(List<String> values) {
            addCriterion("SPEC_EDU_BOOK not in", values, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookBetween(String value1, String value2) {
            addCriterion("SPEC_EDU_BOOK between", value1, value2, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecEduBookNotBetween(String value1, String value2) {
            addCriterion("SPEC_EDU_BOOK not between", value1, value2, "specEduBook");
            return (Criteria) this;
        }

        public Criteria andSpecVersionIsNull() {
            addCriterion("SPEC_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andSpecVersionIsNotNull() {
            addCriterion("SPEC_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSpecVersionEqualTo(String value) {
            addCriterion("SPEC_VERSION =", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionNotEqualTo(String value) {
            addCriterion("SPEC_VERSION <>", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionGreaterThan(String value) {
            addCriterion("SPEC_VERSION >", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_VERSION >=", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionLessThan(String value) {
            addCriterion("SPEC_VERSION <", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionLessThanOrEqualTo(String value) {
            addCriterion("SPEC_VERSION <=", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionLike(String value) {
            addCriterion("SPEC_VERSION like", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionNotLike(String value) {
            addCriterion("SPEC_VERSION not like", value, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionIn(List<String> values) {
            addCriterion("SPEC_VERSION in", values, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionNotIn(List<String> values) {
            addCriterion("SPEC_VERSION not in", values, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionBetween(String value1, String value2) {
            addCriterion("SPEC_VERSION between", value1, value2, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecVersionNotBetween(String value1, String value2) {
            addCriterion("SPEC_VERSION not between", value1, value2, "specVersion");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeIsNull() {
            addCriterion("SPEC_AVG_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeIsNotNull() {
            addCriterion("SPEC_AVG_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeEqualTo(Double value) {
            addCriterion("SPEC_AVG_GRADE =", value, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeNotEqualTo(Double value) {
            addCriterion("SPEC_AVG_GRADE <>", value, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeGreaterThan(Double value) {
            addCriterion("SPEC_AVG_GRADE >", value, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("SPEC_AVG_GRADE >=", value, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeLessThan(Double value) {
            addCriterion("SPEC_AVG_GRADE <", value, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeLessThanOrEqualTo(Double value) {
            addCriterion("SPEC_AVG_GRADE <=", value, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeIn(List<Double> values) {
            addCriterion("SPEC_AVG_GRADE in", values, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeNotIn(List<Double> values) {
            addCriterion("SPEC_AVG_GRADE not in", values, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeBetween(Double value1, Double value2) {
            addCriterion("SPEC_AVG_GRADE between", value1, value2, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecAvgGradeNotBetween(Double value1, Double value2) {
            addCriterion("SPEC_AVG_GRADE not between", value1, value2, "specAvgGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeIsNull() {
            addCriterion("SPEC_PRAC_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeIsNotNull() {
            addCriterion("SPEC_PRAC_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeEqualTo(Double value) {
            addCriterion("SPEC_PRAC_GRADE =", value, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeNotEqualTo(Double value) {
            addCriterion("SPEC_PRAC_GRADE <>", value, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeGreaterThan(Double value) {
            addCriterion("SPEC_PRAC_GRADE >", value, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("SPEC_PRAC_GRADE >=", value, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeLessThan(Double value) {
            addCriterion("SPEC_PRAC_GRADE <", value, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeLessThanOrEqualTo(Double value) {
            addCriterion("SPEC_PRAC_GRADE <=", value, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeIn(List<Double> values) {
            addCriterion("SPEC_PRAC_GRADE in", values, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeNotIn(List<Double> values) {
            addCriterion("SPEC_PRAC_GRADE not in", values, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeBetween(Double value1, Double value2) {
            addCriterion("SPEC_PRAC_GRADE between", value1, value2, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecPracGradeNotBetween(Double value1, Double value2) {
            addCriterion("SPEC_PRAC_GRADE not between", value1, value2, "specPracGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeIsNull() {
            addCriterion("SPEC_EXAM_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeIsNotNull() {
            addCriterion("SPEC_EXAM_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeEqualTo(Double value) {
            addCriterion("SPEC_EXAM_GRADE =", value, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeNotEqualTo(Double value) {
            addCriterion("SPEC_EXAM_GRADE <>", value, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeGreaterThan(Double value) {
            addCriterion("SPEC_EXAM_GRADE >", value, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("SPEC_EXAM_GRADE >=", value, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeLessThan(Double value) {
            addCriterion("SPEC_EXAM_GRADE <", value, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeLessThanOrEqualTo(Double value) {
            addCriterion("SPEC_EXAM_GRADE <=", value, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeIn(List<Double> values) {
            addCriterion("SPEC_EXAM_GRADE in", values, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeNotIn(List<Double> values) {
            addCriterion("SPEC_EXAM_GRADE not in", values, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeBetween(Double value1, Double value2) {
            addCriterion("SPEC_EXAM_GRADE between", value1, value2, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecExamGradeNotBetween(Double value1, Double value2) {
            addCriterion("SPEC_EXAM_GRADE not between", value1, value2, "specExamGrade");
            return (Criteria) this;
        }

        public Criteria andSpecStandardIsNull() {
            addCriterion("SPEC_STANDARD is null");
            return (Criteria) this;
        }

        public Criteria andSpecStandardIsNotNull() {
            addCriterion("SPEC_STANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andSpecStandardEqualTo(String value) {
            addCriterion("SPEC_STANDARD =", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardNotEqualTo(String value) {
            addCriterion("SPEC_STANDARD <>", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardGreaterThan(String value) {
            addCriterion("SPEC_STANDARD >", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_STANDARD >=", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardLessThan(String value) {
            addCriterion("SPEC_STANDARD <", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardLessThanOrEqualTo(String value) {
            addCriterion("SPEC_STANDARD <=", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardLike(String value) {
            addCriterion("SPEC_STANDARD like", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardNotLike(String value) {
            addCriterion("SPEC_STANDARD not like", value, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardIn(List<String> values) {
            addCriterion("SPEC_STANDARD in", values, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardNotIn(List<String> values) {
            addCriterion("SPEC_STANDARD not in", values, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardBetween(String value1, String value2) {
            addCriterion("SPEC_STANDARD between", value1, value2, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecStandardNotBetween(String value1, String value2) {
            addCriterion("SPEC_STANDARD not between", value1, value2, "specStandard");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoIsNull() {
            addCriterion("SPEC_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoIsNotNull() {
            addCriterion("SPEC_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoEqualTo(Integer value) {
            addCriterion("SPEC_USER_NO =", value, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoNotEqualTo(Integer value) {
            addCriterion("SPEC_USER_NO <>", value, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoGreaterThan(Integer value) {
            addCriterion("SPEC_USER_NO >", value, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPEC_USER_NO >=", value, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoLessThan(Integer value) {
            addCriterion("SPEC_USER_NO <", value, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("SPEC_USER_NO <=", value, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoIn(List<Integer> values) {
            addCriterion("SPEC_USER_NO in", values, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoNotIn(List<Integer> values) {
            addCriterion("SPEC_USER_NO not in", values, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_USER_NO between", value1, value2, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SPEC_USER_NO not between", value1, value2, "specUserNo");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeIsNull() {
            addCriterion("SPEC_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeIsNotNull() {
            addCriterion("SPEC_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeEqualTo(Date value) {
            addCriterion("SPEC_REGTIME =", value, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeNotEqualTo(Date value) {
            addCriterion("SPEC_REGTIME <>", value, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeGreaterThan(Date value) {
            addCriterion("SPEC_REGTIME >", value, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SPEC_REGTIME >=", value, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeLessThan(Date value) {
            addCriterion("SPEC_REGTIME <", value, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("SPEC_REGTIME <=", value, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeIn(List<Date> values) {
            addCriterion("SPEC_REGTIME in", values, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeNotIn(List<Date> values) {
            addCriterion("SPEC_REGTIME not in", values, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeBetween(Date value1, Date value2) {
            addCriterion("SPEC_REGTIME between", value1, value2, "specRegtime");
            return (Criteria) this;
        }

        public Criteria andSpecRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("SPEC_REGTIME not between", value1, value2, "specRegtime");
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

        public Criteria andSpecCountIsNull() {
            addCriterion("SPEC_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSpecCountIsNotNull() {
            addCriterion("SPEC_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSpecCountEqualTo(Long value) {
            addCriterion("SPEC_COUNT =", value, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountNotEqualTo(Long value) {
            addCriterion("SPEC_COUNT <>", value, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountGreaterThan(Long value) {
            addCriterion("SPEC_COUNT >", value, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountGreaterThanOrEqualTo(Long value) {
            addCriterion("SPEC_COUNT >=", value, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountLessThan(Long value) {
            addCriterion("SPEC_COUNT <", value, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountLessThanOrEqualTo(Long value) {
            addCriterion("SPEC_COUNT <=", value, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountIn(List<Long> values) {
            addCriterion("SPEC_COUNT in", values, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountNotIn(List<Long> values) {
            addCriterion("SPEC_COUNT not in", values, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountBetween(Long value1, Long value2) {
            addCriterion("SPEC_COUNT between", value1, value2, "specCount");
            return (Criteria) this;
        }

        public Criteria andSpecCountNotBetween(Long value1, Long value2) {
            addCriterion("SPEC_COUNT not between", value1, value2, "specCount");
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