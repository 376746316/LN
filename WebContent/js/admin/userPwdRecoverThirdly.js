/** 密码找回 heyuqiang * */

var pwdRecoverThirfly_UserPwd;

/*企业用户*/

//键盘事件监控
$(function() {
	$("#pwdRecoverThirfly_UserPwdErrorMsgImg").css('display', 'none');
	$("#pwdRecoverThirfly_reUserPwdErrorMsgImg").css('display', 'none');
	
	$("#userPwdRecoverThirdly_Info_form input").bind('keyup', function(event){
		if(event.keyCode == '13'){
			nextUserPwdRecoverThirfly();
		}
	});
});

//检查密码【通用】
function check_pwdRecoverThirfly_UserPwdErrorMsg(userPwd, msgObj) {
	pwdRecoverThirfly_UserPwd = userPwd;
	userPwd = userPwd.trim();
	if (userPwd == "") {
		$(msgObj).text("请输入密码");
		$("#pwdRecoverThirfly_UserPwdErrorMsgImg").css('display', 'none');
	} else {
		if (/^\w{6,20}$/.test(userPwd)) {
			$(msgObj).text("");
			$("#pwdRecoverThirfly_UserPwdErrorMsgImg").css('display', 'block');
		} else {
			$(msgObj).text("请输入6 ~ 20 字符【0-9】【a-z-A-Z】");
			$("#pwdRecoverThirfly_UserPwdErrorMsgImg").css('display', 'none');
		}
	}
}

//检查rpass
function check_pwdRecoverThirfly_reUserPwdErrorMsg(reUserPwd, msgObj) {
	reUserPwd = reUserPwd.trim();
	if (reUserPwd == "") {
		$(msgObj).text("请输入确认密码");
		$("#pwdRecoverThirfly_reUserPwdErrorMsgImg").css('display', 'none');
	} else if (reUserPwd != pwdRecoverThirfly_UserPwd) {
		$(msgObj).text("两次输入不一致，请核对后重新输入");
		$("#pwdRecoverThirfly_reUserPwdErrorMsgImg").css('display', 'none');
	} else {
		$(msgObj).text("");
		$("#pwdRecoverThirfly_reUserPwdErrorMsgImg").css('display', 'block');
	}
}

//找回密码继续按钮 第三步
function nextUserPwdRecoverThirfly() {
	if ($("#pwdRecoverThirfly_UserPwdErrorMsgImg").css('display') == 'block' && $("#pwdRecoverThirfly_reUserPwdErrorMsgImg").css('display') == 'block') { // 验证码输入正确
		$('#userPwdRecoverThirdly_Info_form').submit();
	} else {
		alert("输入的信息不正确，请核对!");
	}
}
