/** 密码找回 heyuqiang * */

// 键盘事件监控

//学生用户

//企业用户
$(function() {
	$('#nextUserPwdRecover_Info_form input[name=userId]').focus();
	
	$('#nextUserPwdRecover_Info_form input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			nextUserPwdRecover();
		}
	});
});
/*企业用户*/
	
	function chackUserIdAvailable(userId, msgObj) {
		userId = userId.trim();
		if (userId == "") {
			$(msgObj).text("请输入用户名");
		} else {
			if (/^\w{6,20}$/.test(userId)||/^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(userId)) {
				$.post(ctx + "/chackUserNameForRecover.do", {
					"userName" : userId
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
	function chackUserVerifyCodeDo(verifyCode, msgObj) {
		if (verifyCode.length == 4) {
			$.post(ctx + "/chackVerifyCode.do", {
				"verifyCode" : verifyCode
			}, function(data) {
				if (data.success) {
					$(msgObj).text("");
					$("#pwdRecover_useryzmMsgImg").css('display', 'block');
				} else {
					$(msgObj).text(data.msg);
					$("#pwdRecover_useryzmMsgImg").css('display', 'none');
				}
			}, "json");
		}
		if (verifyCode.length < 4) {
			$("#pwdRecover_useryzmMsgImg").css('display', 'none');
		}
		if (verifyCode.length > 4) {
			$(msgObj).text("* 验证码不正确");
			$("#pwdRecover_useryzmMsgImg").css('display', 'none');
		}
	}
	//邮件安全验证码校验
	function checkUserSecurityVerifyCodeDo(securityVerifyCode, msgObj) {
		if (securityVerifyCode.length == 6) {
			$.post(ctx + "/checkSecurityVerifyCode.do", {
				"securityVerifyCode" : securityVerifyCode
			}, function(data) {
				if (data.success) {
					$(msgObj).text("");
					$("#pwdRecoverSecond_useryzmMsgImg").css('display', 'block');
				} else {
					$(msgObj).text(data.msg);
					$("#pwdRecoverSecond_useryzmMsgImg").css('display', 'none');
				}
			}, "json");
		}
		if (securityVerifyCode.length < 6) {
			$("#pwdRecoverSecond_useryzmMsgImg").css('display', 'none');
		}
		if (securityVerifyCode.length > 6) {
			$(msgObj).text("* 验证码不正确");
			$("#pwdRecoverSecond_useryzmMsgImg").css('display', 'none');
		}
	}
	//找回密码继续按钮 第一步
	function nextUserPwdRecover() {
		var stuUserid = $('#nextUserPwdRecover_Info_form input[name=userId]').val();
		var verifyCode = $('#nextUserPwdRecover_Info_form input[name=verifyCode]').val();
		if (stuUserid != "") {
			if (verifyCode != "") {
				if($('#pwdRecover_userIdMsg').val() == "" && $('#pwdRecover_useryzmMsgImg').css('display')== "block" ){
					// 设置提交状态
					$("#nextUserPwdRecoverMsg").css('color', '#40bd45');
					$("#nextUserPwdRecoverMsg").text("正在提交...");
					
					$("#nextUserPwdRecover_Info_form").submit();
				}
			} else {
				alert("验证码错误!");
			}
		} else {
			alert("用户名不能为空!");
		}
	}
	//找回密码继续按钮 第二步
	function nextUserPwdRecoverSecond() {
		if($("#pwdRecoverSecond_useryzmMsgImg").css('display')=='block'){	// 验证码输入正确
			
		}else{
			alert("验证码输入错误!");
		}
	}
	

