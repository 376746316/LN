package com.chinasofti.cetp.admin.dao;

import com.chinasofti.cetp.admin.model.UserGroup;
import com.chinasofti.cetp.admin.model.UserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserGroupMapper {
    int countByExample(UserGroupExample example);

    int deleteByExample(UserGroupExample example);

    int deleteByPrimaryKey(Integer ugId);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    List<UserGroup> selectByExample(UserGroupExample example);

    UserGroup selectByPrimaryKey(Integer ugId);

    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
    
    List<UserGroup> selectByExample(UserGroupExample example, RowBounds rb);
}