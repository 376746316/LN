if (window.opener) {
	var url = window.location.href;
	var str = url.match(/access_token=\w*&/);
	if (str.length > 0) {
		str[0] = str[0].replace(/access_token=(\w*)&/, '$1');
		window.opener.vcop.authtoken = str[0];
		window.close();
	}
}

var info = document.getElementById("show_info");
var btn = document.getElementById("choiseFile");
var btnstar = document.getElementById("divstartup");
var per = document.getElementById("percent");
var token = document.getElementById("token");
var page = document.getElementById("pageNum");
var pagecount = document.getElementById("pageCount");
var delfile = document.getElementById("delfileid");
var deltype = document.getElementById("deltype");
var retoken = document.getElementById("retoken");
var mgrurl = document.getElementById("mgrUrl");
var uid = document.getElementById("uid");
var appKey = document.getElementById("appKey");
var appSecret = document.getElementById("appSecret");
$("#show_info").hide();
var vcop = new Q.vcopClient({
	uploadBtn : {
		dom : btn,
		btnH : "32px",
		btnW : "62px",
		btnT : "100px",
		btnL : "100px",
		btnZ : "999",
		hasBind : false
	},
	appKey : appKey.value,
	appSecret : appSecret.value,
	managerUrl : "https://openapi.iqiyi.com/",
	uploadUrl : "http://qichuan.iqiyi.com/",
	needMeta : false
});
var fileinfo = {};
var _refresh = null;
var p = initUpload();
var vTechType;
$(function() {
	$('#vTechType').combotree({
		panelWidth : 180,
		panelHeight : 'auto',
		url : ctx + '/getCbtTechType.do',
		multiple : false,
		editable : false,
		value : "1",
		onSelect : function(data) {
			vTechType = data.id;
		}
	});
	if ($("#vId").val() != "") {
		$("#oldFileTr").show();
	}
});
// 8-28 服务器地址修改
function changeMgrUrl() {
	if (mgrurl.value) {
		vcop.resetApiUrl(mgrurl.value);
	}
}

// 8-27 获取版本号
function getVer() {
	info.innerHTML = vcop.getSDKVersion();
}

// 5-27 企业级授权
function getEntAuth() {
	vcop.getAuthEnterprise(function(data) {
		if (data) {
			info.innerHTML = JSON.stringify(data);
			vcop.authtoken = data.data.access_token;
			_refresh = data.data.refresh_token
			if (/msie/.test(navigator.userAgent.toLowerCase())) {
				initUpload();
			}

			if (uoploader) {
				uoploader.initOneFile({
					btnW : "100px",
					btnH : "100px",
					btnT : "100px",
					btnL : "12px"
				});
			}
		}
	});
}

// 8-06 个人授权
function getPerAuth() {
	vcop.getAuthPerson({
		uid : uid.value
	}, function(data) {
		if (data && data.data) {
			info.innerHTML = JSON.stringify(data);
			vcop.authtoken = data.data.access_token;
			_refresh = data.data.refresh_token
			if (/msie/.test(navigator.userAgent.toLowerCase())) {
				initUpload();
			}

			if (uoploader) {
				uoploader.initOneFile({
					btnW : "100px",
					btnH : "100px",
					btnT : "12px",
					btnL : "12px"
				});
			}
		}
	});
}

function refreshauth() {
	vcop.refreshToken({
		grant_type : 'refresh_token',
		refresh_token : retoken.value
	}, function(data) {
		if (!data.code !== 'A00000') {
			info.innerHTML = data.msg;
		} else {
			info.innerHTML = "authtoken:" + data.access_token + "<br/>refresh token:" + data.refresh_token
		}
	})
}

var uoploader = null; // 上传

function initUpload() {
	if (!vcop.authtoken) {
		getEntAuth();
	} else {
		uoploader = vcop.initUpload({
			access_token : vcop.authtoken,
			device_id : "test",
			uid : uid.value
		}, {
			onSuccess : function(data) {
				if (data && data.data) {
					$("#vFileName").val(uoploader.uploader.currentFile.name);
					$("#videofile").val(data.data.file_id);
					$("#uploadProgress").show();
					$("#startUploadBtn").show();
					fileinfo = data.data;
				}
			},
			onError : function(data) {
				$("#uploadBtn").hide();
				if (data && data.msg) {
					info.innerHTML = data.msg;
				} else {
					info.innerHTML = "网络错误";
				}
			}
		});
	}

}
errortips = function(param) {
	var paramstr = document.getElementById(param);
	if (paramstr.value == null || paramstr.value.length == 0) {
		paramstr.focus();
		return false;
	}

	return true;
};
function sartUpload() { // 20130819 需手工设置meta(调用setMeta函数),否则返回错误
	flag = insertVideoForDB("");
	if (flag) {
		setMeta();
		// 重置上传提示
		$("#upload_progress").hide();
		$("#inner").css({
			width : "0%"
		});
		$("#upload_message").html("");
		$("#upload_prompt").html("暂无");

		$("#uploadBtn").attr("disabled", "disabled");
		$("#upload_progress").show();
		uoploader.startUpload(fileinfo, {
			onFinish : function(data) {
				if (data && data.manualFinish === true) {
					uoploader.finishUpload({
						onSuccess : function() {
							$("#submitvideo_message").html("上传完成");
						},
						onError : function() {
							info.innerHTML = "上传失败";
						}
					});
				} else
					$("#submitvideo_message").html("上传完成");
				setTimeout(function() {
					resetPer();
				}, 600);
			},
			onError : function(data) {
				if (data.msg) {
					info.innerHTML = data.msg;
				} else {
					info.innerHTML = "上传失败";
				}

			},
			onProgress : function(data) { // 5/7 增加速度，剩余时间
				progress = data.percent;
				if (progress == 100) {
					$("#inner").css({
						width : "100%"
					});
					$("#upload_prompt").html("已上传100%");
					$("#submitvideo_message").html("上传完成");
					$("#uploadBtn").removeAttr("disabled");
					$("#startUploadBtn").hide();
					addVideoToMyResource();
				} else if (progress < 0) {
					$("#upload_prompt").html("上传发生错误，请稍后再试");
				} else if (progress < 100) {
					$("#upload_prompt").html("已上传" + progress + "%" + "，当前速度：" + data.speed + "kb/s , 剩余时间：" + data.remainTime + "s");
					$("#inner").css({
						width : progress + "%"
					});
				}
			}
		});
	} else {
		return;
	}
}

var breakdown = null;
function pauseUpload() {
	uoploader.pauseUpload(function(data) {
		breakdown = data;
	});
}

function resumeUpload() {
	uoploader.resumeUpload({
		onFinish : function(data) {
			uoploader.finishUpload({
				onSuccess : function() {
					info.innerHTML = "上传成功";
				},
				onError : function() {
					info.innerHTML = "上传失败";
				}
			});
			setTimeout(function() {
				resetPer();
			}, 600);
		},
		onError : function(data) {
			info.innerHTML = "上传失败";
		},
		onProgress : function(data) {
			per.style.width = data.percent + "%";
			info.innerHTML = "上传中....速度：" + data.speed + "kb/s , 剩余时间：" + data.remainTime + "s";
		}
	});
}

function startBreakPoint() {
	if (!breakdown) {
		return;
	}
	var breakfile = fileinfo;
	breakfile.thefile = uoploader.uploader.currentFile;
	breakfile.forstart = breakdown.realend;
	breakfile.handler = {
		onFinish : function(data) {
			uoploader.finishUpload({
				onSuccess : function() {
					info.innerHTML = "上传成功";
				},
				onError : function() {
					info.innerHTML = "上传失败";
				}
			});
			setTimeout(function() {
				resetPer();
			}, 600);
		},
		onError : function(data) {
			info.innerHTML = "上传失败";
		},
		onProgress : function(data) {
			per.style.width = data.percent + "%";
			info.innerHTML = "上传中....速度：" + data.speed + "kb/s , 剩余时间：" + data.remainTime + "s";
		}
	};
	uoploader.breakResume(breakfile);
}

function cancelUpload() {
	uoploader.cancelUpload({
		onSuccess : function(data) {
			info.innerHTML = "已取消";
			setTimeout(function() {
				resetPer();
			}, 600);
		},
		onError : function(data) {
			if (data && data.code)
				info.innerHTML = "取消失败";
			else
				info.innerHTML = "网络错误";
		}
	});
}

function setMeta() {
	vcop.setMetadata({
		file_id : fileinfo.file_id,
		file_name : $("#title").val(),
		description : $("#description").val(),
		tag : $("#tag").val(),
		file_type : "19",
		uploader : uoploader
	// 20130819 需手工设置meta
	}, function(data) {
		info.innerHTML = data.code;
	});
}

function getVedios() {
	vcop.getVideoInfo({
		file_ids : delfile.value !== "" ? delfile.value : ""
	}, function(data) {
		if (data)
			info.innerHTML = JSON.stringify(data);
	});
}

function getVideoCount() {
	vcop.getVideoCount({}, function(data) {
		if (data)
			info.innerHTML = JSON.stringify(data);
	});
}
function getDownloadUri() {
	vcop.getDownloadUri({
		file_id : delfile.value !== "" ? delfile.value : ""
	}, function(data) {
		if (data)
			info.innerHTML = JSON.stringify(data);
	});
}

function getStatus() { // 20130827 查状态
	vcop.getFileStatus({
		file_id : delfile.value !== "" ? delfile.value : ""
	}, function(data) {
		if (data)
			switch (data.code) {
			case "A00000":
				info.innerHTML = JSON.stringify(data);
				break;
			case "Q00001":
				info.innerHTML = "失败";
				break;
			case "A00001":
				info.innerHTML = "视频发布中";
				break;
			case "A00002":
				info.innerHTML = "视频审核失败";
				break;
			case "A00003":
				info.innerHTML = "视频不存在";
				break;
			case "A00004":
				info.innerHTML = "视频上传中";
				break;
			case "A00006":
				info.innerHTML = "用户取消上传";
				break;
			case "A00007":
				info.innerHTML = "视频发布失败";
				break;

			default:
				break;
			}
	});
}

function getVideosPage() {
	vcop.getVideoListPage({
		page_size : pagecount.value,
		page : page.value
	}, function(data) {
		if (data)
			info.innerHTML = JSON.stringify(data);
	});
}

function delFile() {
	vcop.delVideoById({
		delete_type : deltype.value,
		file_ids : delfile.value
	}, function(data) {
		if (data)
			info.innerHTML = JSON.stringify(data);
	});
}

function resetPer() {
	per.style.width = "0%";
	btnstar.style.display = "none";
	info.innerHTML = '';
	uoploader = null;
}

// 5-8
// ie下初始化页面的时候获取token，取得token后调用initUpload，返回uploader，调用uploader.initOneFile({位置})
window.onload = function() {
	if (/msie/.test(navigator.userAgent.toLowerCase())) {
		getEntAuth();
	}
};

// 将上传好的加入到本地数据库
function addVideoToMyResource() {
	var pram = {
		vId : $("#vId").val(),
		vName : $("#title").val(),
		vComment : $("#description").val(),
		vType : "1",
		vPlayUrl : $("#videofile").val()
	};
	$.post("updateVideoInfo.do", pram, function(data) {
		history.back();
	});
}
// 添加视频
function insertVideoForDB(obj) {
	// 验证参数
	if (!errortips("title")) {
		return false;
	}
	if (!errortips("description")) {
		return false;
	}
	if ($("#vId").val() == "") {
		var pram = {
			vName : $("#title").val(),
			vFileName : $("#vFileName").val(),
			vComment : $("#description").val(),
			vType : "1",
			vTechType : vTechType,
			vStatus : "0"
		};
		$.post("addVideoInfo.do", pram, function(data) {
			var v = JSON.parse(data);
			$("#vId").val(v.vId);
			if (obj != "") {
				$("#tip_message").show();
				$("#tip_message").html("增加视频基本信息成功");
			}
		});
	} else {
		var pram = {
			vName : $("#title").val(),
			vComment : $("#description").val(),
			vType : "1",
			vTechType : vTechType,
			vFileName : $("#vFileName").val(),
			vStatus : "0",
			vId : $("#vId").val()
		};
		$.post("updateVideoInfo.do", pram, function(data) {
			var v = JSON.parse(data);
			$("#vId").val(v.vId);
			if (obj != "") {
				$("#tip_message").show();
				$("#tip_message").html("更新视频基本信息成功");
			}
		});
	}
	return true;
}
function play() {
	window.open('toMediaPlayer.do?vid=1&tvId=' + $("#vId").val());
}