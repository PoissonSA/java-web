package com.gl52.euv.mapper;

import com.gl52.euv.pojo.User;
import com.gl52.euv.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int inseselectByPrimaryKeyrt(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByNameAndPassword(@Param("userName")String userName, @Param("password")String password);
    List<User> selectByGroupId(@Param("groupId")Integer groupId);
}