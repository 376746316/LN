var vTechType = 1;
var vType = 3;
var fileManager_dialog;
var red5Path;
$(function() {
	red5Path = $("#red5Path").val();
	fileManager_dialog = $('#fileManager_dialog').show().dialog({
		title : '浏览服务器资源',
		width : 600,
		height : 520,
		closed : false,
		cache : false,
		modal : true
	}).dialog('close');
	createUploadify();
	if ($("#vId").val() != "") {
		vTechType = $("#hiVTechType").val();
		vType = $("#vType").val();
		var downUrl = $("#hiVdownFileUrl").val();
		if (downUrl != "") {
			$("#oldFileTr").show();
		}
		// var end = downUrl.lastIndexOf("/") + 1;
		// var fileName = downUrl;
		// if (end != 0) {
		// fileName = downUrl.substring(end);
		// } else if (end == 0) {
		// end = downUrl.lastIndexOf("\\") + 1;
		// if (end != 0) {
		// fileName = downUrl.substring(end);
		// }
		// }
		// $("#oldvideofile").val(fileName);
	}
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
});

function createUploadify() {
	$("#uploadvideoarea").uploadify({
		auto : true,
		buttonText : '<input type="button" class="btn btn-primary"  value="选择文件"></input>',
		multi : false,
		height : 30,
		width : 110,
		queueID : 'upload_pre',
		fileTypeDesc : 'video Files',
		cancelImg : ctx + '/images/uploadify/uploadify-cancel.png',
		fileTypeExts : '*.mp4; *.flv; *.wmv; *.swf;',
		fileSizeLimit : (1024 * 1024) + 'KB',
		queueSizeLimit : 1,
		formData : {
			path : red5Path
		},
		fileObjName : 'storeImage',
		swf : ctx + '/images/uploadify/uploadify.swf',
		// uploader : ctx + '/videoFileUploadToResource.do',
		uploader : $("#red5Host").val() + '/FileUpload;jsessionid=' + sessionid,
		onUploadSuccess : function(file, data, response) {
			var json = JSON.parse(data);
			$("#uploadBtn").hide();
			$("#check_pre").hide();
			$("#pre_tr").hide();
			$("#oldFileTr").hide();
			$("#uploadFileTr").show();
			$("#uploadFileSpan").html(file.name);
			$("#vFileName").val(file.name);
			$("#hiVdownFileUrl").val("");
			$("#hiOldFileUrl").val(json.affixUrl);
			$("#sub_message").attr("style", "color:green");
			$("#sub_message").html("上传成功");
		},
		onCancel : function() {
			$("#videofile").val("");
			$("#uploadBtn").hide();
			$("#pre_tr").hide();
			$("#check_pre").hide();
		},
		onUploadError : function() {
			$("#sub_message").css("color", "red");
			$("#sub_message").html("服务器繁忙...");
			$("#videofile").val("");
			$("#uploadBtn").hide();
			$("#pre_tr").hide();
			$("#check_pre").hide();
		},
		onSelect : function(file) {
			if ($("#hiServiceFileUrl").val() != "") {
				cancleServiceR();
			}
			$("#videofile").val(file.name);
			$("#uploadBtn").show();
			$("#pre_tr").show();
			$("#check_pre").show();
		}
	});
}
errortips = function(param) {
	var paramstr = document.getElementById(param);
	if (paramstr.value == null || paramstr.value.length == 0) {
		paramstr.focus();
		return false;
	}

	return true;
};
function submitvideo() {

	if ($("#vId").val() == "") {
		addBaseInfo(false);
	} else {
		// 验证参数
		updateInfo(false);
	}

}
function addBaseInfo(flag) {
	if (!errortips("title")) {
		$("#sub_message").attr("style", "color:red");
		$("#sub_message").html("请填写标题");
		return false;
	}
	if (!errortips("description")) {
		$("#sub_message").attr("style", "color:red");
		$("#sub_message").html("请填写简介");
		return false;
	}
	var pram = {
		vName : $("#title").val(),
		vComment : $("#description").val(),
		vType : vType,
		vTechType : vTechType,
		vPlayUrl : $("#hiOldFileUrl").val(),
		vFileName : $("#vFileName").val(),
		vStatus : "0"
	};
	var vPlayUrl = $("#hiServiceFileUrl").val();
	if (vPlayUrl != "") {
		pram.vPlayUrl = vPlayUrl;
	}
	$("#sub_message").attr("style", "color:green");
	$("#sub_message").html("正在提交....");
	$.post(ctx + "/addVideoInfo.do", pram, function(data) {
		$("#sub_message").css({
			color : "green"
		});
		$("#sub_message").html("保存成功");
		$("#hiOldFileUrl").val("");
		$("#vId").val(data.video.vId);
	}, "json").error(function() {
		$("#sub_message").css("color", "red");
		$("#sub_message").html("服务器繁忙...");
	});
}
function updateInfo(flag) {
	if (!errortips("title")) {
		$("#sub_message").attr("style", "color:red");
		$("#sub_message").html("请填写标题");
		return false;
	}
	if (!errortips("description")) {
		$("#sub_message").attr("style", "color:red");
		$("#sub_message").html("请填写简介");
		return false;
	}
	var pram = {
		vName : $("#title").val(),
		vComment : $("#description").val(),
		vType : vType,
		vTechType : vTechType,
		vPlayUrl : $("#hiOldFileUrl").val(),
		vStatus : "0",
		vId : $("#vId").val()
	};
	var vPlayUrl = $("#hiServiceFileUrl").val();
	if (vPlayUrl != "") {
		pram.vPlayUrl = vPlayUrl;
	}
	$("#sub_message").attr("style", "color:green");
	$("#sub_message").html("正在提交...");
	$.post("updateVideoInfo.do", pram, function(data) {
		$("#sub_message").css("color", "green");
		$("#sub_message").html("保存成功");
		$("#hiOldFileUrl").val("");
	}, "json").error(function() {
		$("#sub_message").css("color", "red");
		$("#sub_message").html("服务器繁忙...");
	});
}
function startUpload() {
	if ($("#videofile").val() == null || $.trim($("#videofile").val()).length == 0) {
		$("#submitvideo_message").html("请选择上传的文件");
		return false;
	}
	vType = 3;
	if ($("#vId").val() == "") {
		addBaseInfo(true);
	} else {
		updateInfo(true);
	}
}
function choiseVideoResource(fileType) {
	if ($("#videofile").val() != "") {
		$('#uploadvideoarea').uploadify('cancel', '*');
	}
	var path = "";
	switch (fileType) {
	case 1:
		path = "";
		break;
	case 2:
		path = "";
		break;
	case 3:
		path = "red5";
		break;
	}
	$("#content").load(ctx + "/toFileManagerJsp.do", {
		fileType : fileType,
		path : path
	}, function() {
		loadSuccess();
		fileManager_dialog.dialog("open");
	});
}
function setSourcePath(path) {
	var downUrl = path;
	$("#hiServiceFileUrl").val(path);
	var end = downUrl.lastIndexOf("/") + 1;
	var fileName = downUrl;
	if (end != 0) {
		fileName = downUrl.substring(end);
	} else if (end == 0) {
		end = downUrl.lastIndexOf("\\") + 1;
		if (end != 0) {
			fileName = downUrl.substring(end);
		}
	}
	$("#servicevideofile").val(fileName);
	vType = 4;
	$("#serviceFileTr").show();
	if ($("#vId").val() == "") {
		addBaseInfo(false);
	} else {
		var pram = {
			vType : vType,
			vTechType : vTechType,
			vStatus : "0",
			vPlayUrl : path,
			vDownloadUrl : path,
			vId : $("#vId").val()
		};
		$.post("updateVideoInfo.do", pram, function(data) {
		});
	}
	fileManager_dialog.dialog("close");
}
function cancleServiceR() {
	vType = 3;
	var pram = {
		vType : vType,
		vTechType : vTechType,
		vStatus : "0",
		vPlayUrl : ""
	};
	$.post("updateVideoInfo.do", pram, function(data) {
		$("#serviceFileTr").hide();
		$("#hiServiceFileUrl").val("");
		$("#servicevideofile").val("");
		fileManager_dialog.dialog("close");
	});
}
function finished() {
	if ($("#hiOldFileUrl").val() != "") {
		$.post($("#red5Host").val() + "/DeleteUploadFileServlet", {
			fileUrl : $("#hiOldFileUrl").val()
		}, function(data) {
		});
	}
	location.href = ctx + "/toVideoMng.do";
}

function deleteUploadFile() {
	try {
		$.post($("#red5Host").val() + "/DeleteUploadFileServlet", {
			fileUrl : $("#hiOldFileUrl").val()
		}, function(data) {
		});
		var param = {
			vId : $("#vId").val(),
			vPlayUrl : "",
			vDownloadUrl : ""
		};
		$.post("updateVideoInfo.do", param, function(data) {
			$("#sub_message").attr("style", "color:green");
			$("#sub_message").html("删除成功，请重新上传");
			$("#uploadFileTr").hide();
		});
	} catch (e) {

	}
}
