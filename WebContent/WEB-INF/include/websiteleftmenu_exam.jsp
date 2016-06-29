<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jQuery EasyUI</title>
<script type="text/javascript">
	/** 在线考试 **/
	function show01() {
		location = "${pageContext.request.contextPath}/listExamUser.action";
	}
	/** 历史考试 **/
	function show02() {
		location = "${pageContext.request.contextPath}/historylistExamUser.action";
	}
</script>
</head>
<body>

	<div id="aa" class="easyui-accordion"
		style="width: 130px; height: 470px;">

		<div title="实训菜单" iconCls="icon-print" selected="true"
			style="padding: 10px; height: 450px">
			 <a href="#" class="easyui-linkbutton" iconCls="icon-search" style="margin-top: 5px" onclick="javascript:show01()">在线考试</a>
			 <a href="#" class="easyui-linkbutton" iconCls="icon-search" style="margin-top: 5px" onclick="javascript:show02()">历史考试</a>
		</div>

	</div>
</body>
</html>