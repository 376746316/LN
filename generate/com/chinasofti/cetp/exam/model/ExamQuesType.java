package com.chinasofti.cetp.exam.model;

public class ExamQuesType {
	
	/** 试题类型编 **/
    private Long qtId;
  
    /** 试题类型名称 **/
    private String qtName;

    private String qtCode;
  
    /** 试题类型输出类型：radio,checkbox,text,textarea **/
    private String qtOuttype;
   
    /** 是否主观题:0为主观题，1为非主观 **/
    private Boolean qtSubjective;

    public Long getQtId() {
        return qtId;
    }

    public void setQtId(Long qtId) {
        this.qtId = qtId;
    }

    public String getQtName() {
        return qtName;
    }

    public void setQtName(String qtName) {
        this.qtName = qtName == null ? null : qtName.trim();
    }

    public String getQtCode() {
        return qtCode;
    }

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode == null ? null : qtCode.trim();
    }

    public String getQtOuttype() {
        return qtOuttype;
    }

    public void setQtOuttype(String qtOuttype) {
        this.qtOuttype = qtOuttype == null ? null : qtOuttype.trim();
    }

    public Boolean getQtSubjective() {
        return qtSubjective;
    }

    public void setQtSubjective(Boolean qtSubjective) {
        this.qtSubjective = qtSubjective;
    }
}