/** 用户登录部分 heyuqiang * */

// 刷新验证码
function refresh(obj) {
	obj.src = ctx + "/image.do?" + Math.random();
}

var msgTimer;
var wait = 3;
function time(o) {
	if (wait == 0) {
		o.disabled = false;
		o.value = "登录";
		wait = 3;
	} else {
		o.disabled = true;
		o.value = "登录(" + wait + ")";
		wait--;
		setTimeout(function() {
			time(o);
		}, 1000);
	}
}

$(function() {
	$('.load_in .name,.load_in a.img').click(function() {
		$(this).parents('.load_in').find('.grzx').toggle();
	});

	if ($("#menuActived")) {
		$("#" + $("#menuActived").val()).addClass("mrbj");
	}

	// 个人登录密码框
	var login_showPwd_1 = $("#login_form_1 input[name=showPwd]"), login_pwd_1 = $("#login_form_1 input[name=stuPwd]");
	login_showPwd_1.focus(function() {
		login_pwd_1.show().focus();
		login_showPwd_1.hide();
	});
	login_pwd_1.focus(function() {
		login_showPwd_1.hide();
	});
	login_pwd_1.blur(function() {
		if (login_pwd_1.val() == "") {
			login_showPwd_1.show();
			login_pwd_1.hide();
		}
	});

	// 企业登录密码框
	var login_showPwd_2 = $("#login_form_2 input[name=showPwd]"), login_pwd_2 = $("#login_form_2 input[name=userPwd]");
	login_showPwd_2.focus(function() {
		login_pwd_2.show().focus();
		login_showPwd_2.hide();
	});
	login_pwd_2.focus(function() {
		login_showPwd_2.hide();
	});
	login_pwd_2.blur(function() {
		if (login_pwd_2.val() == "") {
			login_showPwd_2.show();
			login_pwd_2.hide();
		}
	});

	// 定时刷新消息
	if ($("#newMsgbox").length > 0) {
		msgTimer = setInterval(function() {
			$.post(ctx + "/getNewMsg.do", {}, function(rsp) {
				if (rsp) {
					var rspData = eval("(" + rsp + ")");
					$("#newMsgbox").empty();
					$("#newMsgbox").html(rspData.html);
					$("#newMsgNum").html(rspData.num);
				}
			}).error(function() {
				clearInterval(msgTimer);
			});
		}, 60000);
	}

	// document.getElementById("stuLoginBut").onclick = function() {
	// time(this);
	// };
});

// 个人登录
function studenLogin(msgObj) {
	var stuUserid = $('#login_form_1 [name=stuUserid]').val();
	var stuPwd = $('#login_form_1 [name=stuPwd]').val();
	var verifyCode = $('#login_form_1 [name=verifyCode]').val();
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
			if ($("#stuLoginBut").val() == "登录") {
				time(document.getElementById("stuLoginBut"));
				$.post(ctx + "/student.do?method=login", $('#login_form_1').serialize(), function(data) {
					if (data.success) {
						window.location.reload();
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

// 个人用户注销
function studenLogout() {
	$.prompt("是否要退出系统?", {
		buttons : {
			"确定" : true,
			"取消" : false
		},
		submit : function(e, v, m, f) {
			if (v) {
				$.post(ctx + "/student.do?method=logout", $('#login_form_1').serialize(), function(data) {
					if (data.success) {
						window.location.href = ctx + "/";
					}
				}, "json");
			}
		}
	});
}

// 企业用户登录
function userLogin(msgObj) {
	var userid = $('#login_form_2 [name=userId]').val();
	var userPwd = $('#login_form_2 [name=userPwd]').val();
	var verifyCode = $('#login_form_2 [name=verifyCode]').val();
	if (userid == "用户名/邮箱" || userid == "") {
		$(msgObj).text("请输入用户名");
	} else if (userPwd == "") {
		$(msgObj).text("请输入密码");
	} else if ($.trim(verifyCode) == "") {
		$(msgObj).text("* 请输入验证码");
	} else {
		if (/^\w{6,20}$/.test(userid) || /^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(userid)) {
			$(msgObj).text("正在登陆...");
			if ($("#userLoginBut").val() == "登录") {
				time(document.getElementById("userLoginBut"));
				$.post(ctx + "/epLogin.do", $('#login_form_2').serialize(), function(data) {
					if (data.success) {
						window.location.reload();
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

// 企业用户注销
function userLogout() {
	$.prompt("是否要退出系统?", {
		buttons : {
			"确定" : true,
			"取消" : false
		},
		submit : function(e, v, m, f) {
			if (v) {
				$.post(ctx + "/userLogout.do", $('#login_form_2').serialize(), function(data) {
					if (data.success) {
						window.location.href = ctx + "/";
					}
				}, "json");
			}
		}
	});
}
