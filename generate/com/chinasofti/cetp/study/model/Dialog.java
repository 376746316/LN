package com.chinasofti.cetp.study.model;

import java.util.Date;
import java.util.List;

public class Dialog {
    private String dialogId;

    private String dialogName;

    private Date dialogTime;

    private Integer stuNo;

    private Integer teacherId;

    private List<Message> msgList;
    

    public String getDialogId() {
		return dialogId;
	}

	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}

	public String getDialogName() {
        return dialogName;
    }

    public void setDialogName(String dialogName) {
        this.dialogName = dialogName == null ? null : dialogName.trim();
    }

    public Date getDialogTime() {
        return dialogTime;
    }

    public void setDialogTime(Date dialogTime) {
        this.dialogTime = dialogTime;
    }

    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

	public List<Message> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<Message> msgList) {
		this.msgList = msgList;
	}
    
}