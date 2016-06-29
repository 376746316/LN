<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/admin/integralManager.js"></script>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!-- Start 我的积分-->
<div class="gg_smbox">
	<ul class="g_gfsm">
		<li<c:if test="${requestScope.active == null }"> class="active"</c:if>><a href="javascript:;">积分说明</a> | <span
			class="sj posa" style="left: 22px;"></span></li>
		<li><a href="javascript:;">积分规则</a> | <span class="sj posa"
			style="left: 22px;"></span></li>
		<li><a href="javascript:;">用户组规则 </a> | <span class="sj posa"
			style="left: 22px;"></span></li>
		<li><a href="javascript:;">积分记录</a> | <span class="sj posa"
			style="left: 22px;"></span></li>
		<li<c:if test="${requestScope.active eq 'jfdh' }"> class="active"</c:if>><a href="javascript:;">积分兑换 </a> | <span class="sj posa"
			style="left: 22px;"></span></li>
		<li><a href="javascript:;">礼品兑换</a> <span class="sj posa"
			style="left: 22px;"></span></li>
	</ul>
	<div class="g_gg_box">
		<!-- Start 积分说明 -->
		<div class="g_jjqh" <c:if test="${requestScope.active == null }"> style="display: block;"</c:if>>
			<div class="g_gfsm_m">
				<p>
					积分数：<span class="font_c">${sessionScope.sessionInfo.student.stuScore}</span>
					分（<a class="font_l">积分兑换</a>）
				</p>
				<p>
					用户组：<span><c:if
							test="${sessionScope.sessionInfo.student.stuNickname != null }">
					${sessionScope.sessionInfo.student.stuNickname}
				</c:if> <c:if
							test="${sessionScope.sessionInfo.student.stuNickname == null }">
					${sessionScope.sessionInfo.student.stuUserid}
				</c:if></span>
				</p>
				<p>
					排名：<span>1</span>
				</p>
				<p>
					访问量：<span>100</span>
				</p>
				<p>
					创建时间：<span><fmt:formatDate
							value="${sessionScope.sessionInfo.student.stuRegtime}"
							pattern="yyyy.MM.dd" /></span>
				</p>
				<p>
					最后登录：<span><fmt:formatDate
							value="${sessionScope.sessionInfo.student.stuLastlogin}"
							pattern="yyyy.MM.dd" /></span>
				</p>
			</div>
			<div class="blank30"></div>
			<div class="g_qhdq">
				<h2>积分到期</h2>
				<div class="pp_kfdq">
					<span class="f_l jfye">积分余额</span> <span class="f_l date">积分有效期</span>
					<span class="f_l dqjf">2014年4月1日到期的积分</span> <span
						class="f_l dqjf1">2014年7月1日到期的积分</span>
				</div>
				<div class="kfdq_box">
					<span class="f_l jfye">${sessionScope.sessionInfo.student.stuScore}</span>
					<span class="f_l date">6个月</span> <span class="f_l dqjf">100</span>
					<span class="f_l dqjf1">600</span>
				</div>
			</div>
			<div class="blank30"></div>
			<div class="gg_jfpm">
				<h2>积分排名</h2>
				<div class="g_jfpm">
					<span class="f_l paim">名次</span> <span class="f_l yhz">用户组</span> <span
						class="f_l zgjf">最高积分</span> <span class="f_l yhs">用户数</span>
				</div>
				<div class="jfpm_box">
					<ul>
						<li><span class="f_l paim">1800</span> <span class="f_l yhz">大牛</span>
							<span class="f_l zgjf">2200</span> <span class="f_l yhs">50</span></li>
						<li class="oddbg"><span class="f_l paim">1800</span> <span
							class="f_l yhz">大牛</span> <span class="f_l zgjf">2200</span> <span
							class="f_l yhs">50</span></li>
						<li><span class="f_l paim">1800</span> <span class="f_l yhz">大牛</span>
							<span class="f_l zgjf">2200</span> <span class="f_l yhs">50</span></li>
						<li class="oddbg"><span class="f_l paim">1800</span> <span
							class="f_l yhz">大牛</span> <span class="f_l zgjf">2200</span> <span
							class="f_l yhs">50</span></li>
						<li><span class="f_l paim">1800</span> <span class="f_l yhz">大牛</span>
							<span class="f_l zgjf">2200</span> <span class="f_l yhs">50</span></li>
					</ul>
				</div>

			</div>
		</div>
		<!-- End 积分说明 -->
		<!-- Start 积分规则 -->
		<div class="g_jjqh">
			<div class="g_jfgz">
				<div class="tab_jfgz">
					<span class="left name">名称</span> <span class="left date">周期</span>
					<span class="left zqcs">周期内次数</span> <span class="left num">单次奖励分值</span>
				</div>
				<div class="g_tabf">
					<ul>
						<c:forEach var="scoreRule" items="${requestScope.scoreRuleList }"
							varStatus="status">
							<li <c:if test="${status.index%2==1}">class="oddbg"</c:if>><span
								class="left name">${scoreRule.srName}</span> <span
								class="left date"><c:if test="${scoreRule.srCycle==0 }">一次性</c:if>
									<c:if test="${scoreRule.srCycle==1 }">每天</c:if></span> <span
								class="left zqcs">${scoreRule.srTimes}</span> <span
								class="left num">${scoreRule.srScore}</span></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
		<!-- End 积分规则 -->
		<!-- Start 用户组规则 -->
		<div class="g_jjqh">
			<div class="g_yhgz">
				<div class="tabcc_gz">
					<span class="left name">用户组</span> <span class="left jifen">积分</span>
					<span class="left xuexb">学习币</span> <span class="left zhibo">直播</span>
					<span class="left kcxz">课程下载</span> <span class="left jfdh">积分兑换</span>
					<span class="left xxsl">线下沙龙</span>
				</div>
				<div class="yhgz_tab">
					<ul>
						<c:forEach var="userGroup" items="${requestScope.userGroupList }"
							varStatus="status">
							<li <c:if test="${status.index%2==1}">class="oddbg"</c:if>>
								<span class="left name">${userGroup.ugName }</span> <span
								class="left jifen">${userGroup.ugLowestscore } <c:if
										test="${userGroup.ugTopscore!=-1}">- ${userGroup.ugTopscore}</c:if>
									<c:if test="${userGroup.ugTopscore==-1}">以上</c:if>
							</span> <span class="left xuexb">${userGroup.ugCoin }</span> <span
								class="left zhibo"> <c:if
										test="${userGroup.ugLiveFlag ==0 }">无</c:if> <c:if
										test="${userGroup.ugLiveFlag ==1 }">全部</c:if> <c:if
										test="${userGroup.ugLiveFlag ==2 }">部分</c:if>
							</span> <span class="left kcxz"> <c:if
										test="${userGroup.ugDownloadFlag ==0 }">不可</c:if> <c:if
										test="${userGroup.ugDownloadFlag ==1 }">全部</c:if> <c:if
										test="${userGroup.ugDownloadFlag ==2 }">部分</c:if>
							</span> <span class="left jfdh"> <c:if
										test="${userGroup.ugExchangeFlag ==0 }">不可</c:if> <c:if
										test="${userGroup.ugExchangeFlag ==1 }">可兑换</c:if>
							</span> <span class="left xxsl"> <c:if
										test="${userGroup.ugSalonFlag ==0 }">不可参加</c:if> <c:if
										test="${userGroup.ugSalonFlag ==1 }">可参加</c:if>
							</span>
							</li>
						</c:forEach>
					</ul>
				</div>
				<div class="blank48"></div>
				<div class="g_ksts_t">如果您想快速升级</div>
				<div class="ksts_box">
					<ul>
						<li>
							<div class="ksts_t">
								<img src="${pageContext.request.contextPath }/images/kssj.png"
									width="142" height="98" alt="" />
							</div>
							<div class="ksts_w">
								<h1>完成课程学习</h1>
								<p>针对每个阶段的课程，我们都会给予一定数量的积分奖励。只要您能多多学习课程，那您就能获得大量的积分，快速实现升级。</p>
							</div>
						</li>
						<li>
							<div class="ksts_t">
								<img src="${pageContext.request.contextPath }/images/kssj.png"
									width="142" height="98" alt="" />
							</div>
							<div class="ksts_w">
								<h1>积极参与互动</h1>
								<p>除了学习课程能够获得积分之外，您还可以通过分享课程、回答他人问题、发表评论等多种方式获得积分。</p>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- End 用户组规则 -->
		<!-- Start 积分记录 -->
		<div class="g_jjqh">
			<div class="g_jfjl">
				<div class="tabcc_lm">
					<span class="left name">名称</span> <span class="left zqcs">周期次数</span>
					<span class="left jifen">单次奖励分值</span> <span class="left num">总计奖励分值</span>
					<span class="left date">最新奖励时间</span>
				</div>
				<div class="gg_tab">
					<ul>
						<c:forEach var="pageModelScoreRecord"
							items="${requestScope.pageModelScoreRecordList }"
							varStatus="status">
							<li <c:if test="${status.index%2==1}">class="oddbg"</c:if>>
								<span class="left name">${pageModelScoreRecord.srecReason}</span>
								<span class="left zqcs">${pageModelScoreRecord.srTimes}</span> <span
								class="left jifen">${pageModelScoreRecord.srScore}</span> <span
								class="left num">${pageModelScoreRecord.sumScore}</span> <span
								class="left date"><fmt:formatDate
										value="${pageModelScoreRecord.lastDate}" pattern="yyyy.MM.dd" /></span>
							</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
		<!-- End 积分记录 -->
		<!-- Start 积分兑换 -->
		<div class="g_jjqh" <c:if test="${requestScope.active eq 'jfdh' }"> style="display: block;"</c:if>>
			<div class="g_jjdh">
				<form id="scoreExchange_form" action="">
					<div class="g_gfsm_m">
						<p>
							现有积分:<span id="disStuScore" class="font_c">${sessionScope.sessionInfo.student.stuScore}</span>分
						</p>
						<p>
							可换积分：<span id="kyStuScore"><c:if
									test="${sessionScope.sessionInfo.student.stuScore - 1000 > 0}">${sessionScope.sessionInfo.student.stuScore - 1000}</c:if>
								<c:if
									test="${sessionScope.sessionInfo.student.stuScore - 1000 <= 0}">0</c:if></span>
							（<a class="font_l">兑换说明</a>）
						</p>
					</div>
					<div class="blank35"></div>
					<div class="g_gfsm_m">
						<p>
							兑换分数：<input id="exchangeScore" name="exchangeScore" type="text"
								value="" class="gg_dhfs">分
						</p>
						<p>
							兑换成：<span id="disCrecCoin" class="font_l"
								style="text-decoration: none;">0</span> 学习币
						</p>
						<p>兑换比例：<span id="rpValue">${requestScope.rqaParam.rpValue}</span>分=1学习币</p>
						<input id="rpValueHid" type="hidden" value="${requestScope.rqaParam.rpValue}">
					</div>

					<div class="blank30"></div>
					<div class="g_gfsm_m ml_30">
						<p>
							密码：<input type="password" name="stuPwd" class="g_pawd"  onfocus="chackExchangeScore();"/>
						</p>
						<p class="p_qrtj">
							<input type="button" value="" class="g_qrtj"
								onclick="submitScoreExchangeForm()" />
						</p>
					</div>
				</form>
			</div>
		</div>
		<!-- End 积分兑换 -->
		<!-- Start 礼品兑换 -->
		<div class="g_jjqh">
			<div class="g_lpdh">
				<p>
					<img src="${pageContext.request.contextPath }/images/k_jsz.png"
						width="298" height="182" alt="" />
				</p>
				<p class="g_cent">网站建设中，敬请期待</p>
				<p>
					<a href=""><img
						src="${pageContext.request.contextPath }/images/k_fanh.png"
						width="115" height="33" alt="" /></a>
				</p>
			</div>
		</div>
		<!-- End 礼品兑换 -->
	</div>
</div>
<!-- End 我的积分-->