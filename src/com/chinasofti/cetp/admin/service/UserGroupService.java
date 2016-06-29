package com.chinasofti.cetp.admin.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.UserGroupMapper;
import com.chinasofti.cetp.admin.model.UserGroup;
import com.chinasofti.cetp.admin.model.UserGroupExample;

/**
 * 用户组规则 Service
 * 
 * @author heyuqiang
 * 
 */
@Service
public class UserGroupService {

	private UserGroupMapper userGroupMapper;

	public UserGroupMapper getUserGroupMapper() {
		return userGroupMapper;
	}

	@Autowired
	public void setUserGroupMapper(UserGroupMapper userGroupMapper) {
		this.userGroupMapper = userGroupMapper;
	}

	public List<UserGroup> getUserGropList() {
		return userGroupMapper.selectByExample(null);
	}

	public List<UserGroup> getUserGropList(UserGroupExample example, RowBounds rb) {
		return userGroupMapper.selectByExample(example, rb);
	}

	public int updateByPrimaryKeySelective(UserGroup userGroup) {
		return userGroupMapper.updateByPrimaryKeySelective(userGroup);
	}
}
