package com.ibeifeng.ssm.test;

import com.ibeifeng.ssm.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import javax.security.auth.login.Configuration;
import java.util.List;

/**
 * Created by zmzy on 2016/12/2.
 */

public class TestSSM {
    private SqlSessionTemplate sqlSessionTemplate;

    @Resource
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Test
    public void test01(){
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
        sqlSessionTemplate = factory.getBean("sqlSessionTemplate",SqlSessionTemplate.class);
        List<User> list = sqlSessionTemplate.selectList("com.ibeifeng.ssm.model.User.getUserList");
        System.out.println(list);
    }
}
