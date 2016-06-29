<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>宅客学院-首页</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
</head>

<body>
	<input id="menuActived" type="hidden" value="menuItem_Index" />
	<%@ include file="/WEB-INF/include/top.jsp"%>
	<!-- Start banner区域 -->
<div id="full-screen-slider">
	<ul id="slides">
		<li style="background:url(${pageContext.request.contextPath}/images/banner_1.jpg) no-repeat center top"><a href="javascript:;" target="_blank">智能网站管理系统</a></li>
		<li style="background:url(${pageContext.request.contextPath}/images/banner_2.jpg) no-repeat center top"><a href="${pageContext.request.contextPath}/sys.do?method=projectPracticeService" target="_blank">仙人掌软件</a></li>
        <li style="background:url(${pageContext.request.contextPath}/images/banner_3.jpg) no-repeat center top"><a href="${pageContext.request.contextPath}/sys.do?method=oneToOneService" target="_blank">智能网站管理系统</a></li>
		<li style="background:url(${pageContext.request.contextPath}/images/banner_4.jpg) no-repeat center top"><a href="${pageContext.request.contextPath}/toReadyPlayLiveCourse.do" target="_blank">仙人掌软件</a></li>
		<li style="background:url(${pageContext.request.contextPath}/images/banner_5.jpg) no-repeat center top"><a href="${pageContext.request.contextPath}/sys.do?method=talentCustomMadeService" target="_blank">仙人掌软件</a></li>
	</ul>
</div>
<!-- end banner区域 -->
<!-- Start 内容 -->
<div class="b_cont_box">
	<div class="b_cont">
        <div class="b_cont_l f_l">
            <h2 class="cont_tit">我们的服务</h2>
            <div class="w_service">
                <dl>
                    <dt><a href="${pageContext.request.contextPath}/sys.do?method=oneToOneService"><img src="${pageContext.request.contextPath}/images/sy_t1.png" width="248" height="100" alt="" /></a></dt>
                    <dd>一对一辅导</dd>
                </dl>
                <dl>
                    <dt><a href="${pageContext.request.contextPath}/sys.do?method=projectPracticeService"><img src="${pageContext.request.contextPath}/images/sy_t2.png" width="248" height="100" alt="" /></a></dt>
                    <dd>项目实训</dd>
                </dl>
                <dl>
                    <dt><a href="${pageContext.request.contextPath}/sys.do?method=employmentService"><img src="${pageContext.request.contextPath}/images/sy_t3.png" width="248" height="100" alt="" /></a></dt>
                    <dd>就业服务</dd>
                </dl>
                <dl>
                    <dt><a href="${pageContext.request.contextPath}/sys.do?method=talentCustomMadeService"><img src="${pageContext.request.contextPath}/images/sy_t4.png" width="248" height="100" alt="" /></a></dt>
                    <dd>人才定制</dd>
                </dl>
            </div>
        </div>
        <div class="b_cont_r f_r">
        	 <h2 class="cont_tit">社区</h2>
             <p class="mb_10">在宅客学院的社区里，不仅可以找到你的小伙伴，还可以发现你的校友、学校老师、企业的工程师、IT行业大佬。同时，还可以和志同道合的人组成圈子，分享社区的乐趣。</p>
             <p><img src="${pageContext.request.contextPath}/images/shequ.gif" width="271" height="187" alt="" /></p>
        </div>
        <div class="clear"></div>
	</div>
    <div class="blank35"></div>
</div>
<!-- end 内容 -->
<%@ include file="/WEB-INF/include/footer.jsp"%>
</body>
</html>

