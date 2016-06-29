package com.chinasofti.cetp.question.model;

public class AnswerWithBLOBs extends Answer {
    private String ansContent;

    private String ansEva;

    public String getAnsContent() {
        return ansContent;
    }

    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent == null ? null : ansContent.trim();
    }

    public String getAnsEva() {
        return ansEva;
    }

    public void setAnsEva(String ansEva) {
        this.ansEva = ansEva == null ? null : ansEva.trim();
    }
}