package com.lyn.demo.index.study.service.impl;

import com.lyn.common.enums.JedisTimeUnit;
import com.lyn.common.json.FastJsonUtil;
import com.lyn.demo.index.study.constants.Constants;
import com.lyn.demo.index.study.dao.UserDao;
import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.jedis.JedisClient;
import com.lyn.demo.index.study.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang.StringUtils;
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

    @Resource
    private JedisClient jedisClient;

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

    @Override
    public User getUser(Long id) {

        String userStr = jedisClient.get(Constants.LYN_USER_REDIS_KEY_PREFIX + id);
        if (!StringUtils.isBlank(userStr)) {
            return FastJsonUtil.fromJson(userStr, User.class);
        }

        User user = userDao.getUser(id);
        try {
            if (user != null) {
                jedisClient.setExpire(Constants.LYN_USER_REDIS_KEY_PREFIX + user.getId(), FastJsonUtil.toJson(user), 10L, JedisTimeUnit.MINUTES);
            }
        } catch (Exception e) {
            log.error("保存用户信息到redis时发生异常,ID:" + id, e);
        }
        return user;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateUser(User user) {
        if (user == null) {
            return;
        }
        userDao.updateUser(user);
        jedisClient.delete(Constants.LYN_USER_REDIS_KEY_PREFIX + user.getId());
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
