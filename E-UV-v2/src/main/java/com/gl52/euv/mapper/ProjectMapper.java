package com.gl52.euv.mapper;

import com.gl52.euv.pojo.Project;
import com.gl52.euv.pojo.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    long countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer projectid);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Integer projectid);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    List<Project> selectByPageIndex(@Param("offset")Integer offset, @Param("limit")Integer limit);
}