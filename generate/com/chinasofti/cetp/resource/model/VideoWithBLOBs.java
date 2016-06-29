package com.chinasofti.cetp.resource.model;


public class VideoWithBLOBs extends Video {
	private String vPlayUrl;

	private String vDownloadUrl;

	public String getvPlayUrl() {
		return vPlayUrl;
	}

	public void setvPlayUrl(String vPlayUrl) {
		this.vPlayUrl = vPlayUrl == null ? null : vPlayUrl.trim();
	}

	public String getvDownloadUrl() {
		return vDownloadUrl;
	}

	public void setvDownloadUrl(String vDownloadUrl) {
		this.vDownloadUrl = vDownloadUrl == null ? null : vDownloadUrl.trim();
	}
}