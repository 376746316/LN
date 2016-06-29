$(function() {
	init('');
	loadUserSex();
	loadCbx_userProvince();
	loadCbx_userOrg();
	loadUserType();
	loadUserEduLev();
	loadUserSex_upd();
	loadCbx_userProvince_upd();
	loadCbx_userOrg_upd();
	loadUserType_upd();
	loadUserEduLev_upd();
});

function init(p) {
	p = encodeURI(encodeURI(p));
	$('#list_user')
			.datagrid(
					{
						title : '普通用户信息表',
						iconCls : 'icon-save',
						width : 'auto',
						height : '420',
						nowrap : false,
						striped : true,
						collapsible : true,
						url : ctx + '/getAllUser.do' + p,
						singleSelect : true,
						idField : 'userNo',
						remoteSort : false,
						idField : 'code',
						frozenColumns : [ [ {
							title : '用户编号',
							field : 'userNo',
							align : 'center',
							width : 70,
							sortable : true
						} ] ],
						columns : [
								[
										{
											title : '基本信息',
											colspan : 23
										}], [  {
									field : 'userName',
									title : '用户名称',
									align : 'center',
									width : 80,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								} , {
									field : 'userPhone',
									title : '工作电话',
									align : 'center',
									width : 100,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'userOrg',
									title : '所属组织',
									align : 'center',
									width : 200
								},{
									field : 'userMail',
									title : '邮箱',
									align : 'center',
									width : 120,
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'userAddress',
									title : '地址',
									width : 80,
									align : 'center',
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								}, {
									field : 'userSubject',
									title : '所授课程',
									width : 180,
									align : 'center',
									rowspan : 2,
									sortable : true,
									sorter : function(a, b) {
										return (a > b ? 1 : -1);
									}
								},{
									field : 'opt',
									title : '操作',
									width : 120,
									align : 'center',
									rowspan : 2,
									formatter : function(value, rec) {
										return '<a href="javascript:openEdit();" style="text-decoration:none;">编辑</a>&nbsp;&nbsp;'
										+ '<a href="javascript:sureDelete();" style="text-decoration:none;">删除</a>';
									}
								} ] ],
						pagination : true,
						toolbar : [ {
							id : 'btnadd',
							text : '添加用户',
							iconCls : 'icon-add',
							handler : function() {
								openAdd('add'); 
							}
						} ]
					});
	var p = $('#list_user').datagrid('getPager');
	$(p).pagination({

	});
}


/**
 * 查询
 */
function doSearch() {
	var userName = $('#userName').val();
	$('#list_user').datagrid('load', {
		userName : $.trim(userName)
	});
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
				location = ctx + "/deleteByPrimaryKey.do?id=" + selected.userNo;
			}
		}
	});
}

//显示添加修改窗口
function openAdd(type){
	//添加窗口清空form表单
	if(type=="add"){
		$('#isUpdate').val('insertUser.do');
		$('#addform').form('clear');
		$('#user_add').window('open');
	}
}
//显示修改
function openEdit(){
	var selected = $('#list_user').datagrid('getSelected');
	if (selected) {
		$('#upd_userNo').val(selected.userNo);
		$('#updform').form('load',{
			u_userOrgid : selected.userOrgid,
			u_userName :  selected.userName,
			u_userId : selected.userId,
			u_userPwd : selected.userPwd,
			u_userNickname : selected.userNickname,
			u_userMobile : selected.userMobile,
			u_userPhone : selected.userPhone,
			u_userMail : selected.userMail,
			u_userQq : selected.userQq,
			u_userGrpQq : selected.userGrpQq,
			u_userTitle : selected.userTitle,
			u_userSex : selected.userSex,
			u_userBirth : selected.userBirth,
			u_userPostCode : selected.userPostCode,
			u_userEduLevel: selected.userEduLevel,
			u_userSubject : selected.userSubject,
			u_userType : selected.userType,
			u_userAreaCode : selected.areaName,
			u_userIsLeader : selected.userIsLeader,
			u_userAddress : selected.userAddress,
			u_userMark : selected.userMark
		});
		$('#u_userId').text(selected.userId);
		$('#u_province').combobox('select',selected.provinceCode);
		$('#u_userAreaCode').combobox('select',selected.userAreaCode);
		$('#user_upd').window('open');
	}
}

//添加修改
function doAddOrEdit(){
	var userNoOnPang =  $("#upd_userNo").val();
	if($.trim(userNoOnPang)==""){
		userNoOnPang = null;
	}
	if($('#addform').form('validate')){
	var userObj = {
			userNo : userNoOnPang,
			userOrgid : $("#a_userOrgid").combobox('getValue'),
			userName : $("#a_userName").val(),
			userId : $("#a_userId").val(),
			userPwd : $("#a_userPwd").val(),
			userNickname : $("#a_userNickname").val(),
			userMobile : $("#a_userMobile").val(),
			userPhone : $("#a_userPhone").val(),
			userMail : $("#a_userMail").val(),
			userQq : $("#a_userQq").val(),
			userGrpQq : $("#a_userGrpQq").val(),
			userTitle : $("#a_userTitle").val(),
			userSex : $("#a_userSex").combobox('getValue'),
			userBirth : $("#a_userBirth").datebox('getValue'),
			userAreaCode : $("#a_userAreaCode").combobox('getValue'),
			userAddress : $("#a_userAddress").val(),
			userPostCode : $("#a_userPostCode").val(),
			userIsLeader : $("#a_userIsLeader").combobox('getValue'),
			userEduLevel : $("#a_userEduLevel").combobox('getValue'),
			userSubject : $("#a_userSubject").val(),
			userType : $("#a_userType").combobox('getValue'),
			userMark : $("#a_userMark").val()
			
			
	};
	
	var param = new Object();
	param["json"] = JSON.stringify(userObj);
	
	
	$.post($('#isUpdate').val(), param, function(rsp) {
		if (rsp != "success") {
			$('#list_user').datagrid('reload');
			msgSlider('操作成功！');
		} else {
			msgSlider('操作成功！');
		}
	}).error(function() {
		
		msgSlider('操作成功！');
	}
	);
	
	$('#user_add').window('close');
	//doReset('addform');
	}
}
function doUpd(){
	var userNoOnPang =  $("#upd_userNo").val();
	if($.trim(userNoOnPang)==""){
		userNoOnPang = null;
	}
	if($('#updform').form('validate')){
	var userObj = {
			userNo : userNoOnPang,
			userOrgid : $("#u_userOrgid").combobox('getValue'),
			userName : $("#u_userName").val(),
			userId : $("#u_userId").text(),
			userPwd : $("#u_userPwd").val(),
			userNickname : $("#u_userNickname").val(),
			userMobile : $("#u_userMobile").val(),
			userPhone : $("#u_userPhone").val(),
			userMail : $("#u_userMail").val(),
			userQq : $("#u_userQq").val(),
			userGrpQq : $("#u_userGrpQq").val(),
			userTitle : $("#u_userTitle").val(),
			userSex : $("#u_userSex").combobox('getValue'),
			userBirth : $("#u_userBirth").datebox('getValue'),
			userAreaCode : $("#u_userAreaCode").combobox('getValue'),
			userAddress : $("#u_userAddress").val(),
			userPostCode : $("#u_userPostCode").val(),
			userIsLeader : $("#u_userIsLeader").combobox('getValue'),
			userEduLevel : $("#u_userEduLevel").combobox('getValue'),
			userSubject : $("#u_userSubject").val(),
			userType : $("#u_userType").combobox('getValue'),
			userMark : $("#u_userMark").val()
	};
	
	var param = new Object();
	param["json"] = JSON.stringify(userObj);
	
	
	$.post('updateUser.do', param, function(rsp) {
		if (rsp != "success") {
			$('#list_user').datagrid('reload');
			msgSlider('操作成功！');
		} else {
			msgSlider('操作成功！');
		}
	}).error(function() {
		
		msgSlider('操作成功！');
	}
	);
	
	$('#user_upd').window('close');
	$('#list_user').datagrid('reload');
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

//---->> 性别
function loadUserSex(){
	$('#a_userSex').combobox({
		required : false,
		width : 110,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserSexCbox.do?parentparamid=1',
		valueField:'param_id',
		textField:'param_name'
	});
}
function loadUserSex_upd(){
	$('#u_userSex').combobox({
		required : false,
		width : 110,
		panelHeight : 60,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserSexCbox.do?parentparamid=1',
		valueField:'param_id',
		textField:'param_name'
	});
}
//---->> 学历
function loadUserEduLev(){
	$('#a_userEduLevel').combobox({
		required : false,
		panelHeight : 180,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserEduLevCbox.do?parentparamid=8',
		valueField:'param_id',
		textField:'param_name'
	});
}
//---->> 学历
function loadUserEduLev_upd(){
	$('#u_userEduLevel').combobox({
		required : false,
		panelHeight : 180,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserEduLevCbox.do?parentparamid=8',
		valueField:'param_id',
		textField:'param_name'
	});
}
//---->> 用户性质
function loadUserType(){
	$('#a_userType').combobox({
		required : false,
		panelHeight : 60,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserTypeCbox.do?parentparamid=9',
		valueField:'param_id',
		textField:'param_name'
	});
}
function loadUserType_upd(){
	$('#u_userType').combobox({
		required : false,
		panelHeight : 60,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserTypeCbox.do?parentparamid=9',
		valueField:'param_id',
		textField:'param_name'
	});
}
//--->>加载省份
function loadCbx_userProvince() {

	$('#a_province').combobox({
		panelHeight : 210,
		width : 110,
		editable : false,
		missingMessage : '请选择一个地区',
		url : ctx + '/getStuProvince.do',
		textField : 'areaName',
		valueField : 'areaCode',
		onChange : loadCbx_userArea
	});
}
function loadCbx_userProvince_upd() {

	$('#u_province').combobox({
		panelHeight : 210,
		width : 110,
		editable : false,
		missingMessage : '请选择一个地区',
		url : ctx + '/getStuProvince.do',
		textField : 'areaName',
		valueField : 'areaCode',
		onChange : loadCbx_userArea_upd
	});
}
//---->> 所属地区
function loadCbx_userArea(newValue, oldValue){
	
	var parentId = $("#a_province").combobox('getValue');
	$('#a_userAreaCode').combobox({
		required : true,
		width : 110,
		panelHeight : 210,
		editable : false,
		missingMessage : '请选择一个地区',
		url : ctx + '/getStuAreaCbox.do?parentId=' + parentId,
		textField:'areaName',
		valueField:'areaCode'
	});
	
}
function loadCbx_userArea_upd(newValue, oldValue){
	
	var parentId = $("#u_province").combobox('getValue');
	$('#u_userAreaCode').combobox({
		required : true,
		width : 110,
		panelHeight : 210,
		editable : false,
		missingMessage : '请选择一个地区',
		url : ctx + '/getStuAreaCbox.do?parentId=' + parentId,
		textField:'areaName',
		valueField:'areaCode'
	});
	
}
//---->> 所属组织
function loadCbx_userOrg(){

	$('#a_userOrgid').combobox({
		width : 110,
		required : true,
		panelHeight : 110,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserOrgIdCbox.do',
		textField:'orgName',
		valueField:'orgId'
	});
	
}
function loadCbx_userOrg_upd(){

	$('#u_userOrgid').combobox({
		width : 110,
		required : true,
		panelHeight : 110,
		width : 110,
		editable : false,
		missingMessage : '请选择一个类别',
		url: ctx + '/getUserOrgIdCbox.do',
		textField:'orgName',
		valueField:'orgId'
	});
	
}
$.extend($.fn.validatebox.defaults.rules, {
    minLength : { // 判断最小长度
        validator : function(value, param) {
            return value.length >= param[0];
        },
        message : '最少输入 {0} 个字符。'
    },
    length:{validator:function(value,param){
        var len=$.trim(value).length;
            return len>=param[0]&&len<=param[1];
        },
            message:"输入内容长度必须介于{0}和{1}之间."
        },
    phone : {// 验证电话号码
        validator : function(value) {
            return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value);
        },
        message : '格式不正确,请使用下面格式:020-88888888'
    },
    mobile : {// 验证手机号码
        validator : function(value) {
            return /^(13|15|18)\d{9}$/i.test(value);
        },
        message : '手机号码格式不正确'
    },
    idcard : {// 验证身份证
        validator : function(value) {
            return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value);
        },
        message : '身份证号码格式不正确'
    },
    intOrFloat : {// 验证整数或小数
        validator : function(value) {
            return /^\d+(\.\d+)?$/i.test(value);
        },
        message : '请输入数字，并确保格式正确'
    },
    currency : {// 验证货币
        validator : function(value) {
            return /^\d+(\.\d+)?$/i.test(value);
        },
        message : '货币格式不正确'
    },
    qq : {// 验证QQ,从10000开始
        validator : function(value) {
            return /^[1-9]\d{4,9}$/i.test(value);
        },
        message : 'QQ号码格式不正确'
    },
    integer : {// 验证整数
        validator : function(value) {
            return /^[+]?[1-9]+\d*$/i.test(value);
        },
        message : '请输入整数'
    },
    chinese : {// 验证中文
        validator : function(value) {
            return /^[\u0391-\uFFE5]+$/i.test(value);
        },
        message : '请输入中文'
    },
    english : {// 验证英语
        validator : function(value) {
            return /^[A-Za-z]+$/i.test(value);
        },
        message : '请输入英文'
    },
    unnormal : {// 验证是否包含空格和非法字符
        validator : function(value) {
            return /.+/i.test(value);
        },
        message : '输入值不能为空和包含其他非法字符'
    },
    username : {// 验证用户名
        validator : function(value) {
            return /^[a-zA-Z][a-zA-Z0-9_]{5,15}$/i.test(value);
        },
        message : '用户名不合法（字母开头，允许6-16字节，允许字母数字下划线）'
    },
    faxno : {// 验证传真
        validator : function(value) {
//            return /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/i.test(value);
            return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value);
        },
        message : '传真号码不正确'
    },
    zip : {// 验证邮政编码
        validator : function(value) {
            return /^[1-9]\d{5}$/i.test(value);
        },
        message : '邮政编码格式不正确'
    },
    ip : {// 验证IP地址
        validator : function(value) {
            return /d+.d+.d+.d+/i.test(value);
        },
        message : 'IP地址格式不正确'
    },
    name : {// 验证姓名，可以是中文或英文
            validator : function(value) {
                return /^[\u0391-\uFFE5]+$/i.test(value)|/^\w+[\w\s]+\w+$/i.test(value);
            },
            message : '请输入姓名'
    },
    carNo:{
        validator : function(value){
            return /^[\u4E00-\u9FA5][\da-zA-Z]{6}$/.test(value); 
        },
        message : '车牌号码无效（例：粤J12350）'
    },
    carenergin:{
        validator : function(value){
            return /^[a-zA-Z0-9]{16}$/.test(value); 
        },
        message : '发动机型号无效(例：FG6H012345654584)'
    },
    email:{
        validator : function(value){
        return /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value); 
    },
    message : '请输入有效的电子邮件账号(例：abc@126.com)'    
    },
    msn:{
        validator : function(value){
        return /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value); 
    },
    message : '请输入有效的msn账号(例：abc@hotnail(msn/live).com)'
    },same:{
        validator : function(value, param){
            if($("#"+param[0]).val() != "" && value != ""){
                return $("#"+param[0]).val() == value; 
            }else{
                return true;
            }
        },
        message : '两次输入的密码不一致！'    
    }
});
