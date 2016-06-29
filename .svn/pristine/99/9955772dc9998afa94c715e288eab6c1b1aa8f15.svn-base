package com.chinasofti.cetp.utils;

import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;

public class SessionInfo {

	/** 用户登陆名 **/
	private String stuUserid;

	private Integer stuNo;

	private StudentWithBLOBs student;

	private UserWithBLOBs user;

	private Integer ugLevel;

	/** 修改密码时身份验证唯一标识 **/
	private String uuid;

	private String verifyCode;

	public Integer getUgLevel() {
		return ugLevel;
	}

	public void setUgLevel(Integer ugLevel) {
		this.ugLevel = ugLevel;
	}

	public String getStuUserid() {
		return stuUserid;
	}

	public void setStuUserid(String stuUserid) {
		this.stuUserid = stuUserid;
	}

	public Integer getStuNo() {
		return stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public StudentWithBLOBs getStudent() {
		return student;
	}

	public void setStudent(StudentWithBLOBs student) {
		this.student = student;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public UserWithBLOBs getUser() {
		return user;
	}

	public Integer getUserNo() {
		return user == null ? null : user.getUserNo();
	}

	public void setUser(UserWithBLOBs user) {
		this.user = user;
	}

	/**
	 * 获取当前系统登录用户ID
	 */
	public Integer getStuOrUserNo() {
		return user == null ? (stuNo == null ? null : stuNo) : user.getUserNo();
	}

}
