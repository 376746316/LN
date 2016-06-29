<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/include/header.jsp"%>
<link href="${pageContext.request.contextPath}/css/impromptu/base.css" type="text/css" rel="stylesheet" />
<script>
	$(document).ready(function() {
		$('#aaa').click(function() {
			$.prompt("有前置任务未完成，确定要继续吗？", {
				buttons : {
					"确定" : true,
					"取消" : false
				},
				submit : function(e, v, m, f) {
					if (v) {

					}
				}
			});
		});
		$('#bbb').click(function() {
			alert('111');
		});
		$('#ccc').click(function() {
			alert('ccc', function() {
				//alert('111');
				location.reload();
			});
		});
	});
</script>

</head>
<body>
	<button id="aaa">aaa</button>
	<button id="bbb">bb</button>
	<button id="ccc">ccc</button>
</body>
</html>