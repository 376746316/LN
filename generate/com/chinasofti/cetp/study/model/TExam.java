package com.chinasofti.cetp.study.model;

import java.util.Date;

public class TExam {
    private Long eId;

    private Long epId;

    private String eName;

    private Long eStatus;

    private Date eStartdate;

    private Date eEnddate;

    private String eStarttime;

    private String eEndtime;

    private Long eDuration;

    private Long eAllowtimes;

    private String eMode;

    private String eAnsmode;

    private Long eSingletime;

    private Long eConfusionques;

    private Long eConfusionans;

    private Long eViewanstime;

    private Long eNumpeople;

    private Long eScene;

    private String eScenescale;

    private Date eInstime;

    private Long eSelftest;

    private Long eCreateEpModel;

    private Date eCreateEpTime;

    private Long eDecideEpModel;

    private Date eDecideEpTime;

    private Long eTimes;

    private Long eGenerateStatus;

    private Double ePassscore;

    private Long ePid;

    private String eCaption;

    public Long geteId() {
        return eId;
    }

    public void seteId(Long eId) {
        this.eId = eId;
    }

    public Long getEpId() {
        return epId;
    }

    public void setEpId(Long epId) {
        this.epId = epId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public Long geteStatus() {
        return eStatus;
    }

    public void seteStatus(Long eStatus) {
        this.eStatus = eStatus;
    }

    public Date geteStartdate() {
        return eStartdate;
    }

    public void seteStartdate(Date eStartdate) {
        this.eStartdate = eStartdate;
    }

    public Date geteEnddate() {
        return eEnddate;
    }

    public void seteEnddate(Date eEnddate) {
        this.eEnddate = eEnddate;
    }

    public String geteStarttime() {
        return eStarttime;
    }

    public void seteStarttime(String eStarttime) {
        this.eStarttime = eStarttime == null ? null : eStarttime.trim();
    }

    public String geteEndtime() {
        return eEndtime;
    }

    public void seteEndtime(String eEndtime) {
        this.eEndtime = eEndtime == null ? null : eEndtime.trim();
    }

    public Long geteDuration() {
        return eDuration;
    }

    public void seteDuration(Long eDuration) {
        this.eDuration = eDuration;
    }

    public Long geteAllowtimes() {
        return eAllowtimes;
    }

    public void seteAllowtimes(Long eAllowtimes) {
        this.eAllowtimes = eAllowtimes;
    }

    public String geteMode() {
        return eMode;
    }

    public void seteMode(String eMode) {
        this.eMode = eMode == null ? null : eMode.trim();
    }

    public String geteAnsmode() {
        return eAnsmode;
    }

    public void seteAnsmode(String eAnsmode) {
        this.eAnsmode = eAnsmode == null ? null : eAnsmode.trim();
    }

    public Long geteSingletime() {
        return eSingletime;
    }

    public void seteSingletime(Long eSingletime) {
        this.eSingletime = eSingletime;
    }

    public Long geteConfusionques() {
        return eConfusionques;
    }

    public void seteConfusionques(Long eConfusionques) {
        this.eConfusionques = eConfusionques;
    }

    public Long geteConfusionans() {
        return eConfusionans;
    }

    public void seteConfusionans(Long eConfusionans) {
        this.eConfusionans = eConfusionans;
    }

    public Long geteViewanstime() {
        return eViewanstime;
    }

    public void seteViewanstime(Long eViewanstime) {
        this.eViewanstime = eViewanstime;
    }

    public Long geteNumpeople() {
        return eNumpeople;
    }

    public void seteNumpeople(Long eNumpeople) {
        this.eNumpeople = eNumpeople;
    }

    public Long geteScene() {
        return eScene;
    }

    public void seteScene(Long eScene) {
        this.eScene = eScene;
    }

    public String geteScenescale() {
        return eScenescale;
    }

    public void seteScenescale(String eScenescale) {
        this.eScenescale = eScenescale == null ? null : eScenescale.trim();
    }

    public Date geteInstime() {
        return eInstime;
    }

    public void seteInstime(Date eInstime) {
        this.eInstime = eInstime;
    }

    public Long geteSelftest() {
        return eSelftest;
    }

    public void seteSelftest(Long eSelftest) {
        this.eSelftest = eSelftest;
    }

    public Long geteCreateEpModel() {
        return eCreateEpModel;
    }

    public void seteCreateEpModel(Long eCreateEpModel) {
        this.eCreateEpModel = eCreateEpModel;
    }

    public Date geteCreateEpTime() {
        return eCreateEpTime;
    }

    public void seteCreateEpTime(Date eCreateEpTime) {
        this.eCreateEpTime = eCreateEpTime;
    }

    public Long geteDecideEpModel() {
        return eDecideEpModel;
    }

    public void seteDecideEpModel(Long eDecideEpModel) {
        this.eDecideEpModel = eDecideEpModel;
    }

    public Date geteDecideEpTime() {
        return eDecideEpTime;
    }

    public void seteDecideEpTime(Date eDecideEpTime) {
        this.eDecideEpTime = eDecideEpTime;
    }

    public Long geteTimes() {
        return eTimes;
    }

    public void seteTimes(Long eTimes) {
        this.eTimes = eTimes;
    }

    public Long geteGenerateStatus() {
        return eGenerateStatus;
    }

    public void seteGenerateStatus(Long eGenerateStatus) {
        this.eGenerateStatus = eGenerateStatus;
    }

    public Double getePassscore() {
        return ePassscore;
    }

    public void setePassscore(Double ePassscore) {
        this.ePassscore = ePassscore;
    }

    public Long getePid() {
        return ePid;
    }

    public void setePid(Long ePid) {
        this.ePid = ePid;
    }

    public String geteCaption() {
        return eCaption;
    }

    public void seteCaption(String eCaption) {
        this.eCaption = eCaption == null ? null : eCaption.trim();
    }
}