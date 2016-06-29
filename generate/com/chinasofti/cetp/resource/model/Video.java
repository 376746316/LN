package com.chinasofti.cetp.resource.model;

import java.util.Date;

public class Video {
	private Integer vId;

	private Integer vTechType;

	private String vStatus;

	private String vType;

	private String vFileName;

	private String vName;

	private Integer vPlayCount;

	private Integer vDownloadCount;

	private String vComment;

	private Date vRegtime;

	private String techTypeName;

	public String getTechTypeName() {
		return techTypeName;
	}

	public void setTechTypeName(String techTypeName) {
		this.techTypeName = techTypeName;
	}

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public Integer getvTechType() {
		return vTechType;
	}

	public void setvTechType(Integer vTechType) {
		this.vTechType = vTechType;
	}

	public String getvStatus() {
		return vStatus;
	}

	public void setvStatus(String vStatus) {
		this.vStatus = vStatus == null ? null : vStatus.trim();
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType == null ? null : vType.trim();
	}

	public String getvFileName() {
		return vFileName;
	}

	public void setvFileName(String vFileName) {
		this.vFileName = vFileName == null ? null : vFileName.trim();
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName == null ? null : vName.trim();
	}

	public Integer getvPlayCount() {
		return vPlayCount;
	}

	public void setvPlayCount(Integer vPlayCount) {
		this.vPlayCount = vPlayCount;
	}

	public Integer getvDownloadCount() {
		return vDownloadCount;
	}

	public void setvDownloadCount(Integer vDownloadCount) {
		this.vDownloadCount = vDownloadCount;
	}

	public String getvComment() {
		return vComment;
	}

	public void setvComment(String vComment) {
		this.vComment = vComment == null ? null : vComment.trim();
	}

	public Date getvRegtime() {
		return vRegtime;
	}

	public void setvRegtime(Date vRegtime) {
		this.vRegtime = vRegtime;
	}
}