package com.gl52.euv.mapper;

import com.gl52.euv.pojo.Group;
import com.gl52.euv.pojo.GroupExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface GroupMapper {
    long countByExample(GroupExample example);

    int deleteByExample(GroupExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(Group record);

    int insertSelective(Group record);

    List<Group> selectByExampleWithBLOBs(GroupExample example);

    List<Group> selectByExample(GroupExample example);

    Group selectByPrimaryKey(Integer groupid);

    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByExampleWithBLOBs(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKeyWithBLOBs(Group record);

    int updateByPrimaryKey(Group record);

    List<Map<String, Object>> selectByPageIndex(@Param("offset")  Integer offset, @Param("limit")  Integer limit);
}