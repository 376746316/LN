package com.chinasofti.cetp.exam.model;

public class ExamAnsw {
	/** 章节测验答卷ID **/
    private Integer eaId;

    /** 章节编号 **/
    private Integer eaChapId;

    /** 用户编号（学生） **/
    private Integer eaStuNo;

    /** 测验题目编号 **/
    private Long eaQId;

    /** 用户答卷答案  **/
    private String eaStuansw;

    /** 用户答卷试题得分 **/
    private Double eaScore;

    /** 直播课编号 **/
    private Integer eaLivecourseId;

    public Integer getEaId() {
        return eaId;
    }

    public void setEaId(Integer eaId) {
        this.eaId = eaId;
    }

    public Integer getEaChapId() {
        return eaChapId;
    }

    public void setEaChapId(Integer eaChapId) {
        this.eaChapId = eaChapId;
    }

    public Integer getEaStuNo() {
        return eaStuNo;
    }

    public void setEaStuNo(Integer eaStuNo) {
        this.eaStuNo = eaStuNo;
    }

    public Long getEaQId() {
        return eaQId;
    }

    public void setEaQId(Long eaQId) {
        this.eaQId = eaQId;
    }

    public String getEaStuansw() {
        return eaStuansw;
    }

    public void setEaStuansw(String eaStuansw) {
        this.eaStuansw = eaStuansw == null ? null : eaStuansw.trim();
    }

    public Double getEaScore() {
        return eaScore;
    }

    public void setEaScore(Double eaScore) {
        this.eaScore = eaScore;
    }

    public Integer getEaLivecourseId() {
        return eaLivecourseId;
    }

    public void setEaLivecourseId(Integer eaLivecourseId) {
        this.eaLivecourseId = eaLivecourseId;
    }
}