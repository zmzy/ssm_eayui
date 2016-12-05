package com.ibeifeng.ssm.service;

import com.ibeifeng.ssm.model.User;

import java.util.List;

/**
 * Created by zmzy on 2016/12/2.
 */
public interface IUserService {
    public List<User> findUsers();
}
