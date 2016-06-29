/** 个人用户意见反馈 * */
$(function() {
	$("#uploadfile").uploadify({
		'auto' : false,
		// 'buttonClass' : 'btn3',
		'buttonText' : '附件',
		'multi' : false,
		'height' : 30,
		'width' : 28,
		'fileTypeDesc' : 'Image Files',
		'cancelImg' : ctx + '/images/uploadify/uploadify-cancel.png',
		'fileTypeExts' : '*.gif; *.jpg; *.png; *.bmp; *.jpeg',
		'fileSizeLimit' : '2048KB',
		'queueSizeLimit' : 1,
		'fileObjName' : 'storeImage',
		'swf' : ctx + '/images/uploadify/uploadify.swf',
		'uploader' : ctx + '/student.do?method=doFeedbackUpLoad',
		'onUploadSuccess' : function(file, data, response) {
			// alert("上传成功!");
		},
		'onQueueComplete' : function(queueData) {
			// alert("onQueueComplete!");
		}
	});
});

function doSubmit() {

	if (feedbackInfo() == true) {
		$("#feedback_msg").css('color', '#40bd45');
		$("#feedback_msg").text("正在提交...");

		// 提交数据
		$.post(ctx + "/student.do?method=doFeedback", $('#feedback_form').serialize(), function(data) {
			if (data.success) {

				$('#uploadfile').uploadify('settings', 'formData', {
					"fbId" : data.obj
				});
				$('#uploadfile').uploadify('upload', '*');
				
				$('#feedback_msg').text("保存成功!");
				clearForm($('#feedback_form'));

			} else {
				$('#feedback_msg').css('color', 'red');
				$('#feedback_msg').text(data.msg);
			}
		}, "json");
	}

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

// 意见反馈信息校验
function feedbackInfo() {

	var fbTitle = $('#feedback_form input[name=fbTitle]').val();
	var fbContent = $('#fbContent').val();
	var fbMail = $('#feedback_form input[name=fbMail]').val();
	var fbPhone = $('#feedback_form input[name=fbPhone]').val();

	
	if(fbTitle!=""){
		if (/^[\u4E00-\u9FA5A-Za-z0-9_]+$/.test(fbTitle)) {
			if (fbContent != "") {
				if (fbMail != "") {
					if (/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(fbMail)) {
						if (fbPhone != "") {
							if ((/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/.test(fbPhone))||(/^((0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$/.test(fbPhone))) {
								return true;
							} else {
								alert("电话格式不正确，例如：010-12345678或0411-12345678等");
							}
						} else {
							alert("请输入电话!");
						}
					} else {
						alert("邮箱格式不正确!");
					}
				} else {
					alert("请输入邮箱!");
				}
			} else {
				alert("请输入内容!");
			}
		} else {
			alert("标题只能输入汉字、字母、数字或下划线!");
		}
	}else{
		alert("请输入标题!");
	}
}
/** 企业用户意见反馈 * */
