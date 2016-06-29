<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/myAccountManager.js"></script>
<style type="text/css">
.xgjd_box_xxb {
	z-index: 999;
	background-color: #fff;
	width: 376px;
	position: fixed;
	left: 0px;
	right: 0px;
	top: 100px;
	margin-left: auto;
	margin-right: auto;
}
</style>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!-- Start 我的账户-->
<div class="gg_smbox">
	<div class="g_wdzh_box">
		<div class="g_wdzh_t">
			<h1 class="g_title">账户余额</h1>
			<p>账户余额：<span id="stuCoin" style="color: #f60;font-weight: 700;font-family: verdana,arial;">${sessionScope.sessionInfo.student.stuCoin}</span> 学习币</p>
		</div>
		<div class="blank48"></div>
		<div class="g_wdzh_m">
			<h1 class="g_title">账户充值</h1>
			<p class="g_zhcz">
				<span>充值金额：</span><input type="text" value="" /> <span>学习币（1学习币=1元 <a href="javascript:;">积分兑换</a>）
				</span>
			</p>
			<p class="g_czfs">
				<span>充值方式：</span> <a href="javascript:;" id="rechargeableCard"><img src="${pageContext.request.contextPath}/images/g_czk.png" width="30" height="25" alt="" /><span>充值卡</span></a> <a href=""><img src="${pageContext.request.contextPath}/images/g_zfb.png" width="75" height="25" alt="" /></a> <a href=""><img src="${pageContext.request.contextPath}/images/g_cft.png" width="67" height="25" alt="" /></a> <a href=""><img src="${pageContext.request.contextPath}/images/g_yhk.png" width="30" height="25" alt="" /><span>银行卡</span></a>
			</p>
		</div>
		<div class="blank48"></div>
		<div class="g_wdzh_b">
			<h1 class="g_title">交易记录</h1>
			<div class="g_table">
				<table width="100%">
					<tr>
						<th>时间</th>
						<th>金额</th>
						<th>类别</th>
						<th>明细</th>
					</tr>
					<c:forEach var="coinRecord" items="${requestScope.coinRecords }">
						<tr>
							<td><fmt:formatDate value="${coinRecord.crecRegtime }" pattern="yyyy.MM.dd" /></td>
							<td>${coinRecord.crecCoin }</td>
							<td><c:if test="${coinRecord.crecCoin >0}">充值</c:if> <c:if test="${coinRecord.crecCoin <0}">消费</c:if></td>
							<td>${coinRecord.crecReason }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<!-- 学习币兑换码兑换框 -->
	<div id="xuexibiduihuan" class="xgjd_box zx_gt">
		<div class="xgjd_t posr">
			<h1 class="fp_tit">学习币兑换</h1>
			<div class="z_gb posa">
				<img src="${pageContext.request.contextPath}/images/z_guanb.png" width="8" height="10" alt="">
			</div>
		</div>
		<div style="padding: 37px 0 0 20px;">
			<div class="xg_bf">
				卡号<input id="reRedeemcode" type="text" maxlength="20" onkeyup="coinExchange(this.value)"/> 面额：<span id="reCoinamount" style="color: #f60;font-weight: 700;font-family: verdana,arial;">0</span>个
			</div>
			<div class="wh_cc1">
				<input id="coinExchange_button" type="button" value="兑换" class="borput2 wh_cg2" disabled="disabled" onclick="doCoinExchange()" style="background-color: #AAAAAA"><span class="wh_qx">取消</span>
			</div>
		</div>
	</div>
	<!-- 学习币兑换码兑换框 -->
</div>
<!-- End 我的账户-->