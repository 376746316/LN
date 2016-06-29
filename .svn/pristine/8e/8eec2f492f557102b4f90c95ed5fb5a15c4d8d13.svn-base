<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>实训平台</title>

<script type="text/javascript">
	$(function() {
		$("#login_form input").bind('keyup', function(event) {
			if (event.keyCode == "13") {
				login(); // 用户登录
			}
		});
	});

	jQuery(document).ready(
	function($) {
		// Do the biznizz:
		$('#login_form').motionCaptcha({
			shapes : [ 'triangle', 'x', 'rectangle', 'circle', 'check', 'zigzag', 'arrow', 'delete', 'pigtail', 'star' ]
		});

		// Yep:
		$("input.placeholder").placeholder();
	}

	);

	function yzmClick() {
		if ('请输入右侧验证码' == $('#userLoginYzm').val()) {
			$('#userLoginYzm').val('');
			$('#userLoginYzm').css('color', '');
		}
	}
	function yzmBlur() {
		if ('' == $('#userLoginYzm').val()) {
			$('#userLoginYzm').val('请输入右侧验证码');
			$('#userLoginYzm').css('color', 'gray');
		}
	}

	// 用户登录
	function login() {
		var userLoginName = $('#userLoginName').val();
		var userLoginPswd = $('#userLoginPswd').val();
		var userLoginYzm = $('#userLoginYzm').val();
		if (userLoginName == "") {
			alert("请输入用户名");
		} else if (userLoginPswd == "") {
			alert("请输入密码");
		} else if (userLoginYzm == "") {
			alert("请输入验证码");
		} else {
			$.post("${pageContext.request.contextPath}/userLogin.do", $('#login_form').serialize(), function(data) {
				if (data.success) {
					//$(msgObj).text("");
					window.location.href = "${pageContext.request.contextPath}/todefault.do";
				} else {
					alert(data.msg);
				}
			}, "json");
		}
	}
</script>
</head>
<body id="sybody">
	<center>
		<div id="wrapper">
			<form action="userLogin.do" method="post" id="login_form">
				<div id="logo">
					<img src="images/main/ww.jpg" />
				</div>
				<div id="content">
					<div id="login_left">
						<div id="dl">
							<div id="yhm">
								<input name="userLoginName" id="userLoginName" type="text" style="height: 16px; line-height: 16px; background: none; border: none; width: 150px;" />
							</div>
							<div id="mm">
								<input name="userLoginPswd" id="userLoginPswd" type="password" style="height: 16px; line-height: 16px; background: none; border: none; width: 150px;" />
							</div>
						</div>
						<div id="dl">
							<div id="yhm">
								<input name="userLoginYzm" id="userLoginYzm" type="text" value="请输入右侧验证码" onClick="yzmClick()" onBlur="yzmBlur()" style="color: gray; height: 16px; line-height: 16px; background-color: ffffcc; border: none; width: 150px; margin-top: -3px;" />
							</div>
							<div id="mm">
								<img src="getimagedata.do" />

							</div>
							<input id="submitBut" type="button" value="&nbsp;" style="background: url('images/dl_091.jpg'); background-repeat: no-repeat; width: 100px; height: 42px; border: none; margin-top: -52px; float: left; margin-left: 318px;" onclick="login();" />
						</div>
					</div>
					<div id="login_right">
						<div id="sm">
							<img src="images/main/swtp_11.jpg" />
						</div>
					</div>
					<div id="cb"></div>
				</div>
			</form>
		</div>
		<div style="margin-top: 20px;">
			<!-- <font size="2" color="#014676">技术支持：北京中软国际教育科技有限公司</font> -->
		</div>
	</center>
</body>
</html>
