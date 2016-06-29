package com.chinasofti.cetp.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cetp.admin.dao.AreaMapper;
import com.chinasofti.cetp.admin.model.Area;
import com.chinasofti.cetp.admin.model.MoreArea;
import com.chinasofti.cetp.utils.ReaderXmlParam;

/**
 * <p>
 * 		package:com.chinasofti.cetp.admin.service
 *      <br>
 *      class:AreaService
 *      <br>
 *      description:地区管理服务层
 *      <br>
 *      createdate:2013-07-26
 * </p>
 * @author JianWang
 * @version 1.0
 * */
@Service("areaService")
public class AreaService {
	@Autowired
	private AreaMapper areaMapper;//地区管理mapper引用对象
	/**
	 * <p>
	 * 		method:getAreamapper
	 * 		<br>
	 * 		description:获取地区管理mapper对象的方法
	 * </p>
	 * @return AreaMapper
	 * */
	public AreaMapper getAreaMapper() {
		return areaMapper;
	}
	/**
	 * <p>
	 * 		method:setAreamapper
	 * 		<br>
	 * 		description:获取地区管理mapper对象的方法
	 * </p>
	 * @param areaMapper AreaMapper
	 * */
	public void setAreamapper(AreaMapper areaMapper) {
		this.areaMapper = areaMapper;
	}
	/**
	 * <p>
	 * 		method:selectAllArea
	 * 		<br>
	 * 		description:查询地区数据列表
	 * </p>
	 * @return List<MoreArea>
	 * */
	public List<MoreArea> selectAllArea(Integer parentId) {
		/*第1步：调用mapper层的获取地区列表的方法*/
		return areaMapper.selectAllArea(parentId);
	}
	/**
	 * <p>
	 * 		method:selectConitionArea
	 * 		<br>
	 * 		description:查询地区数据列表
	 * </p>
	 * @param rows int
	 * @param page int
	 * @param map HashMap
	 * @return List<MoreArea>
	 * */
	public List<MoreArea> selectConitionArea(int rows, int page,HashMap map) {
		/*第1步:调用mapper层的获取地区列表的方法*/
		List<MoreArea> list = areaMapper.selectConitionArea(map);
		/*第2步:实例化分页后的数据集合*/
		List<MoreArea> subList = new ArrayList<MoreArea>();
		/*第3步:获取数据起始位置*/
		int start = (page - 1) * rows;
		/*第4步:从数据起始位置开始，将数据项放入到迭代器中*/
		Iterator<MoreArea> itor = list.listIterator(start);
		/*第5步:定义循环记录次数变量n*/
		int n = 0;
		/*第6步:遍历数据，数据条目数目等于每页行数-1*/
		while (itor.hasNext() && n < rows) {
			MoreArea moreArea = itor.next();
			String parammain = ReaderXmlParam.getInstance().getParammain("50",moreArea.getAreaStatus());
			moreArea.setAreaStatus(parammain);
			subList.add(moreArea);//获取单条数据
			n++;//记录数累加
		}
		/*第7步:将分页后的数据集合，返回至AreaController控制层*/
		return subList;
	}
	/**
	 * <p>
	 * 		method:getAreaPerPage
	 * 		<br>
	 * 		description:查询地区数据列表进行分页
	 * </p>
	 * @param rows int
	 * @param page int
	 * */
	public List<MoreArea> getAreaPerPage(int rows, int page,Integer parentId) {
		/*第1步:调用mapper层的获取地区列表的方法*/
		List<MoreArea> list = areaMapper.selectAllArea(parentId);
		/*第2步:实例化分页后的数据集合*/
		List<MoreArea> subList = new ArrayList<MoreArea>();
		/*第3步:获取数据起始位置*/
		int start = (page - 1) * rows;
		/*第4步:从数据起始位置开始，将数据项放入到迭代器中*/
		Iterator<MoreArea> itor = list.listIterator(start);
		/*第5步:定义循环记录次数变量n*/
		int n = 0;
		/*第6步:遍历数据，数据条目数目等于每页行数-1*/
		while (itor.hasNext() && n < rows) {
			//subList.add((MoreArea) itor.next());//获取单条数据		
			MoreArea moreArea = itor.next();
			String parammain = ReaderXmlParam.getInstance().getParammain("50",moreArea.getAreaStatus());
			moreArea.setAreaStatus(parammain);
			subList.add(moreArea);//获取单条数据
			n++;//记录数累加
		}
		/*第7步:将分页后的数据集合，返回至AreaController控制层*/
		return subList;
	}
	/**
	 * <p>
	 * 		method:updateinit
	 * 		<br>
	 * 		description:查询修改页面初始化数据
	 * </p>
	 * @param updareaCode String
	 * */
	public Area updateinit(String areaCodeupd) {
		/*第1步:调用mapper层的获取地区列表的方法*/
		Area area = areaMapper.selectByPrimaryKey(areaCodeupd);	
		/*第2步:将查询后的数据集合，返回至AreaController控制层*/
		return area;
	}
	
	/**
	 * <p>
	 * 		method:insertSave
	 * 		<br>
	 * 		description:添加页面新建地区数据
	 * </p>
	 * @param map HashMap
	 * */
	public boolean insertSave(HashMap map) {
		boolean successflag = false;//修改是否成功的标识符
		/*第1步:调用mapper层的更新地区的方法*/
		int row = areaMapper.insertSave(map);
		/*第2步:判断row返回值是否大于0，如果等于1，修改成功*/
		if(row==1){
			successflag=true;
		}
		/*第3步:将判断结果，返回至AreaController控制层*/
		return successflag;
	}
	
	/**
	 * <p>
	 * 		method:updateSave
	 * 		<br>
	 * 		description:修改页面更新地区数据
	 * </p>
	 * @param map HashMap
	 * */
	public boolean updateSave(HashMap map) {
		boolean successflag = false;//修改是否成功的标识符
		/*第1步:调用mapper层的更新地区的方法*/
		int row = areaMapper.updateSave(map);
		/*第2步:判断row返回值是否大于0，如果等于1，修改成功*/
		if(row==1){
			successflag=true;
		}
		/*第3步:将判断结果，返回至AreaController控制层*/
		return successflag;
	}
	/**
	 * <p>
	 * 		method:deleteSave
	 * 		<br>
	 * 		description:删除地区
	 * </p>
	 * @param updareaCode String
	 * */
	public boolean deleteSave(String areaCodeupd) {
		boolean successflag = false;//修改是否成功的标识符
		/*第1步:调用mapper层的更新地区的方法*/
		int row = areaMapper.deleteByPrimaryKey(areaCodeupd);
		/*第2步:判断row返回值是否大于0，如果等于1，删除成功*/
		if(row==1){
			successflag=true;
		}
		/*第3步:将判断结果，返回至AreaController控制层*/
		return successflag;
	}
}
