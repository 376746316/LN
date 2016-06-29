package com.lidezheng.chapter.model;

public class ChapterWithBLOBs extends Chapter {
    private String chapHomework;

    private String chapHwAns;

    public String getChapHomework() {
        return chapHomework;
    }

    public void setChapHomework(String chapHomework) {
        this.chapHomework = chapHomework == null ? null : chapHomework.trim();
    }

    public String getChapHwAns() {
        return chapHwAns;
    }

    public void setChapHwAns(String chapHwAns) {
        this.chapHwAns = chapHwAns == null ? null : chapHwAns.trim();
    }
}