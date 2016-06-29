/** 积分管理 * */

/**
 * 兑换积分
 */
function chackExchangeScore() {
	var exchangeScore = $('#exchangeScore').val();
	var kyStuScore = $('#kyStuScore').text();
	var rpValue = $("#rpValueHid").val();
	
	if (kyStuScore > 0) {
		if (exchangeScore != '') {
			if (/^(0|[1-9][0-9]*)$/.test(exchangeScore)) {
				exchangeScore = parseInt($.trim(exchangeScore));
				kyStuScore = parseInt($.trim(kyStuScore));
				if (exchangeScore % rpValue == 0) {
					if (kyStuScore < exchangeScore) {
						alert("兑换积分不能大于可用积分!");
					} else {
						$('#disCrecCoin').text(exchangeScore / rpValue);
						return true;
					}
				} else {
					alert("兑换积分只能填写"+rpValue+"的整数倍数!");
					$('#exchangeScore').focus();
				}
			} else {
				alert("兑换分数有非法字符输入!");
				$('#exchangeScore').focus();
			}
		} else {
			alert("请输入兑换积分数!");
			$('#exchangeScore').focus();
		}
	} else {
		alert("可换积分为0!");
	}

}

function submitScoreExchangeForm() {
	
	var kyStuScore = parseInt($('#kyStuScore').text());	// 可用积分
	var disStuScore = parseInt($('#disStuScore').text());	// 可用积分
	var stuPwd = $('#scoreExchange_form input[name="stuPwd"]').val(); // 密码
	var exchangeScore = $('#exchangeScore').val(); // 兑换积分数
	
	if ($('#scoreExchange_form input[name=stuPwd]').val() == "") {
		alert("请输入密码");
		$('#scoreExchange_form input[name=stuPwd]').focus();
	} else {
		if (chackExchangeScore() == true) { // 校验通过
			// 提交数据
			$.post(ctx + "/myCenter/scoreExchange.do", {
				stuPwd : stuPwd,
				exchangeScore : exchangeScore
			}, function(data) {
				if (data.success) {
					$('#scoreExchange_form input[name="stuPwd"]').val("");
					$('#exchangeScore').val("");
					$('#disCrecCoin').text(0);
					
					if (kyStuScore - exchangeScore > 0) {
						$('#kyStuScore').text(kyStuScore - exchangeScore);
					} else {
						$('#kyStuScore').text(0);
					}
					$('#disStuScore').text(disStuScore - exchangeScore);
				}
				alert(data.msg);
			}, "json");
		}
	}
}
