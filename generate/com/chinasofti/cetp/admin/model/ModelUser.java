package com.chinasofti.cetp.admin.model;
/**
 * 个人用户页面模型类
 * @author wangxiaopei
 *
 */
public class ModelUser extends UserWithBLOBs {
	

	/** 验证码 **/
	private String verifyCode;
	
	/** 新密码 **/
	private String newStuPwd;

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getNewStuPwd() {
		return newStuPwd;
	}

	public void setNewStuPwd(String newStuPwd) {
		this.newStuPwd = newStuPwd;
	}
	
	
	

}
