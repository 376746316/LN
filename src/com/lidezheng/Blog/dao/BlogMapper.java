package com.lidezheng.Blog.dao;

import com.lidezheng.Blog.model.Blog;
import com.lidezheng.Blog.model.BlogExample;
import com.lidezheng.Blog.model.BlogMore;

import java.util.List;

public interface BlogMapper {
    int countByExample(BlogExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogExample example);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
    
    List<BlogMore> getinfoByBlogId(int id);
}