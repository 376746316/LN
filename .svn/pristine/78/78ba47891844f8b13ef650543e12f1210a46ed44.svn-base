package com.lidezheng.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lidezheng.login.dao.LuserMapper;
import com.lidezheng.login.model.Luser;
import com.lidezheng.login.model.LuserExample;
import com.lidezheng.login.model.LuserExample.Criteria;

/**
 * @author Administrator
 *
 */
@Service
public class LuserService {
	
	@Autowired
	LuserMapper luserMapper;
	
	public int updateOneLuser(Luser luser){
		return luserMapper.updateByPrimaryKeySelective(luser);
		
	}
	/**
	 * 
	 * 删除用户
	 */
	public int deleteOne(String id){
		int flag=0;
		if(id!=null&& !"".equals(id.trim())){
			flag=luserMapper.deleteByPrimaryKey(Integer.valueOf(id));
		}
		return flag;
	}
	/**
	 * 注册用户
	 * @param luser
	 * @return
	 */
	public int register(Luser luser){
		
		return luserMapper.insertSelective(luser);
	}
	
	/**
	 * 用户登录
	 * @param luser
	 * @return luser-用户存在返回用户信息，null-用户不存在
	 */
	public Luser login(Luser luser){		
		LuserExample luserExample=new LuserExample();
		Criteria criteria = luserExample.createCriteria();
		criteria.andUsernameEqualTo(luser.getUsername());
		
		List<Luser> luserList = luserMapper.selectByExample(luserExample);
		
		return luserList.size()>0?luserList.get(0):null;	
	}
	
	/**
	 * 查询所有用户
	 * 
	 */
	public List<Luser> findLuserList(){
		return luserMapper.selectByExample(null);
	}
	
	/**
	 * 根据id查询一个用户
	 * @param id
	 * @return
	 */
	public Luser findOneLuser(String id){
		return luserMapper.selectByPrimaryKey(Integer.valueOf(id));
	}
}
