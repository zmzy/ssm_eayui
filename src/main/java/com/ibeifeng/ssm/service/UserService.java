package com.ibeifeng.ssm.service;

import com.ibeifeng.ssm.dao.IUserDao;
import com.ibeifeng.ssm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zmzy on 2016/12/2.
 */
@Service
public class UserService implements IUserService {
    private IUserDao userDao;

    @Resource
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findUsers() {
        return userDao.getUserList();
    }
}
