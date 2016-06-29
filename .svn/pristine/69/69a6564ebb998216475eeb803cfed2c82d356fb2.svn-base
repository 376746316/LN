<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript"
	src="<c:url value="/js/admin/classMng.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
<script type="text/javascript">
	function startUpload() {
		
		$('#stumngfileupload').uploadify('upload','*');
		
		//$('#uploadDiv').window('close');
	}
</script>
</head>
<body>

	<div id="rightcont">

		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>班级信息查询</legend>
				<form id="searchfrom" name="searchfrom" method="post">
					<br>
					<table border="0" cellpadding="0" cellspacing="5"
						style="text-align: left; font-size: 12px;">
						<tr>
							<td width="100px" align="right">班级名：</td>
							<td width="90px" align="left"><input id="s_className"
								name="s_className" class="easyui-validatebox"
								style="width: 80px" /></td>
							<td><input type="button" value="查询" title="查询" id="findck"
								class="cx" onclick="doSearch()"> <input type="button"
								value="重置" title="重置" id="resetbtn" class="cz"
								onClick="doReset('searchfrom')"></td>
						</tr>
					</table>
					<br>
				</form>
			</fieldset>
		</div>
		<!-- 条件查询 end -->

		<!-- 列表 start -->
		<div id="right_mx">
			<div id="yle_mx">明细列表</div>
		</div>
		<div id="lbmx">
			<table id="list_user" style="height: auto"></table>
		</div>
		<!-- 列表 end -->

		<!-- 添加修改  start-->
		<div id="user_add" class="easyui-window" title="班级信息"
			iconCls="icon-save"
			style="width: 780px; height: 250px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="addform" name="addform" method="post">

						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">

							<tr>
								<td align="right" width="160px">班级名：</td>
								<td><input type="text" id="className" name="className"
									class="easyui-validatebox" style="width: 180px" data-options="required:true" /></td>
								<td align="right" width="160px">班级类型：</td>
								<td><select id="classType" name="classType"
									class="easyui-combobox" style="width: 180px" data-options="required:true" /></td>
							</tr>

							<tr>
								<td align="right" width="160px">所属专业：</td>
								<td><select id="classMajor" name="classMajor"
									class="easyui-combobox" style="width: 180px" data-options="required:true" /></td>
								<td align="right" width="160px">技术方向：</td>
								<td><select id="classTechDirect" name="classTechDirect"
									class="easyui-combobox" style="width: 180px" data-options="required:true" /></td>
							</tr>

							<tr>
								<td align="right" width="160px">联系人：</td>
								<td><input type="text" id="classLinkMan"
									name="classLinkMan" class="easyui-validatebox"
									style="width: 180px" /></td>
								<td align="right" width="160px">联系电话：</td>
								<td><input type="text" id="classLinkTel"
									name="classLinkTel" class="easyui-validatebox"
									style="width: 180px" /></td>
							</tr>

							<tr>
								<td align="right" width="160px">年级：</td>
								<td><input type="text" id="classGrade" name="classGrade"
									class="easyui-validatebox" style="width: 180px" /></td>
								<td align="right" width="160px">所属组织：</td>
								<td><select id="orgId" name="orgId"
									class="easyui-combobox" style="width: 180px" /></td>
							</tr>

						</table>
					</form>
					<br>
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px;">
						<input type="hidden" id="isUpdate" name="isUpdate" value=""> 
						<input type="hidden" id="upd_classId" name="upd_classId" value="" > <a
							class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="doUpd()">保存</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('user_add')">取消</a>
					</div>
				</div>
			</div>
		</div>
		<!-- 添加修改end -->

		<!-- 上传excel -->
		<div id="uploadDiv" class="easyui-window" closed="true" modal="true"
			minimizable="false" maximizable="false" title="请您选择Excel表格"
			style="width: 450px; height: 150px;">
			<input type="file" id="stumngfileupload" name="stumngfileupload" />
			<div id="uploadQueue" style="margin-left: 10px"></div>
			<a href="javascript:startUpload()" class="easyui-linkbutton" iconCls="icon-add">确认上传</a>
		</div>
		<!-- 上传excel -->
	</div>

</body>
</html>