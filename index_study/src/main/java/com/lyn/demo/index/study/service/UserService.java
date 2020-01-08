package com.lyn.demo.index.study.service;

import com.lyn.demo.index.study.domain.User;

import java.util.List;

/**
 * @Description 用户服务
 */
public interface UserService {

    void insertUser(User user);

    void insertUserBatch(List<User> userList);

    User getUser(Long id);

    void updateUser(User user);

}
