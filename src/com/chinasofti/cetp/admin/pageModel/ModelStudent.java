package com.chinasofti.cetp.admin.pageModel;

import com.chinasofti.cetp.admin.model.StudentWithBLOBs;
/**
 * 个人用户页面模型类
 * @author heyuqiang
 *
 */
public class ModelStudent extends StudentWithBLOBs {

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
