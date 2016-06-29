package com.chinasofti.cetp.practice.model;

public class ProWithBLOBs extends Pro {
    private String proIntro;

    private String proTarget;

    private String proDevEnv;

    public String getProIntro() {
        return proIntro;
    }

    public void setProIntro(String proIntro) {
        this.proIntro = proIntro == null ? null : proIntro.trim();
    }

    public String getProTarget() {
        return proTarget;
    }

    public void setProTarget(String proTarget) {
        this.proTarget = proTarget == null ? null : proTarget.trim();
    }

    public String getProDevEnv() {
        return proDevEnv;
    }

    public void setProDevEnv(String proDevEnv) {
        this.proDevEnv = proDevEnv == null ? null : proDevEnv.trim();
    }
}