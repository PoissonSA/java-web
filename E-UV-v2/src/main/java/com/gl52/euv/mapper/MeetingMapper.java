package com.gl52.euv.mapper;

import com.gl52.euv.pojo.Meeting;
import com.gl52.euv.pojo.MeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingMapper {
    long countByExample(MeetingExample example);

    int deleteByExample(MeetingExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Meeting record);

    int insertSelective(Meeting record);

    List<Meeting> selectByExample(MeetingExample example);

    Meeting selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Meeting record, @Param("example") MeetingExample example);

    int updateByExample(@Param("record") Meeting record, @Param("example") MeetingExample example);

    int updateByPrimaryKeySelective(Meeting record);

    int updateByPrimaryKey(Meeting record);

    Meeting getLastMeeting(Integer groupId);

}