<%@page import="com.chinasofti.cetp.practice.model.Know"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript"
	src="<c:url value="/js/study/techTypeManage.js" />"></script>
<style>
.tree-icon {
	display: none
}
</style>
</head>

<body>
	<div id="rightcont">
		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>
					<span>分类查询</span>
				</legend>
				<form action="" method="post" id="searchForm" style="width: 100%">
					<input type="hidden" id="hidList" name="hidList"
						value="<%=request.getAttribute("list_id")%>" />
					<table border="0" style="width: 100%; padding: 5px">
						<tr>
							<td><font size="2px">分类名称：</font> <input type="text"
								size="12" name="seltechtypename" id="seltechtypename" value="${seltechtypename}"/></td>
							<td><a href="javascript:doSearch();"
								style="text-decoration: none;"> <font size="2px">查询</font></a></td>
							<td><a href="javascript:clearForm('searchForm');"
								style="text-decoration: none;"> <font size="2px">重置</font></a></td>
						</tr>
					</table>
				</form> 
			</fieldset>
		</div>
	</div>

	<div id="right_mx">
		<div id="yle_mx">分类明细列表</div>
	</div>

	<div id="lbmx">
		<table id="techTypeManageList"></table>
	</div>

	<div id="typeMngAddDiv" class="easyui-window" title="新建分类"
		iconCls="icon-save" collapsible=false minimizable=false
		maximizable=false shadow=false
		style="width: 600px; height: 230px; padding: 5px; background: #fafafa;"
		closed="true" modal="true">
		<form id="typeMngAddForm" name="typeMngAddForm" method="post"
			action="addTypeMng.do">
			<input type="hidden" id="insTechTypeId" name="insTechTypeId" />
			<div>
				<table
					style="font-size: 12px; margin: 10 auto 0 auto; width: 100%; height: 100px;"
					cellpadding="2" cellspacing="2">
					<tr>
						<td width='60%'>分类名称 <input type="text" name="insTypeName"
							id="insTypeName" required=true missingMessage="请输入名称"
							class="easyui-validatebox" />
						</td>

						<td>等&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;级 <input
							type="text" name="insTypeLevel" id="insTypeLevel"
							class="easyui-validatebox" />
						</td>
					</tr>
					<tr>
						<td>分类编码 <input type="text" name="insTypeCode"
							id="insTypeCode" class="easyui-validatebox" />
						</td>
						<td>顺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;序 <input
							type="text" name="insTypeSeq" id="insTypeSeq"
							class="easyui-validatebox" />
						</td>
					</tr>
				</table>
			</div>
		</form>
		<div border="false"
			style="text-align: center; height: 30px; line-height: 30px;">
			<a class="easyui-linkbutton" iconCls="icon-search"
				href="javascript:void(0)" onclick="doSubmitAdd()">保存</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="doClose('typeMngAddDiv')">取消</a>
		</div>
	</div>

	<div id="typeMngUpdDiv" class="easyui-window" title="修改分类"
		iconCls="icon-save" collapsible=false minimizable=false
		maximizable=false shadow=false
		style="width: 600px; height: 230px; padding: 5px; background: #fafafa;"
		closed="true" modal="true">
		<form id="typeMngUpdForm" name="typeMngUpdForm" method="post">
			<input type="hidden" id="updTechTypeId" name="updTechTypeId"/>
			<div>
				<table
					style="font-size: 12px; margin: 10 auto 0 auto; width: 100%; height: 100px;"
					cellpadding="2" cellspacing="2">
					<tr>
						<td  width="60%">分类名称 <input type="text" name="updTypeName"
							id="updTypeName" required=true missingMessage="请输入名称"
							class="easyui-validatebox"/>
						</td>
						<td>等&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;级 <input
							type="text" name="updTypeLevel" id="updTypeLevel"
							class="easyui-validatebox"/>
						</td>
					</tr>
					<tr>
						<td>分类编码 <input type="text" name="updTypeCode"
							id="updTypeCode" class="easyui-validatebox"/>
						</td>
						<td>顺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;序 <input
							type="text" name="updTypeSeq" id="updTypeSeq"
							class="easyui-validatebox" />
						</td>
					</tr>
				</table>
			</div>
		</form>
		<div border="false"
			style="text-align: center; height: 30px; line-height: 30px;">
			<a class="easyui-linkbutton" iconCls="icon-search"
				href="javascript:void(0)" onclick="doSubmitUpd()">保存</a> <a
				class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="doClose('typeMngUpdDiv')">取消</a>
		</div>
	</div>

	<div id="typeMngDtlDiv" class="easyui-window" title="分类详细"
		iconCls="icon-save" collapsible=false minimizable=false
		maximizable=false shadow=false
		style="width: 600px; height: 230px; padding: 5px; background: #fafafa;"
		closed="true" modal="true">
		<form id="knowDtlForm" name="knowDtlForm" method="post"
			action="dtlKnowledge.do">
			<div>
				<table
					style="font-size: 12px; margin: 10 auto 0 auto; width: 100%; height: 100px;"
					cellpadding="2" cellspacing="2">
					<tr>
						<td width="60%">分类名称:<span id="dtlTypeName"></span></td>
						<td>顺&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;序:
							<span id="dtlTypeSeq"></span></td>
					</tr>
					<tr>
						<td>分类编码: <span id="dtlTypeCode"></span></td>
						<td>等&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;级:
							<span id="dtlTypeLevel"></span></td>
					</tr>
				</table>
			</div>
		</form>

		<div border="false"
			style="text-align: center; height: 30px; line-height: 30px;">
			<a class="easyui-linkbutton" iconCls="icon-cancel"
				href="javascript:void(0)" onclick="doClose('typeMngDtlDiv')">关闭</a>
		</div>
	</div>
</body>
</html>