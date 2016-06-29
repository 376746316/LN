package com.chinasofti.cetp.admin.model;

/**
 * 
 * @Company : ICS&S DL-ETC
 *
 * @Author : HuangQi
 * @Version : 1.0
 * @Create : 20132013-8-27上午10:02:06
 * TODO : 组织管理自连接
 */
public class MoreOrg extends Org{
	
	private String orgParentName;

	public String getOrgParentName() {
		return orgParentName;
	}

	public void setOrgParentName(String orgParentName) {
		this.orgParentName = orgParentName;
	}

}
