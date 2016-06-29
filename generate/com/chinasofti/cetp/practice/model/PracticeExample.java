package com.chinasofti.cetp.practice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PracticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PracticeExample() {
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

        public Criteria andPracIdIsNull() {
            addCriterion("PRAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPracIdIsNotNull() {
            addCriterion("PRAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPracIdEqualTo(Integer value) {
            addCriterion("PRAC_ID =", value, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdNotEqualTo(Integer value) {
            addCriterion("PRAC_ID <>", value, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdGreaterThan(Integer value) {
            addCriterion("PRAC_ID >", value, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRAC_ID >=", value, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdLessThan(Integer value) {
            addCriterion("PRAC_ID <", value, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRAC_ID <=", value, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdLike(String value) {
            addCriterion("PRAC_ID like", value, "pracId");
            return (Criteria) this;
        }
        
        public Criteria andPracIdIn(List<Integer> values) {
            addCriterion("PRAC_ID in", values, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdNotIn(List<Integer> values) {
            addCriterion("PRAC_ID not in", values, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_ID between", value1, value2, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_ID not between", value1, value2, "pracId");
            return (Criteria) this;
        }

        public Criteria andPracNameIsNull() {
            addCriterion("PRAC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPracNameIsNotNull() {
            addCriterion("PRAC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPracNameEqualTo(String value) {
            addCriterion("PRAC_NAME =", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameNotEqualTo(String value) {
            addCriterion("PRAC_NAME <>", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameGreaterThan(String value) {
            addCriterion("PRAC_NAME >", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRAC_NAME >=", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameLessThan(String value) {
            addCriterion("PRAC_NAME <", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameLessThanOrEqualTo(String value) {
            addCriterion("PRAC_NAME <=", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameLike(String value) {
            addCriterion("PRAC_NAME like", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameNotLike(String value) {
            addCriterion("PRAC_NAME not like", value, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameIn(List<String> values) {
            addCriterion("PRAC_NAME in", values, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameNotIn(List<String> values) {
            addCriterion("PRAC_NAME not in", values, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameBetween(String value1, String value2) {
            addCriterion("PRAC_NAME between", value1, value2, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracNameNotBetween(String value1, String value2) {
            addCriterion("PRAC_NAME not between", value1, value2, "pracName");
            return (Criteria) this;
        }

        public Criteria andPracIntroIsNull() {
            addCriterion("PRAC_INTRO is null");
            return (Criteria) this;
        }

        public Criteria andPracIntroIsNotNull() {
            addCriterion("PRAC_INTRO is not null");
            return (Criteria) this;
        }

        public Criteria andPracIntroEqualTo(String value) {
            addCriterion("PRAC_INTRO =", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroNotEqualTo(String value) {
            addCriterion("PRAC_INTRO <>", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroGreaterThan(String value) {
            addCriterion("PRAC_INTRO >", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroGreaterThanOrEqualTo(String value) {
            addCriterion("PRAC_INTRO >=", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroLessThan(String value) {
            addCriterion("PRAC_INTRO <", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroLessThanOrEqualTo(String value) {
            addCriterion("PRAC_INTRO <=", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroLike(String value) {
            addCriterion("PRAC_INTRO like", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroNotLike(String value) {
            addCriterion("PRAC_INTRO not like", value, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroIn(List<String> values) {
            addCriterion("PRAC_INTRO in", values, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroNotIn(List<String> values) {
            addCriterion("PRAC_INTRO not in", values, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroBetween(String value1, String value2) {
            addCriterion("PRAC_INTRO between", value1, value2, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracIntroNotBetween(String value1, String value2) {
            addCriterion("PRAC_INTRO not between", value1, value2, "pracIntro");
            return (Criteria) this;
        }

        public Criteria andPracTypeIsNull() {
            addCriterion("PRAC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPracTypeIsNotNull() {
            addCriterion("PRAC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPracTypeEqualTo(String value) {
            addCriterion("PRAC_TYPE =", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeNotEqualTo(String value) {
            addCriterion("PRAC_TYPE <>", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeGreaterThan(String value) {
            addCriterion("PRAC_TYPE >", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRAC_TYPE >=", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeLessThan(String value) {
            addCriterion("PRAC_TYPE <", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeLessThanOrEqualTo(String value) {
            addCriterion("PRAC_TYPE <=", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeLike(String value) {
            addCriterion("PRAC_TYPE like", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeNotLike(String value) {
            addCriterion("PRAC_TYPE not like", value, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeIn(List<String> values) {
            addCriterion("PRAC_TYPE in", values, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeNotIn(List<String> values) {
            addCriterion("PRAC_TYPE not in", values, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeBetween(String value1, String value2) {
            addCriterion("PRAC_TYPE between", value1, value2, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracTypeNotBetween(String value1, String value2) {
            addCriterion("PRAC_TYPE not between", value1, value2, "pracType");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamIsNull() {
            addCriterion("PRAC_IS_TEAM is null");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamIsNotNull() {
            addCriterion("PRAC_IS_TEAM is not null");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamEqualTo(String value) {
            addCriterion("PRAC_IS_TEAM =", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamNotEqualTo(String value) {
            addCriterion("PRAC_IS_TEAM <>", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamGreaterThan(String value) {
            addCriterion("PRAC_IS_TEAM >", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamGreaterThanOrEqualTo(String value) {
            addCriterion("PRAC_IS_TEAM >=", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamLessThan(String value) {
            addCriterion("PRAC_IS_TEAM <", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamLessThanOrEqualTo(String value) {
            addCriterion("PRAC_IS_TEAM <=", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamLike(String value) {
            addCriterion("PRAC_IS_TEAM like", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamNotLike(String value) {
            addCriterion("PRAC_IS_TEAM not like", value, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamIn(List<String> values) {
            addCriterion("PRAC_IS_TEAM in", values, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamNotIn(List<String> values) {
            addCriterion("PRAC_IS_TEAM not in", values, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamBetween(String value1, String value2) {
            addCriterion("PRAC_IS_TEAM between", value1, value2, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracIsTeamNotBetween(String value1, String value2) {
            addCriterion("PRAC_IS_TEAM not between", value1, value2, "pracIsTeam");
            return (Criteria) this;
        }

        public Criteria andPracStartDateIsNull() {
            addCriterion("PRAC_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPracStartDateIsNotNull() {
            addCriterion("PRAC_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPracStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_START_DATE =", value, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_START_DATE <>", value, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PRAC_START_DATE >", value, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_START_DATE >=", value, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateLessThan(Date value) {
            addCriterionForJDBCDate("PRAC_START_DATE <", value, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_START_DATE <=", value, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("PRAC_START_DATE in", values, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRAC_START_DATE not in", values, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRAC_START_DATE between", value1, value2, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRAC_START_DATE not between", value1, value2, "pracStartDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateIsNull() {
            addCriterion("PRAC_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPracEndDateIsNotNull() {
            addCriterion("PRAC_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPracEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_END_DATE =", value, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_END_DATE <>", value, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PRAC_END_DATE >", value, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_END_DATE >=", value, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateLessThan(Date value) {
            addCriterionForJDBCDate("PRAC_END_DATE <", value, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRAC_END_DATE <=", value, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("PRAC_END_DATE in", values, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRAC_END_DATE not in", values, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRAC_END_DATE between", value1, value2, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRAC_END_DATE not between", value1, value2, "pracEndDate");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentIsNull() {
            addCriterion("PRAC_SOFT_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentIsNotNull() {
            addCriterion("PRAC_SOFT_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentEqualTo(Double value) {
            addCriterion("PRAC_SOFT_PERCENT =", value, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentNotEqualTo(Double value) {
            addCriterion("PRAC_SOFT_PERCENT <>", value, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentGreaterThan(Double value) {
            addCriterion("PRAC_SOFT_PERCENT >", value, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("PRAC_SOFT_PERCENT >=", value, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentLessThan(Double value) {
            addCriterion("PRAC_SOFT_PERCENT <", value, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentLessThanOrEqualTo(Double value) {
            addCriterion("PRAC_SOFT_PERCENT <=", value, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentIn(List<Double> values) {
            addCriterion("PRAC_SOFT_PERCENT in", values, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentNotIn(List<Double> values) {
            addCriterion("PRAC_SOFT_PERCENT not in", values, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentBetween(Double value1, Double value2) {
            addCriterion("PRAC_SOFT_PERCENT between", value1, value2, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracSoftPercentNotBetween(Double value1, Double value2) {
            addCriterion("PRAC_SOFT_PERCENT not between", value1, value2, "pracSoftPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentIsNull() {
            addCriterion("PRAC_TEAM_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentIsNotNull() {
            addCriterion("PRAC_TEAM_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentEqualTo(Double value) {
            addCriterion("PRAC_TEAM_PERCENT =", value, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentNotEqualTo(Double value) {
            addCriterion("PRAC_TEAM_PERCENT <>", value, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentGreaterThan(Double value) {
            addCriterion("PRAC_TEAM_PERCENT >", value, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("PRAC_TEAM_PERCENT >=", value, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentLessThan(Double value) {
            addCriterion("PRAC_TEAM_PERCENT <", value, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentLessThanOrEqualTo(Double value) {
            addCriterion("PRAC_TEAM_PERCENT <=", value, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentIn(List<Double> values) {
            addCriterion("PRAC_TEAM_PERCENT in", values, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentNotIn(List<Double> values) {
            addCriterion("PRAC_TEAM_PERCENT not in", values, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentBetween(Double value1, Double value2) {
            addCriterion("PRAC_TEAM_PERCENT between", value1, value2, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracTeamPercentNotBetween(Double value1, Double value2) {
            addCriterion("PRAC_TEAM_PERCENT not between", value1, value2, "pracTeamPercent");
            return (Criteria) this;
        }

        public Criteria andPracCostIsNull() {
            addCriterion("PRAC_COST is null");
            return (Criteria) this;
        }

        public Criteria andPracCostIsNotNull() {
            addCriterion("PRAC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andPracCostEqualTo(Integer value) {
            addCriterion("PRAC_COST =", value, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostNotEqualTo(Integer value) {
            addCriterion("PRAC_COST <>", value, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostGreaterThan(Integer value) {
            addCriterion("PRAC_COST >", value, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRAC_COST >=", value, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostLessThan(Integer value) {
            addCriterion("PRAC_COST <", value, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostLessThanOrEqualTo(Integer value) {
            addCriterion("PRAC_COST <=", value, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostIn(List<Integer> values) {
            addCriterion("PRAC_COST in", values, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostNotIn(List<Integer> values) {
            addCriterion("PRAC_COST not in", values, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_COST between", value1, value2, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracCostNotBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_COST not between", value1, value2, "pracCost");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeIsNull() {
            addCriterion("PRAC_TECH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeIsNotNull() {
            addCriterion("PRAC_TECH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeEqualTo(Integer value) {
            addCriterion("PRAC_TECH_TYPE =", value, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeNotEqualTo(Integer value) {
            addCriterion("PRAC_TECH_TYPE <>", value, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeGreaterThan(Integer value) {
            addCriterion("PRAC_TECH_TYPE >", value, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRAC_TECH_TYPE >=", value, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeLessThan(Integer value) {
            addCriterion("PRAC_TECH_TYPE <", value, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PRAC_TECH_TYPE <=", value, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeIn(List<Integer> values) {
            addCriterion("PRAC_TECH_TYPE in", values, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeNotIn(List<Integer> values) {
            addCriterion("PRAC_TECH_TYPE not in", values, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_TECH_TYPE between", value1, value2, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTechTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_TECH_TYPE not between", value1, value2, "pracTechType");
            return (Criteria) this;
        }

        public Criteria andPracTeacherIsNull() {
            addCriterion("PRAC_TEACHER is null");
            return (Criteria) this;
        }

        public Criteria andPracTeacherIsNotNull() {
            addCriterion("PRAC_TEACHER is not null");
            return (Criteria) this;
        }

        public Criteria andPracTeacherEqualTo(Integer value) {
            addCriterion("PRAC_TEACHER =", value, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherNotEqualTo(Integer value) {
            addCriterion("PRAC_TEACHER <>", value, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherGreaterThan(Integer value) {
            addCriterion("PRAC_TEACHER >", value, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRAC_TEACHER >=", value, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherLessThan(Integer value) {
            addCriterion("PRAC_TEACHER <", value, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherLessThanOrEqualTo(Integer value) {
            addCriterion("PRAC_TEACHER <=", value, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherIn(List<Integer> values) {
            addCriterion("PRAC_TEACHER in", values, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherNotIn(List<Integer> values) {
            addCriterion("PRAC_TEACHER not in", values, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_TEACHER between", value1, value2, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracTeacherNotBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_TEACHER not between", value1, value2, "pracTeacher");
            return (Criteria) this;
        }

        public Criteria andPracStatusIsNull() {
            addCriterion("PRAC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPracStatusIsNotNull() {
            addCriterion("PRAC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPracStatusEqualTo(String value) {
            addCriterion("PRAC_STATUS =", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusNotEqualTo(String value) {
            addCriterion("PRAC_STATUS <>", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusGreaterThan(String value) {
            addCriterion("PRAC_STATUS >", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PRAC_STATUS >=", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusLessThan(String value) {
            addCriterion("PRAC_STATUS <", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusLessThanOrEqualTo(String value) {
            addCriterion("PRAC_STATUS <=", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusLike(String value) {
            addCriterion("PRAC_STATUS like", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusNotLike(String value) {
            addCriterion("PRAC_STATUS not like", value, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusIn(List<String> values) {
            addCriterion("PRAC_STATUS in", values, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusNotIn(List<String> values) {
            addCriterion("PRAC_STATUS not in", values, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusBetween(String value1, String value2) {
            addCriterion("PRAC_STATUS between", value1, value2, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracStatusNotBetween(String value1, String value2) {
            addCriterion("PRAC_STATUS not between", value1, value2, "pracStatus");
            return (Criteria) this;
        }

        public Criteria andPracUserNoIsNull() {
            addCriterion("PRAC_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andPracUserNoIsNotNull() {
            addCriterion("PRAC_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPracUserNoEqualTo(Integer value) {
            addCriterion("PRAC_USER_NO =", value, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoNotEqualTo(Integer value) {
            addCriterion("PRAC_USER_NO <>", value, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoGreaterThan(Integer value) {
            addCriterion("PRAC_USER_NO >", value, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRAC_USER_NO >=", value, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoLessThan(Integer value) {
            addCriterion("PRAC_USER_NO <", value, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("PRAC_USER_NO <=", value, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoIn(List<Integer> values) {
            addCriterion("PRAC_USER_NO in", values, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoNotIn(List<Integer> values) {
            addCriterion("PRAC_USER_NO not in", values, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_USER_NO between", value1, value2, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_USER_NO not between", value1, value2, "pracUserNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoIsNull() {
            addCriterion("PRAC_STU_NO is null");
            return (Criteria) this;
        }

        public Criteria andPracStuNoIsNotNull() {
            addCriterion("PRAC_STU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPracStuNoEqualTo(Integer value) {
            addCriterion("PRAC_STU_NO =", value, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoNotEqualTo(Integer value) {
            addCriterion("PRAC_STU_NO <>", value, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoGreaterThan(Integer value) {
            addCriterion("PRAC_STU_NO >", value, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRAC_STU_NO >=", value, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoLessThan(Integer value) {
            addCriterion("PRAC_STU_NO <", value, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoLessThanOrEqualTo(Integer value) {
            addCriterion("PRAC_STU_NO <=", value, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoIn(List<Integer> values) {
            addCriterion("PRAC_STU_NO in", values, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoNotIn(List<Integer> values) {
            addCriterion("PRAC_STU_NO not in", values, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_STU_NO between", value1, value2, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracStuNoNotBetween(Integer value1, Integer value2) {
            addCriterion("PRAC_STU_NO not between", value1, value2, "pracStuNo");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeIsNull() {
            addCriterion("PRAC_REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeIsNotNull() {
            addCriterion("PRAC_REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeEqualTo(Date value) {
            addCriterion("PRAC_REGTIME =", value, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeNotEqualTo(Date value) {
            addCriterion("PRAC_REGTIME <>", value, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeGreaterThan(Date value) {
            addCriterion("PRAC_REGTIME >", value, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PRAC_REGTIME >=", value, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeLessThan(Date value) {
            addCriterion("PRAC_REGTIME <", value, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("PRAC_REGTIME <=", value, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeIn(List<Date> values) {
            addCriterion("PRAC_REGTIME in", values, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeNotIn(List<Date> values) {
            addCriterion("PRAC_REGTIME not in", values, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeBetween(Date value1, Date value2) {
            addCriterion("PRAC_REGTIME between", value1, value2, "pracRegtime");
            return (Criteria) this;
        }

        public Criteria andPracRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("PRAC_REGTIME not between", value1, value2, "pracRegtime");
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