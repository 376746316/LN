<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="/zk" prefix="zk"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="sessionid" value="${pageContext.session.id}" />
<script type="text/javascript">
	var ctx = "${ctx}";
	var sessionid = "${sessionid}";
</script>
<link href="${pageContext.request.contextPath}/css/index.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-impromptu.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/k_zrzy.js"></script>
<script type="text/javascript">
	jQuery.prompt.setDefaults({
		top : '30%',
		buttons : {
			'确定' : true
		}
	});
	window.alert = function(info, func) {
		$.prompt(info, {
			close : func
		});
	};
</script>
<!-- 百度统计 -->
<!-- <script>
	var _hmt = _hmt || [];
	(function() {
		var hm = document.createElement("script");
		hm.src = "//hm.baidu.com/hm.js?1632d53009f2b0de179a98cd75e0fa91";
		var s = document.getElementsByTagName("script")[0];
		s.parentNode.insertBefore(hm, s);
	})();
</script> -->
