package com.lidezheng.Author.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.lidezheng.Author.entity.Page;
import com.lidezheng.Author.model.Author;
import com.lidezheng.Author.model.AuthorExample;
import com.lidezheng.Author.model.AuthorMore;

public interface AuthorMapper {
    int countByExample(AuthorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Author record);

    int insertSelective(Author record);

    List<Author> selectByExample(AuthorExample example);

    Author selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
    
    public AuthorMore getinfo(int id);
    
    public List<Author> QueryforSplitPaper(Page page);
    
    /**
     * 分页查询
     * @param example
     * @return
     */
    List<Author> selectByExample(AuthorExample example, RowBounds rb);
}