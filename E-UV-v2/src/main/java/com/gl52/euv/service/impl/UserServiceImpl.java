package com.gl52.euv.service.impl;

import com.gl52.euv.mapper.UserMapper;
import com.gl52.euv.pojo.User;
import com.gl52.euv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User identify(String name,String password) {
        return this.userMapper.selectByNameAndPassword(name,password);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertGroupId(int userId, int groupId) {
        User user=userMapper.selectByPrimaryKey(userId);
        user.setGroupid(groupId);
        userMapper.updateByPrimaryKeySelective(user);

    }

    @Override
    public boolean isHasGroup(int userId) {
        User user=userMapper.selectByPrimaryKey(userId);
        return user.getGroupid() != null;
    }

    @Override
    public int getGroupId(int userId) {
        return userMapper.selectByPrimaryKey(userId).getGroupid();
    }

    @Override
    public List<User> getUserByGroupId(int groupId) {
        return userMapper.selectByGroupId(groupId);
    }


}
