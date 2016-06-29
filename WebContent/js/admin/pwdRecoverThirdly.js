/** 密码找回 heyuqiang * */
var pwdRecoverThirfly_StuPwd;
$(function() {
	$("#pwdRecoverThirfly_StuPwdErrorMsgImg").css('display', 'none');
	$("#pwdRecoverThirfly_reStuPwdErrorMsgImg").css('display', 'none');
	
	$('#pwdRecoverThirdly_Info_form input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			nextPwdRecoverThirfly();
		}
	});
});

//检查密码【通用】
function check_pwdRecoverThirfly_StuPwdErrorMsg(stuPwd, msgObj) {
	pwdRecoverThirfly_StuPwd = stuPwd;
	stuPwd = stuPwd.trim();
	if (stuPwd == "") {
		$(msgObj).text("请输入密码");
		$("#pwdRecoverThirfly_StuPwdErrorMsgImg").css('display', 'none');
	} else {
		if (/^\w{6,20}$/.test(stuPwd)) {
			$(msgObj).text("");
			$("#pwdRecoverThirfly_StuPwdErrorMsgImg").css('display', 'block');
		} else {
			$(msgObj).text("请输入6 ~ 20 字符【0-9】【a-z-A-Z】");
			$("#pwdRecoverThirfly_StuPwdErrorMsgImg").css('display', 'none');
		}
	}
}

//检查rpass
function check_pwdRecoverThirfly_reStuPwdErrorMsg(restuPwd, msgObj) {
	restuPwd = restuPwd.trim();
	if (restuPwd == "") {
		$(msgObj).text("请输入确认密码");
		$("#pwdRecoverThirfly_reStuPwdErrorMsgImg").css('display', 'none');
	} else if (restuPwd != pwdRecoverThirfly_StuPwd) {
		$(msgObj).text("两次输入不一致，请核对后重新输入");
		$("#pwdRecoverThirfly_reStuPwdErrorMsgImg").css('display', 'none');
	} else {
		$(msgObj).text("");
		$("#pwdRecoverThirfly_reStuPwdErrorMsgImg").css('display', 'block');
	}
}

//找回密码继续按钮 第三步
function nextPwdRecoverThirfly() {
	if ($("#pwdRecoverThirfly_StuPwdErrorMsgImg").css('display') == 'block' && $("#pwdRecoverThirfly_reStuPwdErrorMsgImg").css('display') == 'block') { // 验证码输入正确
		$('#pwdRecoverThirdly_Info_form').submit();
	} else {
		alert("输入的信息不正确，请核对!");
	}
}

