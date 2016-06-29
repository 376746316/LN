package com.lidezheng.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lidezheng.Author.dao.AuthorMapper;
import com.lidezheng.Author.entity.Page;
import com.lidezheng.Author.model.Author;
import com.lidezheng.Author.model.AuthorExample;
import com.lidezheng.Author.model.AuthorMore;
import com.lidezheng.Blog.dao.BlogMapper;
import com.lidezheng.Blog.model.BlogMore;

@Service
public class MybatisService {
	
	@Autowired
	private AuthorMapper authorMapper;
	@Autowired
	private BlogMapper blogMapper;
	/**
	 * 返回指定条数的查询
	 * @param offset
	 * @param rows
	 * @return
	 */
	public List<Author> QueryforSplitPaper(Page page){
		return authorMapper.QueryforSplitPaper(page);
		
	}
	
	
	/**
	 * 查询数据库所有条数
	 * @return
	 */
	public int CountQueryAll(){
		return authorMapper.selectByExample(null).size();
	}
	

	/**
	 * 计算总页数
	 * @param totalNumber 数据库总条数
	 * @param pageNumber 一页的条数
	 * @return
	 */
	public int CountTotalPage(int totalNumber,int pageNumber){
		// 计算总页数
		int totalPage = totalNumber / pageNumber;
		int plus = (totalNumber % pageNumber) == 0 ? 0 : 1;
		totalPage = totalPage + plus;
		if(totalPage <= 0) {
			totalPage = 1;
		}
		return totalPage;				
	}
	public AuthorMore getInfo(String id){
//		return authorMapper.getinfo(Integer.valueOf(id));
		return null;
	}
	
	public List<BlogMore> getinfoByBlogId(Integer id){
		return blogMapper.getinfoByBlogId(id);
	}
	
	 /**
     * 分页查询
     * @param example
     * @return
     */
	public List<Author> selectByExample(AuthorExample example, RowBounds rb){
		return authorMapper.selectByExample(example, rb);
	}
}
