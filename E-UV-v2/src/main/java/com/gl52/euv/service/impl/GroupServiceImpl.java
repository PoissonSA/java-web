package com.gl52.euv.service.impl;

import com.gl52.euv.mapper.GroupMapper;
import com.gl52.euv.pojo.Group;
import com.gl52.euv.pojo.GroupExample;
import com.gl52.euv.pojo.Meeting;
import com.gl52.euv.pojo.User;
import com.gl52.euv.service.GroupService;
import com.gl52.euv.service.MeetingService;
import com.gl52.euv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 团队管理业务层
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupMapper groupMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private MeetingService meetingService ;
    @Override
    public Map<String, Object> getAllGroups(Map<String, Object> param) {
        GroupExample example=new GroupExample();
        Map<String,Object> map = new HashMap<>();
        List<Map<String, Object>> groupsList=groupMapper.selectByPageIndex(Integer.parseInt((String) param.get("offset")),Integer.parseInt((String) param.get("limit")));
//        List<Group> groupsList =groupMapper.selectByPageIndex(Integer.parseInt((String) param.get("offset")),Integer.parseInt((String) param.get("limit")));
        Integer total= Math.toIntExact(groupMapper.countByExample(example));
        map.put("total",total);
        map.put("rows",groupsList);
        return map;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer createGroup(String groupName, int subjectId, int userId) {
        if(!userService.isHasGroup(userId)){
            Group group=new Group();
            group.setSubjectid(subjectId);
            group.setProjectmanager(userId);
            group.setGroupname(groupName);
            group.setIsValid(0);
            int groupId=groupMapper.insertSelective(group);
            userService.insertGroupId(userId,group.getGroupid());
            return group.getGroupid();
        }
        return null;
    }

    @Override
    public boolean joinGroup(int groupId, int userId) {
        if(!userService.isHasGroup(userId)){
            userService.insertGroupId(userId,groupId);
            return true;
        }
            return false;
    }

    @Transactional(readOnly=true)
    @Override
    public HashMap getGroupByUserId(int userId) {
        if(!userService.isHasGroup(userId)){
            return null;
        }else{
            HashMap hashMap=new HashMap();
            int groupId=userService.getGroupId(userId);
            Group group=groupMapper.selectByPrimaryKey(groupId);
            List<User> users=userService.getUserByGroupId(groupId);
            Meeting meeting=meetingService.getLastMeeting(groupId);
            hashMap.put("group",group);
            hashMap.put("users",users);
            hashMap.put("meeting",meeting);
            return hashMap;
        }
    }

    @Transactional(readOnly=true)
    @Override
    public HashMap getGroupByGroupId(int groupId) {
        HashMap hashMap=new HashMap();
        Group group=groupMapper.selectByPrimaryKey(groupId);
        List<User> users=userService.getUserByGroupId(groupId);
        Meeting meeting=meetingService.getLastMeeting(groupId);
        hashMap.put("group",group);
        hashMap.put("users",users);
        hashMap.put("meeting",meeting);
        return hashMap;
    }

    @Transactional
    @Override
    public void saveFichier(String originalFilename, byte[] data, int groupId) {
        Group group=groupMapper.selectByPrimaryKey(groupId);
        group.setFile(data);
        group.setFilename(originalFilename);
        groupMapper.updateByPrimaryKeyWithBLOBs(group);
    }
    @Transactional
    @Override
    public void validerGroup(int groupId) {
        Group group=groupMapper.selectByPrimaryKey(groupId);
        group.setIsValid(1);
        groupMapper.updateByPrimaryKeyWithBLOBs(group);
    }
}
