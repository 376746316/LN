<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-密码找回</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/userPwdRecoverFirst.js"></script>
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
					<div class="yuan_h">
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
		
			<form id="nextUserPwdRecover_Info_form" action="${pageContext.request.contextPath }/pwdRecoverSecond.do" method="post">
				<!--Start 账户名-->
				<div class="my_zfm">
					<span class="m_name">账户名</span> <input type="text" id="" name="userId" class="f_l" onblur="chackUserIdAvailable(this.value,'#pwdRecover_userIdMsg')" /> <span class="m_benz" id="pwdRecover_userIdMsg"></span>
					<div class="clear"></div>
				</div>
				<!--End 账户名-->
				<!--Start 验证码-->
				<div class="my_yzm">
					<span class="m_name">验证码</span> <input type="text" name="verifyCode" id="pwdRecover_userverifyCode" class="f_l" onkeyup="chackUserVerifyCodeDo(this.value, '#pwdRecover_useryzmMsg')" /> <span id="pwdRecover_useryzmMsgImg" style="display: none;"><img src="images/zhmm_t6.png" /></span> <span class="ml_10"><img id="img_3" style="height: 29px; width: 81px;" title="点击更换" onclick="javascript:refresh(this);" src="${pageContext.request.contextPath}/image.do" style="width: 120px; height: 49px" /></span> <span class="m_hyz"><a href="javascript:refresh($('#img_3')[0])">换一张</a></span> <span id="pwdRecover_useryzmMsg" class="m_benz"></span>
					<div class="clear"></div>
				</div>
				<p class="m_yzjx">
					<input type="button" value="继续" onclick="nextUserPwdRecover()" /> <span class="y_tjcg" id="nextUserPwdRecoverMsg">${requestScope.errorMsg }</span>
				</p>
				<!--End 验证码-->
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
