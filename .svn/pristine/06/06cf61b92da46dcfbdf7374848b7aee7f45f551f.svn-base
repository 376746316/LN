<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/js/flexpaper/flexpaper.css" />" />
<script type="text/javascript"
	src="<c:url value="/js/flexpaper/flexpaper_handlers.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/js/flexpaper/flexpaper.js" />"></script>
<style type="text/css" media="screen">
html,body {
	height: 100%;
}

body {
	margin: 0;
	padding: 0;
	overflow: auto;
}

#flashContent {
	display: none;
}
</style>
<title>文档预览</title>
</head>
<body>
	<div id="documentViewer" class="flexpaper_viewer"></div>

	<script type="text/javascript">
		$('#documentViewer').FlexPaperViewer({
			config : {
				SwfFile : ctx + "${mediaName}",
				Scale : 0.6,
				ZoomTransition : 'easeOut',
				ZoomTime : 0.5,
				ZoomInterval : 0.1,
				FitPageOnLoad : true,
				FitWidthOnLoad : false,
				FullScreenAsMaxWindow : false,
				ProgressiveLoading : false,
				MinZoomSize : 0.2,
				MaxZoomSize : 5,
				SearchMatchAll : false,
				//SearchServiceUrl : searchServiceUrl,
				RenderingOrder : "flash,flash",
				ViewModeToolsVisible : true,
				ZoomToolsVisible : true,
				NavToolsVisible : true,
				CursorToolsVisible : true,
				SearchToolsVisible : true,
				key : "",
				//DocSizeQueryService : "swfsize.jsp?doc=1",
				jsDirectory : ctx + '/js/flexpaper/',
				localeDirectory : ctx + '/js/flexpaper/locale/',
				JSONDataType : 'jsonp',
				WMode : 'window',
				localeChain : 'zh_CN'
			}
		});
	</script>

</body>
</html>