package com.chinasofti.cetp.study.model;

import java.io.File;

public class MoreExercise extends ExerciseWithBLOBs {

	private String chapName;
	private int chapId;
	private HomeworkStu homeworkStu;
	private String fileName;

	public String getFileName() {
		if (this.homeworkStu != null && this.homeworkStu.getHsAttachAnswer() != null) {
			int start = this.homeworkStu.getHsAttachAnswer().lastIndexOf(File.separator) + 1;
			this.fileName = this.homeworkStu.getHsAttachAnswer().substring(start);
		}
		return fileName;
	}

	public void setFileName(String fileName) {

		this.fileName = fileName;
	}

	public HomeworkStu getHomeworkStu() {
		return homeworkStu;
	}

	public void setHomeworkStu(HomeworkStu homeworkStu) {
		if (homeworkStu.getHsAttachAnswer() != null) {
			int start = homeworkStu.getHsAttachAnswer().lastIndexOf(File.separator) + 1;
			System.out.println(homeworkStu.getHsAttachAnswer());
			System.out.println("文件分隔符开始：" +File.separator+ start);
			this.fileName = homeworkStu.getHsAttachAnswer().substring(start);
			System.out.println("分割后的文件名称：" + this.fileName);
		}
		this.homeworkStu = homeworkStu;
	}

	public String getChapName() {
		return chapName;
	}

	public void setChapName(String chapName) {
		this.chapName = chapName;
	}

	public int getChapId() {
		return chapId;
	}

	public void setChapId(int chapId) {
		this.chapId = chapId;
	}

}
