$(document).ready(function() {
	$(".g_zhcz a").click(function() {
		$(".w_wdjf").addClass('active').siblings().removeClass('active');
		$('.grzx_r').load($(".w_wdjf").attr('url') + "?active=jfdh");
	});

	$('#rechargeableCard').click(function() {
		$("#reRedeemcode").val("");
		$("#reCoinamount").html("0");
		$("body").append('<div class="lagebg posa"></div>');
		$('.lagebg').css({
			height : $(document).height() || $(window).height()
		});
		$("#xuexibiduihuan").show();
	});
	
	$('#xuexibiduihuan .z_gb,#xuexibiduihuan .wh_qx').click(function() {
		$("#xuexibiduihuan").hide();
		$('.lagebg').remove();
	});
});


// 学习币兑换
function coinExchange(reRedeemcode) {
	if (reRedeemcode.length == 20) {
		$.post(ctx + "/myCenter/coinExchange.do", {
			reRedeemcode : $("#reRedeemcode").val()
		}, function(data) {
			if (data.success) {
				$("#coinExchange_button").removeAttr("disabled");
				$("#coinExchange_button").css("background-color", "#40bd45");
				$("#reCoinamount").html(data.obj.reCoinamount);
			} else {
				$("#reCoinamount").html("0");
				$("#coinExchange_button").attr("disabled", "disabled");
				$("#coinExchange_button").css("background-color", "#AAAAAA");
				alert(data.msg);
			}
		}, "json");
	} else {
		$("#reCoinamount").html("0");
		$("#coinExchange_button").attr("disabled", "disabled");
		$("#coinExchange_button").css("background-color", "#AAAAAA");
	}
}
// 执行学习币兑换
function doCoinExchange() {
	$.post(ctx + "/myCenter/doCoinExchange.do", {
		reRedeemcode : $("#reRedeemcode").val()
	}, function(data) {
		if (data.success) {
			$("#reRedeemcode").val("");
			$("#xuexibiduihuan").hide();
			$("#stuCoin").html(data.obj);
			$('.lagebg').remove();
			alert(data.msg);
			
//			$("#coinExchange_button").removeAttr("disabled");
//			$("#coinExchange_button").css("background-color", "#40bd45");
//			$("#reCoinamount").html(data.obj.reCoinamount);
		} else {
			alert(data.msg);
//			$("#reCoinamount").html("0");
//			$("#coinExchange_button").attr("disabled", "disabled");
//			$("#coinExchange_button").css("background-color", "#AAAAAA");
		}
	}, "json");
}
