package com.chinasofti.cetp.study.model;

import java.util.Date;

public class SpecCourse {
    private Integer specId;

    private String specName;

    private String specCode;

    private String specPreCourse;

    private String specMajor;

    private Integer specTheoryTime;

    private Integer specPracTime;

    private Double specTheoryCredit;

    private Double specPracCredit;

    private String specFlag;

    private String specStatus;

    private Integer specTypeId;

    private String specEduBook;

    private String specVersion;

    private Double specAvgGrade;

    private Double specPracGrade;

    private Double specExamGrade;

    private String specStandard;

    private Integer specUserNo;

    private Date specRegtime;

    private String specClass;

    private Integer specCost;

    private Long specCount;

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode == null ? null : specCode.trim();
    }

    public String getSpecPreCourse() {
        return specPreCourse;
    }

    public void setSpecPreCourse(String specPreCourse) {
        this.specPreCourse = specPreCourse == null ? null : specPreCourse.trim();
    }

    public String getSpecMajor() {
        return specMajor;
    }

    public void setSpecMajor(String specMajor) {
        this.specMajor = specMajor == null ? null : specMajor.trim();
    }

    public Integer getSpecTheoryTime() {
        return specTheoryTime;
    }

    public void setSpecTheoryTime(Integer specTheoryTime) {
        this.specTheoryTime = specTheoryTime;
    }

    public Integer getSpecPracTime() {
        return specPracTime;
    }

    public void setSpecPracTime(Integer specPracTime) {
        this.specPracTime = specPracTime;
    }

    public Double getSpecTheoryCredit() {
        return specTheoryCredit;
    }

    public void setSpecTheoryCredit(Double specTheoryCredit) {
        this.specTheoryCredit = specTheoryCredit;
    }

    public Double getSpecPracCredit() {
        return specPracCredit;
    }

    public void setSpecPracCredit(Double specPracCredit) {
        this.specPracCredit = specPracCredit;
    }

    public String getSpecFlag() {
        return specFlag;
    }

    public void setSpecFlag(String specFlag) {
        this.specFlag = specFlag == null ? null : specFlag.trim();
    }

    public String getSpecStatus() {
        return specStatus;
    }

    public void setSpecStatus(String specStatus) {
        this.specStatus = specStatus == null ? null : specStatus.trim();
    }

    public Integer getSpecTypeId() {
        return specTypeId;
    }

    public void setSpecTypeId(Integer specTypeId) {
        this.specTypeId = specTypeId;
    }

    public String getSpecEduBook() {
        return specEduBook;
    }

    public void setSpecEduBook(String specEduBook) {
        this.specEduBook = specEduBook == null ? null : specEduBook.trim();
    }

    public String getSpecVersion() {
        return specVersion;
    }

    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion == null ? null : specVersion.trim();
    }

    public Double getSpecAvgGrade() {
        return specAvgGrade;
    }

    public void setSpecAvgGrade(Double specAvgGrade) {
        this.specAvgGrade = specAvgGrade;
    }

    public Double getSpecPracGrade() {
        return specPracGrade;
    }

    public void setSpecPracGrade(Double specPracGrade) {
        this.specPracGrade = specPracGrade;
    }

    public Double getSpecExamGrade() {
        return specExamGrade;
    }

    public void setSpecExamGrade(Double specExamGrade) {
        this.specExamGrade = specExamGrade;
    }

    public String getSpecStandard() {
        return specStandard;
    }

    public void setSpecStandard(String specStandard) {
        this.specStandard = specStandard == null ? null : specStandard.trim();
    }

    public Integer getSpecUserNo() {
        return specUserNo;
    }

    public void setSpecUserNo(Integer specUserNo) {
        this.specUserNo = specUserNo;
    }

    public Date getSpecRegtime() {
        return specRegtime;
    }

    public void setSpecRegtime(Date specRegtime) {
        this.specRegtime = specRegtime;
    }

    public String getSpecClass() {
        return specClass;
    }

    public void setSpecClass(String specClass) {
        this.specClass = specClass == null ? null : specClass.trim();
    }

    public Integer getSpecCost() {
        return specCost;
    }

    public void setSpecCost(Integer specCost) {
        this.specCost = specCost;
    }

    public Long getSpecCount() {
        return specCount;
    }

    public void setSpecCount(Long specCount) {
        this.specCount = specCount;
    }
}