/** 密码找回 heyuqiang * */

// 键盘事件监控

//学生用户
$(function() {
	$('#nextPwdRecover_Info_form input[name=stuUserid]').focus();
	
	$('#nextPwdRecover_Info_form input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			nextPwdRecover(); // 个人用户找回密码第一步
		}
	});
	
});


/*学生用户*/

function chackStuUserIdAvailable(stuUserid, msgObj) {
	stuUserid = stuUserid.trim();
	if (stuUserid == "") {
		$(msgObj).text("请输入用户名");
	} else {
		if (/^\w{6,20}$/.test(stuUserid)||/^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(stuUserid)) {
			$.post(ctx + "/student.do?method=chackUserNameForRecover", {
				"stuName" : stuUserid
			}, function(data) {
				if (data.success) {
					$(msgObj).text("");
				} else {
					$(msgObj).text(data.msg);
				}
			}, "json");
		} else {
			$(msgObj).text("请输入6 ~ 20 字符【0-9】【a-z-A-Z】");
		}
	}
}

//验证码校验
function chackVerifyCodeDo(verifyCode, msgObj) {
	if (verifyCode.length == 4) {
		$.post(ctx + "/student.do?method=chackVerifyCode", {
			"verifyCode" : verifyCode
		}, function(data) {
			if (data.success) {
				$(msgObj).text("");
				$("#pwdRecover_yzmMsgImg").css('display', 'block');
			} else {
				$(msgObj).text(data.msg);
				$("#pwdRecover_yzmMsgImg").css('display', 'none');
			}
		}, "json");
	}
	if (verifyCode.length < 4) {
		$("#pwdRecover_yzmMsgImg").css('display', 'none');
	}
	if (verifyCode.length > 4) {
		$(msgObj).text("* 验证码不正确");
		$("#pwdRecover_yzmMsgImg").css('display', 'none');
	}
}

// 邮件安全验证码校验
function checkSecurityVerifyCodeDo(securityVerifyCode, msgObj) {
	if (securityVerifyCode.length == 6) {
		$.post(ctx + "/student.do?method=checkSecurityVerifyCode", {
			"securityVerifyCode" : securityVerifyCode
		}, function(data) {
			if (data.success) {
				$(msgObj).text("");
				$("#pwdRecoverSecond_yzmMsgImg").css('display', 'block');
			} else {
				$(msgObj).text(data.msg);
				$("#pwdRecoverSecond_yzmMsgImg").css('display', 'none');
			}
		}, "json");
	}
	if (securityVerifyCode.length < 6) {
		$("#pwdRecoverSecond_yzmMsgImg").css('display', 'none');
	}
	if (securityVerifyCode.length > 6) {
		$(msgObj).text("* 验证码不正确");
		$("#pwdRecoverSecond_yzmMsgImg").css('display', 'none');
	}
}

// 找回密码继续按钮 第一步
function nextPwdRecover() {
	var stuUserid = $('#nextPwdRecover_Info_form input[name=stuUserid]').val();
	var verifyCode = $('#nextPwdRecover_Info_form input[name=verifyCode]').val();
	if (stuUserid != "") {
		if (verifyCode != "") {
			if($('#pwdRecover_stuUseridMsg').val() == "" && $('#pwdRecover_yzmMsgImg').css('display')== "block" ){
				// 设置提交状态
				$("#nextPwdRecoverMsg").css('color', '#40bd45');
				$("#nextPwdRecoverMsg").text("正在提交...");
				
				$("#nextPwdRecover_Info_form").submit();
			}
		} else {
			alert("验证码错误!");
		}
	} else {
		alert("用户名不能为空!");
	}
}

//找回密码继续按钮 第二步
function nextPwdRecoverSecond() {
	if($("#pwdRecoverSecond_yzmMsgImg").css('display')=='block'){	// 验证码输入正确
		
	}else{
		alert("验证码输入错误!");
	}
}
