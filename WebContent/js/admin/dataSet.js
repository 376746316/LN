/**
 * 个人信息完善-设置 heyuqiang
 */

var number = 8888; // 添加信息项动态ID
var oldmajorInfo = ""; // 上一次添加教育背景信息
var oldstuWorkExpInfo = ""; // 上一次添加工作经验信息

$(function() {
	var flag = $("#chooseFlag").val();
	if("true" == flag){
		$(".left ul li:eq(1)").click();
	}
	// 修改头像
	$(".xgtx_gb").click(function() {
		$(".k_xgtx").hide();
	});

	$('#btnxgtx').click(function() {
		var k_xgtx = $('.k_xgtx');
		if (k_xgtx.css('display') == 'none') {
			k_xgtx.show();
		} else {
			k_xgtx.hide();
		}
	});

	// ----------------------------------------初始化性别信息-------------------------------------------------
	var stuSexHidden = $("#stuSexHidden").val();
	if (stuSexHidden != "") {
		$("#stuSex input[type=radio][value=" + stuSexHidden + "]").attr("checked", 'checked');
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化学习方向信息---------------------------------------------
	var stuTechDirectHidden = $("#stuTechDirectHidden").val();
	if (stuTechDirectHidden != "") {
		$("#stuTechDirect input[type=radio][value=" + stuTechDirectHidden + "]").attr("checked", 'checked');
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化通知设置信息---------------------------------------------
	var stuMsgCfgHidden = $("#stuMsgCfgHidden").val();
	if (stuMsgCfgHidden != "") {
		var stuMsgCfgArray = stuMsgCfgHidden.split(",");
		for ( var i = 0; i < stuMsgCfgArray.length; i++) {
			$("#stuMsgCfgDiv input[type=checkbox][value='" + stuMsgCfgArray[i] + "']").attr("checked", 'checked');
		}
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化邮件设置信息---------------------------------------------
	var stuMailCfgHidden = $("#stuMailCfgHidden").val();
	if (stuMailCfgHidden != "") {
		$("#stuMailCfgDiv input[type=checkbox][value='" + stuMailCfgHidden + "']").attr("checked", 'checked');
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化支付设置信息---------------------------------------------
	var stuPaymentCfgHidden = $("#stuPaymentCfgHidden").val();
	if (stuPaymentCfgHidden != "") {
		$("#stuPayment input[name=stuPaymentCfg][value=" + stuPaymentCfgHidden + "]").click();
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化地区信息-------------------------------------------------
	var areaCode = $('#areaCode').val();
	if (areaCode == "") {
		initComplexArea('seachprov', 'seachcity', 'seachdistrict', area_array, sub_array, '44', '0', '0');
	} else {
		initComplexArea('seachprov', 'seachcity', 'seachdistrict', area_array, sub_array, '0', '0', '0');
		if (areaCode.length >= 2) {
			$('#seachprov').val(areaCode.substr(0, 2));
			changeComplexProvince(areaCode.substr(0, 2), sub_array, 'seachcity', 'seachdistrict');
		}
		if (areaCode.length >= 4) {
			$('#seachcity').val(areaCode.substr(0, 4));
			changeCity(areaCode.substr(0, 4), 'seachdistrict', 'seachdistrict');
		}
		if (areaCode.length == 6) {
			$('#seachdistrict').val(areaCode.substr(0, 6));
		}
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化修改头像信息---------------------------------------------
	var flashvars = {
		"jsfunc" : "uploadevent",
		"imgUrl" : $('#imgStuHead').attr("src"),
		"pid" : "75642723",
		"uploadSrc" : true,
		"showBrow" : true,
		"showCame" : true,
		"showColorAdj" : true,
		"uploadUrl" : "uploadhead.do",
		"pSize" : "300|300|100|100|45|45|30|30"
	};

	var params = {
		menu : "false",
		scale : "noScale",
		allowFullscreen : "true",
		allowScriptAccess : "always",
		wmode : "transparent",
		uploadUrl : "uploadhead.do",
		bgcolor : "#FFFFFF"
	};

	var attributes = {
		id : "FaustCplus"
	};

	swfobject.embedSWF("swf/FaustCplus.swf", "altContent", "650", "500", "9.0.0", "expressInstall.swf", flashvars, params, attributes);
	// ----------------------------------------------END-----------------------------------------------------

});

function uploadevent(data) {
	if (data == -1) {
		$(".k_xgtx").hide();
		return;
	}
	var rsp = eval("(" + data + ")");
	switch (rsp.status + '') {

	case '1':
		$(".k_xgtx").hide();
		var time = new Date().getTime();
		$('#imgStuHead').attr("src", rsp.url + "?" + time);
		$('#topImgHead').attr("src", rsp.url + "?" + time);
		break;

	case '-2':
		alert('保存失败，请稍后再试!');
		window.location.href = "#";
		break;

	default:
		alert(typeof (status) + ' ' + status);
	}
}

// 得到地区码
function getAreaID() {
	var area = 0;
	if ($("#seachdistrict").val() != "0") {
		area = $("#seachdistrict").val();
	} else if ($("#seachcity").val() != "0") {
		area = $("#seachcity").val();
	} else {
		area = $("#seachprov").val();
	}
	return area;
}

function showAreaID() {
	// 地区码
	var areaID = getAreaID();
	// 地区名
	var areaName = getAreaNamebyID(areaID);
	alert("您选择的地区码：" + areaID + "      地区名：" + areaName);
}

// 根据地区码查询地区名
function getAreaNamebyID(areaID) {
	var areaName = "";
	if (areaID.length == 2) {
		areaName = area_array[areaID];
	} else if (areaID.length == 4) {
		var index1 = areaID.substring(0, 2);
		areaName = area_array[index1] + " " + sub_array[index1][areaID];
	} else if (areaID.length == 6) {
		var index1 = areaID.substring(0, 2);
		var index2 = areaID.substring(0, 4);
		areaName = area_array[index1] + " " + sub_array[index1][index2] + " " + sub_arr[index2][areaID];
	}
	return areaName;
}

// 弹出窗口
function pop() {
	// 将窗口居中
	makeCenter();
	// 初始化省份列表
	initProvince();
	// 默认情况下, 给第一个省份添加choosen样式
	$('[province-id="1"]').addClass('choosen');
	// 初始化大学列表
	initSchool(1);
}

// 隐藏窗口
function hide() {
	$('#choose-box-wrapper').css("display", "none");
}

function initProvince() {
	// 原先的省份列表清空
	$('#choose-a-province').html('');
	for (i = 0; i < schoolList.length; i++) {
		$('#choose-a-province').append('<a href="javascript:void(0);" class="province-item" province-id="' + schoolList[i].id + '">' + schoolList[i].name + '</a>');
	}
	// 添加省份列表项的click事件
	$('.province-item').bind('click', function() {
		var item = $(this);
		var province = item.attr('province-id');
		var choosenItem = item.parent().find('.choosen');
		if (choosenItem)
			$(choosenItem).removeClass('choosen');
		item.addClass('choosen');
		// 更新大学列表
		initSchool(province);
	});
}

function initSchool(provinceID) {

	// 原先的学校列表清空
	$('#choose-a-school').html('');
	var schools = schoolList[provinceID - 1].school;
	for (i = 0; i < schools.length; i++) {
		$('#choose-a-school').append('<a href="javascript:void(0);" class="school-item" school-id="' + schools[i].id + '">' + schools[i].name + '</a>');
	}

	// 添加大学列表项的click事件
	$('.school-item').bind('click', function() {
		var item = $(this);
		var school = item.attr('school-id');
		// 更新选择大学文本框中的值
		$('#school-name').val(item.text());
		// 关闭弹窗
		hide();
	});
}

function makeCenter() {
	$('#choose-box-wrapper').css("display", "block");
	$('#choose-box-wrapper').css("position", "absolute");
	$('#choose-box-wrapper').css("top", Math.max(0, (($(window).height() - $('#choose-box-wrapper').outerHeight()) / 2) + $(window).scrollTop()) + "px");
	$('#choose-box-wrapper').css("left", Math.max(0, (($(window).width() - $('#choose-box-wrapper').outerWidth()) / 2) + $(window).scrollLeft()) + "px");
}

// 添加教育背景项
function addStuEduBg() {
	var admissionDate = $('#admissionDate').val();
	var graduationDate = $('#graduationDate').val();
	var schoolname = $('#school-name').val();
	var major = $('#major').val();
	major = $.trim(major);
	if ((admissionDate != '入学时间' || admissionDate != '') && (graduationDate != '毕业时间' && graduationDate != '')) {
		if (admissionDate < graduationDate) {
			if (schoolname == "请选择大学" || schoolname == "") {
				alert("请选择大学");
			} else {
				if (major == "") {
					alert("请填写专业");
					$("#major").focus();
				} else {
					if (/^[\u4e00-\u9fa5]{0,}$/.test(major)) {
						var majorInfo = admissionDate + "-" + graduationDate + "&nbsp;" + schoolname + "&nbsp;" + major;
						var appHtml = "<li id='" + number + "'><span class='left'>" + majorInfo + "</span><a href=\"" + "javascript:removeStuEduBg('#" + number + "')" + "\"' class='close left'>close</a></li>";
						if (oldmajorInfo == majorInfo) {
							alert("该条信息已经存在，请不要重复添加");
						} else {
							$("#stuEduBgs").append(appHtml);
							oldmajorInfo = majorInfo;
							number++;
							$('select[name=admissionDate]').val("入学时间");
							$('select[name=graduationDate]').val("毕业时间");
							$('input[name=school]').val("请选择大学");
							$('input[name=major]').val("请填写专业");
						}
					} else {
						alert("专业信息只能填写汉字");
						$("#major").focus();
					}
				}
			}
		} else {
			alert("入学时间不能大于毕业时间");
		}
	} else {
		alert("请选择入学时间和毕业时间");
	}
	checkBasicInfo();
}

// 移除教育背景项
function removeStuEduBg(obj) {
	obj = $.trim(obj);
	$(obj).remove();
	oldmajorInfo = "";
}

// 添加工作经验项
/*
 * function addStuWorkExp() { var stuWorkExp_01 = $('#stuWorkExp_01').val(); stuWorkExp_01 = $.trim(stuWorkExp_01); var stuWorkExp_02 = $('#stuWorkExp_02').val(); stuWorkExp_02 = $.trim(stuWorkExp_02); if (stuWorkExp_01 != "") { if (stuWorkExp_02 != "") { if (/^[\u4E00-\u9FA5A-Za-z0-9_]+$/.test(stuWorkExp_01)) { if (/^[\u4E00-\u9FA5A-Za-z0-9_]+$/.test(stuWorkExp_02)) { // 验证通过添加信息项 var stuWorkExpInfo = stuWorkExp_01 + "&nbsp;" + stuWorkExp_02; var appHtml = "<li id='" + number + "'><span class='left'>" + stuWorkExpInfo + "</span><a href=\"" + "javascript:removeStuWorkExp('#" + number + "')" + "\"' class='close left'>close</a></li>"; if (oldstuWorkExpInfo == stuWorkExpInfo) { alert("该条信息已经存在，请不要重复添加"); } else { $("#stuWorkExps").append(appHtml); oldstuWorkExpInfo = stuWorkExpInfo; number++; $('input[name=stuWorkExp_01]').val(""); $('input[name=stuWorkExp_02]').val(""); } } else { alert("工作经验信息只能填写汉字"); $('#stuWorkExp_02').focus(); } } else { alert("工作经验信息只能填写汉字"); $('#stuWorkExp_01').focus(); } } else { alert("工作经验信息不完整"); $('#stuWorkExp_02').focus(); } } else { alert("工作经验信息不完整"); $('#stuWorkExp_01').focus(); } } // 移除教育背景项 function removeStuWorkExp(obj) { obj = $.trim(obj); $(obj).remove(); oldstuWorkExpInfo = ""; }
 */

// 提交基本信息
function submit_Basic_Info_form() {

	// 昵称
	var stuNickname = $('#stuNickname').val();
	stuNickname = $.trim(stuNickname);
	$('#Basic_Info_form input[name=stuNickname]').val(stuNickname);

	// 性别
	var stuSex = $('#stuSex input:radio:checked').val();
	$('#Basic_Info_form input[name=stuSex]').val(stuSex);

	// 电话
	var stuMobile = $('#stuMobile').val();
	$('#Basic_Info_form input[name=stuMobile]').val(stuMobile);

	// QQ
	var stuQq = $('#stuQq').val();
	$('#Basic_Info_form input[name=stuQq]').val(stuQq);

	// 个人简介
	var stuIntro = $('#stuIntro').val();
	stuIntro = $.trim(stuIntro);
	$('#Basic_Info_form input[name=stuIntro]').val(stuIntro);

	// 地区编码
	var areaCode = getAreaID();
	$('#Basic_Info_form input[name=areaCode]').val(areaCode);

	// 教育背景
	var stuEduBg = "";
	$("#stuEduBgs>li>span").each(function() {
		if (stuEduBg != "") {
			stuEduBg += ",";
		}
		stuEduBg += $(this).text();
	});
	$('#Basic_Info_form input[name=stuEduBg]').val(stuEduBg);

	// 工作经验
	/*
	 * var stuWorkExp = ""; $("#stuWorkExps>li>span").each(function() { if (stuWorkExp != "") { stuWorkExp += ","; } stuWorkExp += $(this).text(); }); $('#Basic_Info_form input[name=stuWorkExp]').val(stuWorkExp);
	 */
	var stuWorkExp = $('#stuWorkExp').val();
	stuWorkExp = $.trim(stuWorkExp);
	$('#Basic_Info_form input[name=stuWorkExp]').val(stuWorkExp);

	// 特长
	var stuHobby = $('#stuHobby').val();
	stuHobby = $.trim(stuHobby);
	$('#Basic_Info_form input[name=stuHobby]').val(stuHobby);

	// 工作背景
	var stuJobContext = $('#stuJobContext').val();
	stuJobContext = $.trim(stuJobContext);
	$('#Basic_Info_form input[name=stuJobContext]').val(stuJobContext);

	if (checkBasicInfo() != false) { // 校验通过
		// 设置提交状态
		$("#basicMsg").css('color', '#40bd45');
		$("#basicMsg").text("正在提交...");
		// 提交数据
		$.post(ctx + "/student.do?method=perfectionInfo", $('#Basic_Info_form').serialize(), function(data) {
			if (data.success) {
				$("#basicMsg").text(data.msg);
			} else {
				$("#basicMsg").css('color', 'red');
				$("#basicMsg").text(data.msg);
				return false;
			}
		}, "json");
	}

}

// 基本信息校验
function checkBasicInfo() {

	// 昵称
	var stuNickname = $('#stuNickname').val();
	stuNickname = $.trim(stuNickname);
	if (stuNickname != "") {
		if (/^[\u4E00-\u9FA5A-Za-z0-9]+$/.test(stuNickname)) {
			$("#stuNicknameMsg").text("");
			$('#stuNickname').removeClass().addClass("k_txt");
		} else {
			$('#stuNickname').focus();
			$('#stuNickname').removeClass().addClass("k_txt_error");
			$("#stuNicknameMsg").text("昵称只能输入中文、英文、数字但不包括下划线等符号");
			return false;
		}
	} else {
		$("#stuNicknameMsg").text("请填写昵称");
		$('#stuNickname').removeClass().addClass("k_txt_error");
		return false;
	}

	// 电话
	var stuMobile = $('#stuMobile').val();
	stuMobile = $.trim(stuMobile);
	if (stuMobile != "") {
		if (/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/.test(stuMobile)) { // 手机格式
			$("#stuMobileMsg").text("");
		} else if (/^((0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$/.test(stuMobile)) { // 固定电话格式
			$("#stuMobileMsg").text("");
		} else {
			$('#stuMobile').focus();
			$("#stuMobileMsg").text("电话格式不正确，例如：010-12345678或0411-12345678等");
			return false;
		}
	} else {
		$("#stuMobileMsg").text("");
	}

	// QQ
	var stuQq = $('#stuQq').val();
	stuQq = $.trim(stuQq);
	if (stuQq != "") {
		if (/^[0-9]{5,10}$/.test(stuQq)) { // QQ格式
			$("#stuQQMsg").text("");
		} else {
			$('#stuQq').focus();
			$("#stuQQMsg").text("QQ号格式不正确");
			return false;
		}
	} else {
		$("#stuQQMsg").text("");
	}
 
	// 临时注释代码请勿删除
/*	// 个人简介
	var stuIntro = $("#stuIntro").val();
	stuIntro = $.trim(stuIntro);
	if (stuIntro != "") {
		if (stuIntro.length >= 10) {
			$("#stuIntroMsg").text("");
			$("#stuIntro").removeClass().addClass("k_textarea");
		} else {
			$("#stuIntro").focus();
			$("#stuIntro").removeClass().addClass("k_textarea_error");
			$("#stuIntroMsg").text("至少填写10字以上");
			return false;
		}
	} else {
		$("#stuIntroMsg").text("请填写个人介绍");
		$('#stuIntro').removeClass().addClass("k_textarea_error");
		return false;
	}

	// 地区
	var seachcity = $("#seachcity").val();
	var seachdistrict = $("#seachdistrict").val();
	if (seachcity == "0") {
		$("#seachcity").css({
			'border-color' : '#f66'
		});
		return false;
	} else if (seachdistrict == "0") {
		$("#seachdistrict").css({
			'border-color' : '#f66'
		});
		return false;
	}
	$("#seachcity").css({
		'border-color' : ''
	});
	$("#seachdistrict").css({
		'border-color' : ''
	});
	
	// 教育背景
	if ($("#stuEduBgs li").length == 0) {
		$("#admissionDate").css({
			'border-color' : '#f66'
		});
		$("#graduationDate").css({
			'border-color' : '#f66'
		});
		$("#school-name").css({
			'border-color' : '#f66'
		});
		$("#major").css({
			'border-color' : '#f66'
		});
		return false;
	}else{
		$("#admissionDate").css({
			'border-color' : ''
		});
		$("#graduationDate").css({
			'border-color' : ''
		});
		$("#school-name").css({
			'border-color' : ''
		});
		$("#major").css({
			'border-color' : ''
		});
	}

	// 工作背景
	var stuJobContext = $("#stuJobContext").val();
	stuJobContext = $.trim(stuJobContext);
	if(stuJobContext==""){
		$("#stuJobContext").css({
			'border-color' : '#f66'
		});
		return false;
	}else{
		$("#stuJobContext").css({
			'border-color' : ''
		});
	}*/
}

function submit_stuProf() {
	if ($('#stuTechDirect input:checked').val()) {
		// 设置提交状态
		$("#techDirectMsg").css('color', '#40bd45');
		$("#techDirectMsg").text("正在提交...");
		// 提交数据
		$.post(ctx + "/student.do", {
			method : "setProf",
			stuProf : $('#stuTechDirect input:checked').val()
		}, function(data) {
			if (data.success) {
				$("#techDirectMsg").text(data.msg);
			} else {
				$("#techDirectMsg").css('color', 'red');
				$("#techDirectMsg").text(data.msg);
				return false;
			}
		}, "json");
	} else {
		$("#techDirectMsg").css('color', 'red');
		$("#techDirectMsg").text("请选择方向");
	}
}

// 修改邮箱
function modifiStuMail() {
	$('#stuMail').attr("readonly", false); // 去除readonly属性
	$('#stuMail').val("");
	$('#stuMail').focus();
}

// 修改邮箱-邮箱格式校验
function checkMail() {
	var stuMail = $('#stuMail').val();
	if (/^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(stuMail)) { // 邮箱格式正确
		// 检查邮箱是否可用
		$.post(ctx + "/student.do?method=chackEmailAvailable", {
			"email" : stuMail
		}, function(data) {
			if (data.success) {
				$('#stuMail').attr("readonly", true); // 添加readonly属性
				$("#stuMailMsg").css('color', '#40bd45');
				$('#stuMailMsg').text("");
			} else {
				$('#stuMail').focus();
				$("#stuMailMsg").css('color', 'red');
				$('#stuMailMsg').text(data.msg);
			}
		}, "json");
	} else {
		$('#stuMail').focus();
		$("#stuMailMsg").css('color', 'red');
		$('#stuMailMsg').text("邮箱格式错误");
	}
}

// 提交账户设置信息-修改邮箱
function submit_StuMail_Info_form() {
	var stuMail = $('#stuMail').val();
	var stuPwd = $('#modifiStuMailDiv input[name=stuPwd]').val();
	if (stuMail != "" && stuPwd != "") {
		$('#StuMail_Info_form input[name=stuMail]').val(stuMail);
		$('#StuMail_Info_form input[name=stuPwd]').val(stuPwd);
		// 设置提交状态
		$('#stuMailMsg').css('color', '#40bd45');
		$('#stuMailMsg').text("正在提交...");
		// 提交数据
		$.post(ctx + "/student.do?method=modifiStuMail", $('#StuMail_Info_form').serialize(), function(data) {
			if (data.success) {
				$('#stuMailMsg').text(data.msg);
				$('#modifiStuMailDiv input[name=stuPwd]').val("");
			} else {
				$('#stuMailMsg').css('color', 'red');
				$('#stuMailMsg').text(data.msg);
				return false;
			}
		}, "json");
	} else {
		$('#stuMailMsg').css('color', 'red');
		$('#stuMailMsg').text("请输入邮箱和密码");
	}
}

// 提交密码设置信息-检查密码格式
function check_newStuPwd() {
	var newStuPwd = $('#modifiStuPwdDiv input[name=newStuPwd]').val(); // 新密码
	if (/^[\@A-Za-z0-9\!\#\$\%\^\&\*\.\~]{6,20}$/.test(newStuPwd)) {
		return true;
	} else {
		$('#stuPwdMsg').css('color', 'red');
		$('#stuPwdMsg').text("请输入6 ~ 20 字符【0-9】【a-z-A-Z】【~!@#$%^&*.】");
		$('#modifiStuPwdDiv input[name=newStuPwd]').focus();
		return false;
	}
}

// 提交密码设置信息-修改密码
function submit_StuPwd_Info_form() {
	var stuPwd = $('#modifiStuPwdDiv input[name=stuPwd]').val(); // 现有密码
	var newStuPwd = $('#modifiStuPwdDiv input[name=newStuPwd]').val(); // 新密码
	var reStuPwd = $('#modifiStuPwdDiv input[name=reStuPwd]').val(); // 确认密码
	if (stuPwd != "") {
		if (check_newStuPwd()) { // 新密码格式正确
			if (newStuPwd != "" || reStuPwd != "") {
				if (newStuPwd == reStuPwd) { // 新密码和确认密码一致
					$('#StuPwd_Info_form input[name=stuPwd]').val(stuPwd);
					$('#StuPwd_Info_form input[name=newStuPwd]').val(newStuPwd);
					// 设置提交状态
					$('#stuPwdMsg').css('color', '#40bd45');
					$('#stuPwdMsg').text("正在提交...");
					// 提交数据
					$.post(ctx + "/student.do?method=modifiStuPwd", $('#StuPwd_Info_form').serialize(), function(data) {
						if (data.success) {
							$('#stuPwdMsg').text(data.msg);
							$('#modifiStuPwdDiv input[name=stuPwd]').val("");
							$('#modifiStuPwdDiv input[name=newStuPwd]').val("");
							$('#modifiStuPwdDiv input[name=reStuPwd]').val("");
						} else {
							$('#stuPwdMsg').css('color', 'red');
							$('#stuPwdMsg').text(data.msg);
							return false;
						}
					}, "json");
				} else {
					$('#stuPwdMsg').css('color', 'red');
					$('#stuPwdMsg').text("新密码和确认密码不一致");
				}
			} else {
				$('#stuPwdMsg').css('color', 'red');
				$('#stuPwdMsg').text("新密码和确认密码不能为空");
			}
		}
	} else {
		$('#stuPwdMsg').css('color', 'red');
		$('#stuPwdMsg').text("请输入原密码");
	}
}

// 提交通知设置信息-修改通知项
function submit_Notification_Info_form() {

	var stuMsgCfg = "";

	$("#stuMsgCfgDiv input[type='checkbox']:checked").each(function() {
		stuMsgCfg += $(this).val() + ",";
	});

	if (stuMsgCfg.length > 0) {
		// 得到选中的checkbox值序列
		stuMsgCfg = stuMsgCfg.substring(0, stuMsgCfg.length - 1);
	}

	$('#Notification_Info_form input[name=stuMsgCfg]').val(stuMsgCfg);

	// 设置提交状态
	$('#stuMsgCfgMsg').css('color', '#40bd45');
	$('#stuMsgCfgMsg').text("正在提交...");

	// 提交数据
	$.post(ctx + "/student.do?method=perfectionInfo", $('#Notification_Info_form').serialize(), function(data) {
		if (data.success) {
			$('#stuMsgCfgMsg').text(data.msg);
		} else {
			$('#stuMsgCfgMsg').css('color', 'red');
			$('#stuMsgCfgMsg').text(data.msg);
			return false;
		}
	}, "json");
}

// 提交邮件设置信息-修改邮件通知选项
function submit_StuMailCfg_Info_form() {
	var stuMailCfg;
	if ($('#stuMailCfg').attr('checked') == undefined) { // 判断是否已经打勾
		stuMailCfg = 0; // 不订阅
	} else {
		stuMailCfg = 1;// 订阅
	}
	$('#StuMailCfg_Info_form input[name=stuMailCfg]').val(stuMailCfg);
	// 设置提交状态
	$('#stuMailCfgMsg').css('color', '#40bd45');
	$('#stuMailCfgMsg').text("正在提交...");

	// 提交数据
	$.post(ctx + "/student.do?method=perfectionInfo", $('#StuMailCfg_Info_form').serialize(), function(data) {
		if (data.success) {
			$('#stuMailCfgMsg').text(data.msg);
		} else {
			$('#stuMailCfgMsg').css('color', 'red');
			$('#stuMailCfgMsg').text(data.msg);
			return false;
		}
	}, "json");
}

// 提交支付设置信息-修改支付通知选项
function submit_stuPaymentCfg_Info_form() {
	var stuPayment = $("#stuPayment input[name=stuPaymentCfg]:checked").val();
	$('#StuPaymentCfg_Info_form input[name=stuPayment]').val(stuPayment);
	// 设置提交状态
	$('#stuPaymentCfgMsg').css('color', '#40bd45');
	$('#stuPaymentCfgMsg').text("正在提交...");

	// 提交数据
	$.post(ctx + "/student.do?method=perfectionInfo", $('#StuPaymentCfg_Info_form').serialize(), function(data) {
		if (data.success) {
			$('#stuPaymentCfgMsg').text(data.msg);
		} else {
			$('#stuPaymentCfgMsg').css('color', 'red');
			$('#stuPaymentCfgMsg').text(data.msg);
			return false;
		}
	}, "json");
}
