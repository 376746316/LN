<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-用户登录</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/loginRedirect.js"></script>
<script type="text/javascript">
	var redirect = "${redirect}";
</script>
</head>

<body>
	<jsp:include page="/WEB-INF/include/top.jsp"></jsp:include>

	<div class="w980 auto k_regist posr" style="height: 400px;">
		<!-- Start 登录层 -->
		<div class="k_login auto" style="display: block; ">
			<div class="tabt posr font_yh">
				<ul>
					<li class="active">个人<span class="sj posa"></span></li>
					<li>工程师<span class="sj posa"></span></li>
				</ul>
				<span class="line">&emsp;</span>
			</div>

			<div class="tabc">
				<div class="k_hidden" style="display: block;">
					<form id="login_form_3" action="" method="post">
						<div class="loginbox">
							<div class="loginboxc">
								<div class="username">
									<input type="text" name="stuUserid" value="用户名/邮箱" id="search" tabindex="1" onblur="if(this.value==''){this.value='用户名/邮箱'}" onfocus="if(this.value=='用户名/邮箱'){this.value=''}" />
								</div>
								<div class="wordpass">
									<input type="text" name="showPwd" value="密码" /> <input type="password" name="stuPwd" value="" tabindex="2" />
								</div>
							</div>
							<div class="loginbom"></div>
						</div>
						<!-- 验证码 -->
						<div class="yzmbox">
							<div class="left num">
								<span class="yzmnum"><img id="img_1" title="点击更换" onclick="javascript:refresh(this);" src="${pageContext.request.contextPath}/image.do" style="width: 120px; height: 49px" /></span> <a href="javascript:refresh($('#img_1')[0])">看不清楚，换一张</a>
							</div>
							<div class="right inputxt">
								<input type="text" name="verifyCode" id="" tabindex="3" /> <span id="logErrorMsgWeb" class="tips">* 请输入验证码</span>
							</div>
						</div>
						<!-- End 验证码 -->
						<div class="k_zcdl">
							<div class="left kw">
								<a href="${pageContext.request.contextPath}/student.do?method=pwdRecoverFirst" class="wjmm">忘记密码了</a> <a href="${pageContext.request.contextPath}/sys.do?method=register">注册</a>
							</div>
							<div class="right">
								<input id="stuLoginButWeb" type="button" value="登录" class="login" tabindex="4" onclick="studenLoginWeb('#logErrorMsgWeb')" style="color: aliceblue; font-size: 17px;" />
							</div>
						</div>
					</form>
				</div>
				<div class="k_hidden">
					<form id="login_form_4" action="" method="post">
						<div class="loginbox">
							<div class="loginboxc">
								<div class="username">
									<input type="text" name="userId" value="用户名/邮箱" id="search" tabindex="1" onblur="if(this.value==''){this.value='用户名/邮箱'}" onfocus="if(this.value=='用户名/邮箱'){this.value=''}" />
								</div>
								<div class="wordpass">
									<input type="text" name="showPwd" value="密码" /> <input type="password" name="userPwd" value="" tabindex="2" />
								</div>
							</div>
							<div class="loginbom"></div>
						</div>
						<!-- 验证码 -->
						<div class="yzmbox">
							<div class="left num">
								<span class="yzmnum"><img id="img_2" title="点击更换" onclick="javascript:refresh(this);" src="${pageContext.request.contextPath}/image.do" style="width: 120px; height: 49px" /></span> <a href="javascript:refresh($('#img_2')[0])">看不清楚，换一张</a>
							</div>
							<div class="right inputxt">
								<input type="text" name="verifyCode" id="" tabindex="3" /> <span id="userLogErrorMsgWeb" class="tips">* 请输入验证码</span>
							</div>
						</div>
						<!-- End 验证码 -->
						<div class="k_zcdl">
							<div class="left kw">
								<a href="${pageContext.request.contextPath}/pwdRecoverFirst.do" class="wjmm">忘记密码了</a> <a href="${pageContext.request.contextPath}/sys.do?method=register">注册</a>
							</div>
							<div class="right">
								<input id="userLoginButWeb" type="button" value="登录" class="login" tabindex="4" onclick="userLoginWeb('#userLogErrorMsgWeb')" style="color: aliceblue; font-size: 17px;" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<!-- End 登录层 -->

	</div>

	<!--Start 页脚-->
	<jsp:include page="/WEB-INF/include/footer.jsp"></jsp:include>
	<!-- End 页脚 -->
</body>
</html>


