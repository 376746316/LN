//专业管理js

$(function() {
	init('');
	loadCbx_MajorStatus();
	loadCbx_MajorParent();
});

//	---->>初始化
function init(p) {
	p = encodeURI(encodeURI(p));
	$('#list_user')
			.datagrid(
					{
						title : '专业信息表',
						iconCls : 'icon-save',
						width : 'auto',
						height : 'auto',
						nowrap : false,
						striped : true,
						collapsible : true,
						url : ctx + '/getMajorList.do' + p,
						sortName : 'id',
						sortOrder : 'asc',
						remoteSort : false,
						idField : 'code',
						frozenColumns : [ [  {
							title : '专业编码',
							field : 'majorCode',
							align : 'center',
							width : 120,
							sortable : true
						} ] ],
						columns : [[{
									title : '基本信息',
									colspan : 3
							    }], [ 
							         {
									field : 'majorName',
									title : '专业名称',
									width : 210,
									rowspan : 2,
									align : 'center',
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'majorParentName',
									title : '所属专业',
									width : 210,
									rowspan : 2,
									sortable : true,
									align : 'center',
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								} , {
									field : 'majorStatus',
									title : '启用状态',
									width : 80,
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
										return '<span style="color:red"><a href="javascript:sureDelete();" style="text-decoration:none;">删除</a></span>';
										
									}
								} ] ],
						pagination : true,
						toolbar : [ {
							id : 'btnadd',
							text : '添加专业',
							iconCls : 'icon-add',
							handler : function() {
								openAdd('add'); 
							}
						}, '-', {
							id : 'btnsave',
							text : '详细信息',
							iconCls : 'icon-search',
							handler : function() {
								 doMore(); 
							}
						} ]
					});
	var p = $('#list_user').datagrid('getPager');
	$(p).pagination({});
}

function loadCbx_MajorParent(){

	$('#ad_majorParent').combobox({
		required : false,
		panelHeight : '110px',
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getMajorParentCbox.do',
		textField:'majorName',
		valueField:'majorCode'
	});
	
}


//	---->> 	加载下拉框（启用状态）
function loadCbx_MajorStatus(){
	
	$('#ad_majorStatus').combobox({
		required : false,
		panelHeight : '110px',
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getMajorStatusCbox.do?parentparamid=50',
		valueField:'param_id',
		textField:'param_name',
		value:'1'
	});
	$('#ad_majorStatus').combobox('select', '1');
}

// 查询
function doSearch() {
	
	var majorName = $("#majorName").val();
	init('?majorName=' + majorName);
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
				location = ctx + "/deleteMajor.do?majorCode=" + selected.majorCode;
			}
		}
	});
}

//显示添加修改窗口
function openAdd(type){
	//添加窗口清空form表单
	if(type=="add"){
		doReset('addform');
	}else{
		var row = $('#list_user').datagrid('getSelected');
		$('#addform').form('load', row);
	}
	$('#user_add').window('open');
}
//添加修改
function doAdd(){
			
		var majorCode = $("#ad_majorCode").val();
		var majorName = $("#ad_majorName").val();
		var majorParent = $("#ad_majorParent").combobox('getValue');
		var majorStatus = $("#ad_majorStatus").combobox('getValue');
		
		if (majorCode == null || majorCode == ""){
			$.messager.alert('系统提示','专业编码不能为空!','error');
		}else if($.trim(majorCode).length>8){
			$.messager.alert('系统提示','专业编号长度不能大于8!','error');
		}else if(majorName == null || majorName == ""){
			$.messager.alert('系统提示','专业名不能为空!','error');
		}else{
			location = "addMajor.do?majorCode=" + majorCode +"&majorName=" 
			+ encodeURI(encodeURI(majorName)) + "&majorParent=" + majorParent + "&majorStatus="
			+ majorStatus;
		}
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
