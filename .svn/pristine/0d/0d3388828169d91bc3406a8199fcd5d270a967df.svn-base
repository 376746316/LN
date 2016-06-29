<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript" src="<c:url value="/js/main/main.js" />"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',split:true" title="North Title"
		style="height: 100px; padding: 10px;">
		<p>The north content.</p>
	</div>
	<div data-options="region:'south',split:true" title="South Title"
		style="height: 100px; padding: 10px; background: #efefef;">
		<div class="easyui-layout" data-options="fit:true"
			style="background: #ccc;">
			<div data-options="region:'center'">sub center</div>
			<div data-options="region:'east',split:true" style="width: 200px;">sub
				center</div>
		</div>
	</div>
	<div data-options="region:'east',iconCls:'icon-reload',split:true"
		title="Tree Menu" style="width: 180px;">
		<ul id="tt2" class="easyui-tree"
			data-options="url:'tree_data.json',checkbox:true,
			onClick: function(node){
				$(this).tree('toggle', node.target);
			},
			onContextMenu: function(e,node){
				e.preventDefault();
				$(this).tree('select',node.target);
				$('#mm').menu('show',{
					left: e.pageX,
					top: e.pageY
				});
			}"></ul>
		<div id="mm" class="easyui-menu" style="width: 120px;">
			<div onclick="append()" data-options="iconCls:'icon-add'">Append</div>
			<div onclick="remove()" data-options="iconCls:'icon-remove'">Remove</div>
			<div class="menu-sep"></div>
			<div onclick="expand()">Expand</div>
			<div onclick="collapse()">Collapse</div>
		</div>
	</div>
	<div data-options="region:'west',split:true" title="West Menu"
		style="width: 280px; padding1: 1px; overflow: hidden;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<div title="Title1" style="padding: 10px; overflow: auto;">
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content1</p>
				<p>content12</p>
			</div>
			<div title="Title2" data-options="selected:true"
				style="padding: 10px;">content2</div>
			<div title="Title3" style="padding: 10px">content3</div>
		</div>
	</div>
	<div data-options="region:'center'" title="Main Title"
		style="overflow: hidden;">
		<div class="easyui-tabs" data-options="fit:true,border:false">
			<div title="Tab1" style="padding: 20px; overflow: hidden;">
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
			<div title="Tab2" data-options="closable:true" style="padding: 20px;">

			</div>
			<div title="Tab3" data-options="iconCls:'icon-reload',closable:true"
				style="overflow: hidden; padding: 5px;">
				<div id="selectDiv">
					<table border="0" style="border: #6593CF solid 1px">
						<tr>
							<td><font size="2px">帖子标题：</font><input type="text"
								size="12" name="selecttitle" id="selecttitle" /></td>
							<td><font size="2px">作者名称：</font><input type="text"
								size="12" name="selectauthorid" id="selectauthorid" /></td>
							<td><a href="javascript:doSearch()">查询</a></td>
						</tr>
					</table>
				</div>
				<table id="test"></table>
				<div id="add" style="display: none;">
					<form action="addBlog.do" method="post" id="form1">
						<table border="0" style="border: #6593CF solid 1px">
							<tr>
								<td><font size="2px">编号：</font><input type="text" size="12"
									name="id" id="id" /></td>
								<td><font size="2px">帖子标题：</font><input type="text"
									size="12" name="title" id="title" /></td>
								<td><font size="2px">作者编号：</font><input type="text"
									size="12" name="authorid" id="authorid" /></td>
								<td><a href="javascript:addBlog();"
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
		</div>
	</div>
</body>
</html>