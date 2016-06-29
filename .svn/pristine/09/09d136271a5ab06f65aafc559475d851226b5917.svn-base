var planId;
$(function() {
	var teamId = $('#hidTeamId').val();
	var proId = $('#hidProId').val();
	$('#treeTeamScore').treegrid({
		nowrap : false,
		rownumbers : false,
		animate : false,
		url : ctx + '/getTreeTeamScore.do?teamId=' + teamId + '&proId=' + proId,
		idField : 'taskId',
		treeField : 'taskName',
		frozenColumns : [ [ {
			field : 'taskId',
			hidden : true
		}, {
			field : 'taskLevel',
			hidden : true
		}, {
			field : 'space',
			width : 26,
		}, {
			title : '任务名称',
			field : 'taskName',
			width : 320
		} ] ],
		columns : [ [ {
			field : 'plPlanId',
			title : '成果物下载',
			align : 'center',
			width : 80,
			formatter : function(val, rec) {
				if (rec.moreTeamPlan && rec.moreTeamPlan.plPlanId) {
					return '<a href="javascript:;" class="h_sccg" stuName="' + rec.moreTeamPlan.stuName + '" planId="' + rec.moreTeamPlan.plPlanId + '">查看成果物</a>';
				}
			}
		}, {
			field : 'taskScore',
			title : '建议分值',
			align : 'center',
			width : 80
		}, {
			field : 'leaderScore',
			title : '组长打分',
			align : 'center',
			width : 80,
			formatter : function(val, rec) {
				if (rec.moreTeamPlan && rec.moreTeamPlan.plLeaderScore) {
					return '<span title="' + rec.moreTeamPlan.plLeaderReason + '">' + rec.moreTeamPlan.plLeaderScore + '分</span>';
				}
			}
		}, {
			field : 'teacherScore',
			title : '教师打分 ',
			align : 'center',
			width : 80,
			formatter : function(val, rec) {
				var ret = "";
				if (rec.moreTeamPlan && (rec.moreTeamPlan.plTeacherScore || rec.moreTeamPlan.plTeacherScore == 0)) {
					ret = rec.moreTeamPlan.plTeacherScore + '分';
				} else if (rec.teamPhaseCheck) {
					if (rec.teamPhaseCheck.tpcScore || rec.teamPhaseCheck.tpcScore == 0) {
						ret += rec.teamPhaseCheck.tpcScore;
					}
					if (rec.teamPhaseCheck.tpcAddScore) {
						ret += "+" + rec.teamPhaseCheck.tpcAddScore;
					}
					if (ret.length > 0) {
						ret += '分';
					}
				}
				return '<span title="' + (rec.teamPhaseCheck ? rec.teamPhaseCheck.tpcAddReason : (rec.moreTeamPlan && rec.moreTeamPlan.plTeacherReason ? rec.moreTeamPlan.plTeacherReason : '')) + '">' + ret + '</span>';
			}
		} ] ],
		onLoadSuccess : function(row, data) {
			$(".h_sccg").hover(function(e) {
				var $this = $(this);

				$('.cgw_box').css('top', e.clientY + 5 + 'px');
				$('.cgw_box').css('left', e.clientX - 250 + 'px');
				$('.cgw_box').show();
				if ($this.attr('planId') != planId) {
					$('.cgw_box_type h2').siblings().remove();
					$('.cgw_box_type').hide();
					$('#notpr').show();
					$('#stuName').text($this.attr('stuName'));
					planId = $this.attr('planId');
					$.post(ctx + '/getTaskResultList.do', {
						pracIsTeam : 2,
						planId : planId
					}, function(rsp) {
						if ($this.attr('planId') == planId) {
							$('.cgw_box_type h2').siblings().remove();
							$('.cgw_box_type').hide();
							$('#notpr').show();
							$.each(rsp, function(i, tpr) {
								var tprHtml = '<div>';
								tprHtml += '<p class="f_l"><a href="' + ctx + "/download.do?fileurl=" + tpr.tprResult + '">' + tpr.tprName + '</a></p>';

								tprHtml += '<div class="clear"></div></div>';

								var style = tpr.tprStyle.split(';')[0];
								$('.cgw_box_type[typeId=' + style + ']').append(tprHtml);
								$('#notpr').hide();
							});
							$('.cgw_box_type:has(div)').show();
						}
					}, 'json');
				}
			}, function() {
			});
		}
	});
	$('.cgw_box').mouseleave(function() {
		$('.cgw_box').hide();
	});
});
