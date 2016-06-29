<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>资料设置</title>
<%@ include file="/WEB-INF/include/header.jsp"%>
<!-- 地区级联加载 -->
<script src="${pageContext.request.contextPath}/js/Area/Area.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/Area/AreaData_min.js" type="text/javascript"></script>
<!-- zTree加载 -->
<link href="<c:url value="/css/zTree/zTreeStyle.css" />" type="text/css" rel="stylesheet" />
<link href="<c:url value="/css/zTree/techTypeTree.css" />" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="<c:url value="/js/jquery.ztree.all-3.5.js" />"></script>
<!-- 学校加载 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/school/school.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/admin/userDataSet.js"></script>
<link href="${pageContext.request.contextPath}/css/admin/dataSet.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="<c:url value="/js/js/swfobject.js" />"></script>
</head>
<body>
	<%@ include file="/WEB-INF/include/top.jsp"%>
	<div class="w980 auto k_dateset">
		<div class="k_settitle">设置</div>
		<div class="tab_asktit tab_asktit_set posr">
			<div class="left">
				<ul>
					<li class="active"><a href="javascript:;">资料设置</a> |<span class="sj posa" style="left: 22px;"></span></li>
					<li><a href="javascript:;">方向设置</a> |<span class="sj posa" style="left: 18px;"></span></li>
					<li><a href="javascript:;">账户设置</a> |<span class="sj posa" style="left: 18px;"></span></li>
					<li><a href="javascript:;">密码设置</a> |<span class="sj posa" style="left: 18px;"></span></li>
					<li><a href="javascript:;">通知设置</a> |<span class="sj posa" style="left: 18px;"></span></li>
					<li><a href="javascript:;">邮件设置</a><span class="sj posa" style="left: 18px;"></span></li>
				</ul>
				<div class="clear"></div>
			</div>
		</div>
		<div class="tab_askcont1 tab_askcont_dset">
			<!-- Start 资料设置 -->
			<div class="k_hidden" style="display: block;">
				<div class="k_lableset">
					<span class="left k_lablet">昵称：</span>
					<div class="right k_lablec">
						<input type="text" name="userNickname" id="userNickname" class="k_txt" style="width: 260px;" onblur="checkBasicInfo()" value="${sessionScope.sessionInfo.user.userNickname}" /> <span id="userNicknameMsg" style="padding-left: 10px; color: #595959;"> </span>
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">性别：</span>
					<div class="right k_lablec">
						<div class="t_rad_che t_sexm t_fs12" id="userSex">
							<label for=""><input type="radio" class="t_radio" name="userSex" value="0" />男</label> <label for=""><input type="radio" class="t_radio" name="userSex" value="1" />女</label> <label for=""><input type="radio" class="t_radio" name="userSex" checked="checked" value="2" />保密</label><input type="hidden" name="" id="userSexHidden" value="${sessionScope.sessionInfo.user.userSex}" />
						</div>
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">头像：</span>
					<div class="right k_lablec posr">
						<div class="left k_userimg">
							<img id="imgUserHead" src="${sessionScope.sessionInfo.user.userHead} " width="82" height="82" alt="" />
						</div>
						<span class="k_userimg_tips posa">支持jpg、gif、png或bmp格式的图片，建议文件小于20M</span> <a id="btnxgtx" href="javascript:;" class="k_subxgtx posa" title="修改头像">修改头像</a>
					</div>
					<!-- 头像层 -->
					<div class="k_xgtx posa" style="display: none;">
						<div class="pjkc_t">
							<div class="kc_tit f_l">修改头像</div>
							<div class="xgtx_gb">
								<img src="images/pj_gb.png" width="13" height="14" />
							</div>
							<div class="clear"></div>
						</div>
						<div id="altContent" style="border: red;"></div>
					</div>
					<!-- 头像层 end-->
				</div>
				<div class="k_lableset" style="margin-top: 35px;">
					<span class="left k_lablet">电话：</span>
					<div class="right k_lablec">
						<input type="text" name="userMobile" id="userMobile" class="left k_txt" style="width: 160px;" onblur="checkBasicInfo()" value="${sessionScope.sessionInfo.user.userMobile}" /> <span class="left k_lablet" style="width: 60px;">QQ：</span> <input type="text" name="userQq" id="userQq" class="left k_txt" style="width: 160px;" onblur="checkBasicInfo()" value="${sessionScope.sessionInfo.user.userQq}" /> <span id="userMobileMsg" style="padding-left: 10px; color: #595959;"></span><span id="userQQMsg" style="padding-left: 10px; color: #595959;"></span>
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">个人介绍：</span>
					<div class="right k_lablec">
						<textarea name="userIntro" class="k_textarea" id="userIntro" cols="30" rows="10">${sessionScope.sessionInfo.user.userIntro}</textarea>
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">地区：</span>
					<div class="right k_lablec">
						<select id="seachprov" name="seachprov" onchange="changeComplexProvince(this.value, sub_array, 'seachcity', 'seachdistrict');"></select> <select id="seachcity" name="homecity" onchange="changeCity(this.value,'seachdistrict','seachdistrict');"></select> <span id="seachdistrict_div"><select id="seachdistrict" name="seachdistrict"></select></span> <input type="hidden" name="userAreaCode" id="userAreaCode" value="${sessionScope.sessionInfo.user.userAreaCode}" />
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">教育背景：</span>
					<div class="right k_lablec">
						<div class="c">
							<select name="admissionDate" id="admissionDate">
								<option value="">入学时间</option>
								<c:forEach var="calendar" items="${requestScope.calendar }">
									<option value="${calendar }">${calendar }</option>
								</c:forEach>
							</select> <select name="graduationDate" id="graduationDate">
								<option value="">毕业时间</option>
								<c:forEach var="calendar" items="${requestScope.calendar }">
									<option value="${calendar }">${calendar }</option>
								</c:forEach>
							</select>
						</div>
						<div class="c">
							<input type="text" style="width: 187px;" class="k_txt stext" name="school" id="school-name" value="请选择大学" onblur="if(this.value==''){this.value='请选择大学'}" onfocus="if(this.value=='请选择大学'){this.value=''}" onclick="pop()" readonly="readonly" /> <input type="text" name="major" style="width: 190px;" id="major" class="k_txt" value="请填写专业" onblur="if(this.value==''){this.value='请填写专业'}" onfocus="if(this.value=='请填写专业'){this.value=''}" /> <input type="button" value="  " class="k_subtj" onclick="addUserEduBg()" /> <span style="padding-left: 10px; color: #595959;">例如：2008-2012 北京理工大学 工商管理</span>
						</div>
						<ul class="k_tjlist" id="userEduBgs">
							<c:forEach var="userEdBg" items="${requestScope.userEdBgList }">
								${userEdBg }
							</c:forEach>
						</ul>
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">工作背景：</span>
					<div class="right k_lablec">
						<div class="c">
							<input type="text" name="userJobContext" style="width: 392px;" id="userJobContext" class="k_txt" value="${sessionScope.sessionInfo.user.userJobContext}" />
							<!-- <input type="button" value="  " class="k_subtj" onclick="addUserHobby()" />  -->
							<span style="padding-left: 10px; color: #595959;">例如：中软国际软件工程师</span>
						</div>
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">项目经验：</span>
					<div class="right k_lablec">
						<textarea name="userWorkExp" class="k_textarea" id="userWorkExp" cols="30" rows="10">${sessionScope.sessionInfo.user.userWorkExp}</textarea>
					</div>
				</div>
				<div class="k_lableset">
					<span class="left k_lablet">特长：</span>
					<div class="right k_lablec">
						<div class="c">
							<input type="text" name="userHobby" style="width: 392px;" id="userHobby" class="k_txt" value="${sessionScope.sessionInfo.user.userHobby}" />
							<!-- <input type="button" value="  " class="k_subtj" onclick="addUserHobby()" />  -->
							<span style="padding-left: 10px; color: #595959;">例如：iOS开发、广告传媒、信息技术</span>
						</div>
					</div>
				</div>
				<div class="k_lableset">
					<input type="button" value="保存" class="y_subbccg" style="margin-left: 130px;" onclick="submit_Basic_Info_form()" /> <span class="y_tjcg" id="basicMsg"></span>
				</div>
			</div>
			<!-- End 资料设置 -->
			<!-- Start 方向设置 -->
			<div class="k_hidden">
				<div class="k_lableset k_xx">
					<p>技术方向</p>
					<%-- <div class="k_xxfx" id="userTechDirect">
						<c:forEach var="techType" items="${requestScope.techTypeList }">
							<label for=""><input type="radio" name="k_xxfx" value="${techType.techTypeId }" />${techType.techTypeName }</label>
						</c:forEach>
					</div>
					<input type="hidden" name="" id="userTechDirectHidden" value="${sessionScope.sessionInfo.user.userTechDirect }" /> --%>

					<script type="text/javascript">
						var setting = {
							view : {
								showLine : false,
								showIcon : false,
								selectedMulti : false,
								dblClickExpand : false,
								addDiyDom : addDiyDom
							},
							data : {
								simpleData : {
									enable : true
								}
							},
							callback : {
								beforeClick : beforeClick
							},
							check : {
								chkboxType : {
									"Y" : "s",
									"N" : "s"
								},
								enable : true
							}
						};
						///*  
						var zNodes = [
							<c:forEach var="techType" items="${requestScope.techTypeList }">
							{id : ${techType.techTypeId },
									pId : ${techType.techTypeParent },
									name : "${techType.techTypeName }"
								},
							</c:forEach> 
							];
						var zUserTechType=[0
						         	<c:forEach var="userTechTypeKey" items="${requestScope.userTechTypeList }">
										,${userTechTypeKey.utTechtypeId}
									</c:forEach> 
						                   ]; 
						 //*/
						function addDiyDom(treeId, treeNode) {
							var spaceWidth = 20;
							var switchObj = $("#" + treeNode.tId + "_switch"), icoObj = $("#" + treeNode.tId + "_ico"), checkObj = $("#" + treeNode.tId + "_check"), spanObj = $("#" + treeNode.tId + "_span");
							switchObj.remove();
							switchObj.hide();
							checkObj.remove();
							icoObj.before(switchObj);
							spanObj.after(checkObj);
							if (treeNode.level > 0) {
								var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level) + "px'></span>";
								switchObj.before(spaceStr);
							}
						}

						function beforeClick(treeId, treeNode) {
							var zTree = $.fn.zTree.getZTreeObj("treeDemo");
							zTree.checkNode(treeNode,null,true,true);
							return false;
						}
						$(function() {
							var treeObj = $("#treeDemo");
							$.fn.zTree.init(treeObj, setting, zNodes);
							treeObj.hover(function() {
								if (!treeObj.hasClass("showIcon")) {
									treeObj.addClass("showIcon");
								}
							}, function() {
								treeObj.removeClass("showIcon");
							});
							var zTree = $.fn.zTree.getZTreeObj("treeDemo");
							zTree.expandAll(true);
							$.each(zUserTechType, function(i, n) {
								if (n > 0) {
									var node = zTree.getNodeByParam("id", n, null);
									zTree.checkNode(node, true, true,true);
									zTree.selectNode(node);
								}
							});
							zTree.cancelSelectedNode();
						});
					</script>

					<ul id="treeDemo" class="ztree"></ul>


					<div class="blank35"></div>
				</div>
				<div class="k_lableset">
					<input type="button" value="保存" class="y_subbccg" onclick="submit_TechDirect_Info_form()" /> <span class="y_tjcg" id="techDirectMsg"></span>
				</div>
			</div>
			<!-- End 方向设置 -->
			<!-- Start 账户设置 -->
			<div class="k_hidden">
				<div class="k_lableset k_xx" id="modifiUserMailDiv">
					<p>基本信息</p>
					<div class="k_jjxx">
						<span class="k_yhm">用户名：</span><span>${sessionScope.sessionInfo.user.userId }</span>
						<div class="clear"></div>
					</div>
					<div class="k_jjxx">
						<span class="k_yhm">常用邮箱：</span> <span><input id="userMail" type="text" class="k_psw" value="${sessionScope.sessionInfo.user.userMail }" readonly="readonly" onblur="checkMail()" /></span> <span class="k_xgyx" onclick="modifiUserMail()">修改邮箱</span>
						<div class="clear"></div>
					</div>
					<div class="k_jjxx">
						<span class="k_yhm">密码：</span><span><input type="password" name="userPwd" class="k_psw" /></span>
						<div class="clear"></div>
					</div>
					<div class="k_jjxx">
						<input type="button" value="保存" class="jjxx_bc" onclick="submit_UserMail_Info_form()" /> <span class="y_tjcg" id="userMailMsg"></span>
					</div>
				</div>
			</div>
			<!-- End 账户设置 -->
			<!-- Start 密码设置 -->
			<div class="k_hidden">
				<div class="k_lableset k_xx" id="modifiUserPwdDiv">
					<p>基本信息</p>
					<div class="k_jjxx">
						<span class="k_yhm">现有密码：</span><span><input type="password" name="userPwd" id="" class="k_psw" /></span>
						<div class="clear"></div>
					</div>
					<div class="k_jjxx">
						<span class="k_yhm">新密码：</span><span><input type="password" name="newUserPwd" id="" class="k_psw" /></span>
						<div class="clear"></div>
					</div>
					<div class="k_jjxx">
						<span class="k_yhm">确认密码：</span><span><input type="password" name="reUserPwd" id="" class="k_psw" /></span>
						<div class="clear"></div>
					</div>
				</div>
				<div class="k_lableset">
					<input type="button" value="保存" class="jjxx_bc" onclick="submit_UserPwd_Info_form()" /> <span class="y_tjcg" id="userPwdMsg"></span>
				</div>
			</div>
			<!-- End 密码设置 -->
			<!-- Start 通知设置 -->
			<div class="k_hidden">
				<div class="k_lableset k_tz">
					<p>通知</p>
					<div class="k_xxfxx" id="userMsgCfgDiv">
						<c:forEach var="modelNotification" items="${requestScope.modelNotificationList }">
							<label for=""><input type="checkbox" name="userMsgCfg" value="${modelNotification.notificationValue }" />${modelNotification.notificationName }</label>
						</c:forEach>
					</div>
					<input type="hidden" name="" id="userMsgCfgHidden" value="${sessionScope.sessionInfo.user.userMsgCfg }" />
				</div>
				<div class="k_lableset">
					<input type="button" value="保存" class="jjxx_bc" style="margin-left: 30px;" onclick="submit_Notification_Info_form()" /> <span id="userMsgCfgMsg" class="y_tjcg"></span>
				</div>
			</div>
			<!-- End 通知设置 -->
			<!-- Start 邮件设置 -->
			<div class="k_hidden">
				<div class="k_lableset k_tz" id="userMailCfgDiv">
					<p>邮件</p>
					<div class="k_xxfxx">
						<label for=""><input id="userMailCfg" name="userMailCfg" type="checkbox" value="1" />订阅每周精选</label>
					</div>
					<input type="hidden" value="${sessionScope.sessionInfo.user.userMailCfg }" id="userMailCfgHidden" />
				</div>
				<div class="k_lableset">
					<input type="button" value="保存" class="jjxx_bc" style="margin-left: 30px;" onclick="submit_UserMailCfg_Info_form()" /> <span id="userMailCfgMsg" class="y_tjcg"></span>
				</div>
			</div>
			<!-- End 邮件设置 -->
		</div>
	</div>
	<!-- End 资料设置 -->

	<!--Start 页脚-->
	<%@ include file="/WEB-INF/include/footer.jsp"%>
	<!-- End 页脚 -->

	<!-- Start 选择大学弹出层 -->
	<div id="choose-box-wrapper">
		<div id="choose-box">
			<div id="choose-box-title">
				<span>选择学校</span>
			</div>
			<div id="choose-a-province"></div>
			<div id="choose-a-school"></div>
			<div id="choose-box-bottom">
				<input type="button" onclick="hide()" value="关闭" />
			</div>
		</div>
		<!-- End 选择大学弹出层 -->
	</div>
	<!-- Start 表单 -->
	<form id="Basic_Info_form" action="">
		<input type="hidden" name="userNo" value="${sessionScope.sessionInfo.user.userNo}" /> <input type="hidden" name="userNickname" /> <input type="hidden" name="userSex" /> <input type="hidden" name="userMobile" /> <input type="hidden" name="userQq" /> <input type="hidden" name="userIntro" /> <input type="hidden" name="userAreaCode" /> <input type="hidden" name="userEduBg" /> <input type="hidden" name="userWorkExp" /> <input type="hidden" name="userHobby" /> <input type="hidden" name="userJobContext" />
	</form>
	<form id="TechDirect_Info_form" action="">
		<input type="hidden" name="userNo" value="${sessionScope.sessionInfo.user.userNo}" /> <input type="hidden" name="userTechDirect" />
	</form>
	<form id="UserMail_Info_form" action="">
		<input type="hidden" name="userNo" value="${sessionScope.sessionInfo.user.userNo}" /> <input type="hidden" name="userMail" /> <input type="hidden" name="userPwd" />
	</form>
	<form id="UserPwd_Info_form" action="">
		<input type="hidden" name="userNo" value="${sessionScope.sessionInfo.user.userNo}" /> <input type="hidden" name="userPwd" /> <input type="hidden" name="newUserPwd" />
	</form>
	<form id="Notification_Info_form" action="">
		<input type="hidden" name="userNo" value="${sessionScope.sessionInfo.user.userNo}" /> <input type="hidden" name="userMsgCfg" />
	</form>
	<form id="UserMailCfg_Info_form" action="">
		<input type="hidden" name="userNo" value="${sessionScope.sessionInfo.user.userNo}" /> <input type="hidden" name="userMailCfg" />
	</form>
	<!-- End 表单 -->
</body>
</html>