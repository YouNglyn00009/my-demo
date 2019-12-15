package com.lyn.demo.index.study.service.impl;

import com.lyn.demo.index.study.dao.UserDao;
import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description
 */
@Component
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
