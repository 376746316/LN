$(function() {
	var hidareaCode = $("#hidareaCode").val();
	var warn = $("#hidwarn").val();
	if($.trim(hidareaCode).length>0){
		hidareaCode="";
		$('#user_update').window('open');
	}else if($.trim(warn).length>0){
		showwarn(warn);
		init('');
	}else{
		init('');
	}
	
});

function showwarn(message){
	$.messager.show({
		title:'操作提示',
		msg:message,
		timeout:5000,
		showType:'slide'
	});
}

function init(param) {
	$('#list_area')
			.datagrid(
					{
						title : '地区信息列表',
						iconCls : 'icon-save',
						width : 'auto',
						height : 'auto',
						nowrap : false,
						striped : true,
						collapsible : true,
						url : ctx + '/getAreagriddata.do' + param,
						sortName : 'areaCode',
						sortOrder : 'asc',
						remoteSort : false,
						idField : 'areaCode',
						frozenColumns : [ [ {
							field : 'ck',
							checkbox : true
						}, {
							title : '地区编号',
							field : 'areaCode',
							width : 70,
							sortable : true
						} ] ],
						columns : [
								[
										{
											field : 'areaName',
											title : '地区名',
											width : 100
										},
										{
											field : 'areaParentName',
											title : '上级地区名',
											width : 100
										},
										{
											field : 'areaStatus',
											
											title : '启/停状态',
											width : 100
										},
										{
											field : 'opt',
											title : '操作',
											width : 120,
											align : 'center',
											formatter : function(value, rec) {
												return '<a href="javascript:updateinit();" style="text-decoration:none;">修改</a>&nbsp;&nbsp;<a href="javascript:doDtl();" style="text-decoration:none;">详细</a>&nbsp;&nbsp;<a href="javascript:doDelete();" style="text-decoration:none;">删除</a>';
											}
										} ] ],
						pagination : true,
						pagination : true,
						toolbar : [ {
							id : 'btnadd',
							text : '添加地区',
							iconCls : 'icon-add',
							handler : function() {
								insinit();
							}
						}],
						rownumbers : true
					});
	var p = $('#list_area').datagrid('getPager');
	$(p).pagination({

	});
}
//查询
function doSearch() {
	var selareaCode = $('#selareaCode').val();
	var selareaName = $('#selareaName').val();
	var selareaStatus = $('#selareaStatus').combobox('getValue');
	var url="";
	if($.trim(selareaCode).length>0){
		if($.trim(url).length>0){
			url="&selareaCode="+selareaCode;
		}else{
			url="?selareaCode="+selareaCode;
		}
	}
	if($.trim(selareaName).length>0){
		selareaName =encodeURI(encodeURI(selareaName));
		if($.trim(url).length>0){
			url="&selareaName="+selareaName;
		}else{
			url="?selareaName="+selareaName;
		}
	}
	if($.trim(selareaStatus).length>0){
		if($.trim(url).length>0){
			url="&selareaStatus="+selareaStatus;
		}else{
			url="?selareaStatus="+selareaStatus;
		}
	}
	init(url);
}

//Load ComboBox cbbQaTypeS
$(function() {
	$('#selareaStatus').combobox({
		panelHeight : '200px',
		editable : false,
		url : ctx + '/getselareaStatusItemList.do',
		valueField : 'param_id',
		textField : 'param_name',
		value : ' '
	});
});

//点击新建
function insinit(){
	$('#user_insert').window('open');
}
//关闭修改窗口
function doInsClose(){
	$("#user_insert").window('close');
	init('');
}
//Load ComboBox cbbQaTypeS
$(function() {
	$('#insareaStatus').combobox({
		panelHeight : '200px',
		editable : false,
		url : ctx + '/getselareaStatusItemList.do',
		valueField : 'param_id',
		textField : 'param_name',
		value : $("#hidareaStatus").val()
	});
});
//关闭窗口
function doInsert(){
	//获取地区的编号
	var insareaCode = $("#insareaCode").val();
	//获取地区的名称
	var insareaName = $("#insareaName").val();
	//获取上级地区编号
	var insareaParent = $("#insareaParent").val();
	//获取启/停状态
	var insareaStatus = $('#insareaStatus').combobox('getValue');
	if (insareaName == null || insareaName=="") {
		alert("地区名称不能为空！");
	} else if (insareaStatus == null || insareaStatus == "") {
		alert("启/停状态不能为空！");
	} else {
		$("#user_insert").window('close');
		insareaName = encodeURI(encodeURI(insareaName));
		url="insertSave.do?insareaCode="+insareaCode+"&insareaName="+insareaName+"&insareaStatus="+insareaStatus;
		if(insareaParent == null || $.trim(insareaParent).length>0){
			url = url+"&insareaParent="+insareaParent;
		}
		location=url;
	}
}
//点击修改
function updateinit(){
	//获取选中DataGride数据的JQuery对象
	var selected = $('#list_area').datagrid('getSelected');
	//判断DataGride数据是否被选中，如果为真，则在DataGride下方添加一条修改数据框，并给相应数据项赋值，否则弹出提示对话框
	if (selected){
		//获取地区编号
		var areaCodeupd = selected.areaCode;
		location = ctx+"/updateinit.do?areaCodeupd="+areaCodeupd;
	}else{
		//未选中数据，弹出提示对话框
		alert("请选择数据");
	}
}
//Load ComboBox cbbQaTypeS
$(function() {
	$('#updareaStatus').combobox({
		panelHeight : '200px',
		editable : false,
		url : ctx + '/getselareaStatusItemList.do',
		valueField : 'param_id',
		textField : 'param_name',
		value : $("#hidareaStatus").val()
	});
});
//关闭修改窗口
function doClose(){
	$("#user_update").window('close');
	init('');
}
//关闭窗口
function doUpdate(){
	//获取地区的编号
	var updareaCode = $("#updareaCode").val();
	//获取地区的名称
	var updareaName = $("#updareaName").val();
	//获取上级地区编号
	var updareaParent = $("#updareaParent").val();
	//获取启/停状态
	var updareaStatus = $('#updareaStatus').combobox('getValue');
	if (updareaName == null || updareaName=="") {
		alert("地区名称不能为空！");
	} else if (updareaStatus == null || updareaStatus == "") {
		alert("启/停状态不能为空！");
	} else {
		$("#user_update").window('close');
		updareaName = encodeURI(encodeURI(updareaName));
		//var opts= $("#updform").form('options');
		//alert(opts.action);
		//alert($("#updform").form('action'));
		//$("#updform").action="updateSave.do?updareaCode="+updareaCode+"&updareaName="+updareaName+"&updareaParent="+updareaParent+"&updareaStatus="+updareaStatus;
		//alert($("#updform").action);
		//所有校验的数据项都不为空，则提交
		//$("#updform").form('submit');
		url="updateSave.do?updareaCode="+updareaCode+"&updareaName="+updareaName+"&updareaStatus="+updareaStatus;
		if(updareaParent == null || $.trim(updareaParent).length>0){
			url = url+"&updareaParent="+updareaParent;
		}
		location=url;
	}
}

//点击删除
function doDelete(){
	//获取选中DataGride数据的JQuery对象
	var selected = $('#list_area').datagrid('getSelected');
	//判断DataGride数据是否被选中，如果为真，则在DataGride下方添加一条修改数据框，并给相应数据项赋值，否则弹出提示对话框
	if (selected){
		//获取地区编号
		var areaCode = selected.areaCode;
		location = ctx+"/deleteSave.do?areaCode="+areaCode;
	}else{
		//未选中数据，弹出提示对话框
		alert("请选择数据");
	}
}

//点击详细
function doDtl(){
	//获取选中DataGride数据的JQuery对象
	var selected = $('#list_area').datagrid('getSelected');
	//判断DataGride数据是否被选中，如果为真，则在DataGride下方添加一条修改数据框，并给相应数据项赋值，否则弹出提示对话框
	if (selected){
		//获取地区编号
		var areaCode = selected.areaCode;
		var areaName = selected.areaName;
		var areaParentName = selected.areaParentName;
		var areaStatus = selected.areaStatus;
		$("#dtlareaCode").html(areaCode);
		$("#dtlareaName").html(areaName);
		$("#dtlareaParentName").html(areaParentName);
		$("#dtlareaStatus").html(areaStatus);
		$('#user_detail').window('open');
	}else{
		//未选中数据，弹出提示对话框
		alert("请选择数据");
	}
}
//关闭详细窗口
function doDtlClose(){
	$("#user_detail").window('close');
	init('');
}