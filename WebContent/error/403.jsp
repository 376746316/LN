<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>资源暂时不可用。。</title>
<style type="text/css">
.m404 {
	margin: 100px auto;
	vertical-align: middle;
	text-align: center
}
</style>
</head>
<%@ include file="/WEB-INF/include/header.jsp"%>
<body>
	<input id="menuActived" type="hidden" value="menuItem_Index" />
	<%@ include file="/WEB-INF/include/top.jsp"%>
	<div class="m404">
		<a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/images/403.png" width="409" height="177" alt="“真的很抱歉，资源暂时不可用……”要不去网站首页看看？" border="0" /></a>
	</div>
	<div class="blank40"></div>
	<div class="blank40"></div>
	<div class="blank40"></div>
	<!-- end 内容 -->
	<%@ include file="/WEB-INF/include/footer.jsp"%>
</body>
</html>
