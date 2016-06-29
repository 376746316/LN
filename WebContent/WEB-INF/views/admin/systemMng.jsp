<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript" src="<c:url value="/js/admin/main.js" />"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',split:false" 
		style="height: 100px; padding: 0; overflow: heiiden">
		<div style="background:url('./images/main/swtp_01.jpg') no-repeat;width: 100%;height: 100%;">
		
		</div>
	</div>
	
	<!-- tree start -->
	
	<!-- tree end -->
	
	
	<div data-options="region:'west',split:true" title="用户菜单"
		style="width: 180px; padding1: 1px; overflow: hidden;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<div title="系统管理" style="padding: 10px; overflow: auto;">
				<p style="border: 1px solid black">组织管理</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
			</div>
			<div title="Title2" data-options="selected:true"
				style="padding: 10px;">content2</div>
			<div title="Title3" style="padding: 10px">content3</div>
		</div>
	</div>
	<div data-options="region:'center'" title="操作面板"
		style="overflow: hidden;">
		<div class="easyui-tabs" data-options="fit:true,border:false">
			<div title="欢迎界面" style="padding: 20px; overflow: hidden;">
				<div style="margin-top: 20px;">
					<h3>jQuery EasyUI framework help you build your web page
						easily.</h3>
					<ul>
						<li>easyui is a collection of user-interface plugin based on
							jQuery.</li>
						<li>using easyui you don't write many javascript code,
							instead you defines user-interface by writing some HTML markup.</li>
						<li>easyui is very easy but powerful.</li>
					</ul>
				</div>
			</div>
			
			<!-- tab start -->
			<div title="用户管理" selected="true" data-options="closable:true"
				style="overflow: hidden; padding: 5px;">
				<table id="test"></table>
				<div id="add" style="display: none;">
					<form action="addUser.do" method="post" id="form1">
						<table border="0" style="border: #6593CF solid 1px">
							<tr>
								<td><font size="2px">编号：</font><input type="text" size="12"
									name="userId" id="userId" /></td>
								<td><font size="2px">用户名：</font><input type="text"
									size="12" name="userName" id="userName" /></td>
								<td><font size="2px">密码：</font><input type="text"
									size="12" name="userPwd" id="userPwd" /></td>
								<td><font size="2px">真实姓名：</font><input type="text"
									size="12" name="userRname" id="userRname" /></td>
								<td><a href="javascript:addUser();"
									style="text-decoration: none;"><font size="2px">确定</font></a></td>
							</tr>
						</table>
					</form>
				</div>
				<div id="uploadDiv" style="display: none;">
					<form action="uploadfile.do" method="post"
						enctype="multipart/form-data">
						<table>
							<tr>
								<td>
									<div align="center">用户账号</div>
								</td>
								<td><input type="text" name="username" /></td>
							</tr>
							<tr>
								<td>
									<div align="center">
										用户附件 <br /> <a href="javascript:insertFile()">添加附件</a>
									</div>
								</td>
								<td id="fileForm"><br /></td>
							</tr>
						</table>
						<input type="submit" value="上传" />
					</form>
				</div>
			</div>
			
			<!-- tab end -->
			
		</div>
	</div>
</body>
</html>