package com.chinasofti.cetp.gensee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenseeTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenseeTeacherExample() {
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

        public Criteria andGenseeUserNoIsNull() {
            addCriterion("GENSEE_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoIsNotNull() {
            addCriterion("GENSEE_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoEqualTo(Integer value) {
            addCriterion("GENSEE_USER_NO =", value, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoNotEqualTo(Integer value) {
            addCriterion("GENSEE_USER_NO <>", value, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoGreaterThan(Integer value) {
            addCriterion("GENSEE_USER_NO >", value, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("GENSEE_USER_NO >=", value, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoLessThan(Integer value) {
            addCriterion("GENSEE_USER_NO <", value, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("GENSEE_USER_NO <=", value, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoIn(List<Integer> values) {
            addCriterion("GENSEE_USER_NO in", values, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoNotIn(List<Integer> values) {
            addCriterion("GENSEE_USER_NO not in", values, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoBetween(Integer value1, Integer value2) {
            addCriterion("GENSEE_USER_NO between", value1, value2, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andGenseeUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("GENSEE_USER_NO not between", value1, value2, "genseeUserNo");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameIsNull() {
            addCriterion("TEACHER_LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameIsNotNull() {
            addCriterion("TEACHER_LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameEqualTo(String value) {
            addCriterion("TEACHER_LOGIN_NAME =", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameNotEqualTo(String value) {
            addCriterion("TEACHER_LOGIN_NAME <>", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameGreaterThan(String value) {
            addCriterion("TEACHER_LOGIN_NAME >", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_LOGIN_NAME >=", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameLessThan(String value) {
            addCriterion("TEACHER_LOGIN_NAME <", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_LOGIN_NAME <=", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameLike(String value) {
            addCriterion("TEACHER_LOGIN_NAME like", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameNotLike(String value) {
            addCriterion("TEACHER_LOGIN_NAME not like", value, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameIn(List<String> values) {
            addCriterion("TEACHER_LOGIN_NAME in", values, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameNotIn(List<String> values) {
            addCriterion("TEACHER_LOGIN_NAME not in", values, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameBetween(String value1, String value2) {
            addCriterion("TEACHER_LOGIN_NAME between", value1, value2, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherLoginNameNotBetween(String value1, String value2) {
            addCriterion("TEACHER_LOGIN_NAME not between", value1, value2, "teacherLoginName");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNull() {
            addCriterion("TEACHER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNotNull() {
            addCriterion("TEACHER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordEqualTo(String value) {
            addCriterion("TEACHER_PASSWORD =", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotEqualTo(String value) {
            addCriterion("TEACHER_PASSWORD <>", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThan(String value) {
            addCriterion("TEACHER_PASSWORD >", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TEACHER_PASSWORD >=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThan(String value) {
            addCriterion("TEACHER_PASSWORD <", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThanOrEqualTo(String value) {
            addCriterion("TEACHER_PASSWORD <=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLike(String value) {
            addCriterion("TEACHER_PASSWORD like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotLike(String value) {
            addCriterion("TEACHER_PASSWORD not like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIn(List<String> values) {
            addCriterion("TEACHER_PASSWORD in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotIn(List<String> values) {
            addCriterion("TEACHER_PASSWORD not in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordBetween(String value1, String value2) {
            addCriterion("TEACHER_PASSWORD between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotBetween(String value1, String value2) {
            addCriterion("TEACHER_PASSWORD not between", value1, value2, "teacherPassword");
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

        public Criteria andSecIsNull() {
            addCriterion("SEC is null");
            return (Criteria) this;
        }

        public Criteria andSecIsNotNull() {
            addCriterion("SEC is not null");
            return (Criteria) this;
        }

        public Criteria andSecEqualTo(String value) {
            addCriterion("SEC =", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotEqualTo(String value) {
            addCriterion("SEC <>", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecGreaterThan(String value) {
            addCriterion("SEC >", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecGreaterThanOrEqualTo(String value) {
            addCriterion("SEC >=", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecLessThan(String value) {
            addCriterion("SEC <", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecLessThanOrEqualTo(String value) {
            addCriterion("SEC <=", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecLike(String value) {
            addCriterion("SEC like", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotLike(String value) {
            addCriterion("SEC not like", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecIn(List<String> values) {
            addCriterion("SEC in", values, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotIn(List<String> values) {
            addCriterion("SEC not in", values, "sec");
            return (Criteria) this;
        }

        public Criteria andSecBetween(String value1, String value2) {
            addCriterion("SEC between", value1, value2, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotBetween(String value1, String value2) {
            addCriterion("SEC not between", value1, value2, "sec");
            return (Criteria) this;
        }

        public Criteria andMaleIsNull() {
            addCriterion("MALE is null");
            return (Criteria) this;
        }

        public Criteria andMaleIsNotNull() {
            addCriterion("MALE is not null");
            return (Criteria) this;
        }

        public Criteria andMaleEqualTo(String value) {
            addCriterion("MALE =", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleNotEqualTo(String value) {
            addCriterion("MALE <>", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleGreaterThan(String value) {
            addCriterion("MALE >", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleGreaterThanOrEqualTo(String value) {
            addCriterion("MALE >=", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleLessThan(String value) {
            addCriterion("MALE <", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleLessThanOrEqualTo(String value) {
            addCriterion("MALE <=", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleLike(String value) {
            addCriterion("MALE like", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleNotLike(String value) {
            addCriterion("MALE not like", value, "male");
            return (Criteria) this;
        }

        public Criteria andMaleIn(List<String> values) {
            addCriterion("MALE in", values, "male");
            return (Criteria) this;
        }

        public Criteria andMaleNotIn(List<String> values) {
            addCriterion("MALE not in", values, "male");
            return (Criteria) this;
        }

        public Criteria andMaleBetween(String value1, String value2) {
            addCriterion("MALE between", value1, value2, "male");
            return (Criteria) this;
        }

        public Criteria andMaleNotBetween(String value1, String value2) {
            addCriterion("MALE not between", value1, value2, "male");
            return (Criteria) this;
        }

        public Criteria andStratTimeIsNull() {
            addCriterion("STRAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStratTimeIsNotNull() {
            addCriterion("STRAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStratTimeEqualTo(Date value) {
            addCriterion("STRAT_TIME =", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeNotEqualTo(Date value) {
            addCriterion("STRAT_TIME <>", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeGreaterThan(Date value) {
            addCriterion("STRAT_TIME >", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STRAT_TIME >=", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeLessThan(Date value) {
            addCriterion("STRAT_TIME <", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeLessThanOrEqualTo(Date value) {
            addCriterion("STRAT_TIME <=", value, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeIn(List<Date> values) {
            addCriterion("STRAT_TIME in", values, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeNotIn(List<Date> values) {
            addCriterion("STRAT_TIME not in", values, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeBetween(Date value1, Date value2) {
            addCriterion("STRAT_TIME between", value1, value2, "stratTime");
            return (Criteria) this;
        }

        public Criteria andStratTimeNotBetween(Date value1, Date value2) {
            addCriterion("STRAT_TIME not between", value1, value2, "stratTime");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNull() {
            addCriterion("INVALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNotNull() {
            addCriterion("INVALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateEqualTo(Date value) {
            addCriterion("INVALID_DATE =", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotEqualTo(Date value) {
            addCriterion("INVALID_DATE <>", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThan(Date value) {
            addCriterion("INVALID_DATE >", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVALID_DATE >=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThan(Date value) {
            addCriterion("INVALID_DATE <", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThanOrEqualTo(Date value) {
            addCriterion("INVALID_DATE <=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIn(List<Date> values) {
            addCriterion("INVALID_DATE in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotIn(List<Date> values) {
            addCriterion("INVALID_DATE not in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateBetween(Date value1, Date value2) {
            addCriterion("INVALID_DATE between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotBetween(Date value1, Date value2) {
            addCriterion("INVALID_DATE not between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
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