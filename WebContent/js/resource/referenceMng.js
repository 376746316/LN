/**
 * 参考资料管理
 * 
 * @author Fly
 */
var reference_datagrid;// 参考资料表 DataGrid
var aeStateCombobox;// 考勤记录状态
var aeStateEditCombobox; // 考勤记录状态(修改界面)
var aeStateAddCombobox; // 考勤记录状态(新建界面)
var editRecord_dialog; // 考勤记录修改 dialog
var addRecord_dialog; // 新建 dialog
var updThumb_dialog; // 上传文件 dialog

function NewDate(dateStr) {
	var d = new Date();
	if (dateStr) {
		d.setFullYear(dateStr.substring(0, 4), dateStr.substring(5, 7) - 1,
				dateStr.substring(8, 10));
		d.setHours(dateStr.substring(11, 13), dateStr.substring(14, 16),
				dateStr.substring(17, 19), 0);
	}
	return d;
}
function formatDate(val) {
	if (val) {
		var d = NewDate(val);
		var h = "";
		var m = ":";
		if (d.getHours() < 10) {
			h = "0";
		}
		if (d.getMinutes() < 10) {
			m = ":0";
		}
		return h + d.getHours() + m + d.getMinutes();
	} else {
		return "";
	}
}

$(function() {

	// 参考资料表 DataGrid
	reference_datagrid = $('#reference_datagrid')
			.datagrid(
					{
						title : '参考资料',
						width : 1087,
						height : 366,
						nowrap : false,
						striped : true,
						url : ctx + '/getReferenceList.do',
						remoteSort : false,
						pagination : true,
						rownumbers : true,
						fitColumns : true,
						idField : 'refId',
						singleSelect : true,
						columns : [ [
								{
									field : 'refId',
									title : '编号',
									width : 70,
									align : 'center',
									hidden : true
								},
								{
									field : 'refName',
									title : '名称',
									width : 90,
									align : 'center'
								},
								{
									field : 'refPlayCount',
									title : '浏览次数',
									width : 90,
									align : 'center'
								},
								{
									field : 'refDownloadCount',
									title : '下载次数',
									width : 70,
									align : 'center'
								},
								{
									field : 'refCost',
									title : '费用',
									width : 70,
									align : 'center'
								},
								{
									field : 'refRegtime',
									title : '更新日期',
									width : 80,
									align : 'center',
									formatter : function(val) {
										return val.substring(0, 10);
									}
								},
								{
									field : 'cz',
									title : '操作',
									width : 80,
									align : 'center',
									formatter : function(value, row, index) {
										return '<a href="javascript:showPreView();" style="text-decoration:none;">预览</a>&nbsp;<a href="javascript:download();" style="text-decoration:none;">下载</a>&nbsp;<a href="javascript:editRecord();" style="text-decoration:none;">修改</a>&nbsp;<a href="javascript:deleteRecord();" style="text-decoration:none;">删除</a>';
									}
								} ] ],
						toolbar : [ {
							iconCls : 'icon-add',
							text : '新建',
							handler : function() {
								addRecord();
							}
						} ]
					});

	// 修改 dialog
	editRecord_dialog = $('#editRecord_dialog').show().dialog({
		title : '修改参考资料-基本信息',
		width : 500,
		height : 200,
		closed : false,
		cache : false,
		modal : true,
		buttons : [ {
			text : '下一步',
			handler : function() {
				$('#editRecordForm').form('submit', {
					success : function(data) {
						var data = eval('(' + data + ')');
						if (data.success) {
							editRecord_dialog.dialog('close');
							$('#editRecordForm').form('clear');
							initUp(data.refId, data.refThumb);
						}
					}
				});

			}
		}, {
			text : '取消',
			handler : function() {
				$('#editRecordForm').form('clear');
				editRecord_dialog.dialog('close');
			}
		} ],
		onClose : function() {
			$('div.validatebox-tip').remove();
		}
	}).dialog('close');

	// 新建考勤记录 dialog
	addRecord_dialog = $('#addRecord_dialog').show().dialog({
		title : '新建参考资料-基本信息',
		width : 500,
		height : 200,
		closed : false,
		cache : false,
		modal : true,
		buttons : [ {
			text : '下一步',
			handler : function() {
				$('#addRecordForm').form('submit', {
					success : function(data) {
						var data = eval('(' + data + ')');
						if (data.success) {
							addRecord_dialog.dialog('close');
							$('#addRecordForm').form('clear');
							initUp(data.refId, data.refThumb);
						}
					}
				});

			}
		}, {
			text : '取消',
			handler : function() {
				$('#addRecordForm').form('clear');
				addRecord_dialog.dialog('close');
			}
		} ],
		onClose : function() {
			$('div.validatebox-tip').remove();
		}
	}).dialog('close');

	// 上传文件
	updThumb_dialog = $('#updThumb_dialog').show().dialog({
		title : '上传文件及缩略图',
		width : 900,
		height : 550,
		closed : false,
		cache : false,
		modal : true,
		buttons : [ {
			text : '完成',
			handler : function() {
				reference_datagrid.datagrid('reload');
				updThumb_dialog.dialog('close');
			}
		} ]
	}).dialog('close');

});

function uploadevent(data) {
	if (data == -1) {
		return;
	}
	var rsp = eval("(" + data + ")");
	switch (rsp.status + '') {

	case '1':
		$.messager.alert('提示', "保存成功!");
		break;

	case '-2':
		$.messager.alert('提示', '保存失败，请稍后再试!');
		break;

	default:
		alert(typeof (status) + ' ' + status);
	}
}

// 【查询按钮】
function search() {
	var param = {
		refName : $.trim($('#searchForm input[name=refName]').val())
	};
	var startDate = $('#searchForm input[name=dateStart]').val();
	if (startDate != "") {
		param['startDate'] = startDate + " 00:00:00";
	}
	var endDate = $('#searchForm input[name=dateEnd]').val();
	if (endDate != "") {
		param['endDate'] = endDate + " 23:59:59";
	}
	if ($("#desc").attr("checked")) {
		param['desc'] = '1';
	}
	reference_datagrid.datagrid('load', param);
}

// 【重置按钮】
function resetForm() {
	$('#searchForm input').each(function() {
		$(this).val("");
	});
	$('#desc').removeAttr("checked");
	reference_datagrid.datagrid('load');
}

// 考勤记录修改
function editRecord() {
	var r = reference_datagrid.datagrid('getSelected');
	if (r) {
		$("#editRecordForm").form("load", r);
		editRecord_dialog.dialog('open');
	}
}

// 删除考勤记录
function deleteRecord() {
	$.messager.confirm('确认', '您确定要删除该条记录吗?', function(r) {
		if (r) {
			var r = reference_datagrid.datagrid('getSelected');
			$.post("delReference.do", {
				"refId" : r.refId
			}, function(d) {
				if (d.success) {
					$.messager.show({
						title : '提示',
						msg : "删除成功",
						timeout : 5000,
						showType : 'slide'
					});
					reference_datagrid.datagrid('reload');
				} else {
					$.messager.show({
						title : '提示',
						msg : "删除失败",
						timeout : 5000,
						showType : 'slide'
					});
				}
			}, "json").error(function() {
				$.messager.show({
					title : '提示',
					msg : "删除时发生错误",
					timeout : 5000,
					showType : 'slide'
				});
			});
		}
	});
}

// 新建考勤记录
function addRecord() {
	$('#addRecordForm').form('clear');
	// 默认考勤状态为“正常”
	$('#aeStatusAdd').val('01');
	addRecord_dialog.dialog('open');
}

// 清空表单方法
function clearForm(objE) {// objE为form表单
	$(objE).find(':input').each(function() {
		switch (this.type) {
		case 'passsword':
		case 'select-multiple':
		case 'select-one':
		case 'text':
		case 'textarea':
			$(this).val('');
			break;
		case 'checkbox':
		case 'radio':
			this.checked = false;
		}
	});
}

// 预览
function showPreView() {
	var selected = reference_datagrid.datagrid("getSelected");
	if (selected) {
		window.open('toMediaPlayer.do?videoUrl=' + selected.refPlayUrl);
	}
}

// 初始化上传
function initUp(refId, refThumb) {
	$("#uploadifyTD")
			.uploadify(
					{
						width : 120,
						height : 24,
						queueID : 'uploadQueueTD',
						multi : true,
						swf : ctx + '/images/uploadify/uploadify.swf',
						uploader : ctx + '/uploadReference.do;jsessionid='
								+ sessionid,
						auto : true,
						formData : {
							"refId" : refId
						},
						fileSizeLimit : '512000KB',
						fileTypeExts : '*.doc;*.docx; *.xls; *.xlsx;*.txt;*.sql;*.zip;*.rar;*.7z;*.ppt;*.pdf;',
						cancelImg : ctx
								+ '/images/uploadify/uploadify-cancel.png',
						uploadLimit : 10,
						onUploadSuccess : function(file, data, response) {
							$.messager.alert('提示', data);
							$('#reference_datagrid').datagrid('reload');

						},
						onQueueComplete : function(queueData) {
							$("#uploadWin").window('close');
						},
						onClearQueue : function(queueItemCount) {
							$("#uploadWin").window('close');
						}
					});

	// 更换选择文件按钮
	$('.uploadify-button').empty();
	$('.uploadify-button').append(
			'<a name="uploadify-lb" href="javascript:void(0)">选择参考资料</a>');
	$('.uploadify-button').removeClass();
	$('a[name="uploadify-lb"]').linkbutton();
	// ----------------------------------------初始化修改头像信息---------------------------------------------
	$("#thumbBox").html('<div id="altContent"></div>');
	var flashvars = {
		"jsfunc" : "uploadevent",
		"imgUrl" : refThumb,
		"pid" : "75642723",
		"uploadSrc" : true,
		"showBrow" : true,
		"showCame" : false,
		"uploadUrl" : "uploadRefThumb.do?refId=" + refId,
		"pSize" : "300|300|142|100"
	};

	var params = {
		menu : "false",
		scale : "noScale",
		allowFullscreen : "true",
		allowScriptAccess : "always",
		wmode : "transparent",
		uploadUrl : "uploadRefThumb.do?refId=" + refId,
		bgcolor : "#FFFFFF"
	};

	var attributes = {
		id : "FaustCplus"
	};

	swfobject.embedSWF("swf/FaustCplus.swf", "altContent", "600", "450",
			"9.0.0", "expressInstall.swf", flashvars, params, attributes);
	// ----------------------------------------------END-----------------------------------------------------
	updThumb_dialog.dialog('open');
}

//下载
function download() {
	var selected = reference_datagrid.datagrid("getSelected");
	if (selected) {
		location = ctx + "/download.do?fileurl=" + (selected.refDownloadUrl);
	}
}