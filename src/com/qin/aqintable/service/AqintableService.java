package com.qin.aqintable.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qin.aqintable.dao.AqintableMapper;
import com.qin.aqintable.model.Aqintable;
import com.qin.aqintable.model.Page;

@Service
public class AqintableService {

	@Autowired
	AqintableMapper aqintableMapper;

	/**
	 * 注册（添加方法）
	 * 
	 * @param aqintable
	 * 
	 * @return >0 ture
	 */
	public int register(Aqintable aqintable) {

		// aqintableMapper.insert(aqintable);
		return aqintableMapper.insertSelective(aqintable);
	}

	/**
	 * 修改
	 * 
	 * @param aqintable
	 * @return >0修改成功
	 */
	public int dataup(Aqintable aqintable) {
		return aqintableMapper.updateByPrimaryKeySelectiveIsName(aqintable);
	}

	/**
	 * 删除
	 * 
	 * @param name
	 * 
	 * @return >0 删除成功
	 */
	public int deleteda(String name) {
		return aqintableMapper.deleteByPrimaryKeyName(name);
	}

	/**
	 * 查询：单用户查询
	 * 
	 * @param name
	 * @return
	 */
	public Aqintable querydata(String name) {
		return aqintableMapper.selectByPrimaryKeyName(name);
	};

	/**
	 * 查询：登陆
	 * 
	 * @param name
	 * @return
	 */
	public Aqintable querydatalgoin(Aqintable aqintable) {
		return aqintableMapper.selectByPrimaryKeyNameAndPwd(aqintable);
	};

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public ArrayList<Aqintable> querydatall() {
		return aqintableMapper.selectByPrimaryQueryAll();
	}

	/**
	 * 模糊查询
	 * 
	 * @param name
	 * @return
	 */
	public ArrayList<Aqintable> querydatalikename(String name) {
		return aqintableMapper.selectByPrimaryQueryLikeName("%" + name + "%");
	}

	/**
	 * 记录总数
	 * 
	 * @return
	 */
	public int queryDataAllNumber() {
		return aqintableMapper.countByExample(null);
	}

	/**
	 * 模糊查询（返回符合记录的数量）
	 * 
	 * @param name
	 * @return
	 */
	public int querydatalikenamenuber(String name) {
		return aqintableMapper.selectByPrimaryQueryLikeNameNumber("%" + name + "%");
	}

	/**
	 * 全部记录limit
	 * 
	 * @param page
	 *            记录onANDoff
	 * @return 返回被分页的数据
	 */
	public ArrayList<Aqintable> querydataallimt(Page page) {
		return aqintableMapper.selectByPrimaryQueryLimitALL(page);
	}
}
