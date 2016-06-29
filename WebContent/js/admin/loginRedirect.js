$(function() { // 个人登录密码框
	var login_showPwd_3 = $("#login_form_3 input[name=showPwd]"), login_pwd_3 = $("#login_form_3 input[name=stuPwd]");
	login_showPwd_3.focus(function() {
		login_pwd_3.show().focus();
		login_showPwd_3.hide();
	});
	login_pwd_3.focus(function() {
		login_showPwd_3.hide();
	});
	login_pwd_3.blur(function() {
		if (login_pwd_3.val() == "") {
			login_showPwd_3.show();
			login_pwd_3.hide();
		}
	});

	// 企业登录密码框
	var login_showPwd_4 = $("#login_form_4 input[name=showPwd]"), login_pwd_4 = $("#login_form_4 input[name=userPwd]");
	login_showPwd_4.focus(function() {
		login_pwd_4.show().focus();
		login_showPwd_4.hide();
	});
	login_pwd_4.focus(function() {
		login_showPwd_4.hide();
	});
	login_pwd_4.blur(function() {
		if (login_pwd_4.val() == "") {
			login_showPwd_4.show();
			login_pwd_4.hide();
		}
	});

	// 个人登录页回车登录事件
	$('#login_form_3 input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			// studenLogin('#logErrorMsg'); // 个人用户登录
			$("#stuLoginButWeb").click();
		}
	});
	// 企业登录页回车登录事件
	$('#login_form_4 input').bind('keyup', function(event) {
		if (event.keyCode == "13") {
			// userLogin('#userLogErrorMsg'); // 企业用户登录
			$("#userLoginButWeb").click();
		}
	});

});

// 个人登录
function studenLoginWeb(msgObj) {
	var stuUserid = $('#login_form_3 [name=stuUserid]').val();
	var stuPwd = $('#login_form_3 [name=stuPwd]').val();
	var verifyCode = $('#login_form_3 [name=verifyCode]').val();
	if (stuUserid == "用户名/邮箱" || stuUserid == "") {
		$(msgObj).text("请输入用户名");
	} else if (stuPwd == "") {
		$(msgObj).text("请输入密码");
	} else if ($.trim(verifyCode) == "") {
		$(msgObj).text("* 请输入验证码");
	} else {
		if (/^\w{6,20}$/.test(stuUserid) || /^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(stuUserid)) {
			$(msgObj).text("正在登陆...");
			// console.info($("#stuLoginBut").val());
			if ($("#stuLoginButWeb").val() == "登录") {
				time(document.getElementById("stuLoginButWeb"));
				$.post(ctx + "/student.do?method=login", $('#login_form_3').serialize(), function(data) {
					if (data.success) {
						window.location = redirect;
					} else {
						$(msgObj).text(data.msg);
						return false;
					}
				}, "json");
			} else {
				alert("您点的太快了");
			}
		} else {
			$(msgObj).text("用户名不存在!");
		}
	}
}

// 企业用户登录
function userLoginWeb(msgObj) {
	var userid = $('#login_form_4 [name=userId]').val();
	var userPwd = $('#login_form_4 [name=userPwd]').val();
	var verifyCode = $('#login_form_4 [name=verifyCode]').val();
	if (userid == "用户名/邮箱" || userid == "") {
		$(msgObj).text("请输入用户名");
	} else if (userPwd == "") {
		$(msgObj).text("请输入密码");
	} else if ($.trim(verifyCode) == "") {
		$(msgObj).text("* 请输入验证码");
	} else {
		if (/^\w{6,20}$/.test(userid) || /^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(userid)) {
			$(msgObj).text("正在登陆...");
			if ($("#userLoginButWeb").val() == "登录") {
				time(document.getElementById("userLoginButWeb"));
				$.post(ctx + "/epLogin.do", $('#login_form_4').serialize(), function(data) {
					if (data.success) {
						window.location = redirect;
					} else {
						$(msgObj).text(data.msg);
						return false;
					}
				}, "json");
			} else {
				alert("您点的太快了");
			}
		} else {
			$(msgObj).text("用户名不存在!");
		}
	}
}
