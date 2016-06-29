var planId;
$(function() {
	var stuNo = $('#hidStuNo').val();
	var proId = $('#hidProId').val();

	$('#treeStuScore').treegrid({
		nowrap : false,
		rownumbers : false,
		animate : false,
		showFooter : true,
		url : ctx + '/getTreeStuScore.do?stuNo=' + stuNo + '&proId=' + proId,
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
			width : 400
		} ] ],
		columns : [ [ {
			field : 'pnPlanId',
			title : '成果物下载',
			align : 'center',
			width : 80,
			formatter : function(val, rec) {
				if (rec.personPlan && rec.personPlan.pnPlanId) {
					return '<a href="javascript:;" class="h_sccg" planId="' + rec.personPlan.pnPlanId + '">查看成果物</a>';
				}
			}
		}, {
			field : 'taskScore',
			title : '建议分值',
			align : 'center',
			width : 80,
			formatter : function(val) {
				if (val) {
					return val + "分";
				}
			}
		}, {
			field : 'teacherScore',
			title : '教师打分 ',
			align : 'center',
			width : 80,
			formatter : function(val, rec) {
				if (rec.personPlan && rec.personPlan.pnTeacherScore) {
					return '<span title="' + (rec.personPlan.pnTeacherReason ? rec.personPlan.pnTeacherReason : '') + '">' + rec.personPlan.pnTeacherScore + '分</span>';
				}
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
					$('#noprp').show();
					planId = $this.attr('planId');
					$.post(ctx + '/getTaskResultList.do', {
						pracIsTeam : 1,
						planId : planId
					}, function(rsp) {
						if ($this.attr('planId') == planId) {
							$('.cgw_box_type h2').siblings().remove();
							$('.cgw_box_type').hide();
							$('#noprp').show();
							$.each(rsp, function(i, prp) {
								var prpHtml = '<div>';
								prpHtml += '<p class="f_l"><a href="' + ctx + "/download.do?fileurl=" + prp.prpResult + '">' + prp.prpName + '</a></p>';
								prpHtml += '<div class="clear"></div></div>';

								var style = prp.prpStyle.split(';')[0];
								$('.cgw_box_type[typeId=' + style + ']').append(prpHtml);
								$('#noprp').hide();
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
