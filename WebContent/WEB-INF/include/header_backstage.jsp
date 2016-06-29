<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/zk" prefix="zk"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="sessionid" value="${pageContext.session.id}" />
<script type="text/javascript">
	var ctx = "${ctx}";
	var sessionid = "${sessionid}";
</script>
<link rel="stylesheet" type="text/css" href="<c:url value="/themes/default/easyui.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/themes/icon.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/css/uploadify.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/css/formstyle.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/js/kindeditor/themes/default/default.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/css/MotionCAPTCHA/jquery.motionCaptcha.0.2.css" />" />
<script type="text/javascript" src="<c:url value="/js/jquery-1.8.0.min.js" />" ></script>
<script type="text/javascript" src="<c:url value="/js/jquery.easyui.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/locale/easyui-lang-zh_CN.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery.uploadify.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/src/jquery.parser.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/kindeditor/kindeditor.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/kindeditor/lang/zh_CN.js" />"></script>
<script type="text/javascript" src="<c:url value="/js/jquery.placeholder.1.1.1.min.js" />" ></script>
<%-- <script type="text/javascript" src="<c:url value="/js/jquery.motionCaptcha.0.2.js" />"></script> --%>
<!-- Jquery EasyUI 扩展功能 -->
<%-- <script type="text/javascript" src="<c:url value="/themes/yqUtil.js" />"></script> --%>
