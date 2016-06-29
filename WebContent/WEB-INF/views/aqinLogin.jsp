<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- action:table提交到的方法位于Controller -->
	<form action="aqinRegister.do" method="post">
		名字：<input name="name" type="text" /><br> 密码：<input name="pwd"
			type="text" /><br>卡号：<input name="cardid" type="text" /><br>
		<input name="submit" type="submit" value="提交" />
	</form>

	<a href="aqinLoginQueryJupe.do">已有账号，登陆</a>

</body>
</html>