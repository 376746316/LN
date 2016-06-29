<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-用户注册</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/register.js"></script>
</head>

<body>
	<jsp:include page="/WEB-INF/include/top.jsp"></jsp:include>

	<!-- Start 注册页面 -->
	<div class="w980 auto k_regist">
		<div class="k_regbox auto">
			<div class="tabt posr font_yh">
				<ul>
					<li class="active">个人<span class="sj posa"></span></li>
					<li>工程师<span class="sj posa"></span></li>
				</ul>
				<span class="line">&emsp;</span>
			</div>
			<div class="tabc">
				<div class="k_hidden" style="display: block;">
					<form id="register_form_1" action="${pageContext.request.contextPath}/student.do?method=register" method="post">
						<div class="label">
							<input type="text" name="stuUserid" value="用户名" id="" class="username" onblur="check_stuUserid(this.value, '#stuUseridErrorMsg')" onblur="if(this.value==''){this.value='用户名'}" onfocus="if(this.value=='用户名'){this.value=''}" /><span id="stuUseridErrorMsg" class="tips"></span>
						</div>
						<div class="label">
							<input type="text" name="showPwd" value="密码" class="pass" /> <input id="password" type="password" name="stuPwd" onblur="check_pass(this.value, '#stuPwdErrorMsg')" value="" class="pass" /> <span id="stuPwdErrorMsg" class="tips"></span>
						</div>
						<div class="label">
							<input type="text" name="showRePwd" value="确定密码" id="" class="pass" /> <input type="password" name="restuPwd" value="" class="pass" onblur="check_rpass(this.value, '#rstuPwdErrorMsg')" /> <span id="rstuPwdErrorMsg" class="tips"></span>
						</div>
						<div class="label">
							<input type="text" name="stuMail" value="邮箱" id="" class="email" onblur="check_email(this.value, '#emailErrorMsg')" onfocus="if(this.value=='邮箱'){this.value=''}" /> <span id="emailErrorMsg" class="tips"></span>
						</div>
						<!-- 验证码 -->
						<div class="yzmbox">
							<div class="left num">
								<span class="yzmnum"> <img id="regImg_1" title="点击更换" onclick="javascript:refresh(this);" src="${pageContext.request.contextPath}/image.do" style="width: 120px; height: 49px" />
								</span> <a href="javascript:refresh($('#regImg_1')[0])">看不清楚，换一张</a>
							</div>
							<div class="right inputxt">
								<input type="text" id="register_form_1_verifyCode" name="verifyCode" onblur="onInputVerifyCode(this.value,'#verifyCodeErrorMsg')" /> <span id="verifyCodeErrorMsg" class="tips"></span>
							</div>
						</div>
						<!-- End 验证码 -->
						<div class="xy">
							<label for=""><input type="checkbox" checked class="left" name="" id="" onchange="changebackground('#reg_submit1',this)" /> <a href="" class="left">同意用户注册协议</a></label>
						</div>
						<input id="reg_submit1" type="button" value="  " class="sub_reg" onclick="check_registerInfo()" />
					</form>
				</div>
				<div class="k_hidden">
					<form id="register_form_2" action="${pageContext.request.contextPath}/userRegister.do" method="post">
						<div class="label">
							<input type="text" name="userId" value="用户名" id="" class="username" onblur="check_userId(this.value, '#userIdErrorMsg')" onblur="if(this.value==''){this.value='用户名'}" onfocus="if(this.value=='用户名'){this.value=''}" /><span id="userIdErrorMsg" class="tips"></span>
						</div>
						<div class="label">
							<input type="text" name="showPwd" value="密码" class="pass" /> <input id="userPwd" type="password" name="userPwd" onblur="check_userPwd(this.value, '#userPwdErrorMsg')" value="" class="pass" /> <span id="userPwdErrorMsg" class="tips"></span>
						</div>
						<div class="label">
							<input type="text" name="showUserPwd" value="确定密码" id="" class="pass" /> <input type="password" name="reUserPwd" value="" class="pass" onblur="check_reUserPwd(this.value, '#reUserPwdErrorMsg')" /> <span id="reUserPwdErrorMsg" class="tips"></span>
						</div>
						<div class="label">
							<input type="text" name="userMail" value="邮箱" id="" class="email" onblur="check_userMail(this.value, '#userMailErrorMsg')" onfocus="if(this.value=='邮箱'){this.value=''}" /> <span id="userMailErrorMsg" class="tips"></span>
						</div>
						<!-- 验证码 -->
						<div class="yzmbox">
							<div class="left num">
								<span class="yzmnum"> <img id="regImg_2" title="点击更换" onclick="javascript:refresh(this);" src="${pageContext.request.contextPath}/image.do" style="width: 120px; height: 49px" />
								</span> <a href="javascript:refresh($('#regImg_2')[0])">看不清楚，换一张</a>
							</div>
							<div class="right inputxt">
								<input type="text" id="register_form_2_verifyCode" name="verifyCode" onblur="onInputVerifyCode(this.value,'#userVerifyCodeErrorMsg')" /> <span id="userVerifyCodeErrorMsg" class="tips"></span>
							</div>
						</div>
						<!-- End 验证码 -->
						<div class="xy">
							<label for=""><input type="checkbox" checked class="left" name="" id="" onchange="changebackground('#reg_submit2',this)" /> <a href="" class="left">同意用户注册协议</a></label>
						</div>
						<input id="reg_submit2" type="button" value="  " class="sub_reg" onclick="check_userRegisterInfo()" />
					</form>
				</div>
			</div>
		</div>
	</div>
	<input type="hidden" id="_pwd" />
	<!-- End 注册页面 -->

	<!--Start 页脚-->
	<jsp:include page="/WEB-INF/include/footer.jsp"></jsp:include>
	<!-- End 页脚 -->
</body>
</html>


