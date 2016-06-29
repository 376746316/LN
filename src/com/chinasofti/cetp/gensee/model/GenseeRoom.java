package com.chinasofti.cetp.gensee.model;

import java.util.Date;

public class GenseeRoom extends GenseeCode {
	private Long roomId;

	private String id;

	private String number;

	private String subject;

	private String teacherToken;

	private String studentToken;

	private String studentClientToken;

	private Date startDate;

	private Date invalidDate;

	private String assistantToken;

	private String webJoin;

	private String clientJoin;

	private String description;

	private Integer duration;

	private Integer uiMode;

	private String uiColor;

	private Integer scene;

	private String uiWindow;

	private String uiVideo;

	private String upgrade;

	private String sec;

	private String realtime;

	private Integer maxAttendees;

	private Integer usersNo;

	private String teacherJoinUrl;

	private String studentJoinUrl;

	private String speakerInfo;

	private String scheduleInfo;

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number == null ? null : number.trim();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject == null ? null : subject.trim();
	}

	public String getTeacherToken() {
		return teacherToken;
	}

	public void setTeacherToken(String teacherToken) {
		this.teacherToken = teacherToken == null ? null : teacherToken.trim();
	}

	public String getStudentToken() {
		return studentToken;
	}

	public void setStudentToken(String studentToken) {
		this.studentToken = studentToken == null ? null : studentToken.trim();
	}

	public String getStudentClientToken() {
		return studentClientToken;
	}

	public void setStudentClientToken(String studentClientToken) {
		this.studentClientToken = studentClientToken == null ? null : studentClientToken.trim();
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getAssistantToken() {
		return assistantToken;
	}

	public void setAssistantToken(String assistantToken) {
		this.assistantToken = assistantToken == null ? null : assistantToken.trim();
	}

	public String getWebJoin() {
		return webJoin;
	}

	public void setWebJoin(String webJoin) {
		this.webJoin = webJoin == null ? null : webJoin.trim();
	}

	public String getClientJoin() {
		return clientJoin;
	}

	public void setClientJoin(String clientJoin) {
		this.clientJoin = clientJoin == null ? null : clientJoin.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getUiMode() {
		return uiMode;
	}

	public void setUiMode(Integer uiMode) {
		this.uiMode = uiMode;
	}

	public String getUiColor() {
		return uiColor;
	}

	public void setUiColor(String uiColor) {
		this.uiColor = uiColor == null ? null : uiColor.trim();
	}

	public Integer getScene() {
		return scene;
	}

	public void setScene(Integer scene) {
		this.scene = scene;
	}

	public String getUiWindow() {
		return uiWindow;
	}

	public void setUiWindow(String uiWindow) {
		this.uiWindow = uiWindow == null ? null : uiWindow.trim();
	}

	public String getUiVideo() {
		return uiVideo;
	}

	public void setUiVideo(String uiVideo) {
		this.uiVideo = uiVideo == null ? null : uiVideo.trim();
	}

	public String getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(String upgrade) {
		this.upgrade = upgrade == null ? null : upgrade.trim();
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec == null ? null : sec.trim();
	}

	public String getRealtime() {
		return realtime;
	}

	public void setRealtime(String realtime) {
		this.realtime = realtime == null ? null : realtime.trim();
	}

	public Integer getMaxAttendees() {
		return maxAttendees;
	}

	public void setMaxAttendees(Integer maxAttendees) {
		this.maxAttendees = maxAttendees;
	}

	public Integer getUsersNo() {
		return usersNo;
	}

	public void setUsersNo(Integer usersNo) {
		this.usersNo = usersNo;
	}

	public String getTeacherJoinUrl() {
		return teacherJoinUrl;
	}

	public void setTeacherJoinUrl(String teacherJoinUrl) {
		this.teacherJoinUrl = teacherJoinUrl == null ? null : teacherJoinUrl.trim();
	}

	public String getStudentJoinUrl() {
		return studentJoinUrl;
	}

	public void setStudentJoinUrl(String studentJoinUrl) {
		this.studentJoinUrl = studentJoinUrl == null ? null : studentJoinUrl.trim();
	}

	public String getSpeakerInfo() {
		return speakerInfo;
	}

	public void setSpeakerInfo(String speakerInfo) {
		this.speakerInfo = speakerInfo == null ? null : speakerInfo.trim();
	}

	public String getScheduleInfo() {
		return scheduleInfo;
	}

	public void setScheduleInfo(String scheduleInfo) {
		this.scheduleInfo = scheduleInfo == null ? null : scheduleInfo.trim();
	}
}