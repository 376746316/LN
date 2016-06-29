/**
 * 个人信息完善-设置 heyuqiang
 */

var number = 8888; // 添加信息项动态ID
var oldmajorInfo = ""; // 上一次添加教育背景信息
var olduserWorkExpInfo = ""; // 上一次添加工作经验信息

$(function() {
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
	var userSexHidden = $("#userSexHidden").val();
	if (userSexHidden != "") {
		$("#userSex input[type=radio][value=" + userSexHidden + "]").attr("checked", 'checked');
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化学习方向信息---------------------------------------------
	var userTechDirectHidden = $("#userTechDirectHidden").val();
	if (userTechDirectHidden != "") {
		$("#userTechDirect input[type=radio][value=" + userTechDirectHidden + "]").attr("checked", 'checked');
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化通知设置信息---------------------------------------------
	var userMsgCfgHidden = $("#userMsgCfgHidden").val();
	if (userMsgCfgHidden != "") {
		var userMsgCfgArray = userMsgCfgHidden.split(",");
		for ( var i = 0; i < userMsgCfgArray.length; i++) {
			$("#userMsgCfgDiv input[type=checkbox][value='" + userMsgCfgArray[i] + "']").attr("checked", 'checked');
		}
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化邮件设置信息---------------------------------------------
	var userMailCfgHidden = $("#userMailCfgHidden").val();
	if (userMailCfgHidden != "") {
		$("#userMailCfgDiv input[type=checkbox][value='" + userMailCfgHidden + "']").attr("checked", 'checked');
	}
	// ----------------------------------------------END-----------------------------------------------------

	// ----------------------------------------初始化地区信息-------------------------------------------------
	var areaCode = $('#userAreaCode').val();
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
		"imgUrl" : $('#imgUserHead').attr("src"),
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
		$('#imgUserHead').attr("src", rsp.url + "?" + time);
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
function addUserEduBg() {
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
						var appHtml = "<li id='" + number + "'><span class='left'>" + majorInfo + "</span><a href=\"" + "javascript:removeUserEduBg('#" + number + "')" + "\"' class='close left'>close</a></li>";
						if (oldmajorInfo == majorInfo) {
							alert("该条信息已经存在，请不要重复添加");
						} else {
							$("#userEduBgs").append(appHtml);
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
}

// 移除教育背景项
function removeUserEduBg(obj) {
	obj = $.trim(obj);
	$(obj).remove();
	oldmajorInfo = "";
}

/*
 * // 添加工作经验项 function addUserWorkExp() { var userWorkExp_01 =
 * $('#userWorkExp_01').val(); userWorkExp_01 = $.trim(userWorkExp_01); var
 * userWorkExp_02 = $('#userWorkExp_02').val(); userWorkExp_02 =
 * $.trim(userWorkExp_02); if (userWorkExp_01 != "") { if (userWorkExp_02 != "") {
 * if (/^[\u4E00-\u9FA5A-Za-z0-9_]+$/.test(userWorkExp_01)) { if
 * (/^[\u4E00-\u9FA5A-Za-z0-9_]+$/.test(userWorkExp_02)) { // 验证通过添加信息项 var
 * userWorkExpInfo = userWorkExp_01 + "&nbsp;" + userWorkExp_02; var appHtml = "<li id='" + number + "'><span
 * class='left'>" + userWorkExpInfo + "</span><a href=\"" +
 * "javascript:removeUserWorkExp('#" + number + "')" + "\"' class='close
 * left'>close</a></li>"; if (olduserWorkExpInfo == userWorkExpInfo) {
 * alert("该条信息已经存在，请不要重复添加"); } else { $("#userWorkExps").append(appHtml);
 * olduserWorkExpInfo = userWorkExpInfo; number++;
 * $('input[name=userWorkExp_01]').val("");
 * $('input[name=userWorkExp_02]').val(""); } } else { alert("工作经验信息只能填写汉字");
 * $('#userWorkExp_02').focus(); } } else { alert("工作经验信息只能填写汉字");
 * $('#userWorkExp_01').focus(); } } else { alert("工作经验信息不完整");
 * $('#userWorkExp_02').focus(); } } else { alert("工作经验信息不完整");
 * $('#userWorkExp_01').focus(); } } // 移除工作经验背景项 function
 * removeUserWorkExp(obj) { obj = $.trim(obj); $(obj).remove();
 * olduserWorkExpInfo = ""; }
 */

// 提交基本信息
function submit_Basic_Info_form() {

	// 昵称
	var userNickname = $('#userNickname').val();
	userNickname = $.trim(userNickname);
	$('#Basic_Info_form input[name=userNickname]').val(userNickname);

	// 性别
	var userSex = $('#userSex input:radio:checked').val();
	$('#Basic_Info_form input[name=userSex]').val(userSex);

	// 电话
	var userMobile = $('#userMobile').val();
	$('#Basic_Info_form input[name=userMobile]').val(userMobile);

	// QQ
	var userQq = $('#userQq').val();
	$('#Basic_Info_form input[name=userQq]').val(userQq);

	// 个人简介
	var userIntro = $('#userIntro').val();
	userIntro = $.trim(userIntro);
	$('#Basic_Info_form input[name=userIntro]').val(userIntro);

	// 地区编码
	var userAreaCode = getAreaID();
	$('#Basic_Info_form input[name=userAreaCode]').val(userAreaCode);

	// 教育背景
	var userEduBg = "";
	$("#userEduBgs>li>span").each(function() {
		if (userEduBg != "") {
			userEduBg += ",";
		}
		userEduBg += $(this).text();
	});
	$('#Basic_Info_form input[name=userEduBg]').val(userEduBg);

	// 工作经验
	/*
	 * var userWorkExp = ""; $("#userWorkExps>li>span").each(function() { if
	 * (userWorkExp != "") { userWorkExp += ","; } userWorkExp +=
	 * $(this).text(); }); $('#Basic_Info_form
	 * input[name=userWorkExp]').val(userWorkExp);
	 */
	var userWorkExp = $('#userWorkExp').val();
	userWorkExp = $.trim(userWorkExp);
	$('#Basic_Info_form input[name=userWorkExp]').val(userWorkExp);

	// 特长
	var userHobby = $('#userHobby').val();
	userHobby = $.trim(userHobby);
	$('#Basic_Info_form input[name=userHobby]').val(userHobby);
	
	// 工作背景
	var userJobContext = $('#userJobContext').val();
	userJobContext = $.trim(userJobContext);
	$('#Basic_Info_form input[name=userJobContext]').val(userJobContext);

	if (checkBasicInfo() != false) { // 校验通过
		// 设置提交状态
		$("#basicMsg").css('color', '#40bd45');
		$("#basicMsg").text("正在提交...");
		// 提交数据
		$.post(ctx + "/perfectionInfo.do", $('#Basic_Info_form').serialize(), function(data) {
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
	var userNickname = $('#userNickname').val();
	userNickname = $.trim(userNickname);
	if (userNickname != "") {
		if (/^[\u4E00-\u9FA5A-Za-z0-9]+$/.test(userNickname)) {
			$("#userNicknameMsg").text("");
		} else {
			$('#userNickname').focus();
			$("#userNicknameMsg").text("昵称只能输入中文、英文、数字但不包括下划线等符号");
			return false;
		}
	} else {
		$("#userNicknameMsg").text("");
	}

	// 电话
	var userMobile = $('#userMobile').val();
	userMobile = $.trim(userMobile);
	if (userMobile != "") {
		if (/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/.test(userMobile)) { // 手机格式
			$("#userMobileMsg").text("");
		} else if (/^(\(\d{3,4}-)|(\d{3.4}-)?\d{7,8}$/.test(userMobile)) { // 固定电话格式
			$("#userMobileMsg").text("");
		} else {
			$('#userMobile').focus();
			$("#userMobileMsg").text("电话格式不正确，例如：010-12345678或0411-12345678等");
			return false;
		}
	} else {
		$("#userMobileMsg").text("");
	}

	// QQ
	var userQq = $('#userQq').val();
	userQq = $.trim(userQq);
	if (userQq != "") {
		if (/^[1-9][0-9]{4,}$/.test(userQq)) { // QQ格式
			$("#userQQMsg").text("");
		} else {
			$('#userQq').focus();
			$("#userQQMsg").text("QQ号格式不正确");
			return false;
		}
	} else {
		$("#userQQMsg").text("");
	}

}

// 提交学习方向信息
function submit_TechDirect_Info_form() {
	var zTree = $.fn.zTree.getZTreeObj("treeDemo");
	var nodes = zTree.getCheckedNodes();
	if (nodes.length) {
		var userTechType = "";
		$.each(nodes, function(i, n) {
			if (n.pId > 0) {
				userTechType += "," + n.id;
			}
		});
		// 设置提交状态
		$("#techDirectMsg").css('color', '#40bd45');
		$("#techDirectMsg").text("正在提交...");
		// 提交数据
		$.post(ctx + "/setUserTechType.do", {
			userTechType : userTechType
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
function modifiUserMail() {
	$('#userMail').attr("readonly", false); // 去除readonly属性
	$('#userMail').val("");
	$('#userMail').focus();
}

// 修改邮箱-邮箱格式校验
function checkMail() {
	var userMail = $('#userMail').val();
	if (/^[\w-]+[\.]*[\w-]+[@][\w\-]{1,}([.]([\w\-]{1,})){1,3}$/.test(userMail)) { // 邮箱格式正确
		// 检查邮箱是否可用
		$.post(ctx + "/chackUserMailAvailable.do", {
			"email" : userMail
		}, function(data) {
			if (data.success) {
				$('#userMail').attr("readonly", true); // 添加readonly属性
				$("#userMailMsg").css('color', '#40bd45');
				$('#userMailMsg').text("");
			} else {
				$('#userMail').focus();
				$("#userMailMsg").css('color', 'red');
				$('#userMailMsg').text(data.msg);
			}
		}, "json");
	} else {
		$('#userMail').focus();
		$("#userMailMsg").css('color', 'red');
		$('#userMailMsg').text("邮箱格式错误");
	}
}

// 提交账户设置信息-修改邮箱
function submit_UserMail_Info_form() {
	var userMail = $('#userMail').val();
	var userPwd = $('#modifiUserMailDiv input[name=userPwd]').val();
	if (userMail != "" && userPwd != "") {
		$('#UserMail_Info_form input[name=userMail]').val(userMail);
		$('#UserMail_Info_form input[name=userPwd]').val(userPwd);
		// 设置提交状态
		$('#userMailMsg').css('color', '#40bd45');
		$('#userMailMsg').text("正在提交...");
		// 提交数据
		$.post(ctx + "/modifiUserMail.do", $('#UserMail_Info_form').serialize(), function(data) {
			if (data.success) {
				$('#userMailMsg').text(data.msg);
				$('#modifiUserMailDiv input[name=userPwd]').val("");
			} else {
				$('#userMailMsg').css('color', 'red');
				$('#userMailMsg').text(data.msg);
				return false;
			}
		}, "json");
	} else {
		$('#userMailMsg').css('color', 'red');
		$('#userMailMsg').text("请输入邮箱和密码");
	}
}

// 提交密码设置信息-检查密码格式
function check_newUserPwd() {
	var newUserPwd = $('#modifiUserPwdDiv input[name=newUserPwd]').val(); // 新密码
	if (/^[\@A-Za-z0-9\!\#\$\%\^\&\*\.\~]{6,20}$/.test(newUserPwd)) {
		return true;
	} else {
		$('#userPwdMsg').css('color', 'red');
		$('#userPwdMsg').text("请输入6 ~ 20 字符【0-9】【a-z-A-Z】【~!@#$%^&*.】");
		$('#modifiUserPwdDiv input[name=newUserPwd]').focus();
		return false;
	}
}

// 提交密码设置信息-修改密码
function submit_UserPwd_Info_form() {
	var userPwd = $('#modifiUserPwdDiv input[name=userPwd]').val(); // 现有密码
	var newUserPwd = $('#modifiUserPwdDiv input[name=newUserPwd]').val(); // 新密码
	var reUserPwd = $('#modifiUserPwdDiv input[name=reUserPwd]').val(); // 确认密码
	if (userPwd != "") {
		if (check_newUserPwd()) { // 新密码格式正确
			if (newUserPwd != "" || reUserPwd != "") {
				if (newUserPwd == reUserPwd) { // 新密码和确认密码一致
					$('#UserPwd_Info_form input[name=userPwd]').val(userPwd);
					$('#UserPwd_Info_form input[name=newUserPwd]').val(newUserPwd);
					// 设置提交状态
					$('#userPwdMsg').css('color', '#40bd45');
					$('#userPwdMsg').text("正在提交...");
					// 提交数据
					$.post(ctx + "/modifiUserPwd.do", $('#UserPwd_Info_form').serialize(), function(data) {
						if (data.success) {
							$('#userPwdMsg').text(data.msg);
							$('#modifiUserPwdDiv input[name=userPwd]').val("");
							$('#modifiUserPwdDiv input[name=newUserPwd]').val("");
							$('#modifiUserPwdDiv input[name=reUserPwd]').val("");
						} else {
							$('#userPwdMsg').css('color', 'red');
							$('#userPwdMsg').text(data.msg);
							return false;
						}
					}, "json");
				} else {
					$('#userPwdMsg').css('color', 'red');
					$('#userPwdMsg').text("新密码和确认密码不一致");
				}
			} else {
				$('#userPwdMsg').css('color', 'red');
				$('#userPwdMsg').text("新密码和确认密码不能为空");
			}
		}
	} else {
		$('#userPwdMsg').css('color', 'red');
		$('#userPwdMsg').text("请输入原密码");
	}
}

// 提交通知设置信息-修改通知项
function submit_Notification_Info_form() {

	var userMsgCfg = "";

	$("#userMsgCfgDiv input[type='checkbox']:checked").each(function() {
		userMsgCfg += $(this).val() + ",";
	});

	if (userMsgCfg.length > 0) {
		// 得到选中的checkbox值序列
		userMsgCfg = userMsgCfg.substring(0, userMsgCfg.length - 1);
	}

	$('#Notification_Info_form input[name=userMsgCfg]').val(userMsgCfg);

	// 设置提交状态
	$('#userMsgCfgMsg').css('color', '#40bd45');
	$('#userMsgCfgMsg').text("正在提交...");

	// 提交数据
	$.post(ctx + "/perfectionInfo.do", $('#Notification_Info_form').serialize(), function(data) {
		if (data.success) {
			$('#userMsgCfgMsg').text(data.msg);
		} else {
			$('#userMsgCfgMsg').css('color', 'red');
			$('#userMsgCfgMsg').text(data.msg);
			return false;
		}
	}, "json");
}

// 提交邮件设置信息-修改邮件通知选项
function submit_UserMailCfg_Info_form() {
	var userMailCfg;
	if ($('#userMailCfg').attr('checked') == undefined) { // 判断是否已经打勾
		userMailCfg = 0; // 不订阅
	} else {
		userMailCfg = 1;// 订阅
	}
	$('#UserMailCfg_Info_form input[name=userMailCfg]').val(userMailCfg);
	// 设置提交状态
	$('#userMailCfgMsg').css('color', '#40bd45');
	$('#userMailCfgMsg').text("正在提交...");

	// 提交数据
	$.post(ctx + "/perfectionInfo.do", $('#UserMailCfg_Info_form').serialize(), function(data) {
		if (data.success) {
			$('#userMailCfgMsg').text(data.msg);
		} else {
			$('#userMailCfgMsg').css('color', 'red');
			$('#userMailCfgMsg').text(data.msg);
			return false;
		}
	}, "json");
}
