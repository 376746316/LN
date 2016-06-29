package com.chinasofti.cetp.live.model;

import java.util.Date;

public class AwardStu {
    private Integer awsId;

    private Integer awsAwardId;

    private Integer awsStuNo;

    private Integer awsCount;

    private Date awsSendTime;

    private Date awsRegtime;

    public Integer getAwsId() {
        return awsId;
    }

    public void setAwsId(Integer awsId) {
        this.awsId = awsId;
    }

    public Integer getAwsAwardId() {
        return awsAwardId;
    }

    public void setAwsAwardId(Integer awsAwardId) {
        this.awsAwardId = awsAwardId;
    }

    public Integer getAwsStuNo() {
        return awsStuNo;
    }

    public void setAwsStuNo(Integer awsStuNo) {
        this.awsStuNo = awsStuNo;
    }

    public Integer getAwsCount() {
        return awsCount;
    }

    public void setAwsCount(Integer awsCount) {
        this.awsCount = awsCount;
    }

    public Date getAwsSendTime() {
        return awsSendTime;
    }

    public void setAwsSendTime(Date awsSendTime) {
        this.awsSendTime = awsSendTime;
    }

    public Date getAwsRegtime() {
        return awsRegtime;
    }

    public void setAwsRegtime(Date awsRegtime) {
        this.awsRegtime = awsRegtime;
    }
}