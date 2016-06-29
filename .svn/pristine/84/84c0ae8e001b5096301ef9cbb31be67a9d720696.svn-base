package com.chinasofti.cetp.exam.model;

import java.util.Date;

import com.chinasofti.cetp.study.model.TechType;

public class ExamQues {
	
	/** 试题序号 **/
    private Long qId;
    /** 试题选项数目 **/
    private Long qMaxnum;
    /** 试题答题分数 **/
    private Double qScore;
    /** 试题出题人 **/
    private String qMaker;
    /** 试题入库时间 **/
    private Date qInstime;
    /** 试题类型编号 **/
    private Long qQtid;
    /** 试题类型对象引用 **/
    private ExamQuesType examQuesType = new ExamQuesType();
    /** 题目章节关联表ID **/
    private Integer cQid;
    /** 技术分类ID **/
    private Integer qTechtypeid;
    
    private TechType techType = new TechType();

    public Long getqId() {
        return qId;
    }

    public void setqId(Long qId) {
        this.qId = qId;
    }

    public Long getqMaxnum() {
        return qMaxnum;
    }

    public void setqMaxnum(Long qMaxnum) {
        this.qMaxnum = qMaxnum;
    }

    public String getqMaker() {
        return qMaker;
    }

    public void setqMaker(String qMaker) {
        this.qMaker = qMaker == null ? null : qMaker.trim();
    }

    public Date getqInstime() {
        return qInstime;
    }

    public void setqInstime(Date qInstime) {
        this.qInstime = qInstime;
    }

    public Long getqQtid() {
        return qQtid;
    }

    public void setqQtid(Long qQtid) {
        this.qQtid = qQtid;
    }

	public ExamQuesType getExamQuesType() {
		return examQuesType;
	}

	public void setExamQuesType(ExamQuesType examQuesType) {
		this.examQuesType = examQuesType;
	}

	public Integer getcQid() {
		return cQid;
	}

	public void setcQid(Integer cQid) {
		this.cQid = cQid;
	}

	public Double getqScore() {
		return qScore;
	}

	public void setqScore(Double qScore) {
		this.qScore = qScore;
	}

	public TechType getTechType() {
		return techType;
	}

	public void setTechType(TechType techType) {
		this.techType = techType;
	}

	public Integer getqTechtypeid() {
		return qTechtypeid;
	}

	public void setqTechtypeid(Integer qTechtypeid) {
		this.qTechtypeid = qTechtypeid;
	}
    
}