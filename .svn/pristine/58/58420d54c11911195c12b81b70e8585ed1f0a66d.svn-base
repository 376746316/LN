package com.chinasofti.cetp.study.model;

public class MoreExerciseStu extends ExerciseStu {
	private Integer exerId;
	private String exerTitle;
	private String exerContext;
	private String exerTextAnswer;
	private String exerStep;
	public String getExerStep() {
		return exerStep;
	}

	public void setExerStep(String exerStep) {
		this.exerStep = exerStep;
	}

	private String downloadUrl;

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	private String fileName;

	public String getFileName() {
		String downUrl = this.getEsAttachAnswer();
		if (downUrl != null) {
			downUrl = downUrl.replace("\\", "/");
			int start = downUrl.lastIndexOf("/") + 1;
			this.fileName = downUrl.substring(start);
		}
		return fileName;
	}

	public void setFileName(String fileName) {
		String downUrl = this.getEsAttachAnswer();
		if (downUrl != null) {
			downUrl = downUrl.replace("\\", "/");
			int start = downUrl.lastIndexOf("/") + 1;
			this.fileName = downUrl.substring(start);
		}
	}

	public String getExerTextAnswer() {
		return exerTextAnswer;
	}

	public void setExerTextAnswer(String exerTextAnswer) {
		this.exerTextAnswer = exerTextAnswer;
	}

	public Integer getExerId() {
		return exerId;
	}

	public void setExerId(Integer exerId) {
		this.exerId = exerId;
	}

	public String getExerTitle() {
		return exerTitle;
	}

	public void setExerTitle(String exerTitle) {
		this.exerTitle = exerTitle;
	}

	public String getExerContext() {
		return exerContext;
	}

	public void setExerContext(String exerContext) {
		this.exerContext = exerContext;
	}

}
