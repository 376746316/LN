<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online-个人中心管理</title>
<script type="text/javascript" src="<c:url value="/js/admin/userGropManager.js" />"></script>
</head>
<style type="text/css">
a {
	text-decoration: none;
}
</style>

<body>
	<!-- 列表 start -->
	<div id="right_mx">
		<div id="yle_mx">用户组列表</div>
	</div>
	<div id="lbmx">
		<table id="admin_userGrop_datagrid"></table>
	</div>
	<!-- 列表 end -->
	<div id="lbmx">
		<a id="btn" class="easyui-linkbutton" onclick="javascript:window.history.go(-1);">返回</a>
	</div>
	<!-- 显示用户组明细开始 -->
	<div id="show_userGrop_detail">
		<div style="padding-top: 35px">
			<form action="" id="userGropInfoForm">
				<table style="font-size: 12px">
					<tr>
						<td width="140px" align="right">编号：</td>
						<td width="30%" align="left"><input type="text" name="ugId" /></td>
						<td width="140px" align="right">用户组：</td>
						<td width="30%" align="left"><input type="text" name="ugName" /></td>
					</tr>

					<tr>
						<td width="140px" align="right">积分：</td>
						<td width="30%" align="left"><input type="text" name="ugScore" /></td>
						<!-- <td width="30%" align="left"><select name="srCycle" style="width: 135px">
								<option value="0">一次性</option>
								<option value="1">每天</option>
						</select></td> -->
						<td width="140px" align="right">学习币：</td>
						<td width="30%" align="left"><input type="text" name="ugCoin" /></td>
					</tr>

					<tr>
						<td width="140px" align="right">直播：</td>
						<td width="30%" align="left">
							<select name="ugLiveFlag" style="width: 135px">
									<option value="0">无</option>
									<option value="1">全部</option>
									<option value="2">部分</option>
							</select>
						</td>
						<td width="140px" align="right">课程下载：</td>
						<td colspan="3" align="left">
							<select name="ugDownloadFlag" style="width: 135px">
									<option value="0">不可</option>
									<option value="1">全部</option>
									<option value="2">部分</option>
							</select>
						</td>
					</tr>
					<tr>
						<td width="140px" align="right">积分兑换：</td>
						<td width="30%" align="left">
							<select name="ugExchangeFlag" style="width: 135px">
									<option value="0">不可</option>
									<option value="1">可兑换</option>
							</select>
						</td>
						<td width="140px" align="right">线下沙龙</td>
						<td colspan="3" align="left">
							<select name="ugSalonFlag" style="width: 135px">
									<option value="0">不可参与</option>
									<option value="1">可参与</option>
							</select>
						</td>
					</tr>
				</table>
				<input type="hidden" id="rowIndex" name="rowIndex" value="">
			</form>
		</div>
	</div>
	<!-- 显示用户组明细结束 -->

</body>
</html>