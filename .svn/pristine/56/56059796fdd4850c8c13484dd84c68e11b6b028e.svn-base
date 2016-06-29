<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ include file="/WEB-INF/include/common.jsp"%>
<%@ include file="/WEB-INF/include/header_backstage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="<c:url value="/js/json2.js" />"></script>
<title>提示</title>
<script type="text/javascript">
	var times = 6;
	clock();
	function clock() {
		window.setTimeout('clock()', 1000);
		times = times - 1;
		time.innerHTML = times;
		if (times == 0) {
			location.href = "toSurveyList.do";
		}
	}
</script>
</head>
<body>
	<%@ include file="/WEB-INF/include/top.jsp"%>
	<div class="banner1">
		<div class="content">
			<%@ include file="/WEB-INF/include/websiteleftmenu.jsp"%>
			<div id="testTabs" class="tabcon">
				<div class="easyui-tabs">
					<div title="问卷调查" style="overflow: hidden;">
						<div style="width: 850px; height: auto;">
							<div >
								<table>
									<tr>
										<td>该页面将在</td>
										<td>
											<div class="STYLE1" id="time">5</div>
										</td>
										<td>秒后自动跳转</td>
									</tr>
								</table>
							</div>
							<img alt="感谢您参与本次调查" src="images/survey/prompt1.jpg"> 
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/include/newFooter.jsp"%>
</body>
</html>