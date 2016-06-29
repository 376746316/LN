package com.chinasofti.cetp.utils;

import org.apache.log4j.Logger;

/**
 * 上传文件封装类
 * 
 * @author dyy
 * 
 */
public class FileUrl {
	
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	
	private String fileName;
	private String downloadUrl;
	private String videoUrl;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public FileUrl(String downloadUrl, String videoUrl) {
		super();
		this.downloadUrl = downloadUrl;
		downloadUrl = downloadUrl.replace("\\", "/");
		this.fileName = downloadUrl.substring(downloadUrl.lastIndexOf("/") + 1);
		this.videoUrl = videoUrl;
	}

	public FileUrl() {
		super();
	}

}
