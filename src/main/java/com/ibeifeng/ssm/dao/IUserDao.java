package com.ibeifeng.ssm.dao;

import com.ibeifeng.ssm.model.User;

import java.util.List;

/**
 * Created by zmzy on 2016/12/2.
 */
public interface IUserDao {
    public List<User> getUserList();
}
