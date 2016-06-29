<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>个人首页</h1>
	<br>
	<table border="1">
		<tr>
			<th>名字</th>
			<th>密码</th>
			<th>卡号</th>
		</tr>
		<tr>
			<td>${aclassqins.getName()}</td>
			<td>${aclassqins.getPwd()}</td>
			<td>${aclassqins.getCardid()}</td>
		</tr>
		<tr>
			<td><a href="gotoAqintableUpdata.do">修改</a>
			<td>
				<form action="gotoAqintableDelete.do">
					<input name="submitde" type="submit" value="删除" />
				</form>
			</td>
			<td>
				<!-- 				<form action="gotoAqintableQuery.do" method="post"> -->
				<form action="aqinLoginQueryAllAndLike.do" method="post">
					名字：<input name="name" type="text" /><br> <input name="submit"
						type="submit" value="查询" />
				</form>
			</td>
		</tr>
	</table>
	<!-- 
	查询：  登陆账户   查询其他商户
	<form action="gotoAqintableUpdata.do">
					<input name="submitup" type="submit" value="修改" />
				</form>
	
	<form action="/gotoAqintableUpdata.do" method="post">
		<button
			onclick="javascript:window.location.href='gotoAqintableUpdata.do';">修改</button>
		</forma>

		<form action="/example/html/form_action.asp" method="get">
			First name: <input type="text" name="fname" /><br /> Last name: <input
				type="text" name="lname" /><br />
			<button type="submit" value="Submit">Submit</button>
			<button type="reset" value="Reset">Reset</button>
		</form>
		 -->
</body>
</html>