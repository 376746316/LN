$(function() {
});
function doSubmit() {
	if ($("#listName").val() == "") {
		$("#listName").focus();
		$("#msgTip").css({
			color : "red"
		});
		$("#msgTip").html("请填写栏目名称");
		return;
	}
	if ($("#listAnthor").val() == "") {
		$("#listAnthor").focus();
		$("#msgTip").css({
			color : "red"
		});
		$("#msgTip").html("请选择栏目作者");
		return;
	}
	if ($("#listInfo").val() == "") {
		$("#listInfo").focus();
		$("#msgTip").css({
			color : "red"
		});
		$("#msgTip").html("请填写栏目简介");
		return;
	}
	var param = {
		listId : $("#listId").val(),
		listName : $("#listName").val(),
		listAnthor : $("#listAnthor").val(),
		listInfo : $("#listInfo").val()
	};
	$.post(ctx + "/addOrUpdatePlayList.do", param, function(json) {
		if(json.success){
			 doBack();
		}else{
			$("#msgTip").css({
				color : "red"
			});
			$("#msgTip").html(json.msg);
		}
	}, 'json').error(function(){
			$("#msgTip").css({
				color : "red"
			});
			$("#msgTip").html("服务器繁忙，请稍后再试。");
		
	});
}
function doBack() {
	location.href = ctx + "/toMngGrowthDirectionVideo.do";
}