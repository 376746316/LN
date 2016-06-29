//模块管理js

$(function() {
	init('');
	loadCbx_ModuleParent();
	loadCbx_ModuleIcon();
});

//	---->>初始化
function init(p) {
	p = encodeURI(encodeURI(p));
	$('#list_user')
			.datagrid(
					{
						title : '模块功能信息表',
						iconCls : 'icon-save',
						width : 'auto',
						height : '420',
						nowrap : false,
						singleSelect : true,
						striped : true,
						collapsible : true,
						url : ctx + '/getModule.do' + p,
						sortName : 'id',
						sortOrder : 'asc',
						remoteSort : false,
						idField : 'code',
						frozenColumns : [ [  {
							title : '模块功能编码',
							field : 'mdId',
							align : 'center',
							width : 80,
							sortable : true
						} ] ],
						columns : [[{
									title : '基本信息',
									colspan : 3
							    }], [ 
							         {
									field : 'iconUrl',
									title : '图标',
									width : 50,
									rowspan : 2,
									align : 'center',
									sortable : true,
									formatter : function(value, rec) {
										return '<img src="' + value + '" width="18px" height="18px" alt="ss"/>';
									}
								}, {
									field : 'mdName',
									title : '功能模块名称',
									width : 130,
									rowspan : 2,
									sortable : true,
									align : 'center',
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								} , {
									field : 'parentName',
									title : '父模块',
									width : 130,
									rowspan : 2,
									sortable : true,
									align : 'center',
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								},{
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
							text : '添加模块功能',
							iconCls : 'icon-add',
							handler : function() {
								openAdd('add'); 
							}
						} ]
					});
	var p = $('#list_user').datagrid('getPager');
	$(p).pagination({});
}

//加载所属付模块 from db
function loadCbx_ModuleParent(){
	
	$('#mdParent').combobox({
		required : false,
		panelHeight : '110px',
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/loadCbx_ModuleParent.do',
		textField:'mdName',
		valueField:'mdId'
	});
	
}
//加载icon from xml
function loadCbx_ModuleIcon(){
	
	$('#iconUrl').combobox({
		required : false,
		panelHeight : 160,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getIconCbx.do?parentparamid=51',
		valueField:'param_id',
		textField:'param_name',
		formatter : function(row) {
			return '<img src="' + row.param_name + '" width="18px" height="18px" alt="ss" />';
		},
		value: '1'	
	});
	
}


// 查询
function doSearch() {
	
	var s_mdName = $("#s_mdName").val();
	init('?s_mdName=' + s_mdName);
}

//清空表单
function doReset(fromid){
	$('#'+fromid).form('clear');

}

//关闭窗口
function doClose(winid){
	$("#"+winid).window('close');
}

//删除
function sureDelete() {
	$.messager.confirm('提示', '确认删除此条数据吗?', function(r) {
		if (r) {
			var selected = $('#list_user').datagrid('getSelected');
			if (selected) {
				location = ctx + "/deleteModule.do?mdId=" + selected.mdId;
			}
		}
	});
}

//显示添加修改窗口
function openAdd(type){
	//添加窗口清空form表单
	if(type=="add"){
		doReset('addform');
		$('#isUpdate').val('addModule.do');
		$('#user_add').window('open');
	}
	
}

//修改
function openEdit(){
	var selected = $('#list_user').datagrid('getSelected');
	if (selected) {
		$('#isUpdate').val('updateModule.do');
		$('#addform').form('load', selected);
		$('#user_add').window('open');
	}
}

//添加
function doAdd(){
	if($('#addform').form('validate')){
	var mdParent = $("#mdParent").combobox('getValue');
	if(mdParent.length==0){
		mdParent = null;
	}
	var mdId = $('#mdId').val();
	if($('#isUpdate').val()=="addModule.do"){
		//添加操作 mdId给null，数据库自增字段
		mdId = null;
	}
	var moduleObj = {
		mdId : mdId,
		urlHref : $("#urlHref").val(),
		mdName : $("#mdName").val(),
		iconUrl : $("#iconUrl").combobox('getValue'),
		mdParent : mdParent,
		mdIsLeaf : $("#mdIsLeaf").combobox('getValue')
		
	};	
	
	var param = new Object();
	param["json"] = JSON.stringify(moduleObj);
	
	$.post($('#isUpdate').val(), param, function(rsp) {
		
		if (rsp == "success") {
			
			$('#list_user').datagrid('reload');
			msgSlider('操作成功！');
		} else {
			msgSlider('操作失败！');
		}
	}).error(function() {
		msgSlider('操作失败！');
	}
	);
	$('#user_add').window('close');	
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

function remove() {
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('remove', node.target);
}

function collapse() {
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('collapse', node.target);
}

function expand() {
	var node = $('#tt2').tree('getSelected');
	$('#tt2').tree('expand', node.target);
}
