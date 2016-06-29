<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="sessionid" value="${pageContext.session.id}" />
<script type="text/javascript">
	var ctx = "${ctx}";
	var sessionid = "${sessionid}";
</script>
<link href="${pageContext.request.contextPath}/css/ccplayer/bootstrap-theme.min.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/ccplayer/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/ccplayer/docs.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/ccplayer/main.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ccplayer/application.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ccplayer/bootstrap.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ccplayer/highlight.pack.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/js/ccplayer/swfobject.js"></script> 
