<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<c:url value="/js/admin/coinIssuanceManager.js" />"></script>
<style type="text/css">
.ftitle {
	font-size: 14px;
	font-weight: bold;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}
</style>
</head>

<body>
	<input type="hidden" id="a_id" name="id" class="text ui-widget-content ui-corner-all" />
	<div id="rightcont">
		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>
					<span>用户条件查询</span>
				</legend>
				<form action="" method="post" id="searchStudent_form" style="width: 100%">
					<table style="border: #6593CF solid 1px; width: 100%; padding: 4px;">
						<tr>
							<td style="font-size: 12px">账 户：<input type="text" size="32" name="stuUserid" />
							</td>
							<td style="font-size: 12px">昵 称：<input type="text" size="32" name="stuNickname" style="width:195px;">
							</td>
							<td><a href="javascript:doSearch();" style="text-decoration: none;"><font size="2px">查询</font></a></td>
							<td><a href="javascript:clearForm('#searchStudent_form');" style="text-decoration: none;"><font size="2px">重置</font></a></td>
						</tr>
						<tr>
						</tr>
					</table>
				</form>
			</fieldset>
		</div>
		<!-- 条件查询 end -->
	</div>
	<div id="right_mx">
		<div id="yle_mx">用户列表</div>
	</div>
	<div id="lbmx">
		<table id="admin_coinIssuance_datagrid"></table>
	</div>
	<!-- 编辑数据 -->
	<div id="edit_coin_dialog">
		<div class="ftitle">编辑积分和学习币</div>
		<form id="edit_coin_form" action="">
			<table style="font-size: 12px;line-height: 24px" align="center">
				<tr>
					<td align="right">账户：</td>
					<td><b><span id="showStuUserid"></span></b></td>
				</tr>
				<tr>
					<td align="right">积分：</td>
					<td><input type="text" name="stuScore" class="easyui-numberbox" data-options="min:0,required:true" /></td>
				</tr>
				<tr>
					<td align="right">学习币：</td>
					<td><input type="text" name="stuCoin" class="easyui-numberbox" data-options="min:0,required:true" /></td>
				</tr>
			</table>
			<input type="hidden" name="stuNo">
		</form>
	</div>
	<div id="rateSet_dialog">
		<div>
			<form id="rateSet_form">
				<input type="hidden" name="rpId" value="${requestScope.rqaParam.rpId}" /><%--  <input type="hidden" name="" value="${requestScope.rqaParam.rpName }" /> --%>
				
				<table align="center">
					<tr>
						<td style="height: 53px;" colspan="2">兑换比例：<input id="rpValue" name="rpValue" type="text" style=" width: 38px;" class="easyui-numberbox" value="${requestScope.rqaParam.rpValue}" data-options="min:1,max:100" />积分 == 1学习币</td>
					</tr>
					<tr>
						<td><a id="saveBtn" href="javascript:saveRateSet();" class="easyui-linkbutton" data-options="iconCls:'icon-search'">保存</a></td>
						<td><a id="cancelBtn" href="javascript:rateSet_dialog.dialog('close')" class="easyui-linkbutton" data-options="iconCls:'icon-search'">取消</a></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>