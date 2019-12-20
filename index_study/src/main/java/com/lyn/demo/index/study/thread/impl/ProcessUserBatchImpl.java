package com.lyn.demo.index.study.thread.impl;
import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.service.UserService;
import com.lyn.demo.index.study.thread.processUserBatch;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 */
@Service
public class ProcessUserBatchImpl implements processUserBatch {

    @Resource
    private UserService userService;

    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(50,
            50,
            30L,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>());

    @Override
    public void quickInsertUser() {
        for (int i = 0; i < 1000; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    List<User> userList = new ArrayList<>();
                    for (int j = 0; j < 500; j++) {
                        User user = new User();
                        userList.add(user);
                        user.setUserName("user_name" + j);
                        user.setSex(j % 2);
                        user.setAge(20 + (j % 20));
                    }
                    userService.insertUserBatch(userList);
                }
            });
        }
        try {
            Thread.sleep(10000L); //这里等线程执行完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
