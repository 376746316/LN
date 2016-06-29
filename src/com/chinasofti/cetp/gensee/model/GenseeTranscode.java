package com.chinasofti.cetp.gensee.model;

public class GenseeTranscode extends GenseeCode{
    private Long fileId;

    private String name;

    private String coursewareId;

    private String coursewareCode;

    private Integer userNo;

    private String resourceUrl;

    private String visitUrl;
    
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCoursewareId() {
        return coursewareId;
    }

    public void setCoursewareId(String coursewareId) {
        this.coursewareId = coursewareId;
    }

    public String getCoursewareCode() {
        return coursewareCode;
    }

    public void setCoursewareCode(String coursewareCode) {
        this.coursewareCode = coursewareCode == null ? null : coursewareCode.trim();
    }

    public Integer getUserNo() {
        return userNo;
    }

    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl == null ? null : visitUrl.trim();
    }
}