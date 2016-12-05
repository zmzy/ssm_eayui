package com.ibeifeng.ssm.controller;

import com.ibeifeng.ssm.mapper.UserMapper;
import com.ibeifeng.ssm.model.User;
import com.ibeifeng.ssm.service.IUserService;
import com.ibeifeng.ssm.util.DataGrid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zmzy on 2016/12/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private IUserService userService;

    @Resource
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public DataGrid<User> list(){
        List<User> users = userService.findUsers();
        DataGrid<User> dg = new DataGrid<User>();
        dg.setTotal(users.size());
        dg.setRows(users);
        return dg;
    }
}
