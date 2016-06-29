/** 用户注册部分 heyquiang * */
var _password; // 个人用户
var _userPwd; // 企业用户
$(function() {
	// 个人注册密码框
	var register_showPwd_1 = $("#register_form_1 input[name=showPwd]"), register_pwd_1 = $("#register_form_1 input[name=stuPwd]");
	register_showPwd_1.focus(function() {
		register_pwd_1.show().focus();
		register_showPwd_1.hide();
	});

	register_pwd_1.blur(function() {
		if (register_pwd_1.val() == "") {
			register_showPwd_1.show();
			register_pwd_1.hide();
		}
	});

	// 个人注册密码确认框
	var register_showRePwd_1 = $("#register_form_1 input[name=showRePwd]"), register_rePwd_1 = $("#register_form_1 input[name=restuPwd]");
	register_showRePwd_1.focus(function() {
		register_rePwd_1.show().focus();
		register_showRePwd_1.hide();
	});

	register_rePwd_1.blur(function() {
		if (register_rePwd_1.val() == "") {
			register_showRePwd_1.show();
			register_rePwd_1.hide();
		}
	});

	// 企业注册密码框
	var register_showPwd_2 = $("#register_form_2 input[name=showPwd]"), register_pwd_2 = $("#register_form_2 input[name=userPwd]");
	register_showPwd_2.focus(function() {
		register_pwd_2.show().focus();
		register_showPwd_2.hide();
	});

	register_pwd_2.blur(function() {
		if (register_pwd_2.val() == "") {
			register_showPwd_2.show();
			register_pwd_2.hide();
		}
	});

	// 企业注册密码确认框
	var register_showRePwd_2 = $("#register_form_2 input[name=showUserPwd]"), register_rePwd_2 = $("#register_form_2 input[name=reUserPwd]");
	register_showRePwd_2.focus(function() {
		register_rePwd_2.show().focus();
		register_showRePwd_2.hide();
	});

	register_rePwd_2.blur(function() {
		if (register_rePwd_2.val() == "") {
			register_showRePwd_2.show();
			register_rePwd_2.hide();
		}
	});

	// 未输入验证码时显示提示信息
	var verifyCode1 = $('#register_form_1 input[name=verifyCode]').val();
	var verifyCode2 = $('#register_form_2 input[name=verifyCode]').val();

	if (verifyCode1.trim() == "") {
		$('#msg1').html("* 请输入验证码");
	}
	if (verifyCode2.trim() == "") {
		$('#msg2').html("* 请输入验证码");
	}
	
	// 个人注册页回车登录事件
	$('#register_form_1 input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			check_registerInfo(); // 个人用户注册
		}
	});
	// 企业注册页回车登录事件
	$('#register_form_2 input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			check_userRegisterInfo(); // 企业用户注册
		}
	});

});

// 当输入验证码激活的事件【通用】
function onInputVerifyCode(verifyCode, msgObj) {
	if (verifyCode.trim() == "") {
		$(msgObj).html("* 请输入验证码");
	} else {
		chackVerifyCode(verifyCode, msgObj);
	}
}

// 同意用户注册协议
function changebackground(obj, self) {
	if ($(self).attr('checked') == undefined) {
		$(obj).css("background-image", "url(images/regbgdis.png)");
		// 通过设置disabled的值将提交按钮置为disabled
		$(obj).attr("disabled", "disabled");
	} else {
		$(obj).css("background-image", "url(images/regbg.png)");
		// 通过移除的方式将提交按钮的disable属性删除
		$(obj).removeAttr("disabled");
	}
}

// 检查用户名是否可用【个人用户】
function chackStudentNameAvailable(stuName, msgObj) {
	$(msgObj).html('<img src="' + ctx + '/images/loading.gif" style="width:16px;height:16px;"/>');
	$.post(ctx + "/student.do?method=chackUserNameAvailable", {
		"stuName" : stuName
	}, function(data) {
		if (data.success) {
			$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
			return true;
		} else {
			$(msgObj).html(data.msg);
			return false;
		}
	}, "json");
}

// 检查用户名是否可用【企业用户】
function chackUserIdAvailable(userId, msgObj) {
	$(msgObj).html('<img src="' + ctx + '/images/loading.gif" style="width:16px;height:16px;"/>');
	$.post(ctx + "/chackUserIdAvailable.do", {
		"userId" : userId
	}, function(data) {
		if (data.success) {
			$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
			return true;
		} else {
			$(msgObj).html(data.msg);
			return false;
		}
	}, "json");
}

// 检查验证码是否正确【通用】
function chackVerifyCode(verifyCode, msgObj) {
	$(msgObj).html('<img src="' + ctx + '/images/loading.gif" style="width:16px;height:16px;"/>');
	$.post(ctx + "/student.do?method=chackVerifyCode", {
		"verifyCode" : verifyCode
	}, function(data) {
		if (data.success) {
			$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
		} else {
			$(msgObj).html(data.msg);
		}
	}, "json");
}

// 检查用户名【个人用户】
function check_stuUserid(stuUserid, msgObj) {
	stuUserid = stuUserid.trim();
	if (stuUserid == "") {
		$(msgObj).html("请输入用户名");
	} else {
		if (/^\w{6,20}$/.test(stuUserid)) {
			chackStudentNameAvailable(stuUserid, msgObj);
		} else {
			$(msgObj).html("请输入6 ~ 20 字符【0-9】【a-z-A-Z】");
		}
	}
}

// 检查用户名【企业用户】
function check_userId(userId, msgObj) {
	userId = userId.trim();
	if (userId == "") {
		$(msgObj).html("请输入用户名");
	} else {
		if (/^\w{6,20}$/.test(userId)) {
			chackUserIdAvailable(userId, msgObj);
		} else {
			$(msgObj).html("请输入6 ~ 20 字符【0-9】【a-z-A-Z】");
		}
	}
}

// 检查密码【个人用户】
function check_pass(stuPwd, msgObj) {
	_password = stuPwd;
	if (stuPwd == "") {
		$(msgObj).html("请输入密码");
	} else {
		if (/^[\@A-Za-z0-9\!\#\$\%\^\&\*\.\~]{6,20}$/.test(stuPwd)) {
			$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
			;
		} else {
			$(msgObj).html("请输入6 ~ 20 字符【0-9】【a-z-A-Z】【~!@#$%^&*.】");
		}
	}
}

// 检查密码【企业用户】
function check_userPwd(userPwd, msgObj) {
	_userPwd = userPwd;
	if (userPwd == "") {
		$(msgObj).html("请输入密码");
	} else {
		if (/^[\@A-Za-z0-9\!\#\$\%\^\&\*\.\~]{6,20}$/.test(userPwd)) {
			$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
			;
		} else {
			$(msgObj).html("请输入6 ~ 20 字符【0-9】【a-z-A-Z】【~!@#$%^&*.】");
		}
	}
}

// 检查rpass【个人用户】
function check_rpass(restuPwd, msgObj) {
	if (restuPwd == "") {
		$(msgObj).html("请输入确认密码");
	} else if (restuPwd != _password) {
		$(msgObj).html("密码不一致");
	} else {
		$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
	}
}

// 检查rpass【企业用户】
function check_reUserPwd(reUserPwd, msgObj) {
	if (reUserPwd == "") {
		$(msgObj).html("请输入确认密码");
	} else if (reUserPwd != _userPwd) {
		$(msgObj).html("密码不一致");
	} else {
		$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
	}
}

// 检查Email【个人用户】
function check_email(email, msgObj) {
	email = email.trim();
	if (email == "") {
		$('#register_form_1 input[name=mail]').val('邮箱');
		$(msgObj).html("请输入Email");
	} else {
		if (/^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(email)) {
			chackStudentEmailAvailable(email, msgObj); // 验证邮箱是否可用（未被注册）
		} else {
			$(msgObj).html("请输入有效的Email地址");
		}
	}
}

// 检查Email【企业用户】
function check_userMail(userMail, msgObj) {
	userMail = userMail.trim();
	if (userMail == "") {
		$('#register_form_2 input[name=userMail]').val('邮箱');
		$(msgObj).html("请输入Email");
	} else {
		if (/^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(userMail)) {
			chackUserMailAvailable(userMail, msgObj); // 验证邮箱是否可用（未被注册）
		} else {
			$(msgObj).html("请输入有效的Email地址");
		}
	}
}

// 检查个人邮箱是否可用(未被注册)【个人用户】
function chackStudentEmailAvailable(email, msgObj) {
	$(msgObj).html('<img src="' + ctx + '/images/loading.gif" style="width:16px;height:16px;"/>');
	$.post(ctx + "/student.do?method=chackEmailAvailable", {
		"email" : email
	}, function(data) {
		if (data.success) {
			$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
		} else {
			$(msgObj).html(data.msg);
		}
	}, "json");
}

// 检查个人邮箱是否可用(未被注册)【企业用户】
function chackUserMailAvailable(userMail, msgObj) {
	$(msgObj).html('<img src="' + ctx + '/images/loading.gif" style="width:16px;height:16px;"/>');
	$.post(ctx + "/chackUserMailAvailable.do", {
		"userMail" : userMail
	}, function(data) {
		if (data.success) {
			$(msgObj).html('<img src="' + ctx + '/images/img08.png" />');
		} else {
			$(msgObj).html(data.msg);
		}
	}, "json");
}

// 个人用户注册
function check_registerInfo() {
	var stuUserid = $('#register_form_1 input[name=stuUserid]').val();
	var mail = $('#register_form_1 input[name=mail]').val();
	var restuPwd = $('#register_form_1 input[name=restuPwd]').val();
	var verifyCode1 = $('#register_form_1 input[name=verifyCode]').val();

	var stuUseridErrorMsg = $('#stuUseridErrorMsg').text();
	var stuPwdErrorMsg = $('#stuPwdErrorMsg').text();
	var restuPwdErrorMsg = $('#restuPwdErrorMsg').text();
	var emailErrorMsg = $('#emailErrorMsg').text();
	var verifyCodeErrorMsg = $('#verifyCodeErrorMsg').text();

	// 判断错误信息全部为空并且文本框全部不为空
	if ((stuUseridErrorMsg == "" && stuPwdErrorMsg == "" && restuPwdErrorMsg == "" && emailErrorMsg == "" && verifyCodeErrorMsg == "") && (stuUserid != "" && _password != "" && restuPwd != "" && mail != "" && verifyCode1 != "")) {
		$('#register_form_1').submit();
	} else {
		alert("注册信息填写错误，请仔细检查更正后再提交");
	}
}

// 企业用户注册
function check_userRegisterInfo() {
	var userId = $('#register_form_2 input[name=userId]').val();
	var userMail = $('#register_form_2 input[name=userMail]').val();
	var reUserPwd = $('#register_form_2 input[name=reUserPwd]').val();
	var verifyCode2 = $('#register_form_2 input[name=verifyCode]').val();

	var userIdErrorMsg = $('#userIdErrorMsg').text();
	var userPwdErrorMsg = $('#userPwdErrorMsg').text();
	var reUserPwdErrorMsg = $('#reUserPwdErrorMsg').text();
	var userMailErrorMsg = $('#userMailErrorMsg').text();
	var userVerifyCodeErrorMsg = $('#userVerifyCodeErrorMsg').text();

	// 判断错误信息全部为空并且文本框全部不为空
	if ((userIdErrorMsg == "" && userPwdErrorMsg == "" && reUserPwdErrorMsg == "" && userMailErrorMsg == "" && userVerifyCodeErrorMsg == "") && (userId != "" && _userPwd != "" && reUserPwd != "" && userMail != "" && verifyCode2 != "")) {
		$('#register_form_2').submit();
	} else {
		alert("注册信息填写错误，请仔细检查更正后再提交");
	}
}
