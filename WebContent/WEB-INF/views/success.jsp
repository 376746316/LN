<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录成功</title>
</head>
<body>
	恭喜你${usrname} 登陆成功
	<hr>
	<table>
		<tr>
			<td>序号</td>
			<td>用户名</td>
			<td>密码</td>
		</tr>
		<c:forEach var="luser" items="${requestScope.luserList }">
			<tr>
				<td>${luser.id }</td>
				<td>${luser.username }</td>
				<td>${luser.passwd }</td>
				<td>
					<a href="lidezhengUpdateView.do?userId=${luser.id }">修改</a>&nbsp;&nbsp;&nbsp;
				    <a href="lidezhengDeleteOne.do?id=${luser.id }">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>