package com.chinasofti.cetp.study.model;

import java.util.Date;
import java.util.List;

import com.chinasofti.cetp.resource.model.VideoWithBLOBs;

public class SubCourseware {
	private Integer scId;

	private Integer scSeq;

	private String scName;

	private Integer scPlayTime;

	private Integer scVideo;

	private Integer scChapterId;

	private Date scRegtime;

	private VideoWithBLOBs video;

	private List<Note> noteList;
	
	public VideoWithBLOBs getVideo() {
    	return video;
    }

	public void setVideo(VideoWithBLOBs video) {
    	this.video = video;
    }

	public List<Note> getNoteList() {
    	return noteList;
    }

	public void setNoteList(List<Note> noteList) {
    	this.noteList = noteList;
    }

	public Integer getScId() {
		return scId;
	}

	public void setScId(Integer scId) {
		this.scId = scId;
	}

	public Integer getScSeq() {
		return scSeq;
	}

	public void setScSeq(Integer scSeq) {
		this.scSeq = scSeq;
	}

	public String getScName() {
		return scName;
	}

	public void setScName(String scName) {
		this.scName = scName == null ? null : scName.trim();
	}

	public Integer getScPlayTime() {
		return scPlayTime;
	}

	public void setScPlayTime(Integer scPlayTime) {
		this.scPlayTime = scPlayTime;
	}

	public Integer getScVideo() {
		return scVideo;
	}

	public void setScVideo(Integer scVideo) {
		this.scVideo = scVideo;
	}

	public Integer getScChapterId() {
		return scChapterId;
	}

	public void setScChapterId(Integer scChapterId) {
		this.scChapterId = scChapterId;
	}

	public Date getScRegtime() {
		return scRegtime;
	}

	public void setScRegtime(Date scRegtime) {
		this.scRegtime = scRegtime;
	}
}