/** 密码找回 heyuqiang * */

// 键盘事件监控
$(function() {
	$('#nextPwdRecoverSecond_Info_form input[name=securityVerifyCode]').focus();
	document.getElementById("btn").onclick = function() {
		retransmission();
		time(this);
	};
	
	$('#nextPwdRecoverSecond_Info_form input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			nextPwdRecoverSecond();
		}
	});
	
});


/*学生用户*/

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

// 找回密码继续按钮 第二步
function nextPwdRecoverSecond() {
	if ($("#pwdRecoverSecond_yzmMsgImg").css('display') == 'block') { // 验证码输入正确
		$('#nextPwdRecoverSecond_Info_form').submit();
	} else {
		alert("验证码输入错误!");
	}
}

// 重发邮件
function retransmission() {
	$.post(ctx + "/student.do?method=retransmission", $('#nextPwdRecoverSecond_Info_form').serialize(), function(data) {
		if(data.success){
			time(this);
		}else{
			alert(data.msg);
		}
	}, "json");
}

var wait = 60;
function time(o) {
	if (wait == 0) {
		o.removeAttribute("disabled");
		o.value = "再次发送邮件";
		wait = 60;
	} else {
		o.setAttribute("disabled", true);
		o.value = "重新发送(" + wait + ")";
		wait--;
		setTimeout(function() {
			time(o);
		}, 1000);
	}
}
document.getElementById("btn").onclick = function() {
	time(this);
};

