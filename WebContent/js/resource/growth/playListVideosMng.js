/**
 * 视频管理
 * 
 * @author ding
 */
var video_datagrid;
var updThumb_dialog;
$(function() {
	$("#seach_vTypeId").combobox({
		panelHeight : '260px',
		editable : false,
		url : ctx + '/getCbbItemList.do?parentparamid=60',
		valueField : 'param_id',
		textField : 'param_name',
		value : ' '
	});

	$("#selectStatus").combobox({
		panelHeight : '260px',
		editable : false,
		url : ctx + '/getCbbItemList.do?parentparamid=64',
		valueField : 'param_id',
		textField : 'param_name',
		value : ' '
	});
	$('#selectTypeId').combotree({
		panelWidth : 180,
		panelHeight : 'auto',
		url : ctx + '/getCbtTechType.do',
		multiple : false,
		editable : false,
		value : "不限制"
	});
	// 视频表 DataGrid
	video_datagrid = $('#video_datagrid').datagrid({
		title : '视频资料',
		width : 1087,
		height : 450,
		nowrap : false,
		striped : true,
		url : ctx + '/getAllVideosByListId.do?listId=' + $("#listId").val(),
		remoteSort : false,
		pagination : true,
		rownumbers : true,
		fitColumns : true,
		idField : 'vId',
		singleSelect : true,
		columns : [ [ {
			field : 'vId',
			title : '编号',
			width : 70,
			align : 'center',
			hidden : true
		}, {
			field : 'vName',
			title : '名称',
			width : 200,
			align : 'center'
		}, {
			field : 'techTypeName',
			title : '所属分类',
			width : 90,
			align : 'center'
		}, {
			field : 'vPlayCount',
			title : '播放次数',
			width : 60,
			align : 'center',
			formatter : function(value, row, index) {
				if (value == null) {
					value = 0;
				}
				return value;
			}
		}, {
			field : 'vDownloadCount',
			title : '下载次数',
			width : 60,
			align : 'center',
			formatter : function(value, row, index) {
				if (value == null) {
					value = 0;
				}
				return value;
			}
		}, {
			field : 'vType',
			title : '资源位置',
			width : 70,
			align : 'center',
			formatter : function(value, row, index) {
				switch (parseInt(value)) {
				case 1:
					return "奇艺高清";
					break;
				case 2:
					return "CC云视频";
					break;
				case 3:
				case 4:
					return "系统资源库";
					break;
				default:
					return "未知";
					break;
				}
			}
		}, {
			field : 'vStatus',
			title : '当前状态',
			width : 70,
			align : 'center',
			formatter : function(value, row, index) {
				switch (parseInt(value)) {
				case 0:
					return "未发布";
					break;
				case 1:
					return "发布中";
					break;
				case 2:
					return "发布失败";
					break;
				case 3:
					return "已发布";
					break;
				default:
					return "未知状态";
					break;
				}
			}
		}, {
			field : 'vRegtime',
			title : '更新日期',
			width : 80,
			align : 'center'
		}, {
			field : 'cz',
			title : '操作',
			width : 120,
			align : 'center',
			formatter : function(value, row, index) {
				return '<a href="javascript:showPreView();" style="text-decoration:none;">预览</a>&nbsp;<a href="javascript:uploadImg();" style="text-decoration:none;">封面上传</a>&nbsp;<a href="javascript:deleteRecord();" style="text-decoration:none;">删除</a>';
			}
		} ] ],
		toolbar : [ {
			text : "返回",
			iconCls : 'icon-back',
			handler : function() {
				location.href = ctx + "/toMngGrowthDirectionVideo.do";
			}
		}, '-', {
			text : "添加新视频",
			iconCls : 'icon-add',
			handler : function() {
				openUploadNewVideo();
			}
		}, '-', {
			text : "选择资源视频",
			iconCls : 'icon-ok',
			handler : function() {
				choiseResourceVideos();
			}
		} ],
		onLoadSuccess : function(data) {
		}
	});
});
// 重置输入框
function resetForm() {
	$("#c_seach_vName").val("");
	$("#seach_vTypeId").combobox("setValue", "不限制");
	$('#selectStatus').combobox('setValue', ' ');
	$('#selectTypeId').combotree("setValue", "不限制");
	var pp = $('#video_datagrid').datagrid('options');
	pp.url = ctx + '/getAllVideosByListId.do?listId=' + $("#listId").val();
	$('#video_datagrid').datagrid("load");
}

// 查询数据
function search() {
	var seach_vTypeId = $.trim($("#seach_vTypeId").combobox("getValue"));
	var seach_vName = encodeURI(encodeURI($("#seach_vName").val()));
	var selectTypeId = $('#selectTypeId').combotree("getValue");
	var selectStatus = $.trim($('#selectStatus').combobox('getValue'));
	// init('?selectTypeId=' + selectTypeId + '&selectTitle=' + selectTitle
	// + '&selectKey=' + selectKey);
	var pp = $('#video_datagrid').datagrid('options');
	if (seach_vTypeId == "不限制") {
		seach_vTypeId = "";
	}
	pp.url = ctx + '/getAllVideosByListId.do?listId=' + $("#listId").val() + '&seach_vTypeId=' + seach_vTypeId + '&seach_vName=' + seach_vName + '&selectTypeId=' + selectTypeId + '&selectStatus=' + selectStatus;
	$('#video_datagrid').datagrid('load');

}

// 预览
function showPreView() {
	var selected = video_datagrid.datagrid("getSelected");
	if (selected) {
		window.open(ctx + '/toMediaPlayer.do?vid=1&tvId=' + selected.vId);
	}
}
// 删除视频资源
function deleteRecord() {
	var selected = video_datagrid.datagrid("getSelected");
	if (selected) {
		$.messager.confirm("提示", "确定删除栏目视频：" + selected.vName, function(r) {
			if (r) {
				var param = {
					lvId : selected.lvId
				};
				$.get(ctx + "/deleteListVideoByKey.do", param, function(json) {
					if (json.success) {
						$.messager.alert("提示", "删除栏目视频成功", "info");
						video_datagrid.datagrid("reload");
					} else {
						$.messager.alert("警告", "删除栏目视频发生未知错误", "warning");
						video_datagrid.datagrid("reload");
					}
				}, 'json').error(function() {
					$.messager.alert("错误", "服务器繁忙，请稍后重试", "error");
					video_datagrid.datagrid("reload");
				});
			}
		});
	}
}

function datagrid_reload() {
	$('#video_datagrid').datagrid("reload");
}
function choiseResourceVideos() {
	$("#c_seach_vTypeId").combobox({
		panelHeight : '260px',
		editable : false,
		url : ctx + '/getCbbItemList.do?parentparamid=60',
		valueField : 'param_id',
		textField : 'param_name',
		value : ' '
	});

	$("#c_selectStatus").combobox({
		panelHeight : '260px',
		editable : false,
		url : ctx + '/getCbbItemList.do?parentparamid=64',
		valueField : 'param_id',
		textField : 'param_name',
		value : ' '
	});
	$('#c_selectTypeId').combotree({
		panelWidth : 180,
		panelHeight : 'auto',
		url : ctx + '/getCbtTechType.do',
		multiple : false,
		editable : false,
		value : "不限制"
	});

	$('#choiseVideoTable').datagrid({
		title : '可选视频',
		width : 768,
		height : 450,
		nowrap : false,
		striped : true,
		url : ctx + '/getAllVideosNotByListId.do?listId=' + $("#listId").val(),
		remoteSort : false,
		pagination : true,
		rownumbers : true,
		fitColumns : true,
		idField : 'vId',
		singleSelect : true,
		columns : [ [ {
			field : 'vId',
			title : '编号',
			width : 70,
			align : 'center',
			hidden : true
		}, {
			field : 'vName',
			title : '名称',
			width : 100,
			align : 'center'
		}, {
			field : 'techTypeName',
			title : '所属分类',
			width : 70,
			align : 'center'
		}, {
			field : 'vType',
			title : '资源位置',
			width : 70,
			align : 'center',
			formatter : function(value, row, index) {
				switch (parseInt(value)) {
				case 1:
					return "奇艺高清";
					break;
				case 2:
					return "CC云视频";
					break;
				case 3:
				case 4:
					return "系统资源库";
					break;
				default:
					return "未知";
					break;
				}
			}
		}, {
			field : 'vStatus',
			title : '当前状态',
			width : 70,
			align : 'center',
			formatter : function(value, row, index) {
				switch (parseInt(value)) {
				case 0:
					return "未发布";
					break;
				case 1:
					return "发布中";
					break;
				case 2:
					return "发布失败";
					break;
				case 3:
					return "已发布";
					break;
				default:
					return "未知状态";
					break;
				}
			}
		}, {
			field : 'vRegtime',
			title : '更新日期',
			width : 80,
			align : 'center'
		} ] ]
	});
	$("#videoDiv").window({
		top : 30,
		left : 100
	});

	$("#videoDiv").window("open");
}
function doChoise() {
	var selected = $('#choiseVideoTable').datagrid("getSelected");
	if (selected) {
		$("#videoDiv").window("close");
		var param = {
			lvListId : $("#listId").val(),
			lvVideoId : selected.vId
		};
		$.post(ctx + "/addListVideoByKey.do", param, function(json) {
			if (json.success) {
				$.messager.alert("提示", "添加栏目视频成功", "info");
				video_datagrid.datagrid("reload");
			} else {
				$.messager.alert("警告", json.msg, "warning");
				video_datagrid.datagrid("reload");
			}
		}, 'json').error(function() {
			$.messager.alert("错误", "服务器繁忙，请稍后重试", "error");
			video_datagrid.datagrid("reload");
		});
	}
}
// 重置输入框
function sub_resetForm() {
	$("#c_seach_vName").val("");
	$("#c_seach_vTypeId").combobox("setValue", "不限制");
	$('#c_selectStatus').combobox('setValue', ' ');
	$('#c_selectTypeId').combotree("setValue", "不限制");
	var pp = $('#choiseVideoTable').datagrid('options');
	pp.url = ctx + '/getAllVideosNotByListId.do?listId=' + $("#listId").val();
	$('#choiseVideoTable').datagrid("load");
}

// 查询数据
function sub_search() {
	var seach_vTypeId = $.trim($("#c_seach_vTypeId").combobox("getValue"));
	var seach_vName = encodeURI(encodeURI($("#c_seach_vName").val()));
	var selectTypeId = $('#c_selectTypeId').combotree("getValue");
	var selectStatus = $.trim($('#c_selectStatus').combobox('getValue'));
	// init('?selectTypeId=' + selectTypeId + '&selectTitle=' + selectTitle
	// + '&selectKey=' + selectKey);
	var pp = $('#choiseVideoTable').datagrid('options');
	if (seach_vTypeId == "不限制") {
		seach_vTypeId = "";
	}
	if (selectTypeId == "不限制") {
		selectTypeId = "";
	}
	pp.url = ctx + '/getAllVideosNotByListId.do?listId=' + $("#listId").val() + '&seach_vTypeId=' + seach_vTypeId + '&seach_vName=' + seach_vName + '&selectTypeId=' + selectTypeId + '&selectStatus=' + selectStatus;
	$('#choiseVideoTable').datagrid('load');

}
var vTechType = undefined;
var red5Path;
function openUploadNewVideo() {
	red5Path = $("#red5Path").val();
	vTechType = undefined;
	$("#title").val("");
	$("#description").val("");
	$("#vFileName").val("");
	$("#vPlayUrl").val("");
	$("#uploadFileTr").hide();
	$('#vTechType').combotree({
		panelWidth : 180,
		panelHeight : 'auto',
		url : ctx + '/getCbtTechType.do',
		multiple : false,
		editable : false,
		value : vTechType,
		onSelect : function(data) {
			red5Path = $("#red5Path").val();
			var split = red5Path.substring(red5Path.length - 1);
			vTechType = data.id;
			if (data.attributes.techTypeParent != 0) {
				var tree = $('#vTechType').combotree("tree");
				var parentText = tree.tree("getParent", data.target).text;
				red5Path += parentText + split;
			}
			red5Path += data.text + split;
			$('#uploadvideoarea').uploadify('settings', 'formData', {
				path : red5Path
			});
		}
	});
	$("#submitvideo_message").html("");
	$("#uploadvideoarea").uploadify({
		multi : false,
		height : 28,
		width : 76,
		queueID : 'upload_pre',
		buttonText : '选择文件',
		swf : ctx + '/images/uploadify/uploadify.swf?ver=' + Math.random(),
		uploader : $("#red5Host").val() + '/FileUpload;jsessionid=' + sessionid,
		// uploader : ctx + '/videoFileUploadToResource.do;jsessionid=' +
		// sessionid,
		auto : true,
		fileSizeLimit : '512000KB',
		fileTypeExts : '*.flv; *.mp4;*.swf;',
		cancelImg : ctx + '/images/uploadify/uploadify-cancel.png',
		uploadLimit : 345,
		formData : {
			path : red5Path
		},
		onUploadStart : function(file) {
		},
		onUploadSuccess : function(file, data, response) {
			var json = JSON.parse(data);
			$("#vPlayUrl").val(json.affixUrl);
			$("#uploadFileSpan").html(file.name);
			$("#uploadFileTr").show();
			$("#pre_tr").hide();
			$("#submitvideo_message").css({
				color : "green"
			});
			$("#submitvideo_message").html("上传视频成功，请确认保存。");
		},
		onCancel : function() {
			$("#pre_tr").hide();
			$("#vFileName").val("");
			$("#submitvideo_message").html("请重新选择文件...");
		},
		onSelect : function(file) {
			$("#pre_tr").show();
			$("#vFileName").val(file.name);
			if ($("#title").val() == "") {
				$("#title").val(file.name.replace(file.type, ""));
			}
			$("#submitvideo_message").html("正在上传...");
		},
		onError : function() {
			$("#pre_tr").hide();
			$("#vFileName").val("");
			$("#title").val("");
			$("#submitvideo_message").html("系统繁忙...");
		}
	});
	$("#uploadDiv").window("open");
}
function deleteUploadFile() {
	try {
		$.post($("#red5Host").val() + "/DeleteUploadFileServlet", {
			fileUrl : $("#vPlayUrl").val()
		}, function(data) {
		});
	} catch (e) {

	}
	$("#uploadFileTr").hide();
	$("#vPlayUrl").val("");
	$("#submitvideo_message").html("");
}

function doAddNewResource() {
	$("#submitvideo_message").css({
		color : "red"
	});
	if ($("#title").val() == "") {
		$("#title").focus();
		$("#submitvideo_message").html("请输入视频名称");
		return;
	}
	if (vTechType == undefined) {
		$(".combo-arrow").click();
		$("#submitvideo_message").html("请选择视频分类");
		return;
	}
	if ($("#description").val() == "") {
		$("#description").focus();
		$("#submitvideo_message").html("请简要介绍视频");
		return;
	}
	if ($("#vPlayUrl").val() == "") {
		$("#submitvideo_message").html("选择文件上传");
		return;
	}
	$("#submitvideo_message").css({
		color : "green"
	});
	$("#submitvideo_message").html("正在提交....");
	var param = {
		vName : $("#title").val(),
		vComment : $("#description").val(),
		vType : "3",
		vTechType : vTechType,
		vStatus : "0",
		vPlayUrl : $("#vPlayUrl").val(),
		vFileName : $("#vFileName").val(),
		listId : $("#listId").val()
	};
	$("#uploadDiv").window("close");
	$.post(ctx + "/addPlayListVideo.do", param, function(json) {
		if (json.success) {
			$.messager.alert("提示", "添加栏目视频成功", "info");
			video_datagrid.datagrid("reload");
		} else {
			$.messager.alert("警告", json.msg, "warning");
			video_datagrid.datagrid("reload");
		}
	}, 'json').error(function() {
		$.messager.alert("错误", "服务器繁忙，请稍后重试", "error");
		video_datagrid.datagrid("reload");
	});
}

function closeUploadDiv() {
	if ($("#vPlayUrl").val() != "") {
		try {
			$.post($("#red5Host").val() + "/DeleteUploadFileServlet", {
				fileUrl : $("#vPlayUrl").val()
			}, function(data) {
			});
		} catch (e) {
		}
	}
	$("#uploadDiv").window("close");
}

function uploadImg() {
	var selected = video_datagrid.datagrid("getSelected");
	if (selected) {
		$("#lvId").val(selected.lvId);
		var imgUrl = selected.lvImg;
		updThumb_dialog = $('#updThumb_dialog').show().dialog({
			title : '上传视频封面',
			width : 800,
			height : 550,
			closed : false,
			cache : false,
			modal : true,
			buttons : [ {
				text : '关闭',
				handler : function() {
					updThumb_dialog.dialog('close');
				}
			} ]
		}).dialog('close');
		uploadThumb(ctx + "/" + imgUrl);
	}
}
function uploadThumb(url) {

	// ----------------------------------------初始化修改头像信息---------------------------------------------
	$("#thumbBox").html('<div id="altContent"></div>');
	var flashvars = {
		jsfunc : "uploadevent",
		pid : "75642723",
		imgUrl : url,
		uploadSrc : false,
		imgType : "png",
		showBrow : true,
		showCame : false,
		showColorAdj : false,
		uploadUrl : ctx + "/uploadListVideoThumb.do",
		pSize : "370|282|370|282"
	};

	var params = {
		menu : "false",
		scale : "noScale",
		allowFullscreen : "true",
		allowScriptAccess : "always",
		wmode : "transparent",
		uploadUrl : ctx + "/uploadListVideoThumb.do",
		bgcolor : "#FFFFFF"
	};

	var attributes = {
		id : "FaustCplus"
	};

	swfobject.embedSWF("swf/FaustCplus.swf", "altContent", "800", "450", "9.0.0", "expressInstall.swf", flashvars, params, attributes);
	// ----------------------------------------------END-----------------------------------------------------
	updThumb_dialog.dialog('open');
}
function uploadevent(data) {
	if (data == -1) {
		$('#lvImg').val("");
		updThumb_dialog.dialog('close');
		return;
	}
	var rsp = eval("(" + data + ")");
	$('#lvImg').val(rsp.url);
	switch (rsp.status + '') {
	case '1':
		if ($("#lvImg").val() != "") {
			$.post(ctx + "/updatePlayListVideo.do", {
				lvId : $("#lvId").val(),
				lvImg : $("#lvImg").val()
			}, function(json) {
				if (json.success) {
					$("#lvImg").val("");
					$("#lvId").val("");
					video_datagrid.datagrid("reload");
					updThumb_dialog.dialog('close');
					$.messager.alert('提示', "保存成功!");
				} else {
					$.messager.alert('系统异常', json.msg, 'warning');
				}
			}, "json").errror(function() {
				$.messager.alert('系统错误', '系统繁忙，请稍后重试.', 'error');
			});
		} else {
			$.messager.alert('系统异常', "请上传封面再提交", 'warning');
		}
		break;
	case '-2':
		$.messager.alert('提示', '保存失败，请稍后再试!');
		break;

	default:
		alert(typeof (status) + ' ' + status);
	}
}