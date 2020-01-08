package com.lyn.demo.index.study.service.impl.user;

import com.lyn.common.json.FastJsonUtil;
import com.lyn.demo.index.study.constants.Constants;
import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.idgen.IdGenerator;
import com.lyn.demo.index.study.service.UserService;
import com.lyn.demo.index.study.thread.processUserBatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static final Logger log = LogManager.getLogger(UserServiceImplTest.class);

    @Resource
    private UserService userService;

    @Resource
    private processUserBatch processUserBatch;

    @Resource
    private IdGenerator idGenerator;

    @Test
    public void insertUser() {
        User user = new User();
        long id = idGenerator.snowflakeId();
        user.setId(id);
        user.setUserNo(Constants.USER_PREFIX + id);
        user.setUserName("user_name1");
        userService.insertUser(user);
    }

    @Test
    public void insertUserList() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        userList.add(user);
        long id = idGenerator.snowflakeId();
        user.setId(id);
        user.setUserNo(Constants.USER_PREFIX + id);
        user.setUserName("user_name1");
        userService.insertUserBatch(userList);
    }

    @Test
    public void insertUserBatch() {
        processUserBatch.quickInsertUser();
    }

    @Test
    public void getUser() {
        User user = userService.getUser(11091427413L);
        System.out.println(FastJsonUtil.toJson(user));
    }

}