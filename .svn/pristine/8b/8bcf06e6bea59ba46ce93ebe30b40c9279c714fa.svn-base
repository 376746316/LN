package com.chinasofti.cetp.study.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExerciseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExerciseExample() {
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

        public Criteria andExerIdIsNull() {
            addCriterion("EXER_ID is null");
            return (Criteria) this;
        }

        public Criteria andExerIdIsNotNull() {
            addCriterion("EXER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExerIdEqualTo(Integer value) {
            addCriterion("EXER_ID =", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdNotEqualTo(Integer value) {
            addCriterion("EXER_ID <>", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdGreaterThan(Integer value) {
            addCriterion("EXER_ID >", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXER_ID >=", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdLessThan(Integer value) {
            addCriterion("EXER_ID <", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXER_ID <=", value, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdIn(List<Integer> values) {
            addCriterion("EXER_ID in", values, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdNotIn(List<Integer> values) {
            addCriterion("EXER_ID not in", values, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdBetween(Integer value1, Integer value2) {
            addCriterion("EXER_ID between", value1, value2, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXER_ID not between", value1, value2, "exerId");
            return (Criteria) this;
        }

        public Criteria andExerTitleIsNull() {
            addCriterion("EXER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andExerTitleIsNotNull() {
            addCriterion("EXER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andExerTitleEqualTo(String value) {
            addCriterion("EXER_TITLE =", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotEqualTo(String value) {
            addCriterion("EXER_TITLE <>", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleGreaterThan(String value) {
            addCriterion("EXER_TITLE >", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EXER_TITLE >=", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleLessThan(String value) {
            addCriterion("EXER_TITLE <", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleLessThanOrEqualTo(String value) {
            addCriterion("EXER_TITLE <=", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleLike(String value) {
            addCriterion("EXER_TITLE like", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotLike(String value) {
            addCriterion("EXER_TITLE not like", value, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleIn(List<String> values) {
            addCriterion("EXER_TITLE in", values, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotIn(List<String> values) {
            addCriterion("EXER_TITLE not in", values, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleBetween(String value1, String value2) {
            addCriterion("EXER_TITLE between", value1, value2, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTitleNotBetween(String value1, String value2) {
            addCriterion("EXER_TITLE not between", value1, value2, "exerTitle");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdIsNull() {
            addCriterion("EXER_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdIsNotNull() {
            addCriterion("EXER_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdEqualTo(Integer value) {
            addCriterion("EXER_TYPE_ID =", value, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdNotEqualTo(Integer value) {
            addCriterion("EXER_TYPE_ID <>", value, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdGreaterThan(Integer value) {
            addCriterion("EXER_TYPE_ID >", value, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXER_TYPE_ID >=", value, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdLessThan(Integer value) {
            addCriterion("EXER_TYPE_ID <", value, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("EXER_TYPE_ID <=", value, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdIn(List<Integer> values) {
            addCriterion("EXER_TYPE_ID in", values, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdNotIn(List<Integer> values) {
            addCriterion("EXER_TYPE_ID not in", values, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("EXER_TYPE_ID between", value1, value2, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EXER_TYPE_ID not between", value1, value2, "exerTypeId");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsIsNull() {
            addCriterion("EXER_KEYWORDS is null");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsIsNotNull() {
            addCriterion("EXER_KEYWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsEqualTo(String value) {
            addCriterion("EXER_KEYWORDS =", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsNotEqualTo(String value) {
            addCriterion("EXER_KEYWORDS <>", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsGreaterThan(String value) {
            addCriterion("EXER_KEYWORDS >", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("EXER_KEYWORDS >=", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsLessThan(String value) {
            addCriterion("EXER_KEYWORDS <", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsLessThanOrEqualTo(String value) {
            addCriterion("EXER_KEYWORDS <=", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsLike(String value) {
            addCriterion("EXER_KEYWORDS like", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsNotLike(String value) {
            addCriterion("EXER_KEYWORDS not like", value, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsIn(List<String> values) {
            addCriterion("EXER_KEYWORDS in", values, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsNotIn(List<String> values) {
            addCriterion("EXER_KEYWORDS not in", values, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsBetween(String value1, String value2) {
            addCriterion("EXER_KEYWORDS between", value1, value2, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerKeywordsNotBetween(String value1, String value2) {
            addCriterion("EXER_KEYWORDS not between", value1, value2, "exerKeywords");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultIsNull() {
            addCriterion("EXER_DIFFCULT is null");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultIsNotNull() {
            addCriterion("EXER_DIFFCULT is not null");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultEqualTo(String value) {
            addCriterion("EXER_DIFFCULT =", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultNotEqualTo(String value) {
            addCriterion("EXER_DIFFCULT <>", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultGreaterThan(String value) {
            addCriterion("EXER_DIFFCULT >", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultGreaterThanOrEqualTo(String value) {
            addCriterion("EXER_DIFFCULT >=", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultLessThan(String value) {
            addCriterion("EXER_DIFFCULT <", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultLessThanOrEqualTo(String value) {
            addCriterion("EXER_DIFFCULT <=", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultLike(String value) {
            addCriterion("EXER_DIFFCULT like", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultNotLike(String value) {
            addCriterion("EXER_DIFFCULT not like", value, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultIn(List<String> values) {
            addCriterion("EXER_DIFFCULT in", values, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultNotIn(List<String> values) {
            addCriterion("EXER_DIFFCULT not in", values, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultBetween(String value1, String value2) {
            addCriterion("EXER_DIFFCULT between", value1, value2, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerDiffcultNotBetween(String value1, String value2) {
            addCriterion("EXER_DIFFCULT not between", value1, value2, "exerDiffcult");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeIsNull() {
            addCriterion("EXER_SUGGEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeIsNotNull() {
            addCriterion("EXER_SUGGEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeEqualTo(Integer value) {
            addCriterion("EXER_SUGGEST_TIME =", value, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeNotEqualTo(Integer value) {
            addCriterion("EXER_SUGGEST_TIME <>", value, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeGreaterThan(Integer value) {
            addCriterion("EXER_SUGGEST_TIME >", value, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXER_SUGGEST_TIME >=", value, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeLessThan(Integer value) {
            addCriterion("EXER_SUGGEST_TIME <", value, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeLessThanOrEqualTo(Integer value) {
            addCriterion("EXER_SUGGEST_TIME <=", value, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeIn(List<Integer> values) {
            addCriterion("EXER_SUGGEST_TIME in", values, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeNotIn(List<Integer> values) {
            addCriterion("EXER_SUGGEST_TIME not in", values, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeBetween(Integer value1, Integer value2) {
            addCriterion("EXER_SUGGEST_TIME between", value1, value2, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerSuggestTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("EXER_SUGGEST_TIME not between", value1, value2, "exerSuggestTime");
            return (Criteria) this;
        }

        public Criteria andExerScoreIsNull() {
            addCriterion("EXER_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andExerScoreIsNotNull() {
            addCriterion("EXER_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andExerScoreEqualTo(Integer value) {
            addCriterion("EXER_SCORE =", value, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreNotEqualTo(Integer value) {
            addCriterion("EXER_SCORE <>", value, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreGreaterThan(Integer value) {
            addCriterion("EXER_SCORE >", value, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXER_SCORE >=", value, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreLessThan(Integer value) {
            addCriterion("EXER_SCORE <", value, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreLessThanOrEqualTo(Integer value) {
            addCriterion("EXER_SCORE <=", value, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreIn(List<Integer> values) {
            addCriterion("EXER_SCORE in", values, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreNotIn(List<Integer> values) {
            addCriterion("EXER_SCORE not in", values, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreBetween(Integer value1, Integer value2) {
            addCriterion("EXER_SCORE between", value1, value2, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("EXER_SCORE not between", value1, value2, "exerScore");
            return (Criteria) this;
        }

        public Criteria andExerAttachResIsNull() {
            addCriterion("EXER_ATTACH_RES is null");
            return (Criteria) this;
        }

        public Criteria andExerAttachResIsNotNull() {
            addCriterion("EXER_ATTACH_RES is not null");
            return (Criteria) this;
        }

        public Criteria andExerAttachResEqualTo(String value) {
            addCriterion("EXER_ATTACH_RES =", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResNotEqualTo(String value) {
            addCriterion("EXER_ATTACH_RES <>", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResGreaterThan(String value) {
            addCriterion("EXER_ATTACH_RES >", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResGreaterThanOrEqualTo(String value) {
            addCriterion("EXER_ATTACH_RES >=", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResLessThan(String value) {
            addCriterion("EXER_ATTACH_RES <", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResLessThanOrEqualTo(String value) {
            addCriterion("EXER_ATTACH_RES <=", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResLike(String value) {
            addCriterion("EXER_ATTACH_RES like", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResNotLike(String value) {
            addCriterion("EXER_ATTACH_RES not like", value, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResIn(List<String> values) {
            addCriterion("EXER_ATTACH_RES in", values, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResNotIn(List<String> values) {
            addCriterion("EXER_ATTACH_RES not in", values, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResBetween(String value1, String value2) {
            addCriterion("EXER_ATTACH_RES between", value1, value2, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachResNotBetween(String value1, String value2) {
            addCriterion("EXER_ATTACH_RES not between", value1, value2, "exerAttachRes");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerIsNull() {
            addCriterion("EXER_ATTACH_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerIsNotNull() {
            addCriterion("EXER_ATTACH_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerEqualTo(String value) {
            addCriterion("EXER_ATTACH_ANSWER =", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerNotEqualTo(String value) {
            addCriterion("EXER_ATTACH_ANSWER <>", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerGreaterThan(String value) {
            addCriterion("EXER_ATTACH_ANSWER >", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("EXER_ATTACH_ANSWER >=", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerLessThan(String value) {
            addCriterion("EXER_ATTACH_ANSWER <", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerLessThanOrEqualTo(String value) {
            addCriterion("EXER_ATTACH_ANSWER <=", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerLike(String value) {
            addCriterion("EXER_ATTACH_ANSWER like", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerNotLike(String value) {
            addCriterion("EXER_ATTACH_ANSWER not like", value, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerIn(List<String> values) {
            addCriterion("EXER_ATTACH_ANSWER in", values, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerNotIn(List<String> values) {
            addCriterion("EXER_ATTACH_ANSWER not in", values, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerBetween(String value1, String value2) {
            addCriterion("EXER_ATTACH_ANSWER between", value1, value2, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerAttachAnswerNotBetween(String value1, String value2) {
            addCriterion("EXER_ATTACH_ANSWER not between", value1, value2, "exerAttachAnswer");
            return (Criteria) this;
        }

        public Criteria andExerUserNoIsNull() {
            addCriterion("EXER_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andExerUserNoIsNotNull() {
            addCriterion("EXER_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExerUserNoEqualTo(Integer value) {
            addCriterion("EXER_USER_NO =", value, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoNotEqualTo(Integer value) {
            addCriterion("EXER_USER_NO <>", value, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoGreaterThan(Integer value) {
            addCriterion("EXER_USER_NO >", value, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXER_USER_NO >=", value, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoLessThan(Integer value) {
            addCriterion("EXER_USER_NO <", value, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("EXER_USER_NO <=", value, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoIn(List<Integer> values) {
            addCriterion("EXER_USER_NO in", values, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoNotIn(List<Integer> values) {
            addCriterion("EXER_USER_NO not in", values, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoBetween(Integer value1, Integer value2) {
            addCriterion("EXER_USER_NO between", value1, value2, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("EXER_USER_NO not between", value1, value2, "exerUserNo");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeIsNull() {
            addCriterion("EXER_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeIsNotNull() {
            addCriterion("EXER_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeEqualTo(Date value) {
            addCriterion("EXER_REGTIME =", value, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeNotEqualTo(Date value) {
            addCriterion("EXER_REGTIME <>", value, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeGreaterThan(Date value) {
            addCriterion("EXER_REGTIME >", value, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXER_REGTIME >=", value, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeLessThan(Date value) {
            addCriterion("EXER_REGTIME <", value, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("EXER_REGTIME <=", value, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeIn(List<Date> values) {
            addCriterion("EXER_REGTIME in", values, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeNotIn(List<Date> values) {
            addCriterion("EXER_REGTIME not in", values, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeBetween(Date value1, Date value2) {
            addCriterion("EXER_REGTIME between", value1, value2, "exerRegtime");
            return (Criteria) this;
        }

        public Criteria andExerRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("EXER_REGTIME not between", value1, value2, "exerRegtime");
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