<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$('#tt2').tree({
			checkbox : true,
			url : ctx + '/getTreeData.do',
			onClick : function(node) {
				$(this).tree('toggle', node.target);
			},
			onContextMenu : function(e, node) {
				e.preventDefault();
				$('#tt2').tree('select', node.target);
				$('#mm').menu('show', {
					left : e.pageX,
					top : e.pageY
				});
			}
		});
	});
</script>
</head>
<body>
	<ul id="tt2"></ul>
</body>
</html>