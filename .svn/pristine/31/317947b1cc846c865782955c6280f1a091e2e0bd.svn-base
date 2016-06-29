<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-密码找回</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/pwdRecoverSecond.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/include/top.jsp"></jsp:include>

	<div class="blank10"></div>
	<!-- Start 找回密码 -->
	<div class="zhmm_box">
		<h1>找回密码</h1>
		<div class="blank30"></div>
		<div class="zhmm_list">
			<ul class="zhmm_t">
				<li class="w245">
					<div class="yuan_l">
						<span>1</span>
					</div> <span class="mm_wz">填写账户名</span>
				</li>
				<li class="w252">
					<div class="yuan_l">
						<span>2</span>
					</div> <span class="mm_id">验证身份</span>
				</li>
				<li class="w252">
					<div class="yuan_h">
						<span>3</span>
					</div> <span class="mm_id">重置密码</span>
				</li>
				<li style="background: none;">
					<p class="mm_wc">
						<img src="images/zhmm_t3.png" />
					</p> <span class="mm_wc_l">完成</span>
				</li>
			</ul>
		</div>
		<div class="my_zhmm">
			<form id="nextPwdRecoverSecond_Info_form" action="${pageContext.request.contextPath}/student.do?method=pwdRecoverThirdly" method="post">
				<p class="m_email">
					验证码已发送至您 <span>${requestScope.mail }</span> 的邮箱，请填写您收到的验证码。
				</p>
				<div class="my_lb2">
					<table>
						<tr>
							<td><span class="m_name">验证码</span></td>
							<td><input type="text" name="verifyCode" id="pwdRecoverSecond_verifyCode" class="f_l" onkeyup="checkSecurityVerifyCodeDo(this.value, '#pwdRecoverSecond_yzmMsg')" /></td>
							<td><span id="pwdRecoverSecond_yzmMsgImg" style="display: none;"><img src="images/zhmm_t6.png" /></span></td>
							<td><span><!-- <a id="retransmission">再次发送邮件</a> --><input type="button" id="btn" value="再次发送邮件" /></span></td>
							<td><span id="pwdRecoverSecond_yzmMsg" class="m_benz"></span>${requestScope.errorMsg }</td>
						</tr>
					</table>
					<div class="clear"></div>
				</div>
				<p class="m_yzjx">
					<input type="button" value="继续" onclick="nextPwdRecoverSecond()" />
				</p>
				<input type="hidden" name="stuUserid" value="${requestScope.stuUserid }"/>
			</form>
		</div>
	</div>
	<!-- End 找回密码 -->
	<div class="blank30"></div>
	<!--Start 页脚-->
	<jsp:include page="/WEB-INF/include/footer.jsp"></jsp:include>
	<!-- End 页脚 -->
</body>
</html>
