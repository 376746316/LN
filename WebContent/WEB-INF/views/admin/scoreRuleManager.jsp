<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online-个人中心管理</title>
<script type="text/javascript" src="<c:url value="/js/admin/scoreRuleManager.js" />"></script>
</head>
<style type="text/css">
a {
	text-decoration: none;
}
</style>

<body>
	<!-- 列表 start -->
	<div id="right_mx">
		<div id="yle_mx">积分规则列表</div>
	</div>
	<div id="lbmx">
		<table id="admin_scoreRule_datagrid"></table>
	</div>
	<!-- 列表 end -->
	<div id="lbmx">
		<a id="btn" class="easyui-linkbutton" onclick="javascript:window.history.go(-1);">返回</a>
	</div>
	<!-- 显示积分规则明细开始 -->
	<div id="show_scoreRule_detail">
		<div style="padding-top: 35px">
			<form action="" id="scoreRuleInfoForm">
				<table style="font-size: 12px">
					<tr>
						<td width="140px" align="right">编号：</td>
						<td width="30%" align="left"><input type="text" name="srId" /></td>
						<td width="140px" align="right">名称：</td>
						<td width="30%" align="left"><input type="text" name="srName" /></td>
					</tr>

					<tr>
						<td width="140px" align="right">周期：</td>
						<td width="30%" align="left"><select name="srCycle" style="width: 135px">
								<option value="0">一次性</option>
								<option value="1">每天</option>
						</select></td>
						<td width="140px" align="right">周期次数：</td>
						<td width="30%" align="left"><input type="text" name="srTimes" /></td>
					</tr>

					<tr>
						<td width="140px" align="right">单次奖励分值：</td>
						<td width="30%" align="left"><input type="text" name="srScore" /></td>
						<td width="140px" align="right">是否启用：</td>
						<td colspan="3" align="left"><select name="srFlag" style="width: 135px">
								<option value="0">禁用</option>
								<option value="1">启用</option>
						</select></td>
					</tr>
					<tr>
						<td width="140px" align="right">创建时间：</td>
						<td width="30%" align="left"><input type="text" name="srRegtime" /></td>
						<td width="140px" align="right"></td>
						<td colspan="3" align="left"></td>
					</tr>
				</table>
				<input type="hidden" id="rowIndex" name="rowIndex" value="">
			</form>
		</div>
	</div>
	<!-- 显示积分规则明细结束 -->

</body>
</html>