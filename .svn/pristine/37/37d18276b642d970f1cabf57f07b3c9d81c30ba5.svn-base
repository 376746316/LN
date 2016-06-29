<%@page import="com.chinasofti.cetp.utils.ReaderXmlParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CETP-参考资料</title>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!-- my97日期控件 -->
<script type="text/javascript"
	src="<c:url value="/js/My97DatePickerBeta4.8b2/My97DatePicker/WdatePicker.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/js/resource/referenceMng.js" />"></script>
</head>
<body>
	<div id="rightcont">
		<!-- 条件查询 start -->
		<div id="jc">
			<fieldset style="width: 97%;">
				<legend>
					<span>参考资料查询</span>
				</legend>
				<div id="searchAe">
					<form action="" method="post" id="searchForm" style="width: 100%">
						<table border="0"
							style="width: 100%; color: black; padding: 5px; font-size: 12px;">
							<tr>
								<td>名称：<input id="refName" name="refName"
									style="width: 100px;"></td>
								<td>从<input id="dateStart" name="dateStart" class="Wdate"
									type="text" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"
									readonly="readonly" style="width: 100px;" />至<input
									id="dateEnd" name="dateEnd" class="Wdate" type="text"
									onFocus="WdatePicker({dateFmt:'yyyy-MM-dd'})"
									readonly="readonly" style="width: 100px;" /></td>
								<td>按日期降序排序&nbsp;<input id="desc" name="desc"
									type="checkbox"></td>
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
									href="javascript:search();" style="text-decoration: none;">
										<font size="2px">查询</font>
								</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:resetForm();"
									style="text-decoration: none;"> <font size="2px">重置</font>
								</a></td>
							</tr>
						</table>
					</form>
				</div>
			</fieldset>
		</div>
	</div>
	<div id="right_mx">
		<div id="yle_mx">参考资料表</div>
	</div>
	<div id="lbmx">
		<table id="reference_datagrid"></table>
	</div>

	<!-- 修改考勤记录 dialog开始 -->
	<div id="editRecord_dialog">
		<form id="editRecordForm" action="editReference.do" method="post">
			<input type="hidden" id="refId" name="refId"> <input
				type="hidden" id="refThumb" name="refThumb">
			<table width="100%" cellspacing="5" style="font-size: 12px;">
				<tr>
					<td width="auto" align="right">参考资料名称</td>
					<td width="auto"><input id="refName" name="refName"
						style="width: 120px;" class="easyui-validatebox"
						required="required"></td>
					<td width="auto" align="right">参考资料费用</td>
					<td width="auto"><input id="refCost" name="refCost"
						style="width: 80px;" class="easyui-numberbox" required="required"></td>
				</tr>
				<tr>
					<td width="auto" align="right">参考资料介绍</td>
					<td width="auto" colspan="3"><textarea id="refComment"
							name="refComment" style="width: 350px; height: 80px;"></textarea></td>

				</tr>
			</table>
		</form>
	</div>
	<!-- 修改考勤记录 dialog结束-->

	<!-- 新建考勤记录 dialog开始 -->
	<div id="addRecord_dialog">
		<form id="addRecordForm" action="addReference.do" method="post">
			<table width="100%" cellspacing="5" style="font-size: 12px;">
				<tr>
					<td width="auto" align="right">参考资料名称</td>
					<td width="auto"><input id="refName" name="refName"
						style="width: 120px;" class="easyui-validatebox"
						required="required"></td>
					<td width="auto" align="right">参考资料费用</td>
					<td width="auto"><input id="refCost" name="refCost"
						style="width: 80px;" class="easyui-numberbox" required="required"></td>
				</tr>
				<tr>
					<td width="auto" align="right">参考资料介绍</td>
					<td width="auto" colspan="3"><textarea id="refComment"
							name="refComment" style="width: 350px; height: 80px;"></textarea></td>

				</tr>
			</table>
		</form>
	</div>
	<div id="updThumb_dialog">
		<div style="float: left; width: 612px;">
			<div class="easyui-panel" title="缩略图" collapsible=false
				minimizable=false maximizable=false closable=false width="600px">
				<div id="thumbBox">
					<div id="altContent"></div>
				</div>
			</div>
		</div>
		<div style="float: left; width: auto;">
			<div class="easyui-panel" title="上传文件" collapsible=false
				minimizable=false maximizable=false closable=false
				style="height: 480px;">
				<div>
					<input type="file" name="uploadifyTD" id="uploadifyTD" />
				</div>
				<div id="uploadQueueTD"></div>
			</div>
		</div>

	</div>
	<!-- 新建考勤记录 dialog结束-->
</body>
</html>