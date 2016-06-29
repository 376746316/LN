<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-用户注册</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/register.js"></script>
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
	-moz-border-radius: 3px; -webkit-border-radius : 3px;
	transition: .3s;
	-moz-transition: .3s; -o-transition : .3s; -webkit-transition : .3s;
	line-height: 50px;
	text-align: center;
	text-decoration: none;
	-webkit-border-radius: 3px; transition : .3s; -moz-transition : .3s;
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
</style>

</head>

<body>
	<jsp:include page="/WEB-INF/include/top.jsp"></jsp:include>
	<div id="content">
		<div class="mod-regnotify clearfix">
			<div class="reg-notify-info">
				<p class="reg-send-succ">
					<img src="${pageContext.request.contextPath}/images/success_6d23af3f.png" /><span>还差一步即可完成注册</span>
				</p>
				<p class="reg-notify-succ-p">我们已经向您的邮箱${requestScope.sendEmail}发送了一封激活邮件，请点击邮件中的链接完成注册！</p>
				<div class="reg-send-msg">
					<h5 class="reg-send-msg-title">注册成功后，您可以享受如下服务：</h5>
					<ul class="reg-send-msg-ul">
						<li class="reg-send-msg-list">1. 登录“宅客学院”，免费学习案例驱动课程，畅享社区乐趣，享受项目实训、就业求职、在线答疑等定制服务……</li>
					</ul>
				</div>
				<p class="reg-notify-button">
					<c:if test="${requestScope.flag == true}">
						<a href="${requestScope.emailLoginURL}" target="_blank" class="button" style="color: #fff">立即进入邮箱</a>
					</c:if>
					<c:if test="${requestScope.flag == false}">
						<a href="javascript:;" class="button" style="color: #fff; width: 234px; background-color: darkgrey;">请登录您的邮箱查收邮件</a>
					</c:if>
				</p>
			</div>
		</div>
	</div>

	<!-- Start 注册成功 -->
	<%-- <div class="g_zccg">
		<div class="zccg">
			<div class="zccg_t">
				<p>
					<img src="${pageContext.request.contextPath}/images/zhmm_t7.png" width="89" height="89" alt="" />
					还差一步即可完成注册
				</p>
				<p>我们已经向您的邮箱${requestScope.sendEmail}发送了的一封激活邮件，请点击邮件中的连接完成注册!</p>
			</div>
			<div class="zccg_b">
				<h2>注册成功后，您可以享受如下服务：</h2>
				<ul>
					<li>登录“宅客学院”，免费学习案例驱动课程，畅享社区乐趣，享受项目实训、就业求职、在线答疑等定制服务……</li>
				</ul>
			</div>
		</div>
	</div> --%>
	<div class="blank80"></div>
	<!-- End 注册成功 -->

	<!--Start 页脚-->
	<jsp:include page="/WEB-INF/include/footer.jsp"></jsp:include>
	<!-- End 页脚 -->
</body>
</html>


