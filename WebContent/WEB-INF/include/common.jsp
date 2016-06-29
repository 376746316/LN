<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
	var ctx = "${ctx}";
</script>

<link rel="stylesheet" type="text/css" href="<c:url value="/css/global.css" />" />
<link href="${pageContext.request.contextPath}/css/index.css" type="text/css" rel="stylesheet" />