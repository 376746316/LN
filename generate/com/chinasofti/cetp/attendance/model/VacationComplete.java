package com.chinasofti.cetp.attendance.model;

/**
 * 该类继承 Vacation类 增加了实训表和学生信息表字段信息
 * 
 * @author heyq 2014年1月21日11:24:29
 */
public class VacationComplete extends Vacation {

	/** 请假人员 **/
	private String vnStuName;

	/** 批准人 **/
	private String VnUserName;

	public String getVnUserName() {
		return VnUserName;
	}

	public void setVnUserName(String vnUserName) {
		VnUserName = vnUserName;
	}

	public String getVnStuName() {
		return vnStuName;
	}

	public void setVnStuName(String vnStuName) {
		this.vnStuName = vnStuName;
	}

}
