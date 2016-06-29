package com.qin.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qin.blog.dao.AlogQinMapper;
import com.qin.blog.model.AlogQin;

@Service
public class BlogService {

	@Autowired
	AlogQinMapper alogQinMapper;

	/**
	 * 注册用户
	 * 
	 * @param alogqin
	 *            实体类
	 * @return >0为注册成功
	 */
	public int register(AlogQin alogqin) {

		return alogQinMapper.insertSelective(alogqin);
	}
}
