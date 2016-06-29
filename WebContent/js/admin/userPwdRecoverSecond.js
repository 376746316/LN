/** 密码找回 heyuqiang * */

// 键盘事件监控

$(function() {
	$('#nextUserPwdRecoverSecond_Info_form input[name=securityVerifyCode]').focus();
	document.getElementById("btn").onclick = function() {
		retransmission();
		time(this);
	};
	
	$("#nextUserPwdRecoverSecond_Info_form input").bind('keyup', function(event){
		if(event.keyCode == '13'){
			nextUserPwdRecoverSecond();
		}
	});
	
});



/*企业用户*/

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

// 找回密码继续按钮 第二步
function nextUserPwdRecoverSecond() {
	if ($("#pwdRecoverSecond_useryzmMsgImg").css('display') == 'block') { // 验证码输入正确
		$('#nextUserPwdRecoverSecond_Info_form').submit();
	} else {
		alert("验证码输入错误!");
	}
}

// 重发邮件
function retransmission() {
	$.post(ctx + "/retransmission.do", $('#nextUserPwdRecoverSecond_Info_form').serialize(), function(data) {
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

