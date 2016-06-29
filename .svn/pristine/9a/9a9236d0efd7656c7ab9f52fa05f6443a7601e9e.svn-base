<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.chinasofti.cetp.admin.model.Area"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP</title>
<script type="text/javascript" src="<c:url value="/js/admin/area.js" />"></script>
</head>
<body>
	<input type="hidden" id="hidareaCode" name="hidareaCode" value="${area.areaCode}"/>
	<input type="hidden" id="hidareaStatus" name="hidareaStatus" value="${area.areaStatus}"/>
	<input type="hidden" id="hidwarn" name="hidwarn" value="${warn}"/>
	<div id="rightcont">
		<!-- 按钮栏 -->
		<div id="right_bu">
			<input type="button" value="查询" title="查询" id="findarea" class="cx" onclick="doSearch()" /> 
			<input type="button" value="重置" title="重置" id="resetbtn" class="cz" onClick="doReset('searchfrom')" />
		</div>
		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>地区查询</legend>
				<form id="searchfrom" name="searchfrom" method="post">
					<br>
					<table border="0" cellpadding="0" cellspacing="5"
						style="text-align: left; font-size: 12px;">
						<tr>
							<td width="100px" align="right">地区编号：</td>
							<td width="90px" align="left">
								<input id="selareaCode" name="selareaCode" class="easyui-validatebox" style="width: 80px" />
							</td>
							<td width="100px" align="right">地区名称：</td>
							<td width="90px" align="left">
								<input id="selareaName" name="selareaName" class="easyui-validatebox" style="width: 80px" />
							</td>
							<td width="70px" align="right">是否启用：</td>
							<td width="90px" align="left">
								<select id="selareaStatus" class="easyui-combobox" name="selareaStatus" ></select>
							</td>

						</tr>
					</table>
					<br>
				</form>
			</fieldset>
		</div>
		<!-- 条件查询 end -->

		<!-- 列表 start -->
		<div id="right_mx">
			<div id="yle_mx">地区明细</div>
		</div>
		<div id="lbmx">
			<table id="list_area" style="height: auto"></table>
		</div>
		<!-- 列表 end -->

		<!-- 修改  start-->
		<div id="user_insert" class="easyui-window" title="地区信息"
			iconCls="icon-save"
			style="width: 500px; height: 200px; padding: 5px; background: #fafafa;"
			closed="true" modal="true" closable=“false” minimizable="false" maximizable="false" collapsible="false">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="insform" name="insform" method="post">
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px; ">
							<tr>
								<td align="right" width="100px">地区编号：</td>
								<td>
									<input type="text" id="insareaCode" name="insareaCode" required="true" class="easyui-validatebox" validType="length[1,10]" precision="0" style="width: 90px"/>
								</td>
								<td align="right" width="100px">地区名称：</td>
								<td>
									<input type="text" id="insareaName" name="insareaName" required="true" class="easyui-validatebox" validType="length[1,10]" precision="0" style="width: 90px" />
								</td>
							</tr>
							<tr>	
								<td align="right" width="100px">上级地区编号：</td>
								<td>
									<input type="text" id="insareaParent" name="insareaParent"  class="easyui-validatebox" validType="length[1,10]" precision="0" style="width: 90px" />
								</td>
								<td align="right" width="100px">启/停状态：</td>
								<td>
								    <select id="insareaStatus" class="easyui-combobox" name="insareaStatus" ></select>
								</td>
							</tr>
						</table>
					</form>
					<br> <br>
					<div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
						<a class="easyui-linkbutton" iconCls="icon-search" href="javascript:void(0)" onclick="doInsert()">保存</a> 
						<a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="doInsClose()">取消</a>
					</div>
				</div>
			</div>
		</div>

		<!--修改end -->
	</div>



	<!-- 修改  start-->
		<div id="user_update" class="easyui-window" title="地区信息"
			iconCls="icon-save"
			style="width: 500px; height: 200px; padding: 5px; background: #fafafa;"
			closed="true" modal="true" closable=“false” minimizable="false" maximizable="false" collapsible="false">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="updform" name="updform" method="post">
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px; ">
							<tr>
								<td align="right" width="100px">地区编号：</td>
								<td>
									<input type="text" id="updareaCode" name="updareaCode" value="${area.areaCode}" required="true" class="easyui-validatebox" validType="length[1,10]" precision="0" style="width: 90px" readonly="readonly"/>
								</td>
								<td align="right" width="100px">地区名称：</td>
								<td>
									<input type="text" id="updareaName" name="updareaName" value="${area.areaName}" required="true" class="easyui-validatebox" validType="length[1,10]" precision="0" style="width: 90px" />
								</td>
							</tr>
							<tr>
								<td align="right" width="100px">上级地区编号：</td>
								<td>
									<input type="text" id="updareaParent" name="updareaParent" value="${area.areaParent}" required="true" class="easyui-validatebox" validType="length[1,10]" precision="0" style="width: 90px" />
								</td>
								<td align="right" width="100px">启/停状态：</td>
								<td>
								    <select id="updareaStatus" class="easyui-combobox" name="updareaStatus" value="${area.areaStatus}"></select>
								</td>
							</tr>
						</table>
					</form>
					<br> <br>
					<div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
						<a class="easyui-linkbutton" iconCls="icon-search" href="javascript:void(0)" onclick="doUpdate()">保存</a> 
						<a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="doClose()">取消</a>
					</div>
				</div>
			</div>
		</div>

		<!--修改end -->
	</div>

		<!-- 修改  start-->
		<div id="user_detail" class="easyui-window" title="地区信息"
			iconCls="icon-save"
			style="width: 500px; height: 200px; padding: 5px; background: #fafafa;"
			closed="true" modal="true" closable=“false” minimizable="false" maximizable="false" collapsible="false">
			<div class="easyui-layout" fit="true">
				<div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
					<form id="detailform" name="detailform" method="post">
						<table border="0" cellpadding="0" cellspacing="4"
							style="font-size: 12px; ">
							<tr>
								<td align="right" width="100px">地区编号：</td>
								<td>
									<span id="dtlareaCode"></span>
								</td>
								<td align="right" width="100px">地区名称：</td>
								<td>
									<span id="dtlareaName"></span>
								</td>
							</tr>
							<tr>
								<td align="right" width="100px">上级地区名称：</td>
								<td>
									<span id="dtlareaParentName"></span>
								</td>
								<td align="right" width="100px">启/停状态：</td>
								<td>
									<span id="dtlareaStatus"></span>
								</td>
							</tr>
						</table>
					</form>
					<br> <br>
					<div region="south" border="false" style="text-align: center; height: 30px; line-height: 30px;">
						<a class="easyui-linkbutton" iconCls="icon-cancel" href="javascript:void(0)" onclick="doDtlClose()">关闭</a>
					</div>
				</div>
			</div>
		</div>

		<!--修改end -->
	</div>
	
	<!-- tab end -->



</body>
</html>