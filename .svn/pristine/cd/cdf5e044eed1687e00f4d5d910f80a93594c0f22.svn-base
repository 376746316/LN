/**
 * 视频管理
 * 
 * @author ding
 */
var video_datagrid;

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
	vcop = new Q.vcopClient({
		appKey : $("#appKey").val(),
		appSecret : $("#appSecret").val(),
		managerUrl : "https://openapi.iqiyi.com/",
		uploadUrl : "http://qichuan.iqiyi.com/",
		needMeta : false
	});
	// 视频表 DataGrid
	video_datagrid = $('#video_datagrid').datagrid({
		title : '视频资料',
		width : 1087,
		height : 450,
		nowrap : false,
		striped : true,
		url : ctx + '/getVideoListByExample.do',
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
			width : 90,
			align : 'center'
		}, {
			field : 'techTypeName',
			title : '所属分类',
			width : 90,
			align : 'center'
		}, {
			field : 'vPlayCount',
			title : '播放次数',
			width : 90,
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
			width : 70,
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
			align : 'center'
		}, {
			field : 'vStatus',
			title : '当前状态',
			width : 70,
			align : 'center'
		/*
		 * formatter : function(value, row, index) { return
		 * formatterStatus(value, row, index); }
		 */
		}, {
			field : 'vRegtime',
			title : '更新日期',
			width : 80,
			align : 'center'
		}, {
			field : 'cz',
			title : '操作',
			width : 150,
			align : 'center',
			formatter : function(value, row, index) {
				return formatterOptions(value, row, index);
				// return '<a href="javascript:showPreView();"
				// style="text-decoration:none;">预览</a>&nbsp;<a
				// href="javascript:download();"
				// style="text-decoration:none;">下载</a>&nbsp;<a
				// href="javascript:editRecord();"
				// style="text-decoration:none;">修改</a>&nbsp;<a
				// href="javascript:deleteRecord();"
				// style="text-decoration:none;">删除</a>';
			}
		} ] ],
		toolbar : [ {
			id : 'btnadd',
			text : '新建视频',
			iconCls : 'icon-add',
			handler : function() {
				location.href = ctx + "/toUploadForResource.do";
			}
		} ],
		// toolbar : '#toolbar',
		onLoadSuccess : function(data) {
			getPerAuth();
		}
	});
});
// 重置输入框
function resetForm() {
	$("#searchForm")[0].reset();
	$("#seach_vTypeId").combobox("setValue", "不限制");
	$('#selectStatus').combobox('setValue', ' ');
	$('#selectTypeId').combotree("setValue", "不限制");
	var pp = $('#video_datagrid').datagrid('options');
	pp.url = ctx + '/getVideoListByExample.do';
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
	if ("不限制" == selectStatus) {
		selectStatus = "";
	}
	pp.url = ctx + '/getVideoListByExample.do?seach_vTypeId=' + seach_vTypeId + '&seach_vName=' + seach_vName + '&selectTypeId=' + selectTypeId + '&selectStatus=' + selectStatus;
	$('#video_datagrid').datagrid('load');

}

// 预览
function showPreView() {
	var selected = video_datagrid.datagrid("getSelected");
	if (selected) {
		window.open('toMediaPlayer.do?vid=1&tvId=' + selected.vId);
	}
}

// 下载
function download() {
	var selected = video_datagrid.datagrid("getSelected");
	if (selected) {
		location = ctx + "/download.do?fileurl=" + (selected.vDownloadUrl);
	}
}

// 添加视频资源
function addVideoResource(type) {
	switch (type) {
	case "1":
		location.href = ctx + "/toUploadForIQiYi.do";
		break;
	case "2":
		location.href = ctx + "/toUploadForCCPlayer.do";
		break;
	case "3":
		location.href = ctx + "/toUploadForResource.do";
		break;

	default:
		break;
	}
}

// 修改视频资源
function editRecord() {
	var selected = video_datagrid.datagrid("getSelected");
	if (selected) {
		var type = selected.vType;
		switch (type) {
		case "奇艺高清":
			location.href = ctx + "/toUploadForIQiYi.do?vId=" + selected.vId;
			break;
		case "CC云视频":
			location.href = ctx + "/toUploadForCCPlayer.do?vId=" + selected.vId;
			break;
		case "系统资源视频":
		case "服务器资源视频":
			location.href = ctx + "/toUploadForResource.do?vId=" + selected.vId;
			break;

		default:
			break;
		}
	}
}
// 删除视频资源
function deleteRecord() {
	var selected = video_datagrid.datagrid("getSelected");
	if (selected) {
		var type = selected.vType;
		switch (type) {
		case "奇艺高清":
			break;
		case "CC云视频":
			var url = selected.vPlayUrl;
			var videoId = url.split("&")[1];
			deletevideo(videoId, selected.vId);
			break;
		case "系统资源视频":
			$.messager.confirm("提示", "确定删除" + selected.vName, function(r) {
				if (r) {
					try {
						$.post($("#red5Host").val() + "/DeleteUploadFileServlet", {
							fileUrl : selected.vPlayUrl
						}, function(data) {
							// console.log(data);
						});
						var param = {
							vId : selected.vId
						};
						$.get(ctx+"/deleteVideoInfo.do", param, function(data) {
							if (data == "success") {
								$.messager.alert("提示", "删除视频成功", "info");
								video_datagrid.datagrid("reload");
							}
						});
					} catch (e) {

					}
				}
			});
			break;

		default:
			break;
		}
	}
}

// 删除远程服务器资源
function deletevideo(videoId, vId) {
	var url = ctx + "/deleteCCVideo.do?videoid=" + videoId;
	var req = getAjax();
	req.open("GET", url, true);
	req.onreadystatechange = function() {
		if (req.readyState == 4) {
			if (req.status == 200) {
				$.get(ctx+"/deleteVideoInfo.do", {
					vId : vId
				}, function(data) {
					if (data == "success") {
						$.messager.alert("信息", "删除视频成功", "info");
						datagrid_reload();
					}
				}).error(function() {
					$.messager.alert("错误", "服务器繁忙，稍后再试", "error");
				});
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

function datagrid_reload() {
	$('#video_datagrid').datagrid("reload");
}

// iqiyi视频管理
var vcop;

// 企业授权
function getPerAuth() {
	vcop.getAuthEnterprise(function(data) {
		if (data) {
			vcop.authtoken = data.data.access_token;
		}
	});
}

// 格式化状态单元格
function formatterStatus(value, row, index) {
	var reault = '<font color="green">已成功发布</font>';
	if (row.vType == "奇艺高清") {
		var file_id = row.vPlayUrl;
		if (file_id.indexOf("http://") == -1) {
			reault = '<font color="red">未发布</font>';
		}
	}
	return reault;
}
// 格式化操作单元格
function formatterOptions(value, row, index) {
	var reault = '<a href="javascript:showPreView();" style="text-decoration:none;">预览</a>&nbsp;';
	// if (row.vType == "奇艺高清") {
	// var file_id = row.vPlayUrl;
	// if (file_id.indexOf("http://") == -1) {
	// reault = '<a href="javascript:publishVideo();"
	// style="text-decoration:none;">发布视频</a>&nbsp;<a
	// href="javascript:download();"
	// style="text-decoration:none;">下载</a>&nbsp;<a
	// href="javascript:editRecord();"
	// style="text-decoration:none;">修改</a>&nbsp;<a
	// href="javascript:deleteRecord();" style="text-decoration:none;">删除</a>';
	// }
	// }
	var status = row.vStatus;
	switch (status) {
	case "未发布":
		reault += '<a href="javascript:publishVideo();" style="text-decoration:none;">发布视频</a>&nbsp;<a href="javascript:editRecord();" style="text-decoration:none;">修改</a>';
		break;
	case "发布中":
		reault += '<a href="javascript:publishVideo();" style="text-decoration:none;">重新发布</a>&nbsp;<a href="javascript:editRecord();" style="text-decoration:none;">修改</a>';
		break;
	case "发布失败":
		reault += '<a href="javascript:publishVideo();" style="text-decoration:none;">重新发布</a>&nbsp;<a href="javascript:editRecord();" style="text-decoration:none;">修改</a>';
		break;
	case "已发布":
		reault += '<a href="javascript:download();" style="text-decoration:none;">下载</a>';
		break;
	}
	reault += '&nbsp;<a href="javascript:deleteRecord();" style="text-decoration:none;">删除</a>';
	return reault;
}

// 发布奇艺视频
function publishVideo() {
	var selected = $('#video_datagrid').datagrid("getSelected");
	if (selected) {
		var type = selected.vType;
		switch (type) {
		case "奇艺高清":
			vcop.getFileStatus({
				file_id : selected.vPlayUrl
			}, function(data) {
				if (data)
					switch (data.code) {
					case "A00000":
						var pram = {
							vId : selected.vId,
							vName : selected.vName,
							vComment : selected.vComment,
							vType : "1",
							vPlayUrl : data.data.swfurl,
							vStatus : "3"
						};
						$.post("updateVideoInfo.do", pram, function(data) {
							alert("已成功发布");
						});
						break;
					case "Q00001":
						alert("失败");
						break;
					case "A00001":
						alert("视频发布中");
						break;
					case "A00002":
						alert("视频审核失败");
						break;
					case "A00003":
						alert("视频不存在");
						break;
					case "A00004":
						alert("视频上传中");
						break;
					case "A00006":
						alert("用户取消上传");
						break;
					case "A00007":
						alert("视频发布失败");
						break;
					}
				datagrid_reload();
			});
			break;
		case "CC云视频":
			var pram = {
				vId : selected.vId,
				vName : selected.vName,
				vComment : selected.vComment,
				vStatus : "3"
			};
			$.post("updateVideoInfo.do", pram, function(data) {
				alert("已成功发布");
			});
			break;
		case "系统资源视频":
			$("#publish_div").show();
			vPlayUrl = selected.vPlayUrl;
			publish_dialog = $('#publish_div').dialog({
				title : '发布视频到',
				width : 200,
				height : 150,
				closed : false,
				cache : false,
				modal : true,
				onOpen : function() {
					var publish_check = $("input[name='publish']:checked");
					$.each(publish_check, function(i) {
						$(this).removeAttr("checked");
					});
				},
				buttons : [ {
					text : '发布',
					handler : function() {
						var publish_check = $("input[name='publish']:checked");
						if (publish_check.length == 0) {
							$("#msg_tip").css({
								color : "red"
							});
							$("#msg_tip").html("请至少选择一个平台进行发布。");
							setTimeout('$("#msg_tip").html("")', 3000);
							return;
						}
						$.each(publish_check, function(i) {
							if ($(this).val() == 1) {
								publishToIqiyi(vPlayUrl, selected.vId);
							} else {
								publishToBokecc(selected);
							}
							publish_dialog.dialog('close');
						});
						$('#video_datagrid').datagrid("reload");
					}
				}, {
					text : '取消',
					handler : function() {
						publish_dialog.dialog('close');
					}
				} ]
			}).dialog('open');
			break;

		default:
			break;
		}
	}
}
function publishToIqiyi(vPlayUrl, vId) {
	$.messager.show({
		title : '提示',
		msg : '发布到i奇艺视频功能请等待',
		timeout : 3000,
		showType : 'slide'
	});
}
function publishToBokecc(opt) {
	$.post(ctx + "/updateVideoInfo.do", {
		vId : opt.vId,
		vStatus : "1"
	}, function(map) {
		$.post($("#red5Host").val() + "/PublishCCServlet", {
			fileUrl : opt.vPlayUrl,
			title : opt.vName,
			tags : opt.techTypeName,
			desc : opt.vComment,
			callbackUrl : ctx + "/publishCCCallback_" + opt.vId + ".do"
		}, function(data) {

		}, 'json');
		$.messager.alert("发布提示", "视频发布中，请等待服务器处理，处理时间大概是视频时长的1.5~2倍(根据网络状况可能不同)。", "info");
	}, 'json');

}