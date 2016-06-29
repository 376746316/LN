package com.chinasofti.cetp.survey.model;

import java.util.Date;

public class SurveyQueItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_survey_que_item.SQI_ID
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    private Integer sqiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_survey_que_item.SQI_QA_ID
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    private Integer sqiQaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_survey_que_item.SQI_CONTENT
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    private String sqiContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_survey_que_item.SQI_PERCENT
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    private Double sqiPercent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_survey_que_item.SQI_PROP
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    private String sqiProp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_survey_que_item.SQI_REGTIME
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    private Date sqiRegtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_survey_que_item.SQI_ID
     *
     * @return the value of tp_survey_que_item.SQI_ID
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public Integer getSqiId() {
        return sqiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_survey_que_item.SQI_ID
     *
     * @param sqiId the value for tp_survey_que_item.SQI_ID
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setSqiId(Integer sqiId) {
        this.sqiId = sqiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_survey_que_item.SQI_QA_ID
     *
     * @return the value of tp_survey_que_item.SQI_QA_ID
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public Integer getSqiQaId() {
        return sqiQaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_survey_que_item.SQI_QA_ID
     *
     * @param sqiQaId the value for tp_survey_que_item.SQI_QA_ID
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setSqiQaId(Integer sqiQaId) {
        this.sqiQaId = sqiQaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_survey_que_item.SQI_CONTENT
     *
     * @return the value of tp_survey_que_item.SQI_CONTENT
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public String getSqiContent() {
        return sqiContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_survey_que_item.SQI_CONTENT
     *
     * @param sqiContent the value for tp_survey_que_item.SQI_CONTENT
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setSqiContent(String sqiContent) {
        this.sqiContent = sqiContent == null ? null : sqiContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_survey_que_item.SQI_PERCENT
     *
     * @return the value of tp_survey_que_item.SQI_PERCENT
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public Double getSqiPercent() {
        return sqiPercent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_survey_que_item.SQI_PERCENT
     *
     * @param sqiPercent the value for tp_survey_que_item.SQI_PERCENT
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setSqiPercent(Double sqiPercent) {
        this.sqiPercent = sqiPercent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_survey_que_item.SQI_PROP
     *
     * @return the value of tp_survey_que_item.SQI_PROP
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public String getSqiProp() {
        return sqiProp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_survey_que_item.SQI_PROP
     *
     * @param sqiProp the value for tp_survey_que_item.SQI_PROP
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setSqiProp(String sqiProp) {
        this.sqiProp = sqiProp == null ? null : sqiProp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_survey_que_item.SQI_REGTIME
     *
     * @return the value of tp_survey_que_item.SQI_REGTIME
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public Date getSqiRegtime() {
        return sqiRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_survey_que_item.SQI_REGTIME
     *
     * @param sqiRegtime the value for tp_survey_que_item.SQI_REGTIME
     *
     * @mbggenerated Thu Jul 25 20:01:32 CST 2013
     */
    public void setSqiRegtime(Date sqiRegtime) {
        this.sqiRegtime = sqiRegtime;
    }
}