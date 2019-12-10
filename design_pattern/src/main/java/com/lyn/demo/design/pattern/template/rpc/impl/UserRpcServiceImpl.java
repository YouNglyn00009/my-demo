package com.lyn.demo.design.pattern.template.rpc.impl;

import com.lyn.demo.design.pattern.annonation.MyLog;
import com.lyn.demo.design.pattern.template.param.User;
import com.lyn.demo.design.pattern.template.rpc.UserRpcService;
import org.springframework.stereotype.Service;

/**
 * @Description
 */
@Service
public class UserRpcServiceImpl implements UserRpcService {

    @MyLog
    @Override
    public String processUser(User user) {
        return "hello " + user.getName();
    }
}
