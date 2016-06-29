package com.chinasofti.cetp.exam.model;

public class ExamQuesWithBLOBs extends ExamQues {
	/** 试题问题描述 **/
    private String qDescribe;

    /** 试题正文 **/
    private String qContent;
    
    /** 试题备选答案 **/
    private String qAnswer;

    /** 试题教师详解 **/
    private String qDetailans;

    /** 试题正确答案 **/
    private String qRightans;
    public String getqDescribe() {
        return qDescribe;
    }

    public void setqDescribe(String qDescribe) {
        this.qDescribe = qDescribe == null ? null : qDescribe.trim();
    }

    public String getqContent() {
        return qContent;
    }

    public void setqContent(String qContent) {
        this.qContent = qContent == null ? null : qContent.trim();
    }

    public String getqAnswer() {
        return qAnswer;
    }

    public void setqAnswer(String qAnswer) {
        this.qAnswer = qAnswer == null ? null : qAnswer.trim();
    }

    public String getqDetailans() {
        return qDetailans;
    }

    public void setqDetailans(String qDetailans) {
        this.qDetailans = qDetailans == null ? null : qDetailans.trim();
    }

    public String getqRightans() {
        return qRightans;
    }

    public void setqRightans(String qRightans) {
        this.qRightans = qRightans == null ? null : qRightans.trim();
    }

	@Override
    public String toString() {
	    return "ExamQuesWithBLOBs [qDescribe=" + qDescribe + ", qContent=" + qContent + ", qAnswer=" + qAnswer + ", qDetailans=" + qDetailans + ", qRightans=" + qRightans + ", getqId()=" + getqId() + ", getqMaxnum()=" + getqMaxnum() + ", getqMaker()=" + getqMaker() + ", getqInstime()=" + getqInstime() + ", getqQtid()=" + getqQtid() + ", getExamQuesType()=" + getExamQuesType() + ", getcQid()=" + getcQid() + ", getqScore()=" + getqScore() + ", getTechType()=" + getTechType() + ", getqTechtypeid()=" + getqTechtypeid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}