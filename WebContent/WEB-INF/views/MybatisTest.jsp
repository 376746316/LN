<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <form action="getInfo.do" method="post">
		作者id:<input type="text" name="id"/>
		<input type="submit" value="提交"/> 
	</form> -->
	
	<form action="getinfoByBlogId.do" method="post">
		作者id:<input type="text" name="id"/>
		<input type="submit" value="提交"/> 
	</form>
	所有信息
	<br>
	<!--  
	<c:forEach var="blog" items="${requestScope.authorMore.blogList }">
		ID : ${blog.blogId } --- 标题 ：${blog.blogTitle }  <br />
	</c:forEach>
	-->
	<c:forEach var="blogMore" items="${requestScope.blogMorelist }">
		ID : ${blogMore.blogId } --- 标题 ：${blogMore.blogTitle }  --- 作者：${blogMore.author.username }  <br />
	</c:forEach>
</body>
</html>