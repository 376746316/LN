<%@page import="com.chinasofti.cetp.utils.ReaderXmlParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP-视频</title>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<script type="text/javascript" src="<c:url value="/js/resource/growth/playListVideosMng.js" />"></script>
<style>
.tree-icon {
	display: none
}
</style>
</head>
<body>
	<input id="red5Host" name="red5Host" type="hidden" value="${red5Host }" />
	<input id="red5Path" name="red5Path" type="hidden" value="${red5Path }" />
	<input id="listId" name="listId" type="hidden" value="${playList.listId }" />
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
		<div id="yle_mx">${playList.listName }视频信息表</div>
	</div>
	<div id="lbmx">
		<table id="video_datagrid"></table>
	</div>

	<div id="videoDiv" class="easyui-window" title="选择栏目视频" iconCls="icon-tip" style="width: auto; height: auto; padding: 5px; background: #fafafa;" closed="true" modal="true" closable="false" minimizable="false" maximizable="false" collapsible="false">
		<table border="0" style="width: 100%; color: black; padding: 5px; font-size: 12px;">
			<tr>
				<td>视频名称：<input id="c_seach_vName" style="width: 100px;"></td>
				<td>资源类型：<input id="c_seach_vTypeId" class="easyui-combobox" style="width: 100px;"></td>
				<td>所属分类：<input id="c_selectTypeId" class="easyui-combotree" />
				</td>
				<td>视频状态：<input id="c_selectStatus" class="easyui-combobox" /></td>

			</tr>
			<tr>
				<td>&nbsp;&nbsp;<a href="javascript:sub_search();" style="text-decoration: none;"> <font size="2px">查询</font>
				</a>&nbsp;&nbsp;<a href="javascript:sub_resetForm();" style="text-decoration: none;"> <font size="2px">重置</font>
			</tr>
		</table>
		<table id="choiseVideoTable"></table>
		<div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
			<a class="easyui-linkbutton" iconCls="icon-add" href="javascript:void(0)" onclick="doChoise()">确定</a> <a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="$('#videoDiv').window('close');">取消</a>
		</div>
	</div>
	<div id="uploadDiv" class="easyui-window" title="添加栏目视频" iconCls="icon-tip" style="width: 500px; height: auto; padding: 5px; background: #fafafa;" closed="true" modal="true" closable="false" minimizable="false" maximizable="false" collapsible="false">
		<input type="hidden" id="vFileName" name="vFileName">
		<table class="tool-table">
			<tbody>
				<tr>
					<td width="100px">视频名称：</td>
					<td colspan="2"><input id="title" name="title" placeholder="请输入视频标题" type="text" /></td>
				</tr>
				<tr>
					<td>技术分类：</td>
					<td colspan="2"><select id="vTechType" name="vTechType" required="true"></select></td>
				</tr>
				<tr>
					<td>视频简介：</td>
					<td colspan="2"><textarea id="description" name="description" placeholder="请输入视频简介" rows="5" cols="30"></textarea></td>
				</tr>
				<tr>
					<td>文件浏览:</td>
					<td colspan="2">
						<div id="uploadvideoarea"></div>
					</td>
				</tr>
				<tr id="pre_tr" style="display: none;">
					<td><span id="check_pre" style="display: none;">进度查看:</span></td>
					<td>
						<div></div>
					</td>
					<td><div style="top: 15px;" id="upload_pre"></div></td>
				</tr>
				<tr id="uploadFileTr" style="display: none;">
					<td>上传文件:</td>
					<td colspan="2"><input id="vPlayUrl" name="VPlayUrl" type="hidden"> <span id="uploadFileSpan"></span>&nbsp;&nbsp;<a href="javascript:;" onclick="deleteUploadFile()">删除</a></td>
				</tr>
			</tbody>
		</table>
		<span id="submitvideo_message" class="fr upload-message"></span>
		<div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
			<a class="easyui-linkbutton" iconCls="icon-add" href="javascript:void(0)" onclick="doAddNewResource()">添加</a> <a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="closeUploadDiv()">取消</a>
		</div>
	</div>
	<div id="updThumb_dialog">
	<input type="hidden" id="lvImg">
	<input type="hidden" id="lvId">
		<div class="easyui-panel" title="视频封面" collapsible=false minimizable=false maximizable=false closable=false width="450px">
			<div id="thumbBox">
				<div id="altContent"></div>
			</div>
		</div>
	</div>
</body>
</html>