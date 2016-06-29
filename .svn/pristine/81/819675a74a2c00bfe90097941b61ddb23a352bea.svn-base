package com.chinasofti.cetp.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.UserMapper;
import com.chinasofti.cetp.admin.model.UserExample;
import com.chinasofti.cetp.admin.model.UserWithBLOBs;

@Service("sysService")
public class SysService {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public List<UserWithBLOBs> selectUserByExample(UserExample example) {
		return userMapper.selectByExampleWithBLOBs(example);
	}
}
