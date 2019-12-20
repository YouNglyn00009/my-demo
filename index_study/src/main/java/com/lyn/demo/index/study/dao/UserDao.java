package com.lyn.demo.index.study.dao;

import com.lyn.demo.index.study.domain.User;

import java.util.List;

/**
 * @Description
 */
public interface UserDao {


    void insertUser(User user);

    void insertUserBatch(List<User> userList);
}
