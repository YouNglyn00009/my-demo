package com.lyn.demo.index.study.service.impl;

import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.service.UserService;
import com.lyn.demo.index.study.thread.processUserBatch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-main.xml"})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Resource
    private processUserBatch processUserBatch;

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserName("user_name1");
        user.setAge(22);
        user.setSex(2);
        userService.insertUser(user);
    }

    @Test
    public void insertUserList() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        userList.add(user);
        user.setUserName("user_name1");
        user.setAge(22);
        user.setSex(2);
        userService.insertUserBatch(userList);
    }

    @Test
    public void insertUserBatch() {
        processUserBatch.quickInsertUser();
    }



}