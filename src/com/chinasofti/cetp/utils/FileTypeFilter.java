package com.chinasofti.cetp.utils;

import java.io.File;
import java.io.FilenameFilter;

import org.apache.log4j.Logger;

public class FileTypeFilter implements FilenameFilter {
	
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	
	private String fileTypeExts;

	public String getFileTypeExts() {
		return fileTypeExts;
	}

	public void setFileTypeExts(String fileTypeExts) {
		this.fileTypeExts = fileTypeExts.toLowerCase();
	}

	public FileTypeFilter(String fileTypeExts) {
		super();
		this.fileTypeExts = fileTypeExts.toLowerCase();
	}

	@Override
	public boolean accept(File dir, String name) {
		if (new File(dir, name).isDirectory()) {
			return true;
		}
		if (name != null) {
			name = name.toLowerCase();
		}
		boolean bAccept = true;
		if (fileTypeExts != null && fileTypeExts != "") {
			bAccept = false;
			for (String fileType : fileTypeExts.split(";")) {
				if (fileType.trim() != "") {
					bAccept = bAccept || name.endsWith(fileType.trim());
				}
			}
		}
		return bAccept && (name.charAt(0) != '.');
	}
}
