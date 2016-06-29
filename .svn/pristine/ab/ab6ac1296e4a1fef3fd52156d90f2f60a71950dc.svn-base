package com.chinasofti.cetp.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

public class ReadFile {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(ReadFile.class);

	public ReadFile() {
	}

	/**
	 * 读取指定文件夹下的所有文件，并删除指定创建时间之前的文件
	 */
	public static boolean readfile(String filepath) throws FileNotFoundException, IOException {

		try {

			File file = new File(filepath);
			if (!file.isDirectory()) {
				// System.out.println("文件");
				// System.out.println("path=" + file.getPath());
				// System.out.println("absolutepath=" + file.getAbsolutePath());
				// System.out.println("name=" + file.getName());
			} else if (file.isDirectory()) {
				// System.out.println("文件夹");
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						// System.out.println("path=" + readfile.getPath());
						// System.out.println("absolutepath=" + readfile.getAbsolutePath());
						// System.out.println("name=" + readfile.getName());
						if (System.currentTimeMillis() - readfile.lastModified() > 60 * 1000 * 60) {
							readfile.delete();
						}
					} else if (readfile.isDirectory()) {
						readfile(filepath + "\\" + filelist[i]);
					}
				}

			}

		} catch (FileNotFoundException e) {
			logger.info("readfile()   Exception:" + e.getMessage());
		}
		return true;
	}

	/**
	 * 删除某个文件夹下的所有文件夹和文件
	 */

	/*
	 * public static boolean deletefile(String delpath) throws FileNotFoundException, IOException { try {
	 * 
	 * File file = new File(delpath); if (!file.isDirectory()) { System.out.println("1"); file.delete(); } else if (file.isDirectory()) { System.out.println("2"); String[] filelist = file.list(); for (int i = 0; i < filelist.length; i++) { File delfile = new File(delpath + "\\" + filelist[i]); if (!delfile.isDirectory()) { System.out.println("path=" + delfile.getPath()); System.out.println("absolutepath=" + delfile.getAbsolutePath()); System.out.println("name=" + delfile.getName()); delfile.delete(); System.out.println("删除文件成功"); } else if (delfile.isDirectory()) { deletefile(delpath + "\\" + filelist[i]); } } file.delete();
	 * 
	 * }
	 * 
	 * } catch (FileNotFoundException e) { System.out.println("deletefile()   Exception:" + e.getMessage()); } return true; }
	 */

	public static void main(String[] args) {
		try {
			readfile("D://Tools//Servers//apache-tomcat-7.0.54//webapps//online//temp");
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		}
		System.out.println("ok");
	}

}
