package com.chinasofti.cetp.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuNoIsNull() {
            addCriterion("STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andStuNoIsNotNull() {
            addCriterion("STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStuNoEqualTo(Integer value) {
            addCriterion("STU_NO =", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotEqualTo(Integer value) {
            addCriterion("STU_NO <>", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThan(Integer value) {
            addCriterion("STU_NO >", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_NO >=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThan(Integer value) {
            addCriterion("STU_NO <", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("STU_NO <=", value, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoIn(List<Integer> values) {
            addCriterion("STU_NO in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotIn(List<Integer> values) {
            addCriterion("STU_NO not in", values, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoBetween(Integer value1, Integer value2) {
            addCriterion("STU_NO between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_NO not between", value1, value2, "stuNo");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNull() {
            addCriterion("STU_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNotNull() {
            addCriterion("STU_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStuNumEqualTo(String value) {
            addCriterion("STU_NUM =", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotEqualTo(String value) {
            addCriterion("STU_NUM <>", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThan(String value) {
            addCriterion("STU_NUM >", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThanOrEqualTo(String value) {
            addCriterion("STU_NUM >=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThan(String value) {
            addCriterion("STU_NUM <", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThanOrEqualTo(String value) {
            addCriterion("STU_NUM <=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLike(String value) {
            addCriterion("STU_NUM like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotLike(String value) {
            addCriterion("STU_NUM not like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumIn(List<String> values) {
            addCriterion("STU_NUM in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotIn(List<String> values) {
            addCriterion("STU_NUM not in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumBetween(String value1, String value2) {
            addCriterion("STU_NUM between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotBetween(String value1, String value2) {
            addCriterion("STU_NUM not between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuOrgidIsNull() {
            addCriterion("STU_ORGID is null");
            return (Criteria) this;
        }

        public Criteria andStuOrgidIsNotNull() {
            addCriterion("STU_ORGID is not null");
            return (Criteria) this;
        }

        public Criteria andStuOrgidEqualTo(Integer value) {
            addCriterion("STU_ORGID =", value, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidNotEqualTo(Integer value) {
            addCriterion("STU_ORGID <>", value, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidGreaterThan(Integer value) {
            addCriterion("STU_ORGID >", value, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_ORGID >=", value, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidLessThan(Integer value) {
            addCriterion("STU_ORGID <", value, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("STU_ORGID <=", value, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidIn(List<Integer> values) {
            addCriterion("STU_ORGID in", values, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidNotIn(List<Integer> values) {
            addCriterion("STU_ORGID not in", values, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidBetween(Integer value1, Integer value2) {
            addCriterion("STU_ORGID between", value1, value2, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_ORGID not between", value1, value2, "stuOrgid");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("STU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("STU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("STU_NAME =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("STU_NAME <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("STU_NAME >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("STU_NAME >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("STU_NAME <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("STU_NAME <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("STU_NAME like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("STU_NAME not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("STU_NAME in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("STU_NAME not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("STU_NAME between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("STU_NAME not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuUseridIsNull() {
            addCriterion("STU_USERID is null");
            return (Criteria) this;
        }

        public Criteria andStuUseridIsNotNull() {
            addCriterion("STU_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andStuUseridEqualTo(String value) {
            addCriterion("STU_USERID =", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridNotEqualTo(String value) {
            addCriterion("STU_USERID <>", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridGreaterThan(String value) {
            addCriterion("STU_USERID >", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridGreaterThanOrEqualTo(String value) {
            addCriterion("STU_USERID >=", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridLessThan(String value) {
            addCriterion("STU_USERID <", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridLessThanOrEqualTo(String value) {
            addCriterion("STU_USERID <=", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridLike(String value) {
            addCriterion("STU_USERID like", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridNotLike(String value) {
            addCriterion("STU_USERID not like", value, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridIn(List<String> values) {
            addCriterion("STU_USERID in", values, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridNotIn(List<String> values) {
            addCriterion("STU_USERID not in", values, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridBetween(String value1, String value2) {
            addCriterion("STU_USERID between", value1, value2, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuUseridNotBetween(String value1, String value2) {
            addCriterion("STU_USERID not between", value1, value2, "stuUserid");
            return (Criteria) this;
        }

        public Criteria andStuPwdIsNull() {
            addCriterion("STU_PWD is null");
            return (Criteria) this;
        }

        public Criteria andStuPwdIsNotNull() {
            addCriterion("STU_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andStuPwdEqualTo(String value) {
            addCriterion("STU_PWD =", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotEqualTo(String value) {
            addCriterion("STU_PWD <>", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdGreaterThan(String value) {
            addCriterion("STU_PWD >", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdGreaterThanOrEqualTo(String value) {
            addCriterion("STU_PWD >=", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLessThan(String value) {
            addCriterion("STU_PWD <", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLessThanOrEqualTo(String value) {
            addCriterion("STU_PWD <=", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdLike(String value) {
            addCriterion("STU_PWD like", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotLike(String value) {
            addCriterion("STU_PWD not like", value, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdIn(List<String> values) {
            addCriterion("STU_PWD in", values, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotIn(List<String> values) {
            addCriterion("STU_PWD not in", values, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdBetween(String value1, String value2) {
            addCriterion("STU_PWD between", value1, value2, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuPwdNotBetween(String value1, String value2) {
            addCriterion("STU_PWD not between", value1, value2, "stuPwd");
            return (Criteria) this;
        }

        public Criteria andStuNicknameIsNull() {
            addCriterion("STU_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andStuNicknameIsNotNull() {
            addCriterion("STU_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuNicknameEqualTo(String value) {
            addCriterion("STU_NICKNAME =", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameNotEqualTo(String value) {
            addCriterion("STU_NICKNAME <>", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameGreaterThan(String value) {
            addCriterion("STU_NICKNAME >", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("STU_NICKNAME >=", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameLessThan(String value) {
            addCriterion("STU_NICKNAME <", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameLessThanOrEqualTo(String value) {
            addCriterion("STU_NICKNAME <=", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameLike(String value) {
            addCriterion("STU_NICKNAME like", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameNotLike(String value) {
            addCriterion("STU_NICKNAME not like", value, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameIn(List<String> values) {
            addCriterion("STU_NICKNAME in", values, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameNotIn(List<String> values) {
            addCriterion("STU_NICKNAME not in", values, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameBetween(String value1, String value2) {
            addCriterion("STU_NICKNAME between", value1, value2, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuNicknameNotBetween(String value1, String value2) {
            addCriterion("STU_NICKNAME not between", value1, value2, "stuNickname");
            return (Criteria) this;
        }

        public Criteria andStuMobileIsNull() {
            addCriterion("STU_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andStuMobileIsNotNull() {
            addCriterion("STU_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andStuMobileEqualTo(String value) {
            addCriterion("STU_MOBILE =", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotEqualTo(String value) {
            addCriterion("STU_MOBILE <>", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileGreaterThan(String value) {
            addCriterion("STU_MOBILE >", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileGreaterThanOrEqualTo(String value) {
            addCriterion("STU_MOBILE >=", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileLessThan(String value) {
            addCriterion("STU_MOBILE <", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileLessThanOrEqualTo(String value) {
            addCriterion("STU_MOBILE <=", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileLike(String value) {
            addCriterion("STU_MOBILE like", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotLike(String value) {
            addCriterion("STU_MOBILE not like", value, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileIn(List<String> values) {
            addCriterion("STU_MOBILE in", values, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotIn(List<String> values) {
            addCriterion("STU_MOBILE not in", values, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileBetween(String value1, String value2) {
            addCriterion("STU_MOBILE between", value1, value2, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuMobileNotBetween(String value1, String value2) {
            addCriterion("STU_MOBILE not between", value1, value2, "stuMobile");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNull() {
            addCriterion("STU_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIsNotNull() {
            addCriterion("STU_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhoneEqualTo(String value) {
            addCriterion("STU_PHONE =", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotEqualTo(String value) {
            addCriterion("STU_PHONE <>", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThan(String value) {
            addCriterion("STU_PHONE >", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("STU_PHONE >=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThan(String value) {
            addCriterion("STU_PHONE <", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLessThanOrEqualTo(String value) {
            addCriterion("STU_PHONE <=", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneLike(String value) {
            addCriterion("STU_PHONE like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotLike(String value) {
            addCriterion("STU_PHONE not like", value, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneIn(List<String> values) {
            addCriterion("STU_PHONE in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotIn(List<String> values) {
            addCriterion("STU_PHONE not in", values, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneBetween(String value1, String value2) {
            addCriterion("STU_PHONE between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuPhoneNotBetween(String value1, String value2) {
            addCriterion("STU_PHONE not between", value1, value2, "stuPhone");
            return (Criteria) this;
        }

        public Criteria andStuMailIsNull() {
            addCriterion("STU_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andStuMailIsNotNull() {
            addCriterion("STU_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andStuMailEqualTo(String value) {
            addCriterion("STU_MAIL =", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotEqualTo(String value) {
            addCriterion("STU_MAIL <>", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailGreaterThan(String value) {
            addCriterion("STU_MAIL >", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailGreaterThanOrEqualTo(String value) {
            addCriterion("STU_MAIL >=", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailLessThan(String value) {
            addCriterion("STU_MAIL <", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailLessThanOrEqualTo(String value) {
            addCriterion("STU_MAIL <=", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailLike(String value) {
            addCriterion("STU_MAIL like", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotLike(String value) {
            addCriterion("STU_MAIL not like", value, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailIn(List<String> values) {
            addCriterion("STU_MAIL in", values, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotIn(List<String> values) {
            addCriterion("STU_MAIL not in", values, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailBetween(String value1, String value2) {
            addCriterion("STU_MAIL between", value1, value2, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuMailNotBetween(String value1, String value2) {
            addCriterion("STU_MAIL not between", value1, value2, "stuMail");
            return (Criteria) this;
        }

        public Criteria andStuQqIsNull() {
            addCriterion("STU_QQ is null");
            return (Criteria) this;
        }

        public Criteria andStuQqIsNotNull() {
            addCriterion("STU_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andStuQqEqualTo(String value) {
            addCriterion("STU_QQ =", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotEqualTo(String value) {
            addCriterion("STU_QQ <>", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqGreaterThan(String value) {
            addCriterion("STU_QQ >", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqGreaterThanOrEqualTo(String value) {
            addCriterion("STU_QQ >=", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqLessThan(String value) {
            addCriterion("STU_QQ <", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqLessThanOrEqualTo(String value) {
            addCriterion("STU_QQ <=", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqLike(String value) {
            addCriterion("STU_QQ like", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotLike(String value) {
            addCriterion("STU_QQ not like", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqIn(List<String> values) {
            addCriterion("STU_QQ in", values, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotIn(List<String> values) {
            addCriterion("STU_QQ not in", values, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqBetween(String value1, String value2) {
            addCriterion("STU_QQ between", value1, value2, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotBetween(String value1, String value2) {
            addCriterion("STU_QQ not between", value1, value2, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqIsNull() {
            addCriterion("STU_GRP_QQ is null");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqIsNotNull() {
            addCriterion("STU_GRP_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqEqualTo(String value) {
            addCriterion("STU_GRP_QQ =", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqNotEqualTo(String value) {
            addCriterion("STU_GRP_QQ <>", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqGreaterThan(String value) {
            addCriterion("STU_GRP_QQ >", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqGreaterThanOrEqualTo(String value) {
            addCriterion("STU_GRP_QQ >=", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqLessThan(String value) {
            addCriterion("STU_GRP_QQ <", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqLessThanOrEqualTo(String value) {
            addCriterion("STU_GRP_QQ <=", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqLike(String value) {
            addCriterion("STU_GRP_QQ like", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqNotLike(String value) {
            addCriterion("STU_GRP_QQ not like", value, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqIn(List<String> values) {
            addCriterion("STU_GRP_QQ in", values, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqNotIn(List<String> values) {
            addCriterion("STU_GRP_QQ not in", values, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqBetween(String value1, String value2) {
            addCriterion("STU_GRP_QQ between", value1, value2, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuGrpQqNotBetween(String value1, String value2) {
            addCriterion("STU_GRP_QQ not between", value1, value2, "stuGrpQq");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("STU_SEX is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("STU_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("STU_SEX =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("STU_SEX <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("STU_SEX >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("STU_SEX >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("STU_SEX <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("STU_SEX <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("STU_SEX like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("STU_SEX not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("STU_SEX in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("STU_SEX not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("STU_SEX between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("STU_SEX not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuTitleIsNull() {
            addCriterion("STU_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andStuTitleIsNotNull() {
            addCriterion("STU_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andStuTitleEqualTo(String value) {
            addCriterion("STU_TITLE =", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleNotEqualTo(String value) {
            addCriterion("STU_TITLE <>", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleGreaterThan(String value) {
            addCriterion("STU_TITLE >", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("STU_TITLE >=", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleLessThan(String value) {
            addCriterion("STU_TITLE <", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleLessThanOrEqualTo(String value) {
            addCriterion("STU_TITLE <=", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleLike(String value) {
            addCriterion("STU_TITLE like", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleNotLike(String value) {
            addCriterion("STU_TITLE not like", value, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleIn(List<String> values) {
            addCriterion("STU_TITLE in", values, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleNotIn(List<String> values) {
            addCriterion("STU_TITLE not in", values, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleBetween(String value1, String value2) {
            addCriterion("STU_TITLE between", value1, value2, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuTitleNotBetween(String value1, String value2) {
            addCriterion("STU_TITLE not between", value1, value2, "stuTitle");
            return (Criteria) this;
        }

        public Criteria andStuBirthIsNull() {
            addCriterion("STU_BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andStuBirthIsNotNull() {
            addCriterion("STU_BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andStuBirthEqualTo(Date value) {
            addCriterionForJDBCDate("STU_BIRTH =", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("STU_BIRTH <>", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("STU_BIRTH >", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_BIRTH >=", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthLessThan(Date value) {
            addCriterionForJDBCDate("STU_BIRTH <", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_BIRTH <=", value, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthIn(List<Date> values) {
            addCriterionForJDBCDate("STU_BIRTH in", values, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("STU_BIRTH not in", values, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_BIRTH between", value1, value2, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_BIRTH not between", value1, value2, "stuBirth");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNull() {
            addCriterion("STU_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNotNull() {
            addCriterion("STU_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andStuAddressEqualTo(String value) {
            addCriterion("STU_ADDRESS =", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotEqualTo(String value) {
            addCriterion("STU_ADDRESS <>", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThan(String value) {
            addCriterion("STU_ADDRESS >", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("STU_ADDRESS >=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThan(String value) {
            addCriterion("STU_ADDRESS <", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThanOrEqualTo(String value) {
            addCriterion("STU_ADDRESS <=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLike(String value) {
            addCriterion("STU_ADDRESS like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotLike(String value) {
            addCriterion("STU_ADDRESS not like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressIn(List<String> values) {
            addCriterion("STU_ADDRESS in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotIn(List<String> values) {
            addCriterion("STU_ADDRESS not in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressBetween(String value1, String value2) {
            addCriterion("STU_ADDRESS between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotBetween(String value1, String value2) {
            addCriterion("STU_ADDRESS not between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeIsNull() {
            addCriterion("STU_POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeIsNotNull() {
            addCriterion("STU_POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeEqualTo(String value) {
            addCriterion("STU_POSTCODE =", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeNotEqualTo(String value) {
            addCriterion("STU_POSTCODE <>", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeGreaterThan(String value) {
            addCriterion("STU_POSTCODE >", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("STU_POSTCODE >=", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeLessThan(String value) {
            addCriterion("STU_POSTCODE <", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeLessThanOrEqualTo(String value) {
            addCriterion("STU_POSTCODE <=", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeLike(String value) {
            addCriterion("STU_POSTCODE like", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeNotLike(String value) {
            addCriterion("STU_POSTCODE not like", value, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeIn(List<String> values) {
            addCriterion("STU_POSTCODE in", values, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeNotIn(List<String> values) {
            addCriterion("STU_POSTCODE not in", values, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeBetween(String value1, String value2) {
            addCriterion("STU_POSTCODE between", value1, value2, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuPostcodeNotBetween(String value1, String value2) {
            addCriterion("STU_POSTCODE not between", value1, value2, "stuPostcode");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderIsNull() {
            addCriterion("STU_IS_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderIsNotNull() {
            addCriterion("STU_IS_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderEqualTo(String value) {
            addCriterion("STU_IS_LEADER =", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderNotEqualTo(String value) {
            addCriterion("STU_IS_LEADER <>", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderGreaterThan(String value) {
            addCriterion("STU_IS_LEADER >", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("STU_IS_LEADER >=", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderLessThan(String value) {
            addCriterion("STU_IS_LEADER <", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderLessThanOrEqualTo(String value) {
            addCriterion("STU_IS_LEADER <=", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderLike(String value) {
            addCriterion("STU_IS_LEADER like", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderNotLike(String value) {
            addCriterion("STU_IS_LEADER not like", value, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderIn(List<String> values) {
            addCriterion("STU_IS_LEADER in", values, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderNotIn(List<String> values) {
            addCriterion("STU_IS_LEADER not in", values, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderBetween(String value1, String value2) {
            addCriterion("STU_IS_LEADER between", value1, value2, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuIsLeaderNotBetween(String value1, String value2) {
            addCriterion("STU_IS_LEADER not between", value1, value2, "stuIsLeader");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelIsNull() {
            addCriterion("STU_EDU_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelIsNotNull() {
            addCriterion("STU_EDU_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelEqualTo(String value) {
            addCriterion("STU_EDU_LEVEL =", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelNotEqualTo(String value) {
            addCriterion("STU_EDU_LEVEL <>", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelGreaterThan(String value) {
            addCriterion("STU_EDU_LEVEL >", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelGreaterThanOrEqualTo(String value) {
            addCriterion("STU_EDU_LEVEL >=", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelLessThan(String value) {
            addCriterion("STU_EDU_LEVEL <", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelLessThanOrEqualTo(String value) {
            addCriterion("STU_EDU_LEVEL <=", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelLike(String value) {
            addCriterion("STU_EDU_LEVEL like", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelNotLike(String value) {
            addCriterion("STU_EDU_LEVEL not like", value, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelIn(List<String> values) {
            addCriterion("STU_EDU_LEVEL in", values, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelNotIn(List<String> values) {
            addCriterion("STU_EDU_LEVEL not in", values, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelBetween(String value1, String value2) {
            addCriterion("STU_EDU_LEVEL between", value1, value2, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuEduLevelNotBetween(String value1, String value2) {
            addCriterion("STU_EDU_LEVEL not between", value1, value2, "stuEduLevel");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIsNull() {
            addCriterion("STU_IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIsNotNull() {
            addCriterion("STU_IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdcardEqualTo(String value) {
            addCriterion("STU_IDCARD =", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotEqualTo(String value) {
            addCriterion("STU_IDCARD <>", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardGreaterThan(String value) {
            addCriterion("STU_IDCARD >", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("STU_IDCARD >=", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLessThan(String value) {
            addCriterion("STU_IDCARD <", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLessThanOrEqualTo(String value) {
            addCriterion("STU_IDCARD <=", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardLike(String value) {
            addCriterion("STU_IDCARD like", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotLike(String value) {
            addCriterion("STU_IDCARD not like", value, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardIn(List<String> values) {
            addCriterion("STU_IDCARD in", values, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotIn(List<String> values) {
            addCriterion("STU_IDCARD not in", values, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardBetween(String value1, String value2) {
            addCriterion("STU_IDCARD between", value1, value2, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuIdcardNotBetween(String value1, String value2) {
            addCriterion("STU_IDCARD not between", value1, value2, "stuIdcard");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNull() {
            addCriterion("STU_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andStuMajorIsNotNull() {
            addCriterion("STU_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andStuMajorEqualTo(String value) {
            addCriterion("STU_MAJOR =", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotEqualTo(String value) {
            addCriterion("STU_MAJOR <>", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThan(String value) {
            addCriterion("STU_MAJOR >", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorGreaterThanOrEqualTo(String value) {
            addCriterion("STU_MAJOR >=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThan(String value) {
            addCriterion("STU_MAJOR <", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLessThanOrEqualTo(String value) {
            addCriterion("STU_MAJOR <=", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorLike(String value) {
            addCriterion("STU_MAJOR like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotLike(String value) {
            addCriterion("STU_MAJOR not like", value, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorIn(List<String> values) {
            addCriterion("STU_MAJOR in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotIn(List<String> values) {
            addCriterion("STU_MAJOR not in", values, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorBetween(String value1, String value2) {
            addCriterion("STU_MAJOR between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuMajorNotBetween(String value1, String value2) {
            addCriterion("STU_MAJOR not between", value1, value2, "stuMajor");
            return (Criteria) this;
        }

        public Criteria andStuClassIdIsNull() {
            addCriterion("STU_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIdIsNotNull() {
            addCriterion("STU_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassIdEqualTo(Integer value) {
            addCriterion("STU_CLASS_ID =", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdNotEqualTo(Integer value) {
            addCriterion("STU_CLASS_ID <>", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdGreaterThan(Integer value) {
            addCriterion("STU_CLASS_ID >", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_CLASS_ID >=", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdLessThan(Integer value) {
            addCriterion("STU_CLASS_ID <", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("STU_CLASS_ID <=", value, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdIn(List<Integer> values) {
            addCriterion("STU_CLASS_ID in", values, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdNotIn(List<Integer> values) {
            addCriterion("STU_CLASS_ID not in", values, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdBetween(Integer value1, Integer value2) {
            addCriterion("STU_CLASS_ID between", value1, value2, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andStuClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_CLASS_ID not between", value1, value2, "stuClassId");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdIsNull() {
            addCriterion("STU_SCHOOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdIsNotNull() {
            addCriterion("STU_SCHOOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdEqualTo(Integer value) {
            addCriterion("STU_SCHOOL_ID =", value, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdNotEqualTo(Integer value) {
            addCriterion("STU_SCHOOL_ID <>", value, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdGreaterThan(Integer value) {
            addCriterion("STU_SCHOOL_ID >", value, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_SCHOOL_ID >=", value, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdLessThan(Integer value) {
            addCriterion("STU_SCHOOL_ID <", value, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("STU_SCHOOL_ID <=", value, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdIn(List<Integer> values) {
            addCriterion("STU_SCHOOL_ID in", values, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdNotIn(List<Integer> values) {
            addCriterion("STU_SCHOOL_ID not in", values, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("STU_SCHOOL_ID between", value1, value2, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_SCHOOL_ID not between", value1, value2, "stuSchoolId");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNull() {
            addCriterion("STU_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNotNull() {
            addCriterion("STU_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeEqualTo(Integer value) {
            addCriterion("STU_GRADE =", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotEqualTo(Integer value) {
            addCriterion("STU_GRADE <>", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThan(Integer value) {
            addCriterion("STU_GRADE >", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_GRADE >=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThan(Integer value) {
            addCriterion("STU_GRADE <", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThanOrEqualTo(Integer value) {
            addCriterion("STU_GRADE <=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeIn(List<Integer> values) {
            addCriterion("STU_GRADE in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotIn(List<Integer> values) {
            addCriterion("STU_GRADE not in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeBetween(Integer value1, Integer value2) {
            addCriterion("STU_GRADE between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_GRADE not between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuPoliticIsNull() {
            addCriterion("STU_POLITIC is null");
            return (Criteria) this;
        }

        public Criteria andStuPoliticIsNotNull() {
            addCriterion("STU_POLITIC is not null");
            return (Criteria) this;
        }

        public Criteria andStuPoliticEqualTo(String value) {
            addCriterion("STU_POLITIC =", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticNotEqualTo(String value) {
            addCriterion("STU_POLITIC <>", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticGreaterThan(String value) {
            addCriterion("STU_POLITIC >", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticGreaterThanOrEqualTo(String value) {
            addCriterion("STU_POLITIC >=", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticLessThan(String value) {
            addCriterion("STU_POLITIC <", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticLessThanOrEqualTo(String value) {
            addCriterion("STU_POLITIC <=", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticLike(String value) {
            addCriterion("STU_POLITIC like", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticNotLike(String value) {
            addCriterion("STU_POLITIC not like", value, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticIn(List<String> values) {
            addCriterion("STU_POLITIC in", values, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticNotIn(List<String> values) {
            addCriterion("STU_POLITIC not in", values, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticBetween(String value1, String value2) {
            addCriterion("STU_POLITIC between", value1, value2, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuPoliticNotBetween(String value1, String value2) {
            addCriterion("STU_POLITIC not between", value1, value2, "stuPolitic");
            return (Criteria) this;
        }

        public Criteria andStuLinkIsNull() {
            addCriterion("STU_LINK is null");
            return (Criteria) this;
        }

        public Criteria andStuLinkIsNotNull() {
            addCriterion("STU_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andStuLinkEqualTo(String value) {
            addCriterion("STU_LINK =", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkNotEqualTo(String value) {
            addCriterion("STU_LINK <>", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkGreaterThan(String value) {
            addCriterion("STU_LINK >", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkGreaterThanOrEqualTo(String value) {
            addCriterion("STU_LINK >=", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkLessThan(String value) {
            addCriterion("STU_LINK <", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkLessThanOrEqualTo(String value) {
            addCriterion("STU_LINK <=", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkLike(String value) {
            addCriterion("STU_LINK like", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkNotLike(String value) {
            addCriterion("STU_LINK not like", value, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkIn(List<String> values) {
            addCriterion("STU_LINK in", values, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkNotIn(List<String> values) {
            addCriterion("STU_LINK not in", values, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkBetween(String value1, String value2) {
            addCriterion("STU_LINK between", value1, value2, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkNotBetween(String value1, String value2) {
            addCriterion("STU_LINK not between", value1, value2, "stuLink");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelIsNull() {
            addCriterion("STU_LINK_TEL is null");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelIsNotNull() {
            addCriterion("STU_LINK_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelEqualTo(String value) {
            addCriterion("STU_LINK_TEL =", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelNotEqualTo(String value) {
            addCriterion("STU_LINK_TEL <>", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelGreaterThan(String value) {
            addCriterion("STU_LINK_TEL >", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelGreaterThanOrEqualTo(String value) {
            addCriterion("STU_LINK_TEL >=", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelLessThan(String value) {
            addCriterion("STU_LINK_TEL <", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelLessThanOrEqualTo(String value) {
            addCriterion("STU_LINK_TEL <=", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelLike(String value) {
            addCriterion("STU_LINK_TEL like", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelNotLike(String value) {
            addCriterion("STU_LINK_TEL not like", value, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelIn(List<String> values) {
            addCriterion("STU_LINK_TEL in", values, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelNotIn(List<String> values) {
            addCriterion("STU_LINK_TEL not in", values, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelBetween(String value1, String value2) {
            addCriterion("STU_LINK_TEL between", value1, value2, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuLinkTelNotBetween(String value1, String value2) {
            addCriterion("STU_LINK_TEL not between", value1, value2, "stuLinkTel");
            return (Criteria) this;
        }

        public Criteria andStuEnrolIsNull() {
            addCriterion("STU_ENROL is null");
            return (Criteria) this;
        }

        public Criteria andStuEnrolIsNotNull() {
            addCriterion("STU_ENROL is not null");
            return (Criteria) this;
        }

        public Criteria andStuEnrolEqualTo(Date value) {
            addCriterionForJDBCDate("STU_ENROL =", value, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolNotEqualTo(Date value) {
            addCriterionForJDBCDate("STU_ENROL <>", value, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolGreaterThan(Date value) {
            addCriterionForJDBCDate("STU_ENROL >", value, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_ENROL >=", value, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolLessThan(Date value) {
            addCriterionForJDBCDate("STU_ENROL <", value, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_ENROL <=", value, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolIn(List<Date> values) {
            addCriterionForJDBCDate("STU_ENROL in", values, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolNotIn(List<Date> values) {
            addCriterionForJDBCDate("STU_ENROL not in", values, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_ENROL between", value1, value2, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuEnrolNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_ENROL not between", value1, value2, "stuEnrol");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateIsNull() {
            addCriterion("STU_GRADEUATE is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateIsNotNull() {
            addCriterion("STU_GRADEUATE is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateEqualTo(Date value) {
            addCriterionForJDBCDate("STU_GRADEUATE =", value, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateNotEqualTo(Date value) {
            addCriterionForJDBCDate("STU_GRADEUATE <>", value, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateGreaterThan(Date value) {
            addCriterionForJDBCDate("STU_GRADEUATE >", value, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_GRADEUATE >=", value, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateLessThan(Date value) {
            addCriterionForJDBCDate("STU_GRADEUATE <", value, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_GRADEUATE <=", value, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateIn(List<Date> values) {
            addCriterionForJDBCDate("STU_GRADEUATE in", values, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateNotIn(List<Date> values) {
            addCriterionForJDBCDate("STU_GRADEUATE not in", values, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_GRADEUATE between", value1, value2, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuGradeuateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_GRADEUATE not between", value1, value2, "stuGradeuate");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseIsNull() {
            addCriterion("STU_JOIN_BASE is null");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseIsNotNull() {
            addCriterion("STU_JOIN_BASE is not null");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseEqualTo(Date value) {
            addCriterionForJDBCDate("STU_JOIN_BASE =", value, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseNotEqualTo(Date value) {
            addCriterionForJDBCDate("STU_JOIN_BASE <>", value, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseGreaterThan(Date value) {
            addCriterionForJDBCDate("STU_JOIN_BASE >", value, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_JOIN_BASE >=", value, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseLessThan(Date value) {
            addCriterionForJDBCDate("STU_JOIN_BASE <", value, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_JOIN_BASE <=", value, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseIn(List<Date> values) {
            addCriterionForJDBCDate("STU_JOIN_BASE in", values, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseNotIn(List<Date> values) {
            addCriterionForJDBCDate("STU_JOIN_BASE not in", values, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_JOIN_BASE between", value1, value2, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuJoinBaseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_JOIN_BASE not between", value1, value2, "stuJoinBase");
            return (Criteria) this;
        }

        public Criteria andStuCycleIsNull() {
            addCriterion("STU_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andStuCycleIsNotNull() {
            addCriterion("STU_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andStuCycleEqualTo(String value) {
            addCriterion("STU_CYCLE =", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleNotEqualTo(String value) {
            addCriterion("STU_CYCLE <>", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleGreaterThan(String value) {
            addCriterion("STU_CYCLE >", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleGreaterThanOrEqualTo(String value) {
            addCriterion("STU_CYCLE >=", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleLessThan(String value) {
            addCriterion("STU_CYCLE <", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleLessThanOrEqualTo(String value) {
            addCriterion("STU_CYCLE <=", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleLike(String value) {
            addCriterion("STU_CYCLE like", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleNotLike(String value) {
            addCriterion("STU_CYCLE not like", value, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleIn(List<String> values) {
            addCriterion("STU_CYCLE in", values, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleNotIn(List<String> values) {
            addCriterion("STU_CYCLE not in", values, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleBetween(String value1, String value2) {
            addCriterion("STU_CYCLE between", value1, value2, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuCycleNotBetween(String value1, String value2) {
            addCriterion("STU_CYCLE not between", value1, value2, "stuCycle");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardIsNull() {
            addCriterion("STU_TIME_CARD is null");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardIsNotNull() {
            addCriterion("STU_TIME_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardEqualTo(String value) {
            addCriterion("STU_TIME_CARD =", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardNotEqualTo(String value) {
            addCriterion("STU_TIME_CARD <>", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardGreaterThan(String value) {
            addCriterion("STU_TIME_CARD >", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardGreaterThanOrEqualTo(String value) {
            addCriterion("STU_TIME_CARD >=", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardLessThan(String value) {
            addCriterion("STU_TIME_CARD <", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardLessThanOrEqualTo(String value) {
            addCriterion("STU_TIME_CARD <=", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardLike(String value) {
            addCriterion("STU_TIME_CARD like", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardNotLike(String value) {
            addCriterion("STU_TIME_CARD not like", value, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardIn(List<String> values) {
            addCriterion("STU_TIME_CARD in", values, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardNotIn(List<String> values) {
            addCriterion("STU_TIME_CARD not in", values, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardBetween(String value1, String value2) {
            addCriterion("STU_TIME_CARD between", value1, value2, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTimeCardNotBetween(String value1, String value2) {
            addCriterion("STU_TIME_CARD not between", value1, value2, "stuTimeCard");
            return (Criteria) this;
        }

        public Criteria andStuTypeIsNull() {
            addCriterion("STU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStuTypeIsNotNull() {
            addCriterion("STU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStuTypeEqualTo(String value) {
            addCriterion("STU_TYPE =", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeNotEqualTo(String value) {
            addCriterion("STU_TYPE <>", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeGreaterThan(String value) {
            addCriterion("STU_TYPE >", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STU_TYPE >=", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeLessThan(String value) {
            addCriterion("STU_TYPE <", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeLessThanOrEqualTo(String value) {
            addCriterion("STU_TYPE <=", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeLike(String value) {
            addCriterion("STU_TYPE like", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeNotLike(String value) {
            addCriterion("STU_TYPE not like", value, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeIn(List<String> values) {
            addCriterion("STU_TYPE in", values, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeNotIn(List<String> values) {
            addCriterion("STU_TYPE not in", values, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeBetween(String value1, String value2) {
            addCriterion("STU_TYPE between", value1, value2, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuTypeNotBetween(String value1, String value2) {
            addCriterion("STU_TYPE not between", value1, value2, "stuType");
            return (Criteria) this;
        }

        public Criteria andStuMarkIsNull() {
            addCriterion("STU_MARK is null");
            return (Criteria) this;
        }

        public Criteria andStuMarkIsNotNull() {
            addCriterion("STU_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andStuMarkEqualTo(String value) {
            addCriterion("STU_MARK =", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkNotEqualTo(String value) {
            addCriterion("STU_MARK <>", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkGreaterThan(String value) {
            addCriterion("STU_MARK >", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkGreaterThanOrEqualTo(String value) {
            addCriterion("STU_MARK >=", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkLessThan(String value) {
            addCriterion("STU_MARK <", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkLessThanOrEqualTo(String value) {
            addCriterion("STU_MARK <=", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkLike(String value) {
            addCriterion("STU_MARK like", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkNotLike(String value) {
            addCriterion("STU_MARK not like", value, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkIn(List<String> values) {
            addCriterion("STU_MARK in", values, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkNotIn(List<String> values) {
            addCriterion("STU_MARK not in", values, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkBetween(String value1, String value2) {
            addCriterion("STU_MARK between", value1, value2, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuMarkNotBetween(String value1, String value2) {
            addCriterion("STU_MARK not between", value1, value2, "stuMark");
            return (Criteria) this;
        }

        public Criteria andStuUserNoIsNull() {
            addCriterion("STU_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andStuUserNoIsNotNull() {
            addCriterion("STU_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStuUserNoEqualTo(Integer value) {
            addCriterion("STU_USER_NO =", value, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoNotEqualTo(Integer value) {
            addCriterion("STU_USER_NO <>", value, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoGreaterThan(Integer value) {
            addCriterion("STU_USER_NO >", value, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_USER_NO >=", value, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoLessThan(Integer value) {
            addCriterion("STU_USER_NO <", value, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("STU_USER_NO <=", value, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoIn(List<Integer> values) {
            addCriterion("STU_USER_NO in", values, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoNotIn(List<Integer> values) {
            addCriterion("STU_USER_NO not in", values, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoBetween(Integer value1, Integer value2) {
            addCriterion("STU_USER_NO between", value1, value2, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_USER_NO not between", value1, value2, "stuUserNo");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeIsNull() {
            addCriterion("STU_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeIsNotNull() {
            addCriterion("STU_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeEqualTo(Date value) {
            addCriterion("STU_REGTIME =", value, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeNotEqualTo(Date value) {
            addCriterion("STU_REGTIME <>", value, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeGreaterThan(Date value) {
            addCriterion("STU_REGTIME >", value, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STU_REGTIME >=", value, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeLessThan(Date value) {
            addCriterion("STU_REGTIME <", value, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("STU_REGTIME <=", value, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeIn(List<Date> values) {
            addCriterion("STU_REGTIME in", values, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeNotIn(List<Date> values) {
            addCriterion("STU_REGTIME not in", values, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeBetween(Date value1, Date value2) {
            addCriterion("STU_REGTIME between", value1, value2, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("STU_REGTIME not between", value1, value2, "stuRegtime");
            return (Criteria) this;
        }

        public Criteria andStuLastloginIsNull() {
            addCriterion("STU_LASTLOGIN is null");
            return (Criteria) this;
        }

        public Criteria andStuLastloginIsNotNull() {
            addCriterion("STU_LASTLOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andStuLastloginEqualTo(Date value) {
            addCriterion("STU_LASTLOGIN =", value, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginNotEqualTo(Date value) {
            addCriterion("STU_LASTLOGIN <>", value, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginGreaterThan(Date value) {
            addCriterion("STU_LASTLOGIN >", value, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("STU_LASTLOGIN >=", value, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginLessThan(Date value) {
            addCriterion("STU_LASTLOGIN <", value, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginLessThanOrEqualTo(Date value) {
            addCriterion("STU_LASTLOGIN <=", value, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginIn(List<Date> values) {
            addCriterion("STU_LASTLOGIN in", values, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginNotIn(List<Date> values) {
            addCriterion("STU_LASTLOGIN not in", values, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginBetween(Date value1, Date value2) {
            addCriterion("STU_LASTLOGIN between", value1, value2, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuLastloginNotBetween(Date value1, Date value2) {
            addCriterion("STU_LASTLOGIN not between", value1, value2, "stuLastlogin");
            return (Criteria) this;
        }

        public Criteria andStuScoreIsNull() {
            addCriterion("STU_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andStuScoreIsNotNull() {
            addCriterion("STU_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andStuScoreEqualTo(Integer value) {
            addCriterion("STU_SCORE =", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotEqualTo(Integer value) {
            addCriterion("STU_SCORE <>", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreGreaterThan(Integer value) {
            addCriterion("STU_SCORE >", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_SCORE >=", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreLessThan(Integer value) {
            addCriterion("STU_SCORE <", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreLessThanOrEqualTo(Integer value) {
            addCriterion("STU_SCORE <=", value, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreIn(List<Integer> values) {
            addCriterion("STU_SCORE in", values, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotIn(List<Integer> values) {
            addCriterion("STU_SCORE not in", values, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreBetween(Integer value1, Integer value2) {
            addCriterion("STU_SCORE between", value1, value2, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_SCORE not between", value1, value2, "stuScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreIsNull() {
            addCriterion("STU_HISTORY_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreIsNotNull() {
            addCriterion("STU_HISTORY_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreEqualTo(Integer value) {
            addCriterion("STU_HISTORY_SCORE =", value, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreNotEqualTo(Integer value) {
            addCriterion("STU_HISTORY_SCORE <>", value, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreGreaterThan(Integer value) {
            addCriterion("STU_HISTORY_SCORE >", value, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_HISTORY_SCORE >=", value, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreLessThan(Integer value) {
            addCriterion("STU_HISTORY_SCORE <", value, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreLessThanOrEqualTo(Integer value) {
            addCriterion("STU_HISTORY_SCORE <=", value, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreIn(List<Integer> values) {
            addCriterion("STU_HISTORY_SCORE in", values, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreNotIn(List<Integer> values) {
            addCriterion("STU_HISTORY_SCORE not in", values, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreBetween(Integer value1, Integer value2) {
            addCriterion("STU_HISTORY_SCORE between", value1, value2, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuHistoryScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_HISTORY_SCORE not between", value1, value2, "stuHistoryScore");
            return (Criteria) this;
        }

        public Criteria andStuCoinIsNull() {
            addCriterion("STU_COIN is null");
            return (Criteria) this;
        }

        public Criteria andStuCoinIsNotNull() {
            addCriterion("STU_COIN is not null");
            return (Criteria) this;
        }

        public Criteria andStuCoinEqualTo(Integer value) {
            addCriterion("STU_COIN =", value, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinNotEqualTo(Integer value) {
            addCriterion("STU_COIN <>", value, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinGreaterThan(Integer value) {
            addCriterion("STU_COIN >", value, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_COIN >=", value, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinLessThan(Integer value) {
            addCriterion("STU_COIN <", value, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinLessThanOrEqualTo(Integer value) {
            addCriterion("STU_COIN <=", value, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinIn(List<Integer> values) {
            addCriterion("STU_COIN in", values, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinNotIn(List<Integer> values) {
            addCriterion("STU_COIN not in", values, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinBetween(Integer value1, Integer value2) {
            addCriterion("STU_COIN between", value1, value2, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_COIN not between", value1, value2, "stuCoin");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgIsNull() {
            addCriterion("STU_MSG_CFG is null");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgIsNotNull() {
            addCriterion("STU_MSG_CFG is not null");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgEqualTo(String value) {
            addCriterion("STU_MSG_CFG =", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgNotEqualTo(String value) {
            addCriterion("STU_MSG_CFG <>", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgGreaterThan(String value) {
            addCriterion("STU_MSG_CFG >", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgGreaterThanOrEqualTo(String value) {
            addCriterion("STU_MSG_CFG >=", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgLessThan(String value) {
            addCriterion("STU_MSG_CFG <", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgLessThanOrEqualTo(String value) {
            addCriterion("STU_MSG_CFG <=", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgLike(String value) {
            addCriterion("STU_MSG_CFG like", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgNotLike(String value) {
            addCriterion("STU_MSG_CFG not like", value, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgIn(List<String> values) {
            addCriterion("STU_MSG_CFG in", values, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgNotIn(List<String> values) {
            addCriterion("STU_MSG_CFG not in", values, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgBetween(String value1, String value2) {
            addCriterion("STU_MSG_CFG between", value1, value2, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMsgCfgNotBetween(String value1, String value2) {
            addCriterion("STU_MSG_CFG not between", value1, value2, "stuMsgCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgIsNull() {
            addCriterion("STU_MAIL_CFG is null");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgIsNotNull() {
            addCriterion("STU_MAIL_CFG is not null");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgEqualTo(String value) {
            addCriterion("STU_MAIL_CFG =", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgNotEqualTo(String value) {
            addCriterion("STU_MAIL_CFG <>", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgGreaterThan(String value) {
            addCriterion("STU_MAIL_CFG >", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgGreaterThanOrEqualTo(String value) {
            addCriterion("STU_MAIL_CFG >=", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgLessThan(String value) {
            addCriterion("STU_MAIL_CFG <", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgLessThanOrEqualTo(String value) {
            addCriterion("STU_MAIL_CFG <=", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgLike(String value) {
            addCriterion("STU_MAIL_CFG like", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgNotLike(String value) {
            addCriterion("STU_MAIL_CFG not like", value, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgIn(List<String> values) {
            addCriterion("STU_MAIL_CFG in", values, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgNotIn(List<String> values) {
            addCriterion("STU_MAIL_CFG not in", values, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgBetween(String value1, String value2) {
            addCriterion("STU_MAIL_CFG between", value1, value2, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuMailCfgNotBetween(String value1, String value2) {
            addCriterion("STU_MAIL_CFG not between", value1, value2, "stuMailCfg");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdIsNull() {
            addCriterion("STU_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdIsNotNull() {
            addCriterion("STU_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdEqualTo(Integer value) {
            addCriterion("STU_GROUP_ID =", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdNotEqualTo(Integer value) {
            addCriterion("STU_GROUP_ID <>", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdGreaterThan(Integer value) {
            addCriterion("STU_GROUP_ID >", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_GROUP_ID >=", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdLessThan(Integer value) {
            addCriterion("STU_GROUP_ID <", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("STU_GROUP_ID <=", value, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdIn(List<Integer> values) {
            addCriterion("STU_GROUP_ID in", values, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdNotIn(List<Integer> values) {
            addCriterion("STU_GROUP_ID not in", values, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("STU_GROUP_ID between", value1, value2, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_GROUP_ID not between", value1, value2, "stuGroupId");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateIsNull() {
            addCriterion("STU_ISACTIVATE is null");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateIsNotNull() {
            addCriterion("STU_ISACTIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateEqualTo(Integer value) {
            addCriterion("STU_ISACTIVATE =", value, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateNotEqualTo(Integer value) {
            addCriterion("STU_ISACTIVATE <>", value, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateGreaterThan(Integer value) {
            addCriterion("STU_ISACTIVATE >", value, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_ISACTIVATE >=", value, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateLessThan(Integer value) {
            addCriterion("STU_ISACTIVATE <", value, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateLessThanOrEqualTo(Integer value) {
            addCriterion("STU_ISACTIVATE <=", value, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateIn(List<Integer> values) {
            addCriterion("STU_ISACTIVATE in", values, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateNotIn(List<Integer> values) {
            addCriterion("STU_ISACTIVATE not in", values, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateBetween(Integer value1, Integer value2) {
            addCriterion("STU_ISACTIVATE between", value1, value2, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuIsactivateNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_ISACTIVATE not between", value1, value2, "stuIsactivate");
            return (Criteria) this;
        }

        public Criteria andStuFlagIsNull() {
            addCriterion("STU_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andStuFlagIsNotNull() {
            addCriterion("STU_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStuFlagEqualTo(String value) {
            addCriterion("STU_FLAG =", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagNotEqualTo(String value) {
            addCriterion("STU_FLAG <>", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagGreaterThan(String value) {
            addCriterion("STU_FLAG >", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagGreaterThanOrEqualTo(String value) {
            addCriterion("STU_FLAG >=", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagLessThan(String value) {
            addCriterion("STU_FLAG <", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagLessThanOrEqualTo(String value) {
            addCriterion("STU_FLAG <=", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagLike(String value) {
            addCriterion("STU_FLAG like", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagNotLike(String value) {
            addCriterion("STU_FLAG not like", value, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagIn(List<String> values) {
            addCriterion("STU_FLAG in", values, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagNotIn(List<String> values) {
            addCriterion("STU_FLAG not in", values, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagBetween(String value1, String value2) {
            addCriterion("STU_FLAG between", value1, value2, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuFlagNotBetween(String value1, String value2) {
            addCriterion("STU_FLAG not between", value1, value2, "stuFlag");
            return (Criteria) this;
        }

        public Criteria andStuPaymentIsNull() {
            addCriterion("STU_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andStuPaymentIsNotNull() {
            addCriterion("STU_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andStuPaymentEqualTo(Integer value) {
            addCriterion("STU_PAYMENT =", value, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentNotEqualTo(Integer value) {
            addCriterion("STU_PAYMENT <>", value, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentGreaterThan(Integer value) {
            addCriterion("STU_PAYMENT >", value, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_PAYMENT >=", value, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentLessThan(Integer value) {
            addCriterion("STU_PAYMENT <", value, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("STU_PAYMENT <=", value, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentIn(List<Integer> values) {
            addCriterion("STU_PAYMENT in", values, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentNotIn(List<Integer> values) {
            addCriterion("STU_PAYMENT not in", values, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentBetween(Integer value1, Integer value2) {
            addCriterion("STU_PAYMENT between", value1, value2, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_PAYMENT not between", value1, value2, "stuPayment");
            return (Criteria) this;
        }

        public Criteria andStuQacountIsNull() {
            addCriterion("STU_QACOUNT is null");
            return (Criteria) this;
        }

        public Criteria andStuQacountIsNotNull() {
            addCriterion("STU_QACOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andStuQacountEqualTo(Integer value) {
            addCriterion("STU_QACOUNT =", value, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountNotEqualTo(Integer value) {
            addCriterion("STU_QACOUNT <>", value, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountGreaterThan(Integer value) {
            addCriterion("STU_QACOUNT >", value, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_QACOUNT >=", value, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountLessThan(Integer value) {
            addCriterion("STU_QACOUNT <", value, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountLessThanOrEqualTo(Integer value) {
            addCriterion("STU_QACOUNT <=", value, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountIn(List<Integer> values) {
            addCriterion("STU_QACOUNT in", values, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountNotIn(List<Integer> values) {
            addCriterion("STU_QACOUNT not in", values, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountBetween(Integer value1, Integer value2) {
            addCriterion("STU_QACOUNT between", value1, value2, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuQacountNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_QACOUNT not between", value1, value2, "stuQacount");
            return (Criteria) this;
        }

        public Criteria andStuJobContextIsNull() {
            addCriterion("STU_JOB_CONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andStuJobContextIsNotNull() {
            addCriterion("STU_JOB_CONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andStuJobContextEqualTo(String value) {
            addCriterion("STU_JOB_CONTEXT =", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextNotEqualTo(String value) {
            addCriterion("STU_JOB_CONTEXT <>", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextGreaterThan(String value) {
            addCriterion("STU_JOB_CONTEXT >", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextGreaterThanOrEqualTo(String value) {
            addCriterion("STU_JOB_CONTEXT >=", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextLessThan(String value) {
            addCriterion("STU_JOB_CONTEXT <", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextLessThanOrEqualTo(String value) {
            addCriterion("STU_JOB_CONTEXT <=", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextLike(String value) {
            addCriterion("STU_JOB_CONTEXT like", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextNotLike(String value) {
            addCriterion("STU_JOB_CONTEXT not like", value, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextIn(List<String> values) {
            addCriterion("STU_JOB_CONTEXT in", values, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextNotIn(List<String> values) {
            addCriterion("STU_JOB_CONTEXT not in", values, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextBetween(String value1, String value2) {
            addCriterion("STU_JOB_CONTEXT between", value1, value2, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuJobContextNotBetween(String value1, String value2) {
            addCriterion("STU_JOB_CONTEXT not between", value1, value2, "stuJobContext");
            return (Criteria) this;
        }

        public Criteria andStuProfIsNull() {
            addCriterion("STU_PROF is null");
            return (Criteria) this;
        }

        public Criteria andStuProfIsNotNull() {
            addCriterion("STU_PROF is not null");
            return (Criteria) this;
        }

        public Criteria andStuProfEqualTo(Integer value) {
            addCriterion("STU_PROF =", value, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfNotEqualTo(Integer value) {
            addCriterion("STU_PROF <>", value, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfGreaterThan(Integer value) {
            addCriterion("STU_PROF >", value, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_PROF >=", value, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfLessThan(Integer value) {
            addCriterion("STU_PROF <", value, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfLessThanOrEqualTo(Integer value) {
            addCriterion("STU_PROF <=", value, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfIn(List<Integer> values) {
            addCriterion("STU_PROF in", values, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfNotIn(List<Integer> values) {
            addCriterion("STU_PROF not in", values, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfBetween(Integer value1, Integer value2) {
            addCriterion("STU_PROF between", value1, value2, "stuProf");
            return (Criteria) this;
        }

        public Criteria andStuProfNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_PROF not between", value1, value2, "stuProf");
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