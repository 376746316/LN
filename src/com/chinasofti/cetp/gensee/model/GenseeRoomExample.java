package com.chinasofti.cetp.gensee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenseeRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenseeRoomExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Long value) {
            addCriterion("ROOM_ID =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Long value) {
            addCriterion("ROOM_ID <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Long value) {
            addCriterion("ROOM_ID >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROOM_ID >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Long value) {
            addCriterion("ROOM_ID <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Long value) {
            addCriterion("ROOM_ID <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Long> values) {
            addCriterion("ROOM_ID in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Long> values) {
            addCriterion("ROOM_ID not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Long value1, Long value2) {
            addCriterion("ROOM_ID between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Long value1, Long value2) {
            addCriterion("ROOM_ID not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("NUMBER =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("NUMBER <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("NUMBER >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBER >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("NUMBER <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("NUMBER <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("NUMBER like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("NUMBER not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("NUMBER in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("NUMBER not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("NUMBER between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("NUMBER not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenIsNull() {
            addCriterion("teacher_Token is null");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenIsNotNull() {
            addCriterion("teacher_Token is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenEqualTo(String value) {
            addCriterion("teacher_Token =", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenNotEqualTo(String value) {
            addCriterion("teacher_Token <>", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenGreaterThan(String value) {
            addCriterion("teacher_Token >", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_Token >=", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenLessThan(String value) {
            addCriterion("teacher_Token <", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenLessThanOrEqualTo(String value) {
            addCriterion("teacher_Token <=", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenLike(String value) {
            addCriterion("teacher_Token like", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenNotLike(String value) {
            addCriterion("teacher_Token not like", value, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenIn(List<String> values) {
            addCriterion("teacher_Token in", values, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenNotIn(List<String> values) {
            addCriterion("teacher_Token not in", values, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenBetween(String value1, String value2) {
            addCriterion("teacher_Token between", value1, value2, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andTeacherTokenNotBetween(String value1, String value2) {
            addCriterion("teacher_Token not between", value1, value2, "teacherToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenIsNull() {
            addCriterion("student_Token is null");
            return (Criteria) this;
        }

        public Criteria andStudentTokenIsNotNull() {
            addCriterion("student_Token is not null");
            return (Criteria) this;
        }

        public Criteria andStudentTokenEqualTo(String value) {
            addCriterion("student_Token =", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenNotEqualTo(String value) {
            addCriterion("student_Token <>", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenGreaterThan(String value) {
            addCriterion("student_Token >", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenGreaterThanOrEqualTo(String value) {
            addCriterion("student_Token >=", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenLessThan(String value) {
            addCriterion("student_Token <", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenLessThanOrEqualTo(String value) {
            addCriterion("student_Token <=", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenLike(String value) {
            addCriterion("student_Token like", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenNotLike(String value) {
            addCriterion("student_Token not like", value, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenIn(List<String> values) {
            addCriterion("student_Token in", values, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenNotIn(List<String> values) {
            addCriterion("student_Token not in", values, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenBetween(String value1, String value2) {
            addCriterion("student_Token between", value1, value2, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentTokenNotBetween(String value1, String value2) {
            addCriterion("student_Token not between", value1, value2, "studentToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenIsNull() {
            addCriterion("student_Client_Token is null");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenIsNotNull() {
            addCriterion("student_Client_Token is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenEqualTo(String value) {
            addCriterion("student_Client_Token =", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenNotEqualTo(String value) {
            addCriterion("student_Client_Token <>", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenGreaterThan(String value) {
            addCriterion("student_Client_Token >", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenGreaterThanOrEqualTo(String value) {
            addCriterion("student_Client_Token >=", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenLessThan(String value) {
            addCriterion("student_Client_Token <", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenLessThanOrEqualTo(String value) {
            addCriterion("student_Client_Token <=", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenLike(String value) {
            addCriterion("student_Client_Token like", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenNotLike(String value) {
            addCriterion("student_Client_Token not like", value, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenIn(List<String> values) {
            addCriterion("student_Client_Token in", values, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenNotIn(List<String> values) {
            addCriterion("student_Client_Token not in", values, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenBetween(String value1, String value2) {
            addCriterion("student_Client_Token between", value1, value2, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStudentClientTokenNotBetween(String value1, String value2) {
            addCriterion("student_Client_Token not between", value1, value2, "studentClientToken");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_Date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_Date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_Date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_Date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_Date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_Date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_Date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_Date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_Date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_Date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_Date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_Date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNull() {
            addCriterion("invalid_Date is null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIsNotNull() {
            addCriterion("invalid_Date is not null");
            return (Criteria) this;
        }

        public Criteria andInvalidDateEqualTo(Date value) {
            addCriterion("invalid_Date =", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotEqualTo(Date value) {
            addCriterion("invalid_Date <>", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThan(Date value) {
            addCriterion("invalid_Date >", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateGreaterThanOrEqualTo(Date value) {
            addCriterion("invalid_Date >=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThan(Date value) {
            addCriterion("invalid_Date <", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateLessThanOrEqualTo(Date value) {
            addCriterion("invalid_Date <=", value, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateIn(List<Date> values) {
            addCriterion("invalid_Date in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotIn(List<Date> values) {
            addCriterion("invalid_Date not in", values, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateBetween(Date value1, Date value2) {
            addCriterion("invalid_Date between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andInvalidDateNotBetween(Date value1, Date value2) {
            addCriterion("invalid_Date not between", value1, value2, "invalidDate");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenIsNull() {
            addCriterion("assistant_Token is null");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenIsNotNull() {
            addCriterion("assistant_Token is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenEqualTo(String value) {
            addCriterion("assistant_Token =", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenNotEqualTo(String value) {
            addCriterion("assistant_Token <>", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenGreaterThan(String value) {
            addCriterion("assistant_Token >", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenGreaterThanOrEqualTo(String value) {
            addCriterion("assistant_Token >=", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenLessThan(String value) {
            addCriterion("assistant_Token <", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenLessThanOrEqualTo(String value) {
            addCriterion("assistant_Token <=", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenLike(String value) {
            addCriterion("assistant_Token like", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenNotLike(String value) {
            addCriterion("assistant_Token not like", value, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenIn(List<String> values) {
            addCriterion("assistant_Token in", values, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenNotIn(List<String> values) {
            addCriterion("assistant_Token not in", values, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenBetween(String value1, String value2) {
            addCriterion("assistant_Token between", value1, value2, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andAssistantTokenNotBetween(String value1, String value2) {
            addCriterion("assistant_Token not between", value1, value2, "assistantToken");
            return (Criteria) this;
        }

        public Criteria andWebJoinIsNull() {
            addCriterion("web_join is null");
            return (Criteria) this;
        }

        public Criteria andWebJoinIsNotNull() {
            addCriterion("web_join is not null");
            return (Criteria) this;
        }

        public Criteria andWebJoinEqualTo(String value) {
            addCriterion("web_join =", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinNotEqualTo(String value) {
            addCriterion("web_join <>", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinGreaterThan(String value) {
            addCriterion("web_join >", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinGreaterThanOrEqualTo(String value) {
            addCriterion("web_join >=", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinLessThan(String value) {
            addCriterion("web_join <", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinLessThanOrEqualTo(String value) {
            addCriterion("web_join <=", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinLike(String value) {
            addCriterion("web_join like", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinNotLike(String value) {
            addCriterion("web_join not like", value, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinIn(List<String> values) {
            addCriterion("web_join in", values, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinNotIn(List<String> values) {
            addCriterion("web_join not in", values, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinBetween(String value1, String value2) {
            addCriterion("web_join between", value1, value2, "webJoin");
            return (Criteria) this;
        }

        public Criteria andWebJoinNotBetween(String value1, String value2) {
            addCriterion("web_join not between", value1, value2, "webJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinIsNull() {
            addCriterion("client_join is null");
            return (Criteria) this;
        }

        public Criteria andClientJoinIsNotNull() {
            addCriterion("client_join is not null");
            return (Criteria) this;
        }

        public Criteria andClientJoinEqualTo(String value) {
            addCriterion("client_join =", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinNotEqualTo(String value) {
            addCriterion("client_join <>", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinGreaterThan(String value) {
            addCriterion("client_join >", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinGreaterThanOrEqualTo(String value) {
            addCriterion("client_join >=", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinLessThan(String value) {
            addCriterion("client_join <", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinLessThanOrEqualTo(String value) {
            addCriterion("client_join <=", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinLike(String value) {
            addCriterion("client_join like", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinNotLike(String value) {
            addCriterion("client_join not like", value, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinIn(List<String> values) {
            addCriterion("client_join in", values, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinNotIn(List<String> values) {
            addCriterion("client_join not in", values, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinBetween(String value1, String value2) {
            addCriterion("client_join between", value1, value2, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andClientJoinNotBetween(String value1, String value2) {
            addCriterion("client_join not between", value1, value2, "clientJoin");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andUiModeIsNull() {
            addCriterion("ui_Mode is null");
            return (Criteria) this;
        }

        public Criteria andUiModeIsNotNull() {
            addCriterion("ui_Mode is not null");
            return (Criteria) this;
        }

        public Criteria andUiModeEqualTo(Integer value) {
            addCriterion("ui_Mode =", value, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeNotEqualTo(Integer value) {
            addCriterion("ui_Mode <>", value, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeGreaterThan(Integer value) {
            addCriterion("ui_Mode >", value, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ui_Mode >=", value, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeLessThan(Integer value) {
            addCriterion("ui_Mode <", value, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeLessThanOrEqualTo(Integer value) {
            addCriterion("ui_Mode <=", value, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeIn(List<Integer> values) {
            addCriterion("ui_Mode in", values, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeNotIn(List<Integer> values) {
            addCriterion("ui_Mode not in", values, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeBetween(Integer value1, Integer value2) {
            addCriterion("ui_Mode between", value1, value2, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiModeNotBetween(Integer value1, Integer value2) {
            addCriterion("ui_Mode not between", value1, value2, "uiMode");
            return (Criteria) this;
        }

        public Criteria andUiColorIsNull() {
            addCriterion("ui_color is null");
            return (Criteria) this;
        }

        public Criteria andUiColorIsNotNull() {
            addCriterion("ui_color is not null");
            return (Criteria) this;
        }

        public Criteria andUiColorEqualTo(String value) {
            addCriterion("ui_color =", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorNotEqualTo(String value) {
            addCriterion("ui_color <>", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorGreaterThan(String value) {
            addCriterion("ui_color >", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorGreaterThanOrEqualTo(String value) {
            addCriterion("ui_color >=", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorLessThan(String value) {
            addCriterion("ui_color <", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorLessThanOrEqualTo(String value) {
            addCriterion("ui_color <=", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorLike(String value) {
            addCriterion("ui_color like", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorNotLike(String value) {
            addCriterion("ui_color not like", value, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorIn(List<String> values) {
            addCriterion("ui_color in", values, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorNotIn(List<String> values) {
            addCriterion("ui_color not in", values, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorBetween(String value1, String value2) {
            addCriterion("ui_color between", value1, value2, "uiColor");
            return (Criteria) this;
        }

        public Criteria andUiColorNotBetween(String value1, String value2) {
            addCriterion("ui_color not between", value1, value2, "uiColor");
            return (Criteria) this;
        }

        public Criteria andSceneIsNull() {
            addCriterion("scene is null");
            return (Criteria) this;
        }

        public Criteria andSceneIsNotNull() {
            addCriterion("scene is not null");
            return (Criteria) this;
        }

        public Criteria andSceneEqualTo(Integer value) {
            addCriterion("scene =", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotEqualTo(Integer value) {
            addCriterion("scene <>", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThan(Integer value) {
            addCriterion("scene >", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene >=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThan(Integer value) {
            addCriterion("scene <", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneLessThanOrEqualTo(Integer value) {
            addCriterion("scene <=", value, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneIn(List<Integer> values) {
            addCriterion("scene in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotIn(List<Integer> values) {
            addCriterion("scene not in", values, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneBetween(Integer value1, Integer value2) {
            addCriterion("scene between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andSceneNotBetween(Integer value1, Integer value2) {
            addCriterion("scene not between", value1, value2, "scene");
            return (Criteria) this;
        }

        public Criteria andUiWindowIsNull() {
            addCriterion("ui_window is null");
            return (Criteria) this;
        }

        public Criteria andUiWindowIsNotNull() {
            addCriterion("ui_window is not null");
            return (Criteria) this;
        }

        public Criteria andUiWindowEqualTo(String value) {
            addCriterion("ui_window =", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowNotEqualTo(String value) {
            addCriterion("ui_window <>", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowGreaterThan(String value) {
            addCriterion("ui_window >", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowGreaterThanOrEqualTo(String value) {
            addCriterion("ui_window >=", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowLessThan(String value) {
            addCriterion("ui_window <", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowLessThanOrEqualTo(String value) {
            addCriterion("ui_window <=", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowLike(String value) {
            addCriterion("ui_window like", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowNotLike(String value) {
            addCriterion("ui_window not like", value, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowIn(List<String> values) {
            addCriterion("ui_window in", values, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowNotIn(List<String> values) {
            addCriterion("ui_window not in", values, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowBetween(String value1, String value2) {
            addCriterion("ui_window between", value1, value2, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiWindowNotBetween(String value1, String value2) {
            addCriterion("ui_window not between", value1, value2, "uiWindow");
            return (Criteria) this;
        }

        public Criteria andUiVideoIsNull() {
            addCriterion("ui_video is null");
            return (Criteria) this;
        }

        public Criteria andUiVideoIsNotNull() {
            addCriterion("ui_video is not null");
            return (Criteria) this;
        }

        public Criteria andUiVideoEqualTo(String value) {
            addCriterion("ui_video =", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoNotEqualTo(String value) {
            addCriterion("ui_video <>", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoGreaterThan(String value) {
            addCriterion("ui_video >", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoGreaterThanOrEqualTo(String value) {
            addCriterion("ui_video >=", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoLessThan(String value) {
            addCriterion("ui_video <", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoLessThanOrEqualTo(String value) {
            addCriterion("ui_video <=", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoLike(String value) {
            addCriterion("ui_video like", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoNotLike(String value) {
            addCriterion("ui_video not like", value, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoIn(List<String> values) {
            addCriterion("ui_video in", values, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoNotIn(List<String> values) {
            addCriterion("ui_video not in", values, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoBetween(String value1, String value2) {
            addCriterion("ui_video between", value1, value2, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUiVideoNotBetween(String value1, String value2) {
            addCriterion("ui_video not between", value1, value2, "uiVideo");
            return (Criteria) this;
        }

        public Criteria andUpgradeIsNull() {
            addCriterion("upgrade is null");
            return (Criteria) this;
        }

        public Criteria andUpgradeIsNotNull() {
            addCriterion("upgrade is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradeEqualTo(String value) {
            addCriterion("upgrade =", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeNotEqualTo(String value) {
            addCriterion("upgrade <>", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeGreaterThan(String value) {
            addCriterion("upgrade >", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeGreaterThanOrEqualTo(String value) {
            addCriterion("upgrade >=", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeLessThan(String value) {
            addCriterion("upgrade <", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeLessThanOrEqualTo(String value) {
            addCriterion("upgrade <=", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeLike(String value) {
            addCriterion("upgrade like", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeNotLike(String value) {
            addCriterion("upgrade not like", value, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeIn(List<String> values) {
            addCriterion("upgrade in", values, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeNotIn(List<String> values) {
            addCriterion("upgrade not in", values, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeBetween(String value1, String value2) {
            addCriterion("upgrade between", value1, value2, "upgrade");
            return (Criteria) this;
        }

        public Criteria andUpgradeNotBetween(String value1, String value2) {
            addCriterion("upgrade not between", value1, value2, "upgrade");
            return (Criteria) this;
        }

        public Criteria andSecIsNull() {
            addCriterion("sec is null");
            return (Criteria) this;
        }

        public Criteria andSecIsNotNull() {
            addCriterion("sec is not null");
            return (Criteria) this;
        }

        public Criteria andSecEqualTo(String value) {
            addCriterion("sec =", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotEqualTo(String value) {
            addCriterion("sec <>", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecGreaterThan(String value) {
            addCriterion("sec >", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecGreaterThanOrEqualTo(String value) {
            addCriterion("sec >=", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecLessThan(String value) {
            addCriterion("sec <", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecLessThanOrEqualTo(String value) {
            addCriterion("sec <=", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecLike(String value) {
            addCriterion("sec like", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotLike(String value) {
            addCriterion("sec not like", value, "sec");
            return (Criteria) this;
        }

        public Criteria andSecIn(List<String> values) {
            addCriterion("sec in", values, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotIn(List<String> values) {
            addCriterion("sec not in", values, "sec");
            return (Criteria) this;
        }

        public Criteria andSecBetween(String value1, String value2) {
            addCriterion("sec between", value1, value2, "sec");
            return (Criteria) this;
        }

        public Criteria andSecNotBetween(String value1, String value2) {
            addCriterion("sec not between", value1, value2, "sec");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNull() {
            addCriterion("realtime is null");
            return (Criteria) this;
        }

        public Criteria andRealtimeIsNotNull() {
            addCriterion("realtime is not null");
            return (Criteria) this;
        }

        public Criteria andRealtimeEqualTo(String value) {
            addCriterion("realtime =", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotEqualTo(String value) {
            addCriterion("realtime <>", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThan(String value) {
            addCriterion("realtime >", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeGreaterThanOrEqualTo(String value) {
            addCriterion("realtime >=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThan(String value) {
            addCriterion("realtime <", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLessThanOrEqualTo(String value) {
            addCriterion("realtime <=", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeLike(String value) {
            addCriterion("realtime like", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotLike(String value) {
            addCriterion("realtime not like", value, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeIn(List<String> values) {
            addCriterion("realtime in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotIn(List<String> values) {
            addCriterion("realtime not in", values, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeBetween(String value1, String value2) {
            addCriterion("realtime between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andRealtimeNotBetween(String value1, String value2) {
            addCriterion("realtime not between", value1, value2, "realtime");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesIsNull() {
            addCriterion("max_attendees is null");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesIsNotNull() {
            addCriterion("max_attendees is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesEqualTo(Integer value) {
            addCriterion("max_attendees =", value, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesNotEqualTo(Integer value) {
            addCriterion("max_attendees <>", value, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesGreaterThan(Integer value) {
            addCriterion("max_attendees >", value, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_attendees >=", value, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesLessThan(Integer value) {
            addCriterion("max_attendees <", value, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesLessThanOrEqualTo(Integer value) {
            addCriterion("max_attendees <=", value, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesIn(List<Integer> values) {
            addCriterion("max_attendees in", values, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesNotIn(List<Integer> values) {
            addCriterion("max_attendees not in", values, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesBetween(Integer value1, Integer value2) {
            addCriterion("max_attendees between", value1, value2, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andMaxAttendeesNotBetween(Integer value1, Integer value2) {
            addCriterion("max_attendees not between", value1, value2, "maxAttendees");
            return (Criteria) this;
        }

        public Criteria andUsersNoIsNull() {
            addCriterion("users_no is null");
            return (Criteria) this;
        }

        public Criteria andUsersNoIsNotNull() {
            addCriterion("users_no is not null");
            return (Criteria) this;
        }

        public Criteria andUsersNoEqualTo(Integer value) {
            addCriterion("users_no =", value, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoNotEqualTo(Integer value) {
            addCriterion("users_no <>", value, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoGreaterThan(Integer value) {
            addCriterion("users_no >", value, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_no >=", value, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoLessThan(Integer value) {
            addCriterion("users_no <", value, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoLessThanOrEqualTo(Integer value) {
            addCriterion("users_no <=", value, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoIn(List<Integer> values) {
            addCriterion("users_no in", values, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoNotIn(List<Integer> values) {
            addCriterion("users_no not in", values, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoBetween(Integer value1, Integer value2) {
            addCriterion("users_no between", value1, value2, "usersNo");
            return (Criteria) this;
        }

        public Criteria andUsersNoNotBetween(Integer value1, Integer value2) {
            addCriterion("users_no not between", value1, value2, "usersNo");
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