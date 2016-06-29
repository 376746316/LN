<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript" src="<c:url value="/js/resource/growth/editPlayList.js" />"></script>
<style>
.tree-icon {
	display: none
}
</style>
</head>
<body>

	<div id="rightcont">
		<!-- 列表 start -->
		<div id="right_mx">
			<div id="yle_mx">新建播放栏目</div>
		</div>
		<div id="lbmx">
			<div style="padding: 20px;">
				<input type="hidden" id="listId" name="listId" value="${playList.listId }"> 
				<table border="0" cellpadding="0" cellspacing="4" style="font-size: 12px;">
					<tr>
						<td align="right" width="110px"><font color="red">*</font>栏目名称：</td>
						<td><input type="text" name="listName" id="listName" value="${playList.listName }" placeholder="输入列表名称" style="width: 120px" /></td>
						<td align="right" width="110px"><font color="red">*</font>上传作者：</td>
						<td><input type="text" name="listAnthor" id="listAnthor" value="${playList.listAnthor }" placeholder="输入列表名称" style="width: 120px" /></td>
					</tr>
					<tr>
						<td align="right" width="110px">列表简介：</td>
						<td colspan="3"><textarea rows="20" cols="5" id="listInfo" name="listInfo" style="width: 740px; height: 50px;" placeholder="输入列表简介" />${playList.listInfo }</textarea></td>
					</tr>
				</table>
				<span id="msgTip"></span>
			</div>
		</div>
		<!-- 列表 end -->
		<div style="margin-top: 10px; margin-left: 30px;">
			<a href="#" class="easyui-linkbutton" onClick="doSubmit()" iconCls="icon-ok">提交</a>&nbsp;&nbsp; <a href="#" class="easyui-linkbutton" onClick="doBack()" iconCls="icon-back">返回</a>
		</div>
	</div>
</body>
</html>
