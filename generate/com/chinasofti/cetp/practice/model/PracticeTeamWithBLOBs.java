package com.chinasofti.cetp.practice.model;

public class PracticeTeamWithBLOBs extends PracticeTeam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_practice_team.TEAM_SUMMARY
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private String teamSummary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_practice_team.TEAM_EVALUATE
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    private String teamEvaluate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_practice_team.TEAM_SUMMARY
     *
     * @return the value of tp_practice_team.TEAM_SUMMARY
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getTeamSummary() {
        return teamSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_practice_team.TEAM_SUMMARY
     *
     * @param teamSummary the value for tp_practice_team.TEAM_SUMMARY
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTeamSummary(String teamSummary) {
        this.teamSummary = teamSummary == null ? null : teamSummary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_practice_team.TEAM_EVALUATE
     *
     * @return the value of tp_practice_team.TEAM_EVALUATE
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public String getTeamEvaluate() {
        return teamEvaluate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_practice_team.TEAM_EVALUATE
     *
     * @param teamEvaluate the value for tp_practice_team.TEAM_EVALUATE
     *
     * @mbggenerated Thu Jul 25 19:47:24 CST 2013
     */
    public void setTeamEvaluate(String teamEvaluate) {
        this.teamEvaluate = teamEvaluate == null ? null : teamEvaluate.trim();
    }
}