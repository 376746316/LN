package com.chinasofti.cetp.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chinasofti.cetp.admin.dao.UserGroupMapper;
import com.chinasofti.cetp.admin.model.UserGroup;

public class UserGroupUtils {
	private static Map<Integer, UserGroup> ugMap = null;

	public static UserGroup getUserGroup(Integer ugId) {
		if (ugMap == null) {
			UserGroupMapper userGroupMapper = BeanUtils.getBean("userGroupMapper", UserGroupMapper.class);
			ugMap = new HashMap<Integer, UserGroup>();
			List<UserGroup> list = userGroupMapper.selectByExample(null);
			for (UserGroup userGroup : list) {
				ugMap.put(userGroup.getUgId(), userGroup);
			}
		}
		return ugMap.get(ugId);
	}

}
