//班级管理js

$(function() {
	$('#list_user')
			.datagrid(
					{
						title : '班级信息表',
						iconCls : 'icon-save',
						width : 'auto',
						height : '420',
						nowrap : false,
						striped : true,
						singleSelect : true,
						collapsible : true,
						url : ctx + '/getClassList.do',
						sortName : 'id',
						sortOrder : 'asc',
						remoteSort : false,
						idField : 'code',
						rownumbers : true,
						frozenColumns : [ [ {
							field : 'ck',
							checkbox : true
						}, {
							title : '班级编号',
							field : 'classId',
							align : 'center',
							width : 70,
							sortable : true
						} ] ],
						columns : [
								[ {
									title : '班级信息列表',
									colspan : 7
								} ],
								[
										{
											field : 'className',
											title : '班级名',
											width : 110,
											rowspan : 2,
											align : 'center',
											sortable : true,
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'classTechDirect',
											title : '技术方向',
											width : 110,
											hidden : true,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'classMajor',
											title : '技术方向',
											width : 110,
											hidden : true,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'orgId',
											title : '技术方向',
											width : 110,
											hidden : true,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'majorName',
											title : '所属专业',
											width : 110,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'classType',
											title : '班级类型',
											width : 80,
											rowspan : 2,
											sortable : true,
											hidden : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'classLinkMan',
											title : '联系人',
											width : 110,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'classLinkTel',
											title : '联系方式',
											width : 110,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'orgName',
											title : '所属学校(组织)',
											width : 180,
											rowspan : 2,
											sortable : true,
											align : 'center',
											sorter : function(a, b) {
												return (a > b ? 1 : -1);
											}
										},
										{
											field : 'opt',
											title : '操作',
											width : 120,
											align : 'center',
											rowspan : 4,
											formatter : function(value, rec) {
												return '<a href="javascript:openEdit();" style="text-decoration:none;">编辑</a>&nbsp;&nbsp;'
														+ '<a href="javascript:sureDelete();" style="text-decoration:none;">删除</a>';

											}
										} ] ],
						pagination : true,
						toolbar : [ {
							id : 'btnadd',
							text : '添加班级',
							iconCls : 'icon-add',
							handler : function() {
								openAdd('add');
							}
						}, '-', {
							id : 'btnExcel',
							text : '导入Excel',
							iconCls : 'icon-print',
							handler : function() {
								doEnter();
							}
						}, '-', {
							id : 'btnDownExcel',
							text : '模板下载',
							iconCls : 'icon-redo',
							handler : function() {
								doDownLoad();
							}
						} ]
					});
	loadCbx_classType();
	loadCbx_classSchool();
	loadCbx_classTechDir();
	loadCbx_classMajor();

	// ---->>初始化上传组件

});
function creatUploadfiy(classId, orgId, classMajor) {
	$("#stumngfileupload").uploadify({
		width : 85,
		height : 24,
		queueID : 'uploadQueue	',
		multi : false,
		swf : ctx + '/images/uploadify/uploadify.swf',
		auto : false,
		uploader : ctx + '/stumngupload.do;jsessionid=' + sessionid,
		formData : {
			classId : classId,
			orgId : orgId,
			classMajor : classMajor
		},
		fileSizeLimit : '512000KB',
		fileTypeExts : '*.*',
		cancelImg : ctx + '/images/uploadify/uploadify-cancel.png',
		uploadLimit : 1,
		onUploadSuccess : function(file, data, response) {
			$.messager.alert('提示', data, 'confirm');
		},
		onQueueComplete : function(queueData) {
			$("#uploadDiv").window('close');

		},
		onClearQueue : function(queueItemCount) {
			$("#uploadDiv").window('close');
		}
	});

	$('.uploadify-button').empty();
	$('.uploadify-button').append(
			'<a name="uploadify-lb" href="javascript:void(0)">选择文件</a>');
	$('.uploadify-button').removeClass();
	$('a[name="uploadify-lb"]').linkbutton();
}

// 查询
function doSearch() {
	$('#list_user').datagrid('load', {
		s_className : $("#s_className").val()
	});
}

// ---->> 班级类型 from xml
function loadCbx_classType() {

	$('#classType').combobox({
		required : false,
		panelHeight : 120,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getClassTypeCbx.do?parentparamid=7&required=true',
		valueField : 'param_id',
		textField : 'param_name',
		vaule : '1'
	});
}

// ---->> 所属组织学校 from db
function loadCbx_classSchool() {

	$('#orgId').combobox({
		required : true,
		panelHeight : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getClassOrgIdCbox.do',
		textField : 'orgName',
		valueField : 'orgId'
	});

}

// ---->> 学生技术方向 from xml
function loadCbx_classTechDir() {
	$('#classTechDirect').combobox({
		required : false,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getClassTechDirCbx.do?parentparamid=6',
		valueField : 'param_id',
		textField : 'param_name'
	});
}

// ---->> 班级专业 from db
function loadCbx_classMajor() {

	$('#classMajor').combobox({
		required : false,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url : ctx + '/getClassMajorCbx.do',
		valueField : 'majorCode',
		textField : 'majorName'
	});
}

// 清空表单
function doReset(fromid) {
	$('#' + fromid).form('clear');
	alert($('#upd_classId').val());

}

// 关闭窗口
function doClose(winid) {
	$("#" + winid).window('close');
}

// 删除
function sureDelete() {
	$.messager.confirm('提示', '确认删除此条数据吗?', function(r) {
		if (r) {
			var selected = $('#list_user').datagrid('getSelected');
			if (selected) {
				location = ctx + "/deleteClass.do?classId=" + selected.classId;
			}
		}
	});
}

// 显示添加
function openAdd(type) {
	// 添加窗口清空form表单
	if (type == "add") {
		clearForm($('#addform'));
		$('#isUpdate').val('addClass.do');
		$('#user_add').window('open');
	}
}

// 显示修改
function openEdit() {
	var selected = $('#list_user').datagrid('getSelected');
	if (selected) {
		$('#isUpdate').val('updateClass.do');
		$('#addform').form('load', selected);
		$('#upd_classId').val(selected.classId);
		$('#classTechDirect').combobox("select", selected.classTechDirect);
		$('#classType').combobox("select", selected.classType);
		
		$('#user_add').window('open');
	}
}
// 添加
function doAdd() {

	var classObj = {
		classId : null,
		className : $("#className").val(),
		classType : $("#classType").combobox('getValue'),

		classMajor : $("#classMajor").combobox('getValue'),
		classTechDirect : $("#classTechDirect").combobox('getValue'),

		classLinkMan : $("#classLinkMan").val(),
		classLinkTel : $("#classLinkTel").val(),

		classGrade : $("#classGrade").val(),
		orgId : $("#orgId").combobox('getValue')
	};

	var param = new Object();
	param["json"] = JSON.stringify(classObj);

	$.post($('#isUpdate').val(), param, function(rsp) {

		if (rsp == "success") {

			$('#list_user').datagrid('reload');
			msgSlider('操作成功！');
		} else {
			msgSlider('操作失败！');
		}
	}).error(function() {
		msgSlider('操作失败！');
	});
	$('#user_add').window('close');
}
function doUpd() {
	
	if ($('#addform').form('validate')) {
		
		var classId = $("#upd_classId").val();
		var classObj = {
			className : $("#className").val(),
			classType : $("#classType").combobox('getValue'),

			classMajor : $("#classMajor").combobox('getValue'),
			classTechDirect : $("#classTechDirect").combobox('getValue'),

			classLinkMan : $("#classLinkMan").val(),
			classLinkTel : $("#classLinkTel").val(),

			classGrade : $("#classGrade").val(),
			orgId : $("#orgId").combobox('getValue')
		};
		var url = 'addClass.do';
		if(
			$.trim(classId).length>0 ){
			url = 'updateClass.do';
			classObj['classId'] = classId;
		}
		
		var param = new Object();
		param["json"] = JSON.stringify(classObj);

		$.post(url, param, function(rsp) {

			if (rsp == "success") {

				$('#list_user').datagrid('reload');
				msgSlider('操作成功！');
			} else {
				msgSlider('操作失败！');
			}
		}).error(function() {
			msgSlider('操作失败！');
		});
		$('#list_user').datagrid('clearSelections');
		$('#user_add').window('close');
	}

}
// -->> 获取目录，及客户端的信息
function getRootPath() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName
			.substring(0, pathName.substr(1).indexOf('/') + 1);
	// projectName = ctx;
	return (localhostPaht + projectName);
}

// ---- >> 下载学生信息模板
function doDownLoad() {
	$.messager.confirm('警告', '下载后,请不要修改Excel模板任何格式,也不要在Excel中插入空行!',
			function(r) {
				if (r) {
					location = 'upload/stuInfo.xlsx';
				}
			});

}

// ----->> 导入信息
function doEnter() {
	var selected = $('#list_user').datagrid('getSelected');

	if (selected) {
		var classId = selected.classId;
		var orgId = selected.orgId;
		var classMajor = selected.classMajor;
		creatUploadfiy(classId, orgId, classMajor);
		$('#uploadDiv').window('open');
	} else {
		$.messager.alert('操作无效', '请至少选择一个班级，才可导入学生数据，请单击任意一个班级！', 'error');
	}

}

function msgSlider(message) {
	$.messager.show({
		title : '操作提示',
		msg : message,
		timeout : 1500,
		showType : 'slide'
	});
}

//清空表单方法
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
