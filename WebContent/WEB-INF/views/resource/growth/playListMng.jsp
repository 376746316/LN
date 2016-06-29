<%@page import="com.chinasofti.cetp.utils.ReaderXmlParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP-视频</title>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<script type="text/javascript" src="<c:url value="/js/resource/growth/playListMng.js" />"></script>
</head>
<body>
	<div id="rightcont">
		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>
					<span>播放列表查询</span>
				</legend>
				<div id="searchAe">
					<form action="" method="post" id="searchForm" style="width: 100%">
						<table border="0" style="width: 100%; color: black; padding: 5px; font-size: 12px;">
							<tr>
								<td>栏目名称：<input id="listName" name="listName" style="width: 100px;"></td>
								<td>&nbsp;&nbsp;<a href="javascript:doSearch();" style="text-decoration: none;"> <font size="2px">查询</font>
								</a>&nbsp;&nbsp;<a href="javascript:doReset();" style="text-decoration: none;"> <font size="2px">重置</font>
							</tr>
						</table>
					</form>
				</div>
			</fieldset>
		</div>
	</div>
	<div id="right_mx">
		<div id="yle_mx">播放列表信息表</div>
	</div>
	<div id="lbmx">
		<table id="playList_datagrid"></table>
	</div>

</body>
</html>