<%@page import="com.chinasofti.cetp.utils.ReaderXmlParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP-视频</title>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<script type="text/javascript" src="<c:url value="/js/iqiyi/sdkbase.js"/>"></script>

<script type="text/javascript" src="<c:url value="/js/resource/videoMng.js" />"></script>
<style>
.tree-icon {
	display: none
}
</style>
</head>
<body>
	<input id="uid" name="uid" type="hidden" value="${uid }" />
	<input id="red5Host" name="red5Host" type="hidden" value="${red5Host }" />
	<input id="appKey" name="appKey" type="hidden" value="${appKey }" />
	<input id="appSecret" name="appSecret" type="hidden" value="${appSecret }" />
	<div id="rightcont">
		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>
					<span>视频查询</span>
				</legend>
				<div id="searchAe">
					<form action="" method="post" id="searchForm" style="width: 100%">
						<table border="0" style="width: 100%; color: black; padding: 5px; font-size: 12px;">
							<tr>
								<td>视频名称：<input id="seach_vName" name="seach_vName" style="width: 100px;"></td>
								<td>资源类型：<input id="seach_vTypeId" class="easyui-combobox" name="seach_vTypeId" style="width: 100px;"></td>
								<td>所属分类：<input id="selectTypeId" name="slectTypeId" class="easyui-combotree" />
								</td>
								<td>视频状态：<input id="selectStatus" name="selectStatus" class="easyui-combobox" /></td>

							</tr>
							<tr>
								<td>&nbsp;&nbsp;<a href="javascript:search();" style="text-decoration: none;"> <font size="2px">查询</font>
								</a>&nbsp;&nbsp;<a href="javascript:resetForm();" style="text-decoration: none;"> <font size="2px">重置</font>
							</tr>
						</table>
					</form>
				</div>
			</fieldset>
		</div>
	</div>
	<div id="right_mx">
		<div id="yle_mx">视频信息表</div>
	</div>
	<div id="lbmx">
		<table id="video_datagrid"></table>
	</div>
	<div id="toolbar" style="display: none;">
		<a href="javascript:void(0)" id="mb" class="easyui-menubutton" data-options="menu:'#mm',iconCls:'icon-edit'">新建视频</a>
		<div id="mm" style="width: 150px; height: auto;">
			<div data-options="iconCls:'icon-tip'" onclick="addVideoResource('1');">奇艺高清视频</div>
			<div class="menu-sep"></div>
			<div data-options="iconCls:'icon-tip'" onclick="addVideoResource('2');">CC云视频</div>
			<div class="menu-sep"></div>
			<div data-options="iconCls:'icon-tip'" onclick="addVideoResource('3');">系统服务器资源</div>
		</div>
	</div>
	<div id="publish_div" style="display: none;">
		<table>
			<tr>
				<td><input type="checkbox" name="publish" id="iqiyi" value="1"></td>
				<td>奇艺高清</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="publish" id="bokecc" value="2"></td>
				<td>CC云视频</td>
			</tr>
		</table>
		<span id="msg_tip"></span>
	</div>
</body>
</html>