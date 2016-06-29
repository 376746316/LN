<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>修改页面</h1>
	<h2>将要修改的用户名：${updataclas.getName()}</h2>
	<form action="aqinUpDataUser.do" method="post">
		新密码：<input name="pwd" type="text" /><br>新卡号：<input name="cardid"
			type="text" /><br> <input name="submit" type="submit"
			value="提交" />
	</form>
</body>
</html>