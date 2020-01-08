package com.lyn.demo.index.study.thread.impl;
import com.lyn.demo.index.study.constants.Constants;
import com.lyn.demo.index.study.domain.User;
import com.lyn.demo.index.study.idgen.IdGenerator;
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

    @Resource
    private IdGenerator idGenerator;

    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100,
            100,
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
                        long id = idGenerator.snowflakeId();
                        user.setId(id);
                        user.setUserNo(Constants.USER_PREFIX + id);
                        user.setIsVip((byte) 0);
                    }
                    userService.insertUserBatch(userList);
                }
            });
        }
        try {
            Thread.sleep(15000L); //这里等线程执行完
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
