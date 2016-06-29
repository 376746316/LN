package com.chinasofti.cetp.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chinasofti.cetp.study.dao.TechTypeMapper;
import com.chinasofti.cetp.study.model.TechType;
import com.chinasofti.cetp.study.model.TechTypeExample;

public class TechTypeUtils {
	private static final Map<Integer, TechType> techTypes = new HashMap<Integer, TechType>();
	private static final Map<Integer, List<TechType>> techTypeMap = new HashMap<Integer, List<TechType>>();
	private static final Map<Integer, List<TechType>> subTechTypeMap = new HashMap<Integer, List<TechType>>();
	private static TechTypeMapper mapper = BeanUtils.getBean("techTypeMapper", TechTypeMapper.class);
	private static final String PRE = "--";

	public static void refreshAll() {
		techTypes.clear();
		techTypeMap.clear();
		subTechTypeMap.clear();
	}

	public static List<TechType> getList(Integer parentId) {
		if (!techTypeMap.containsKey(parentId)) {
			List<TechType> techTypeList = new ArrayList<TechType>();
			if (parentId != 0) {
				TechType tt = mapper.selectByPrimaryKey(parentId);
				if (tt == null) {
					return null;
				}
				techTypeList.add(tt);
			}
			TechTypeExample example = new TechTypeExample();
			example.createCriteria().andTechTypeParentEqualTo(parentId);
			List<TechType> subTechTypeList = mapper.selectByExample(example);

			for (TechType techType : subTechTypeList) {
				List<TechType> ttl = getList(techType.getTechTypeId());
				for (TechType techType2 : ttl) {
					TechType newTT = new TechType();
					org.springframework.beans.BeanUtils.copyProperties(techType2, newTT);
					if (parentId != 0) {
						newTT.setTechTypeName(PRE + techType2.getTechTypeName());
					}
					techTypeList.add(newTT);
				}

			}
			techTypeMap.put(parentId, techTypeList);
		}
		return techTypeMap.get(parentId);
	}

	public static List<TechType> getSubList(Integer parentId) {
		if (!subTechTypeMap.containsKey(parentId)) {
			TechTypeExample example = new TechTypeExample();
			example.createCriteria().andTechTypeParentEqualTo(parentId);
			List<TechType> techTypeList = mapper.selectByExample(example);

			subTechTypeMap.put(parentId, techTypeList);
		}
		return subTechTypeMap.get(parentId);
	}

	public static List<TechType> getAllTechType() {
		List<TechType> list = new ArrayList<TechType>();
		if (techTypes.size() == 0) {
			refreshTechType();
		}
		list.addAll(techTypes.values());
		return list;
	}

	public static TechType getTechType(Integer techTypeId) {
		if (techTypeId == null) {
			return null;
		}
		if (!techTypes.containsKey(techTypeId)) {
			refreshTechType();
		}
		return techTypes.get(techTypeId);
	}

	public static void refreshTechType() {
		techTypes.clear();
		List<TechType> list = mapper.selectByExample(null);
		for (TechType techType : list) {
			techTypes.put(techType.getTechTypeId(), techType);
		}
	}

	public static List<TechType> findParents(int childId) {
		List<TechType> allList = TechTypeUtils.getAllTechType();
		List<TechType> result = new ArrayList<TechType>();
		for (int i = allList.size() - 1; i >= 0; i--) {
			TechType vo = (TechType) allList.get(i);
			if (vo.getTechTypeId() == childId) {
				result.add(vo);
				if (vo.getTechTypeParent() != 0) {
					childId = vo.getTechTypeParent();
				}
			}
		}
		return result;
	}

}
