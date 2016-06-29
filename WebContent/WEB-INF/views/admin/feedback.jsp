<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>中软卓越培训网-意见反馈</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/feedback.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.uploadify.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/feedback.css" />
</head>
<body>
	<jsp:include page="/WEB-INF/include/top.jsp"></jsp:include>

	<div class="blank10"></div>
	<!-- Start 个人用户意见反馈 -->
	<div class="yjfk_box">
		<div class="yjfk">
			<h1>意见反馈</h1>
			<div class="yjfk_cont">
				<form id="feedback_form" action="" method="post">
					<div class="yjfl_bt">
						<span class="f_l y_fktt">标题 :</span>
						<div class="f_l y_tt">
							<input type="text" name="fbTitle" id="" class="y_title" />
						</div>
						<div class="clear"></div>
					</div>
					<div class="yjfl_bt">
						<span class="f_l y_fktt">内容 :</span>
						<div class="f_l y_tt">
							<textarea id="fbContent" cols="4" rows="10" class="y_nr" name="fbContent"></textarea>
						</div>
						<div class="clear"></div>
						<div class="y_yjfj">
							<input type="file" name="uploadfile" id="uploadfile" />
						</div>
					</div>
					<div class="yjfl_bt">
						<span class="f_l y_fktt">邮箱 :</span>
						<c:choose>
							<c:when test="${sessionScope.sessionInfo.student != null && sessionScope.sessionInfo.user == null }">
								<div class="f_l y_tt">
									<input type="text" name="fbMail" value="${sessionScope.sessionInfo.student.stuMail}" id="" class="y_title" />
								</div>
							</c:when>
							<c:when test="${sessionScope.sessionInfo.user != null && sessionScope.sessionInfo.student == null }">
								<div class="f_l y_tt">
									<input type="text" name="fbMail" value="${sessionScope.sessionInfo.user.userMail}" id="" class="y_title" />
								</div>
							</c:when>
							<c:otherwise>
								<input type="text" name="fbMail" id="" class="y_title" />
							</c:otherwise>
						</c:choose>
						<div class="clear"></div>
					</div>
					<div class="yjfl_bt">
						<span class="f_l y_fktt">电话 :</span>
						<c:choose>
							<c:when test="${sessionScope.sessionInfo.student != null && sessionScope.sessionInfo.user == null }">
								<div class="f_l y_tt">
									<input type="text" name="fbPhone" value="${sessionScope.sessionInfo.student.stuMobile}" id="" class="y_title" />
								</div>
							</c:when>
							<c:when test="${sessionScope.sessionInfo.user != null && sessionScope.sessionInfo.student == null }">
								<div class="f_l y_tt">
									<input type="text" name="fbPhone" value="${sessionScope.sessionInfo.user.userMobile}" id="" class="y_title" />
								</div>
							</c:when>
							<c:otherwise>
								<input type="text" name="fbPhone" id="" class="y_title" />
							</c:otherwise>
						</c:choose>
						<div class="clear"></div>
					</div>
					<div class="yjfl_bt">
						<input type="button" value="提交" class="y_subbccg" onclick="doSubmit()" /> <span class="y_tjcg" id="feedback_msg"></span>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="blank30"></div>

	<!--Start 页脚-->
	<jsp:include page="/WEB-INF/include/footer.jsp"></jsp:include>
	<!-- End 页脚 -->
</body>
</html>
