package com.gl52.euv.mapper;

import com.gl52.euv.pojo.Response;
import com.gl52.euv.pojo.ResponseExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ResponseMapper {
    long countByExample(ResponseExample example);

    int deleteByExample(ResponseExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Response record);

    int insertSelective(Response record);

    List<Response> selectByExampleWithBLOBs(ResponseExample example);

    List<Response> selectByExample(ResponseExample example);

    Response selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Response record, @Param("example") ResponseExample example);

    int updateByExampleWithBLOBs(@Param("record") Response record, @Param("example") ResponseExample example);

    int updateByExample(@Param("record") Response record, @Param("example") ResponseExample example);

    int updateByPrimaryKeySelective(Response record);

    int updateByPrimaryKeyWithBLOBs(Response record);

    int updateByPrimaryKey(Response record);

    List<Map<String, Object>> getResponseByEvaluationId(@Param("eid") Integer eid);
}