package com.chinasofti.cetp.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.chinasofti.cetp.utils.TypeVO;

public class TypeTreeHelper {
	private static final Logger logger = Logger.getLogger(DocConverter.class);
	/**
	 * 得到后代列表
	 * 
	 */
	public List<TypeVO> allList;

	public List<TypeVO> getAllList() {
		return allList;
	}

	public void setAllList(List<TypeVO> allList) {
		this.allList = allList;
	}

	public String getChildrenList(Integer parentid) {

		// TypeVO parentObj = findByPrimary(parentid);
		// if(parentObj == null){
		// logger.info("root:");
		// }else{
		// logger.info("{id:"+ parentObj.getId() + "text:" +
		// parentObj.getName());
		// }
		StringBuffer buffer = new StringBuffer("");
		List<TypeVO> childlist = findChild(parentid);
		String json = "[{\"id\":1,\"text\":\"java\"},{\"id\":2,\"text\":\"C\",\"children\":[{\"id\":3,\"text\":\"C++\"}]}]";
		if (childlist != null && childlist.size() > 0) {
			logger.info(",children:[");
			buffer.append(",children:[");
			for (int i = 0; i < childlist.size(); i++) {
				TypeVO bean = (TypeVO) childlist.get(i);

				logger.info("{\"id\":" + bean.getId() + ",\"text\":\"" + bean.getName() + "\"");
				buffer.append("{\"id\":" + bean.getId() + ",\"text\":\"" + bean.getName() + "\"");
				getChildrenList(bean.getId());
				if (i < childlist.size() - 1) {
					logger.info("},");
					buffer.append("},");
				} else {
					logger.info("}");
					buffer.append("}");
				}

			}
			logger.info("]");
			buffer.append("]");
		}
		// logger.info("}");
		// buffer.append("}");
		return buffer.toString();
	}

	public List<TypeVO> findChild(int parentId) {
		List<TypeVO> result = new ArrayList<TypeVO>();
		for (int i = 0; i < allList.size(); i++) {
			TypeVO vo = (TypeVO) allList.get(i);
			if (vo.getParentId() == parentId) {
				result.add(vo);
			}
		}
		return result;
	}

	public List<TypeVO> findParents(int childId) {
		List<TypeVO> result = new ArrayList<TypeVO>();
		for (int i = allList.size(); i >= 0; i--) {
			TypeVO vo = (TypeVO) allList.get(i);
			if (vo.getId() == childId) {
				result.add(vo);
				if (vo.getParentId() != 0) {
					childId = vo.getParentId();
				}
			}
		}
		return result;
	}

	public TypeVO findByPrimary(int id) {
		TypeVO result = null;
		for (int i = 0; i < allList.size(); i++) {
			TypeVO vo = (TypeVO) allList.get(i);
			if (vo.getId() == id) {
				result = vo;
				break;
			}
		}
		return result;
	}
}
