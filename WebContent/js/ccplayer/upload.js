// 加载上传flash ------------- start
var swfobj = new SWFObject('http://union.bokecc.com/flash/api/uploader.swf', 'uploadswf', '80', '25', '8');
var vTechType;
$(function() {
	swfobj.addVariable("progress_interval", 1); // 上传进度通知间隔时长（单位：s）
	swfobj.addVariable("notify_url", $("#notify_url").val()); // 上传后回调接口
	swfobj.addParam('allowFullscreen', 'true');
	swfobj.addParam('allowScriptAccess', 'always');
	swfobj.addParam('wmode', 'transparent');
	swfobj.write('swfDiv');
	vTechType = $("#hivTechType").val()
	errortips = function(param) {
		var paramstr = $.trim($("#" + param).val());
		if (paramstr == null || paramstr.length == 0) {
			$("#" + param).focus();
			return false;
		}

		return true;
	};
	$('#vTechType').combotree({
		panelWidth : 180,
		panelHeight : 'auto',
		url : ctx + '/getCbtTechType.do',
		multiple : false,
		editable : false,
		value : vTechType,
		onSelect : function(data) {
			vTechType = data.id;
		}
	});
	$("#save").click(function(){
		if (!errortips("tag")) {
			return false;
		}
		if (!errortips("description")) {
			return false;
		}
		if (!errortips("title")) {
			return false;
		}
		var pram = {
				vId : $("#vId").val(),
				vName : $("#title").val(),
				vComment : $("#description").val(),
				vTechType : vTechType,
				vType : "2"
			};
			$.post("updateVideoInfo.do", pram, function(data) {
				$("#msg_font").html("基本信息保存成功");
			});
	});
});

// 加载上传flash ------------- end

// -------------------
// 调用者：flash
// 功能：选中上传文件，获取文件名函数
// 时间：2010-12-22
// 说明：用户可以加入相应逻辑
// -------------------
function on_spark_selected_file(filename) {
	$("#videofile").val(filename);
}

// -------------------
// 调用者：flash
// 功能：验证上传是否正常进行函数
// 时间：2010-12-22
// 说明：用户可以加入相应逻辑
// -------------------
function on_spark_upload_validated(status, videoid) {
	if (status == "OK") {
		$("#videoid").val(videoid);
		$("#submitvideo_message").html("已经开始上传，请稍后....");
		$("#uploadBtn").attr("disabled", "disabled");
	} else if (status == "NETWORK_ERROR") {
		alert("网络错误");
	} else {
		alert("api错误码：" + status);
	}
}

// -------------------
// 调用者：flash
// 功能：通知上传进度函数
// 时间：2010-12-22
// 说明：用户可以加入相应逻辑
// -------------------
function on_spark_upload_progress(progress) {
	$("#upload_progress").show();
	if (progress == 100) {
		$("#inner").css({
			width : "100%"
		});
		$("#upload_prompt").html("已上传100%");
		$("#submitvideo_message").html("上传完成");
		$("#uploadBtn").removeAttr("disabled");
		addCCVideoToMyResource();
	} else if (progress < 0) {
		$("#upload_prompt").html("上传发生错误，请稍后再试");
	} else if (progress < 100) {
		$("#upload_prompt").html("已上传" + progress + "%");
		$("#inner").css({
			width : progress + "%"
		});
	}
}

// 控制上传
function submitvideo() {
	// 重置上传提示
	//$("#upload_progress").hide();
	$("#inner").css({
		width : "0%"
	});
	$("#upload_message").html("");
	$("#upload_prompt").html("暂无");

	// 验证参数
	if (!errortips("tag")) {
		return false;
	}
	if (!errortips("description")) {
		return false;
	}
	if ($("#videofile").val() == null || $.trim($("#videofile").val()).length == 0) {
		$("#upload_message").html("请选择上传的文件");
		return false;
	}
	//	

	if ($("#title").val().length == 0) {
		$("#title").val($("#videofilename").val().substring(0, $("#videofilename").val().lastIndexOf(".")));
	}
	var title = encodeURIComponent($("#title").val(), "utf-8");
	var tag = encodeURIComponent($("#tag").val(), "utf-8");
	var description = encodeURIComponent($("#description").val(), "utf-8");
	var subCategory = $("#sub_supercategory");
	if ($("#supercategory") != null && subCategory == null) {
		$("#tips").html("<div style='color:red;'>一级分类不能添加，请重新选择</div>");
		return;
	}
	var url = "getuploadurl.do?title=" + title + "&tag=" + tag + "&description=" + description+"&vId="+$("#vId").val();

	if (subCategory != null) {
		url = url + "&categoryid=" + subCategory.val();
	}
	var req = getAjax();
	req.open("GET", url, true);
	req.onreadystatechange = function() {
		if (req.readyState == 4) {
			if (req.status == 200) {
				if ($("#vId").val() == "") {
					var pram = {
						vName : $("#title").val(),
						vComment : $("#description").val(),
						vType : "2"
					};
//					$.post("addVideoInfo.do", pram, function(data) {
//						var v = JSON.parse(data);
//						$("#vId").val(v.vId);
//					});
				}
				var re = req.responseText;// 获取返回的内容
				$("#uploadswf")[0].start_upload(re); // 调用flash上传函数
			}
		}
	};
	req.send(null);

}
function getAjax() {
	var oHttpReq = null;

	if (window.XMLHttpRequest) {
		oHttpReq = new XMLHttpRequest;
		if (oHttpReq.overrideMimeType) {
			oHttpReq.overrideMimeType("text/xml");
		}
	} else if (window.ActiveXObject) {
		try {
			oHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			oHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
		}
	} else if (window.createRequest) {
		oHttpReq = window.createRequest();
	} else {
		oHttpReq = new XMLHttpRequest();
	}

	return oHttpReq;
}

// 控制分类显示
showSub();
function show() {
	subCategorys = document.getElementsByName("sub_category");
	for (var i = 0; i < document.getElementsByName("sub_category").length; i++) {
		subCategorys[i].style.display = 'none';
	}
	showSub();
}

function showSub() {
	var superCategory = $("#supercategory").value;
	var subCategory = $("#sub_" + superCategory);
	if (subCategory != null) {
		subCategory.css("display", "inline");
		/* subCategory.style.display = 'inline'; */
	}
}

// 将上传好的加入到本地数据库
function addCCVideoToMyResource() {
	var pram = {
		vId : $("#vId").val(),
		vName : $("#title").val(),
		vComment : $("#description").val(),
		vTechType : vTechType,
		vFileName : $("#videofile").val(),
		vType : "2",
		vPlayUrl : $("#userId").val() + "&" + $("#videoid").val()
	};
	$.post("updateVideoInfo.do", pram, function(data) {
		
	});
}