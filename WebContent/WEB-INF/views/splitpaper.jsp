<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页技术测试</title>
<script type="text/javascript">
</script>
<style type="text/css">
</style>
</head>
<body>
	<div>
		<c:forEach var="author" items="${requestScope.authorList }">
			序号: ${author.id }----用户名: ${author.username }----email: ${author.email }----博客： ${author.bio }<br>
		</c:forEach>
	</div>	
	<div>
	共<b>${requestScope.currentPage} / ${requestScope.totalPage }</b>页
	<a href="QueryforSplitPaper.do?currentPage=1">首页</a>
	<a id="prepage" href="QueryforSplitPaper.do?currentPage=${requestScope.currentPage-1}">上一页</a>
	<a id="nextpage"href="QueryforSplitPaper.do?currentPage=${requestScope.currentPage+1}">下一页</a>
	<a href="QueryforSplitPaper.do?currentPage=${requestScope.totalPage }">最后一页</a>
	</div>
</body>
</html>