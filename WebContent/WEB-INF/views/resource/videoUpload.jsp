<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload demo</title>
<%@ include file="/WEB-INF/include/resource_header.jsp"%>
<script type="text/javascript" src="<c:url value="/js/resource/videoUpload.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
<style>
.panel-body {
	padding: 0px;
	overflow: auto;
	border: 1px solid #D3D3D3;
	border-top-width: 0px;
	overflow: auto;
}

.tree-icon {
	display: none
}

.uploadify {
	position: relative;
	margin-bottom: 0em;
	margin-top: 0em;
}

.combo {
	display: block;
	width: 500px;
	height: 34px;
	padding: 6px 12px;
	font-size: 14px;
	line-height: 1.428571429;
	color: #555;
	vertical-align: middle;
	background-color: #fff;
	background-image: none;
	border: 1px solid #ccc;
	border-radius: 4px;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
	-webkit-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
	transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
}

.combo-arrow {
	float: right;
}
</style>
</head>
<body>
	<div class="panel panel-default" style="padding-left: 50px;">
		<form id="addvform" name="" action="" method="get">
			<input id="vId" name="vId" type="hidden" value="${video.vId }" /> <input id="vFileName" name="vFileName" type="hidden" value="${video.vFileName }" /> <input id="red5Host" type="hidden" value="${red5Host }" /> <input id="red5Path" type="hidden" value="${red5Path }" /> <input id="vType" name="vType" type="hidden" value="${video.vType }" /> <input id="hiVTechType" name="hiVTechType" type="hidden" value="${video.vTechType }" />

			<!-- 格式化上传 -->
			<table class="tool-table">
				<tbody>
					<tr>
						<td width="100px">视频名称：</td>
						<td colspan="2"><input id="title" name="title" placeholder="请输入视频标题" type="text" class="form-control" value="${video.vName }" /></td>
						<td>视频标题，字符长度0～40</td>
					</tr>
					<tr>
						<td>技术分类：</td>
						<td colspan="2"><select id="vTechType" name="vTechType"></select></td>
						<td>视频所属的技术分类</td>
					</tr>
					<tr>
						<td>视频简介：</td>
						<td colspan="2"><textarea id="description" name="description" placeholder="请输入视频简介" rows="5" cols="30" class="form-control">${video.vComment }</textarea></td>
						<td>视频描述，字符长度0～200</td>
					</tr>
					<tr style="display: none;">
						<td>文件名称:</td>
						<td colspan="2"><input id="videofile" name="videofile" type="text" placeholder="请选择上传的视频文件" disabled="false" class="form-control"></td>
						<td></td>
					</tr>
					<tr>
						<td>文件浏览:</td>
						<td width="120px">
							<div id="uploadvideoarea"></div>
						</td>
						<td style="padding-top: 1em;"><input value="Flash资源" onclick="choiseVideoResource(1);" class="btn btn-primary" type="button"> <input value="MediaPlay资源" onclick="choiseVideoResource(2);" class="btn btn-primary" type="button"> <input value="Red5资源" onclick="choiseVideoResource(3);" class="btn btn-primary" type="button"></td>
						<td>请选择上传本地文件，或者选择服务器资源文件</td>
					</tr>
					<tr id="pre_tr" style="display: none;">
						<td><span id="check_pre" style="display: none;">进度查看:</span></td>
						<td>
							<div>
								<!-- <input value="开始上传" id="uploadBtn" onclick="startUpload();" class="btn btn-primary" style="display: none;" type="button"> --> <span id="submitvideo_message" class="fr upload-message"></span>
							</div>

						</td>
						<td><div style="top: 15px;" id="upload_pre"></div></td>
						<td></td>
					</tr>
					<tr id="uploadFileTr" style="display: none;">
						<td>上传文件:</td>
						<td colspan="2"><input id="hiOldFileUrl" type="hidden"> <span id="uploadFileSpan"></span>&nbsp;&nbsp;<a href="javascript:;" onclick="deleteUploadFile()">删除</a></td>
						<td><span style="color: green">当前上传的资源。。。</span></td>
					</tr>
					<tr id="serviceFileTr" style="display: none;">
						<td>服务器文件:</td>
						<td colspan="2"><input id="hiServiceFileUrl" type="hidden"> <input id="servicevideofile" name="servicevideofile" type="text" class="form-control"></td>
						<td><span style="color: green">当前使用的服务器资源。。。</span><br /> <a href="javascript:;" onclick="cancleServiceR()">取消</a></td>
					</tr>
					<tr id="oldFileTr" style="display: none;">
						<td>原有文件名称:</td>
						<td colspan="2"><input id="hiVdownFileUrl" type="hidden" value="${video.vDownloadUrl }"> <input id="oldvideofile" name="videofile" type="text" class="form-control" value="${video.vFileName }"></td>
						<td><span style="color: red">重新选择文件将会替换原有的文件，请慎重。。。</span></td>
					</tr>
					<tr>
						<td colspan="4"><input value="保存信息" id="saveInfoBtn" onclick="submitvideo();" class="btn btn-primary" type="button">&nbsp;<span id="sub_message"></span></td>
					</tr>
				</tbody>
			</table>
			<!-- end -->
		</form>
	</div>
	<input value="返回" id="" onclick="finished();" class="btn" type="button">

	<div id="fileManager_dialog">
		<div id="content" style="width: auto; height: auto;"></div>
	</div>
</body>
</html>