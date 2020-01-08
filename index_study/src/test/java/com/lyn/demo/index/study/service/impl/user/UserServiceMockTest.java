package com.lyn.demo.index.study.service.impl.user;

import com.lyn.common.utils.AopTargetUtils;
import com.lyn.demo.index.study.constants.Constants;
import com.lyn.demo.index.study.dao.UserDao;
import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.jedis.JedisClient;
import com.lyn.demo.index.study.service.UserService;
import com.lyn.demo.index.study.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;


/**
 * @Description
 * Mock测试
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-main.xml"})
public class UserServiceMockTest {

    @Mock
    private JedisClient jedisClient;

    @Mock
    private UserDao userDao;

    private UserService userService = new UserServiceImpl();

    @Before
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(AopTargetUtils.getTarget(userService), "jedisClient", jedisClient);
        ReflectionTestUtils.setField(AopTargetUtils.getTarget(userService), "userDao", userDao);
    }

    @Test
    public void getUserTest() {
        User user = new User();
        user.setId(1214818869726806016L);
        user.setUserNo("LUP1214818869726806016");
        Mockito.when(jedisClient.get(Mockito.anyString())).thenReturn("");

        Mockito.when(userDao.getUser(Mockito.anyLong())).thenReturn(user);

        Mockito.when(jedisClient.set(Mockito.anyString(), Mockito.anyString())).thenReturn(true);

        User user1 = userService.getUser(1214818869726806016L);
    }

}
