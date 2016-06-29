package com.chinasofti.cetp.study.model;

import java.util.Date;

public class Note {
    private Integer noteId;

    private Integer noteScid;

    private Integer noteStuNo;

    private String notePlayTime;

    private Date noteRegtime;

    private String noteContent;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getNoteScid() {
        return noteScid;
    }

    public void setNoteScid(Integer noteScid) {
        this.noteScid = noteScid;
    }

    public Integer getNoteStuNo() {
        return noteStuNo;
    }

    public void setNoteStuNo(Integer noteStuNo) {
        this.noteStuNo = noteStuNo;
    }

    public String getNotePlayTime() {
        return notePlayTime;
    }

    public void setNotePlayTime(String notePlayTime) {
        this.notePlayTime = notePlayTime == null ? null : notePlayTime.trim();
    }

    public Date getNoteRegtime() {
        return noteRegtime;
    }

    public void setNoteRegtime(Date noteRegtime) {
        this.noteRegtime = noteRegtime;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent == null ? null : noteContent.trim();
    }
}