package com.gl52.euv.mapper;

import com.gl52.euv.pojo.Evaluation;
import com.gl52.euv.pojo.EvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationMapper {
    long countByExample(EvaluationExample example);

    int deleteByExample(EvaluationExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    List<Evaluation> selectByExampleWithBLOBs(EvaluationExample example);

    List<Evaluation> selectByExample(EvaluationExample example);

    Evaluation selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExampleWithBLOBs(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKeyWithBLOBs(Evaluation record);

    int updateByPrimaryKey(Evaluation record);
}