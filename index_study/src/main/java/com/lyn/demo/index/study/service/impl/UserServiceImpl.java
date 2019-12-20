package com.lyn.demo.index.study.service.impl;

import com.lyn.demo.index.study.dao.UserDao;
import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 */
@Component
@Log4j2
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
        log.info("添加用户信息完成");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insertUserBatch(List<User> userList) {
        userDao.insertUserBatch(userList);
        log.info("批量添加用户信息完成");
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
