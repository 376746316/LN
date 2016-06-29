<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<c:url value="/js/admin/coinCodeManager.js" />"></script>
<!-- my97日期控件 -->
<script type="text/javascript" src="<c:url value="/js/My97DatePickerBeta4.8b2/My97DatePicker/WdatePicker.js" />"></script> 
<style type="text/css">
.ftitle {
	font-size: 14px;
	font-weight: bold;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}

.inviteinput {
	height: 20px;
	line-height: 20px;
	border: 1px solid #b4c8d9;
	padding-left: 3px;
	color: #6f8899;
	width: 180px;
}
</style>
</head>

<body>
	<input type="hidden" id="a_id" name="id" class="text ui-widget-content ui-corner-all" />
	<!-- <div id="rightcont">
		条件查询 start
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
		条件查询 end
	</div> -->
	<div id="right_mx">
		<div id="yle_mx">学习币兑换码</div>
	</div>
	<div id="lbmx">
		<!--  -->
		<div id="redeem_tabs" class="easyui-tabs" style="width:1050px;height:368px;">
			<div title="有效兑换码[0]" data-options="" style="padding:0px;">
				<table id="admin_coinCode_datagrid_normal"></table>
			</div>
			<div title="已使用兑换码[0]" data-options="" style="padding:0px;">
				<table id="admin_coinCode_datagrid_exchange"></table>
			</div>
			<div title="过期兑换码[0]" data-options="" style="padding:0px;">
				<table id="admin_coinCode_datagrid_expired"></table>
			</div>
		</div>
	</div>
	<!-- 编辑数据 -->
	<div id="generate_redeem_dialog">
		<form id="generate_redeem_form" action="">
			<table style="font-family: Arial,Verdana,Helvetica,sans-serif;font-size: 12px;width: 100%">
				<tr>
					<td colspan="3" align="center"><div style="color: rgb(255, 126, 0);height: 25px;line-height: 25px;"><!-- 已有兑换码0个，还可以再生成500个! --></div></td>
				</tr>
				<tr>
					<td align="right" style="width: 90px;font-size: 12px">生成个数:</td>
					<td colspan="2"><input type="text" id="generateCount" name="generateCount" class="inviteinput" maxlength="4" onkeydown="return yysearchinput(event,this);" /> (1~1000)</td>
				</tr>
				<tr>
					<td align="right" style="width: 90px;">有效时间:</td>
					<td colspan="2"><input type="text" id="reValidity" name="reValidity" class="inviteinput" class="Wdate" onfocus="WdatePicker({minDate:'%y-%M-{%d+1}',dateFmt:'yyyy-MM-dd HH:mm:ss'})" readonly="readonly" /></td>
				</tr>
				<tr>
					<td align="right" style="width: 90px;">学习币数量:</td>
					<td colspan="2"><input type="text" id="reCoinamount" name="reCoinamount" class="inviteinput" maxlength="4" onkeydown="return yysearchinput(event,this);" /> (1~1000)</td>
				</tr>
				<tr>
					<td align="right" style="width: 90px;">同步导出:</td>
					<td colspan="2"><input name="sync" type="checkbox" /></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>