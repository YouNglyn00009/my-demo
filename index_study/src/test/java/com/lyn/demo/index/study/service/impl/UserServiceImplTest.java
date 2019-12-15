package com.lyn.demo.index.study.service.impl;

import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-main.xml"})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void insertUser() {
        User user = new User();
        user.setAge(12);
        user.setUserNo("LBU" + String.format("%012d", 1));
        user.setSex(1);
        user.setNickName("a-bu");
        user.setUserName("abu");
        user.setCreateUser("abu");
        user.setUpdateUser("abu");
        userService.insertUser(user);
        System.out.println("insert success");
    }
}