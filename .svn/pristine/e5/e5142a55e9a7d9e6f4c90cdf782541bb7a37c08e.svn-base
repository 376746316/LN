<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<script type="text/javascript">
	$('.grzx_box .grzx_l ul.g_grzxx').find('li').live('click', function() {
		if ($(this).attr('url') && $(this).attr('url') != "") {
			$(this).addClass('active').siblings().removeClass('active');
			$('.grzx_r').load($(this).attr('url'));
		}
	});
	$(document).ready(function() {
		$(".${active}").click();
	});
</script>
</head>

<body>
	<%@ include file="/WEB-INF/include/top.jsp"%>

	<div class="w1000">
		<%@ include file="/WEB-INF/include/uTop.jsp"%>
		<div class="blank40"></div>
		<div class="grzx_box">
			<%@ include file="/WEB-INF/include/myUserCenterMenu.jsp"%>
			<div class="grzx_r f_l"></div>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
	</div>
	<div class="blank80"></div>
	<%@ include file="/WEB-INF/include/footer.jsp"%>
</body>
</html>

