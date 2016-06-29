<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-用户注册</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript">
	$(function() {
		var time = parseInt($("#gotomsg span").text()), interval = setInterval(function() {
			$("#gotomsg span").text(--time);
			if (time == 0) {
				clearInterval(interval);
				location.href = $('#gotomsg').attr('href');
			}
		}, 1000);
	});
</script>
<style type=text/css>
#content {
	width: 980px;
	margin-left: auto;
	margin-right: auto;
}

.mod-regnotify {
	position: relative;
	padding-top: 90px;
}

.clearfix {
	zoom: 1;
}

.reg-notify-succ-p {
	text-align: center;
	font-size: 14px;
	color: #666;
	line-height: 58px;
}

.reg-send-msg {
	padding-left: 200px;
	margin-top: 20px;
	font-size: 12px;
	color: #666;
}

.reg-send-msg-title {
	margin-bottom: 5px;
	font-weight: bold;
}

ul,ol {
	list-style: none;
}

.reg-send-msg-list {
	line-height: 20px;
}

.reg-notify-button {
	margin: 30px auto 90px;
}

.button {
	display: block;
	width: 180px;
	height: 50px;
	margin: 0 auto;
	padding: 0;
	font-size: 16px;
	font-weight: bold;
	cursor: pointer;
	color: #fff;
	background: #3f89ec;
	border-radius: 3px;
	border: none;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
	transition: .3s;
	-moz-transition: .3s;
	-o-transition: .3s;
	-webkit-transition: .3s;
	line-height: 50px;
	text-align: center;
	text-decoration: none;
	-webkit-border-radius: 3px;
	transition: .3s;
	-moz-transition: .3s;
	-o-transition: .3s;
	-webkit-transition: .3s;
}

.reg-send-succ {
	text-align: center;
}

.reg-send-succ span {
	position: relative;
	top: 2px;
	left: 10px;
	font-size: 16px;
	font-weight: bold;
	color: #666;
}

.result-goto {
	text-align: center;
	margin-bottom: 80px;
	margin-top: 68px;
	margin-bottom: 200px;
}
</style>
</head>

<body>
	<jsp:include page="/WEB-INF/include/top.jsp"></jsp:include>

	<div id="content">
		<div class="mod-regnotify clearfix">
			<div class="reg-notify-info">
				<p class="reg-send-succ">
					<img src="${pageContext.request.contextPath}/images/error_icon.png" /><span>激活链接已经失效，请重新注册！</span>
				</p>
				<%-- <p class="reg-notify-succ-p">我们已经向您的邮箱${requestScope.sendEmail}发送了一封激活邮件，请点击邮件中的链接完成注册！</p>
				<div class="reg-send-msg">
					<h5 class="reg-send-msg-title">注册成功后，您可以享受如下服务：</h5>
					<ul class="reg-send-msg-ul">
						<li class="reg-send-msg-list">1. 登录“宅客学院”，免费学习案例驱动课程，畅享社区乐趣，享受项目实训、就业求职、在线答疑等定制服务……</li>
					</ul>
				</div>
				<p class="reg-notify-button">
					<a href="http://mail.qq.com/" target="_blank" class="button" style="color: #fff">立即进入邮箱</a>
				</p> --%>
			</div>
			<div class="result-goto">
				<a href="${pageContext.request.contextPath}/" style="text-decoration: none;color: #2b78e4;" id="gotomsg"><span>5</span>秒后自动跳转</a>
			</div>
		</div>
	</div>


	<!--Start 页脚-->
	<jsp:include page="/WEB-INF/include/footer.jsp"></jsp:include>
	<!-- End 页脚 -->
</body>
</html>


