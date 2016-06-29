<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-密码找回</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/pwdRecoverThirdly.js"></script>
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
					<div class="yuan_l">
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
			<form id="pwdRecoverThirdly_Info_form" action="${pageContext.request.contextPath}/student.do?method=pwdRecoverFourthly" method="post">
				<!--Start 新密码-->
				<div class="my_zfm" style="margin-left: 14px;">
					<table>
						<tr>
							<td><span class="m_name">新密码</span></td>
							<td><input type="password" name="stuPwd" id="pwdRecoverThirfly_stuPwd" onblur="check_pwdRecoverThirfly_StuPwdErrorMsg(this.value, '#pwdRecoverThirfly_StuPwdErrorMsg')" class="f_l" /></td>
							<td><span id="pwdRecoverThirfly_StuPwdErrorMsgImg" class="m_benz m_ymcw">&nbsp;&nbsp;&nbsp;&nbsp;</span> <span id="pwdRecoverThirfly_StuPwdErrorMsg"></span></td>
						</tr>
					</table>
					<div class="clear"></div>
				</div>
				<!--End 新密码-->
				<!--Start 确认新密码-->
				<div class="my_zfm">
					<table>
						<tr>
							<td><span class="m_name">确认密码</span></td>
							<td><input type="password" name="restuPwd" id="" class="f_l" onblur="check_pwdRecoverThirfly_reStuPwdErrorMsg(this.value, '#pwdRecoverThirfly_reStuPwdErrorMsg')"/></td>
							<td><span id="pwdRecoverThirfly_reStuPwdErrorMsgImg" class="m_benz m_ymcw">&nbsp;&nbsp;&nbsp;&nbsp;</span><span id="pwdRecoverThirfly_reStuPwdErrorMsg"></span></td>
						</tr>
					</table>
					<div class="clear"></div>
				</div>
				<!--End 确认新密码-->
				<p class="m_yzjxx">
					<input type="button" value="继续" onclick="nextPwdRecoverThirfly()" />
				</p>
				<input type="hidden" name="uuid" value="${requestScope.uuid }" />
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
