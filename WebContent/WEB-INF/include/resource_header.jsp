<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="sessionid" value="${pageContext.session.id}" />
<script type="text/javascript">
	var ctx = "${ctx}";
	var sessionid = "${sessionid}";
</script>
<link rel="stylesheet" type="text/css" href="<c:url value="/themes/default/easyui.css" />" />
<link href="${pageContext.request.contextPath}/css/ccplayer/bootstrap-theme.min.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/ccplayer/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/ccplayer/docs.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/ccplayer/main.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/admin/feedback.css" />

<script type="text/javascript" src="<c:url value="/js/jquery-1.8.0.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery.uploadify.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery.easyui.min.js" />"></script>

