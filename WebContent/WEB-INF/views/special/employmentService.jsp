<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>宅客学院-首页</title>
</head>
<%@ include file="/WEB-INF/include/header.jsp"%>
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
<div class="blank55"></div>
<!-- Start 高薪就业 -->
<div class="jyfw_A">
	<h1 class="jyfw_tit">
    	<p>为什么高薪就业</p>
    </h1>
    <div class="j_cent">掌握企业需要的核心技能、快速胜任岗位工作、具备专业的职业素养是高薪就业的三大法宝。宅客学院专注IT工程师培养，结合IT行业的人才需求，通过拆解真实案例，提供系列案例驱动的在线课程以及实训项目，同时辅助各种形式的职业素养课程，全方位提升学习者的就业竞争力，获得高薪就业的三大法宝。</div>
	<div class="blank30"></div>
    <div class="gxjy_list">
    	<dl>
        	<dt><img src="${pageContext.request.contextPath}/images/al_t1.png" width="103" height="80" alt="" /></dt>
            <dd>
            	<h2>案例学习</h2>
                <p>案例驱动的在线课程，边学边做，边做边学，快速提高IT核心技能。</p>
            </dd>
        </dl>
        <dl>
        	<dt><img src="${pageContext.request.contextPath}/images/al_t2.png" width="119" height="80" alt="" /></dt>
            <dd>
            	<h2>一对一辅导</h2>
                <p>与中软国际20000名工程师实时互动，在线答疑，掌握最“前线”的经验。</p>
            </dd>
        </dl>
        <dl>
        	<dt><img src="${pageContext.request.contextPath}/images/al_t3.png" width="113" height="80" alt="" /></dt>
            <dd>
            	<h2>高强度项目实训</h2>
                <p>基于真实案例的实训项目，体验项目开发整体流程，快速提高工程能力。</p>
            </dd>
        </dl>
        <dl>
        	<dt><img src="${pageContext.request.contextPath}/images/al_t4.png" width="103" height="81" alt="" /></dt>
            <dd>
            	<h2>线下实习</h2>
                <p>全国十个工程实践中心，为学习者提供实习机会，为胜任岗位工作奠定基础。</p>
            </dd>
        </dl>
        <dl>
        	<dt><img src="${pageContext.request.contextPath}/images/al_t5.png" width="119" height="81" alt="" /></dt>
            <dd>
            	<h2>就业指导</h2>
                <p>专业就业指导团队，从提升学习者职业素质着手，为学习者高薪就业保驾护航。</p>
            </dd>
        </dl>
        <dl>
        	<dt><img src="${pageContext.request.contextPath}/images/al_t6.png" width="113" height="81" alt="" /></dt>
            <dd>
            	<h2>高薪就业</h2>
                <p>全方位学习、辅导、实训、就业等服务，实现“高薪就业”的终极目标。</p>
            </dd>
        </dl>
    </div>
</div>
<!-- end 高薪就业 -->
<!-- Start 职业素养提升 -->
<div class="jyfw_B">
	<div class="jyfw_B_nr">
    	<h1 class="jyfw_tit1">
    		<p>职业素养提升</p>
    	</h1>
        <div class="j_cent1">职业素养在从业者的职业生涯中扮演非常重要的角色，起到非常重要的决定作用。职业素养主要包括职业技能、商务礼仪、职业心态、沟通技巧、职业道德等模块，是任何岗位都需要具备的基本素质。</div>
		<div class="syts_box">
        	<ul>
            	<li>
                	<h3  class="syts_t1">职业技能</h3>
                    <p>熟悉IT行业不同岗位必备的职业技能，包括需求分析、系统设计、代码编写、应用部署、质量管理、软件测试、技术文档写作等。</p>
                </li>
                <li>
                	<h3 class="syts_t2">商务礼仪</h3>
                    <p>熟悉职场必要的商务礼仪，包括握手礼仪、仪表礼仪、举止礼仪、办公礼仪、宴会礼仪、迎宾礼仪、电话礼仪等，完善职业形象。</p>
                </li>
                <li>
                    <h3 class="syts_t3">职业心态</h3>
                    <p>职业发展需要具备良好的职业心态，包括学习的心态、主动的心态、积极的心态、空杯的心态、舍得的心态等，正确对待工作。</p>
                </li>
                <li>
                	<h3 class="syts_t4">沟通技巧</h3>
                	<p>沟通能力是从业者的一项重要素质，也是企业选拔管理人员的一个重要考核因素。掌握常用的沟通技巧，能够使得工作中事半功倍。</p>
                </li>
                <li>
                	<h3 class="syts_t5">职业道德</h3>
               	 	<p>了解职业道德，能够更清楚掌握从业者在工作中的行为标准和要求，也能够理解所从事职业对社会所负的道德责任和义务。</p>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- end 职业素养提升 -->
<div class="blank55"></div>
<!-- Start 就业服务中心 -->
<div class="jyfw_C">
	<h1 class="jyfw_tit">
    	<p>就业服务中心</p>
    </h1>
    <div class="j_cent">就业服务中心包括职业规划部及企业拓展部，由具备丰富人力资源经验的专业团队，拓展企业资源，第一时间获得企业招聘信息，指导学习者提升必备的职业技能，选择适合自己的岗位，达到高薪就业的目标。</div>
	<div class="blank30"></div>
    <div class="fwzx_box posr">
    	<div class="fw_t1">学习者的私人教练，根据学习者的职业性格特征，职业技能水平，定制专业的职业发展计划，提供就业推荐服务。</div>
        <div class="fw_t2">了解行业内企业的人才需求，掌握人员招聘的最新资讯，为学习者建立就业的快速通道。</div>
        <div class="fw_t3">对就业信息及发展情况进行跟踪管理，通过专业数据分析，不断完善就业指导服务，提升就业服务质量。</div>
    </div>
</div>
<!-- end 就业服务中心 -->

<!--Start 就业企业资源-->
<div class="jyfw_D">
	<div class="jyfw_D_nr">
    	<h1 class="jyfw_tit1">
    		<p>就业企业资源</p>
    	</h1>
        <div class="j_cent1">现阶段，与中软卓越建立人才供应合作关系的企业，已经超过了1000家，这其中包括百度、IBM、阿里巴巴、华为、联想等众多IT巨头。与此同时，中软国际每年的人才需求量也达到了数千人，这些构成了中软卓越人才供应的稳定资源。</div>
		<div class="qyzy_box">
        	<dl>
            	<dt><img src="${pageContext.request.contextPath}/images/al_t8.png" width="156" height="80" alt="" /></dt>
                <dd>中软国际每年的人才需求量都在千人以上</dd>
            </dl>
            <dl>
            	<dt><img src="${pageContext.request.contextPath}/images/al_t17.png" width="113" height="80" alt="" /></dt>
                <dd>超过1000IT企业与中软国际建立了人才供应关系</dd>
            </dl>
        </div>
        <div class="blank40"></div>
    </div>
</div>
<!-- end 就业企业资源 -->
<div class="blank55"></div>

<!-- Start 就业明星 -->
<div class="jyfw_E">
	<h1 class="jyfw_tit">
    	<p>就业明星</p>
    </h1>
    <div class="j_cent">ETC始终致力帮助每一位学员实现高水准就业，在具有一定规模的公司找到适合的岗位，并获得高于应届毕业生的平均薪资待遇。ETC在学员毕业之后，将根据学员的表现推荐到中软国际和合作伙伴的企业中供职。</div>
	<div class="blank30"></div>
    <div class="jymx_box posr">
    	<div class="jymx_list posr">
    		<ul>
            	<li>
                	<dl>
                    	<dt><img src="${pageContext.request.contextPath}/images/jymx_linan.png" width="256" height="164" alt="" /></dt>
                    	<dd>
                        	<h2>李楠</h2>
                            <p>学校名称：大连交通大学</p>
                            <p>就职单位：NEC</p>
                            <p>薪资待遇：年薪30万</p>
                        </dd>
                    </dl>
                    <dl>
                    	<dt><img src="${pageContext.request.contextPath}/images/jymx_jlx.png" width="256" height="164" alt="" /></dt>
                    	<dd>
                        	<h2>贾丽欣</h2>
                            <p>学校名称：东北大学</p>
                            <p>就职单位：华为</p>
                            <p>薪资待遇：年薪10万</p>
                        </dd>
                    </dl>
                    <dl>
                    	<dt><img src="${pageContext.request.contextPath}/images/jymx_fyx.png" width="256" height="164" alt="" /></dt>
                    	<dd>
                        	<h2>范永星</h2>
                            <p>学校名称：天津工业大学</p>
                            <p>就职单位：北京玩蟹</p>
                            <p>薪资待遇：年薪10万</p>
                        </dd>
                    </dl>
                    <dl>
                    	<dt><img src="${pageContext.request.contextPath}/images/jymx_chenjian.png" width="256" height="164" alt="" /></dt>
                    	<dd>
                        	<h2>陈健</h2>
                            <p>学校名称：天津工业大学</p>
                            <p>就职单位：百度</p>
                            <p>薪资待遇：年薪12万</p>
                        </dd>
                    </dl>
                    <dl>
                    	<dt><img src="${pageContext.request.contextPath}/images/jymx_dxh.png" width="256" height="164" alt="" /></dt>
                    	<dd>
                        	<h2>丁晓晖</h2>
                            <p>学校名称：厦门理工大学</p>
                            <p>就职单位：厦门宝软</p>
                            <p>薪资待遇：年薪10万</p>
                        </dd>
                    </dl>
                    <dl>
                    	<dt><img src="${pageContext.request.contextPath}/images/jymx_fangyi.png" width="256" height="164" alt="" /></dt>
                    	<dd>
                        	<h2>方意</h2>
                            <p>学校名称：天津工业大学</p>
                            <p>就职单位：宝兰德</p>
                            <p>薪资待遇：年薪10万</p>
                        </dd>
                    </dl>
                </li>
                
            </ul>
        </div>
        <!-- <a href="javascript:;" class="posa prev"></a>
        <a href="javascript:;" class="posa next"></a> -->
    </div>
</div>
<!-- end 就业明星 -->
<!-- end 内容 -->
<%@ include file="/WEB-INF/include/footer.jsp"%>

</body>
</html>

