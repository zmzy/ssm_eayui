package com.ibeifeng.ssm.dao;

import com.ibeifeng.ssm.mapper.UserMapper;
import com.ibeifeng.ssm.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zmzy on 2016/12/2.
 */
@Repository
public class UserDao implements IUserDao {
    private UserMapper userMapper;

    @Resource
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
