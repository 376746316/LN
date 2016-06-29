<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript" src="<c:url value="/js/admin/moduleMng.js" />"></script>
</head>
<body>

	<div id="rightcont">
		
		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>模块功能</legend>
				<form id="searchfrom" name="searchfrom" method="post">
					<br>
					<table border="0" cellpadding="0" cellspacing="5"
						style="text-align: left; font-size: 12px; ">
						<tr>
							<td width="100px" align="right">模块名：</td>
							<td width="90px" align="left"><input id="s_mdName" name="s_mdName"
								class="easyui-validatebox" style="width: 80px" /></td>
							<td><input type="button" value="查询" title="查询" id="findck" class="cx"
								onclick="doSearch()"> <input type="button" value="重置"
								title="重置" id="resetbtn" class="cz" onClick="doReset('searchfrom')"></td>
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
		<div id="user_add" class="easyui-window" title="模块功能信息"
			iconCls="icon-save"
			style="width: 600px; height: 290px; padding: 5px; background: #fafafa;"
			closed="true" modal="true">
			
			<div class="easyui-layout" fit="true">
				<div region="center" border="false"
					style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="addform" name="addform" method="post">
						<input type="hidden" id="mdId" name="mdId">
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px;">
							<tr>
								
								<td align="right" width="100px">模块URL：</td>
								<td><input type="text" id="urlHref" name="urlHref" class="easyui-validatebox" 
									style="width: 130px" data-options="required:true"/></td>
								<td align="right" width="100px">模块名称：</td>
								<td><input type="text" id="mdName" name="mdName" class="easyui-validatebox" 
									style="width: 130px" data-options="required:true"/></td>
							</tr>
							<tr>		
								<td align="right" width="100px">所属模块：</td>
								<td><select id="mdParent" name="mdParent" class="easyui-combobox"  style="width: 130px" />
									
								</td>
								<td align="right" width="100px">是否为目录：</td>
								<td><select id="mdIsLeaf" name="mdIsLeaf" class="easyui-combobox" editable=false style="width: 130px" panelHeight='auto'	>
										<option value="0">目录</option>
										<option value="1">叶节点</option>
									</select>
								</td>
							</tr>
							
							<tr>		
								<td align="right" width="100px">模块图标：</td>
								<td><select id="iconUrl" name="iconUrl" class="easyui-combobox" editable=false style="width: 130px" />
								</td>
							</tr>
						</table>
					</form>
					<br> <br>
					<br> <br>
					<div region="south" border="false"
						style="text-align: center; height: 30px; line-height: 30px;">
						<input type="hidden" id="isUpdate" name="isUpdate" >
						<a class="easyui-linkbutton" iconCls="icon-search"
							href="javascript:void(0)" onclick="doAdd()">保存</a> <a
							class="easyui-linkbutton" iconCls="icon-cancel"
							href="javascript:void(0)" onclick="doClose('user_add')">取消</a>
					</div>
				</div>
			</div>
		</div>
		<!-- 添加修改end -->
		
		<!-- 详细信息 -->
		
		<!-- 详细信息 -->
		
		
	</div>

</body>
</html>