package com.chinasofti.cetp.study.model;

import java.util.Date;

public class Exam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer examId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_TYPE_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer examTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_KEYWORDS
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private String examKeywords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_DIFFCULT
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private String examDiffcult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_SUGGEST_TIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer examSuggestTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_SCORE
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer examScore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_ATTACH_RES
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private String examAttachRes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_ATTACH_ANSWER
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private String examAttachAnswer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_TYPE
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private String examType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_USER_NO
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Integer examUserNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tp_exam.EXAM_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    private Date examRegtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_ID
     *
     * @return the value of tp_exam.EXAM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_ID
     *
     * @param examId the value for tp_exam.EXAM_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_TYPE_ID
     *
     * @return the value of tp_exam.EXAM_TYPE_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getExamTypeId() {
        return examTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_TYPE_ID
     *
     * @param examTypeId the value for tp_exam.EXAM_TYPE_ID
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamTypeId(Integer examTypeId) {
        this.examTypeId = examTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_KEYWORDS
     *
     * @return the value of tp_exam.EXAM_KEYWORDS
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public String getExamKeywords() {
        return examKeywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_KEYWORDS
     *
     * @param examKeywords the value for tp_exam.EXAM_KEYWORDS
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamKeywords(String examKeywords) {
        this.examKeywords = examKeywords == null ? null : examKeywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_DIFFCULT
     *
     * @return the value of tp_exam.EXAM_DIFFCULT
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public String getExamDiffcult() {
        return examDiffcult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_DIFFCULT
     *
     * @param examDiffcult the value for tp_exam.EXAM_DIFFCULT
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamDiffcult(String examDiffcult) {
        this.examDiffcult = examDiffcult == null ? null : examDiffcult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_SUGGEST_TIME
     *
     * @return the value of tp_exam.EXAM_SUGGEST_TIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getExamSuggestTime() {
        return examSuggestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_SUGGEST_TIME
     *
     * @param examSuggestTime the value for tp_exam.EXAM_SUGGEST_TIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamSuggestTime(Integer examSuggestTime) {
        this.examSuggestTime = examSuggestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_SCORE
     *
     * @return the value of tp_exam.EXAM_SCORE
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getExamScore() {
        return examScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_SCORE
     *
     * @param examScore the value for tp_exam.EXAM_SCORE
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamScore(Integer examScore) {
        this.examScore = examScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_ATTACH_RES
     *
     * @return the value of tp_exam.EXAM_ATTACH_RES
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public String getExamAttachRes() {
        return examAttachRes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_ATTACH_RES
     *
     * @param examAttachRes the value for tp_exam.EXAM_ATTACH_RES
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamAttachRes(String examAttachRes) {
        this.examAttachRes = examAttachRes == null ? null : examAttachRes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_ATTACH_ANSWER
     *
     * @return the value of tp_exam.EXAM_ATTACH_ANSWER
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public String getExamAttachAnswer() {
        return examAttachAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_ATTACH_ANSWER
     *
     * @param examAttachAnswer the value for tp_exam.EXAM_ATTACH_ANSWER
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamAttachAnswer(String examAttachAnswer) {
        this.examAttachAnswer = examAttachAnswer == null ? null : examAttachAnswer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_TYPE
     *
     * @return the value of tp_exam.EXAM_TYPE
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public String getExamType() {
        return examType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_TYPE
     *
     * @param examType the value for tp_exam.EXAM_TYPE
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamType(String examType) {
        this.examType = examType == null ? null : examType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_USER_NO
     *
     * @return the value of tp_exam.EXAM_USER_NO
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Integer getExamUserNo() {
        return examUserNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_USER_NO
     *
     * @param examUserNo the value for tp_exam.EXAM_USER_NO
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamUserNo(Integer examUserNo) {
        this.examUserNo = examUserNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tp_exam.EXAM_REGTIME
     *
     * @return the value of tp_exam.EXAM_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public Date getExamRegtime() {
        return examRegtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tp_exam.EXAM_REGTIME
     *
     * @param examRegtime the value for tp_exam.EXAM_REGTIME
     *
     * @mbggenerated Thu Jul 25 19:26:27 CST 2013
     */
    public void setExamRegtime(Date examRegtime) {
        this.examRegtime = examRegtime;
    }
}