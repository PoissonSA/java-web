package com.gl52.euv.service.impl;

import com.gl52.euv.mapper.MeetingMapper;
import com.gl52.euv.pojo.Meeting;
import com.gl52.euv.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    private MeetingMapper meetingMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void createMeeting(int groupId, Date mDate) {
        Meeting meeting=new Meeting();
        meeting.setGroupid(groupId);
        meeting.setMdate(mDate);
        meetingMapper.insertSelective(meeting);
    }

    @Override
    public Meeting getLastMeeting(int groupId) {
        return meetingMapper.getLastMeeting(groupId);
    }
}
