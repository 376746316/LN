package com.chinasofti.cetp.gensee.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenseeCoursewareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenseeCoursewareExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNull() {
            addCriterion("record_Id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_Id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("record_Id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("record_Id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("record_Id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("record_Id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("record_Id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("record_Id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("record_Id like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("record_Id not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("record_Id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("record_Id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("record_Id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("record_Id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andScreenshotIsNull() {
            addCriterion("screenshot is null");
            return (Criteria) this;
        }

        public Criteria andScreenshotIsNotNull() {
            addCriterion("screenshot is not null");
            return (Criteria) this;
        }

        public Criteria andScreenshotEqualTo(String value) {
            addCriterion("screenshot =", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotNotEqualTo(String value) {
            addCriterion("screenshot <>", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotGreaterThan(String value) {
            addCriterion("screenshot >", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotGreaterThanOrEqualTo(String value) {
            addCriterion("screenshot >=", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotLessThan(String value) {
            addCriterion("screenshot <", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotLessThanOrEqualTo(String value) {
            addCriterion("screenshot <=", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotLike(String value) {
            addCriterion("screenshot like", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotNotLike(String value) {
            addCriterion("screenshot not like", value, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotIn(List<String> values) {
            addCriterion("screenshot in", values, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotNotIn(List<String> values) {
            addCriterion("screenshot not in", values, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotBetween(String value1, String value2) {
            addCriterion("screenshot between", value1, value2, "screenshot");
            return (Criteria) this;
        }

        public Criteria andScreenshotNotBetween(String value1, String value2) {
            addCriterion("screenshot not between", value1, value2, "screenshot");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_Time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_Time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_Time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_Time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_Time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_Time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_Time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_Time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_Time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_Time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeIsNull() {
            addCriterion("record_Start_Time is null");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeIsNotNull() {
            addCriterion("record_Start_Time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeEqualTo(Date value) {
            addCriterion("record_Start_Time =", value, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeNotEqualTo(Date value) {
            addCriterion("record_Start_Time <>", value, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeGreaterThan(Date value) {
            addCriterion("record_Start_Time >", value, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_Start_Time >=", value, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeLessThan(Date value) {
            addCriterion("record_Start_Time <", value, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_Start_Time <=", value, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeIn(List<Date> values) {
            addCriterion("record_Start_Time in", values, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeNotIn(List<Date> values) {
            addCriterion("record_Start_Time not in", values, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeBetween(Date value1, Date value2) {
            addCriterion("record_Start_Time between", value1, value2, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_Start_Time not between", value1, value2, "recordStartTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeIsNull() {
            addCriterion("record_End_Time is null");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeIsNotNull() {
            addCriterion("record_End_Time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeEqualTo(Date value) {
            addCriterion("record_End_Time =", value, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeNotEqualTo(Date value) {
            addCriterion("record_End_Time <>", value, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeGreaterThan(Date value) {
            addCriterion("record_End_Time >", value, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_End_Time >=", value, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeLessThan(Date value) {
            addCriterion("record_End_Time <", value, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_End_Time <=", value, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeIn(List<Date> values) {
            addCriterion("record_End_Time in", values, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeNotIn(List<Date> values) {
            addCriterion("record_End_Time not in", values, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeBetween(Date value1, Date value2) {
            addCriterion("record_End_Time between", value1, value2, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andRecordEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_End_Time not between", value1, value2, "recordEndTime");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(Integer value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(Integer value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(Integer value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(Integer value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<Integer> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<Integer> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
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