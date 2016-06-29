package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinasofti.cetp.admin.dao.RedeemMapper;
import com.chinasofti.cetp.admin.model.Redeem;
import com.chinasofti.cetp.admin.model.RedeemExample;
import com.chinasofti.cetp.admin.model.User;
import com.chinasofti.cetp.base.BaseController;
import com.chinasofti.cetp.utils.RowBoundsWithTotalCount;
import com.chinasofti.cetp.utils.ValidCodeUtils;

@Service
public class RedeemService extends BaseController {

	private RedeemMapper redeemMapper;

	public RedeemMapper getRedeemMapper() {
		return redeemMapper;
	}

	@Autowired
	public void setRedeemMapper(RedeemMapper redeemMapper) {
		this.redeemMapper = redeemMapper;
	}

	public List<Redeem> selectByExample(RedeemExample redeemExample, RowBoundsWithTotalCount rb) {
		return redeemMapper.selectByExample(redeemExample, rb);
	}
	
	public List<Redeem> selectByExample(RedeemExample redeemExample) {
		return redeemMapper.selectByExample(redeemExample);
	}

	/**
	 * 学习币兑换码生成方法
	 * 
	 * @param generateCount
	 *            兑换码个数
	 * @param reValidity
	 *            有效期
	 * @param reCoinamount
	 *            学习币数量
	 * @param user
	 * @return
	 */
	@Transactional
	public List<Redeem> generateRedeemCode(Integer generateCount, Date reValidity, Integer reCoinamount, User user) {
		int codeLength = 20; // 兑换码字符数
		List<Redeem> redeemList = new ArrayList<Redeem>();

		for (int i = 0; i < generateCount; i++) {
			Redeem redeem = new Redeem();
			// 设置属性
			redeem.setReCoinamount(reCoinamount);// 学习币数量
			redeem.setReValidity(reValidity);// 有效期
			redeem.setReStatus(1);// 状态（1:正常，2:已使用，3:已过期）
			redeem.setReUserId(user.getUserNo());// 发放人
			//redeem.setReUserName(user.getUserName());
			redeem.setReCreatetime(new Date());// 生成时间
			// 生成兑换码
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < codeLength; j++) {
				sb.append(ValidCodeUtils.getRandomChar());
			}

			redeem.setReRedeemcode(sb.toString()); // 兑换码

			if (redeemMapper.insertSelective(redeem) > 0) {
				// 保存成功
				redeemList.add(redeem);
			} else {
				// 保存失败
				return null;
			}
		}
		
		return redeemList;
	}
	
	/**
	 * 删除学习币兑换码
	 * @param reIds (如：1001,1002,1003,1004)
	 * @return
	 */
	public boolean deleteRedeemByReIds(String reIds){
		boolean flag = false;
		try {
			String [] reIdsArray = reIds.split(",");
			for (int i = 0; i < reIdsArray.length; i++) {
				redeemMapper.deleteByPrimaryKey(Integer.valueOf(reIdsArray[i]));
			}
			flag = true;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public List<Redeem> getRedeemByCode(String reRedeemcode){
		RedeemExample example = new RedeemExample();
		example.createCriteria().andReRedeemcodeEqualTo(reRedeemcode);
		return redeemMapper.selectByExample(example);
	}
	
	public int updateByPrimaryKeySelective(Redeem redeem){
		return redeemMapper.updateByPrimaryKeySelective(redeem);
	}

}
