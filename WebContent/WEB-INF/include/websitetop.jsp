<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript">
	function doClearSession(){
		
		$.messager.confirm('提示信息', '是否确认注销实训平台?', function(r){
			if (r){

				$.post("clearAllSession.do", null, function(rsp) {
					location = "towebsite.do";
				}).error(function() {
					location = "towebsite.do";
				});
				
			}
		});
}
</script>
<div class="top">
	<div class="top_m">
		<div class="ding_right">
			<ul>
				<li>您好,${sessionScope.stuName}</li>
				<c:if test="${sessionScope.stuName != null}">
					<li><a href="javascript:doClearSession();">注销用户</a></li>
				</c:if>	
				<li><a href="">网站专属二维码</a></li>
			</ul>
		</div>
		<div class="top_i">
			<div class="top_img">
				<img src="images/logo.jpg" /> <img src="images/title.jpg" /> <img
					src="images/phone.jpg" />
			</div>
		</div>
	
		<%@ include file="/WEB-INF/include/menu.jsp"%>
		 
	</div>
</div>
