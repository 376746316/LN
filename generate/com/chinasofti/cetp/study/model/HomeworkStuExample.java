package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeworkStuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeworkStuExample() {
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

        public Criteria andHsChapIdIsNull() {
            addCriterion("HS_CHAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andHsChapIdIsNotNull() {
            addCriterion("HS_CHAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHsChapIdEqualTo(Integer value) {
            addCriterion("HS_CHAP_ID =", value, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdNotEqualTo(Integer value) {
            addCriterion("HS_CHAP_ID <>", value, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdGreaterThan(Integer value) {
            addCriterion("HS_CHAP_ID >", value, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HS_CHAP_ID >=", value, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdLessThan(Integer value) {
            addCriterion("HS_CHAP_ID <", value, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdLessThanOrEqualTo(Integer value) {
            addCriterion("HS_CHAP_ID <=", value, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdIn(List<Integer> values) {
            addCriterion("HS_CHAP_ID in", values, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdNotIn(List<Integer> values) {
            addCriterion("HS_CHAP_ID not in", values, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdBetween(Integer value1, Integer value2) {
            addCriterion("HS_CHAP_ID between", value1, value2, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsChapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HS_CHAP_ID not between", value1, value2, "hsChapId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdIsNull() {
            addCriterion("HS_STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andHsStuIdIsNotNull() {
            addCriterion("HS_STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHsStuIdEqualTo(Integer value) {
            addCriterion("HS_STU_ID =", value, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdNotEqualTo(Integer value) {
            addCriterion("HS_STU_ID <>", value, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdGreaterThan(Integer value) {
            addCriterion("HS_STU_ID >", value, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HS_STU_ID >=", value, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdLessThan(Integer value) {
            addCriterion("HS_STU_ID <", value, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("HS_STU_ID <=", value, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdIn(List<Integer> values) {
            addCriterion("HS_STU_ID in", values, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdNotIn(List<Integer> values) {
            addCriterion("HS_STU_ID not in", values, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdBetween(Integer value1, Integer value2) {
            addCriterion("HS_STU_ID between", value1, value2, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HS_STU_ID not between", value1, value2, "hsStuId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdIsNull() {
            addCriterion("HS_EXER_ID is null");
            return (Criteria) this;
        }

        public Criteria andHsExerIdIsNotNull() {
            addCriterion("HS_EXER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHsExerIdEqualTo(Integer value) {
            addCriterion("HS_EXER_ID =", value, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdNotEqualTo(Integer value) {
            addCriterion("HS_EXER_ID <>", value, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdGreaterThan(Integer value) {
            addCriterion("HS_EXER_ID >", value, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HS_EXER_ID >=", value, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdLessThan(Integer value) {
            addCriterion("HS_EXER_ID <", value, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdLessThanOrEqualTo(Integer value) {
            addCriterion("HS_EXER_ID <=", value, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdIn(List<Integer> values) {
            addCriterion("HS_EXER_ID in", values, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdNotIn(List<Integer> values) {
            addCriterion("HS_EXER_ID not in", values, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdBetween(Integer value1, Integer value2) {
            addCriterion("HS_EXER_ID between", value1, value2, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsExerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HS_EXER_ID not between", value1, value2, "hsExerId");
            return (Criteria) this;
        }

        public Criteria andHsStatusIsNull() {
            addCriterion("HS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andHsStatusIsNotNull() {
            addCriterion("HS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHsStatusEqualTo(String value) {
            addCriterion("HS_STATUS =", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusNotEqualTo(String value) {
            addCriterion("HS_STATUS <>", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusGreaterThan(String value) {
            addCriterion("HS_STATUS >", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("HS_STATUS >=", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusLessThan(String value) {
            addCriterion("HS_STATUS <", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusLessThanOrEqualTo(String value) {
            addCriterion("HS_STATUS <=", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusLike(String value) {
            addCriterion("HS_STATUS like", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusNotLike(String value) {
            addCriterion("HS_STATUS not like", value, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusIn(List<String> values) {
            addCriterion("HS_STATUS in", values, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusNotIn(List<String> values) {
            addCriterion("HS_STATUS not in", values, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusBetween(String value1, String value2) {
            addCriterion("HS_STATUS between", value1, value2, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsStatusNotBetween(String value1, String value2) {
            addCriterion("HS_STATUS not between", value1, value2, "hsStatus");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerIsNull() {
            addCriterion("HS_TEXT_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerIsNotNull() {
            addCriterion("HS_TEXT_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerEqualTo(String value) {
            addCriterion("HS_TEXT_ANSWER =", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerNotEqualTo(String value) {
            addCriterion("HS_TEXT_ANSWER <>", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerGreaterThan(String value) {
            addCriterion("HS_TEXT_ANSWER >", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("HS_TEXT_ANSWER >=", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerLessThan(String value) {
            addCriterion("HS_TEXT_ANSWER <", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerLessThanOrEqualTo(String value) {
            addCriterion("HS_TEXT_ANSWER <=", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerLike(String value) {
            addCriterion("HS_TEXT_ANSWER like", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerNotLike(String value) {
            addCriterion("HS_TEXT_ANSWER not like", value, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerIn(List<String> values) {
            addCriterion("HS_TEXT_ANSWER in", values, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerNotIn(List<String> values) {
            addCriterion("HS_TEXT_ANSWER not in", values, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerBetween(String value1, String value2) {
            addCriterion("HS_TEXT_ANSWER between", value1, value2, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsTextAnswerNotBetween(String value1, String value2) {
            addCriterion("HS_TEXT_ANSWER not between", value1, value2, "hsTextAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerIsNull() {
            addCriterion("HS_ATTACH_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerIsNotNull() {
            addCriterion("HS_ATTACH_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerEqualTo(String value) {
            addCriterion("HS_ATTACH_ANSWER =", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerNotEqualTo(String value) {
            addCriterion("HS_ATTACH_ANSWER <>", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerGreaterThan(String value) {
            addCriterion("HS_ATTACH_ANSWER >", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("HS_ATTACH_ANSWER >=", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerLessThan(String value) {
            addCriterion("HS_ATTACH_ANSWER <", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerLessThanOrEqualTo(String value) {
            addCriterion("HS_ATTACH_ANSWER <=", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerLike(String value) {
            addCriterion("HS_ATTACH_ANSWER like", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerNotLike(String value) {
            addCriterion("HS_ATTACH_ANSWER not like", value, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerIn(List<String> values) {
            addCriterion("HS_ATTACH_ANSWER in", values, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerNotIn(List<String> values) {
            addCriterion("HS_ATTACH_ANSWER not in", values, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerBetween(String value1, String value2) {
            addCriterion("HS_ATTACH_ANSWER between", value1, value2, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsAttachAnswerNotBetween(String value1, String value2) {
            addCriterion("HS_ATTACH_ANSWER not between", value1, value2, "hsAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeIsNull() {
            addCriterion("HS_COMMIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeIsNotNull() {
            addCriterion("HS_COMMIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeEqualTo(Date value) {
            addCriterion("HS_COMMIT_TIME =", value, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeNotEqualTo(Date value) {
            addCriterion("HS_COMMIT_TIME <>", value, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeGreaterThan(Date value) {
            addCriterion("HS_COMMIT_TIME >", value, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HS_COMMIT_TIME >=", value, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeLessThan(Date value) {
            addCriterion("HS_COMMIT_TIME <", value, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("HS_COMMIT_TIME <=", value, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeIn(List<Date> values) {
            addCriterion("HS_COMMIT_TIME in", values, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeNotIn(List<Date> values) {
            addCriterion("HS_COMMIT_TIME not in", values, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeBetween(Date value1, Date value2) {
            addCriterion("HS_COMMIT_TIME between", value1, value2, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("HS_COMMIT_TIME not between", value1, value2, "hsCommitTime");
            return (Criteria) this;
        }

        public Criteria andHsScoreIsNull() {
            addCriterion("HS_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andHsScoreIsNotNull() {
            addCriterion("HS_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andHsScoreEqualTo(Integer value) {
            addCriterion("HS_SCORE =", value, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreNotEqualTo(Integer value) {
            addCriterion("HS_SCORE <>", value, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreGreaterThan(Integer value) {
            addCriterion("HS_SCORE >", value, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("HS_SCORE >=", value, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreLessThan(Integer value) {
            addCriterion("HS_SCORE <", value, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreLessThanOrEqualTo(Integer value) {
            addCriterion("HS_SCORE <=", value, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreIn(List<Integer> values) {
            addCriterion("HS_SCORE in", values, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreNotIn(List<Integer> values) {
            addCriterion("HS_SCORE not in", values, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreBetween(Integer value1, Integer value2) {
            addCriterion("HS_SCORE between", value1, value2, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("HS_SCORE not between", value1, value2, "hsScore");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdIsNull() {
            addCriterion("HS_TEACHER_ID is null");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdIsNotNull() {
            addCriterion("HS_TEACHER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdEqualTo(Integer value) {
            addCriterion("HS_TEACHER_ID =", value, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdNotEqualTo(Integer value) {
            addCriterion("HS_TEACHER_ID <>", value, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdGreaterThan(Integer value) {
            addCriterion("HS_TEACHER_ID >", value, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HS_TEACHER_ID >=", value, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdLessThan(Integer value) {
            addCriterion("HS_TEACHER_ID <", value, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("HS_TEACHER_ID <=", value, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdIn(List<Integer> values) {
            addCriterion("HS_TEACHER_ID in", values, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdNotIn(List<Integer> values) {
            addCriterion("HS_TEACHER_ID not in", values, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("HS_TEACHER_ID between", value1, value2, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HS_TEACHER_ID not between", value1, value2, "hsTeacherId");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagIsNull() {
            addCriterion("HS_CHECK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagIsNotNull() {
            addCriterion("HS_CHECK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagEqualTo(String value) {
            addCriterion("HS_CHECK_FLAG =", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagNotEqualTo(String value) {
            addCriterion("HS_CHECK_FLAG <>", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagGreaterThan(String value) {
            addCriterion("HS_CHECK_FLAG >", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("HS_CHECK_FLAG >=", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagLessThan(String value) {
            addCriterion("HS_CHECK_FLAG <", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("HS_CHECK_FLAG <=", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagLike(String value) {
            addCriterion("HS_CHECK_FLAG like", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagNotLike(String value) {
            addCriterion("HS_CHECK_FLAG not like", value, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagIn(List<String> values) {
            addCriterion("HS_CHECK_FLAG in", values, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagNotIn(List<String> values) {
            addCriterion("HS_CHECK_FLAG not in", values, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagBetween(String value1, String value2) {
            addCriterion("HS_CHECK_FLAG between", value1, value2, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckFlagNotBetween(String value1, String value2) {
            addCriterion("HS_CHECK_FLAG not between", value1, value2, "hsCheckFlag");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeIsNull() {
            addCriterion("HS_CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeIsNotNull() {
            addCriterion("HS_CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeEqualTo(Date value) {
            addCriterion("HS_CHECK_TIME =", value, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeNotEqualTo(Date value) {
            addCriterion("HS_CHECK_TIME <>", value, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeGreaterThan(Date value) {
            addCriterion("HS_CHECK_TIME >", value, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HS_CHECK_TIME >=", value, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeLessThan(Date value) {
            addCriterion("HS_CHECK_TIME <", value, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("HS_CHECK_TIME <=", value, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeIn(List<Date> values) {
            addCriterion("HS_CHECK_TIME in", values, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeNotIn(List<Date> values) {
            addCriterion("HS_CHECK_TIME not in", values, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeBetween(Date value1, Date value2) {
            addCriterion("HS_CHECK_TIME between", value1, value2, "hsCheckTime");
            return (Criteria) this;
        }

        public Criteria andHsCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("HS_CHECK_TIME not between", value1, value2, "hsCheckTime");
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