package com.lyn.demo.design.pattern.template.excutor;

import com.lyn.demo.design.pattern.annonation.Excutor;
import com.lyn.demo.design.pattern.template.abstracts.AbstractExcutor;
import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import com.lyn.demo.design.pattern.template.param.User;
import com.lyn.demo.design.pattern.template.rpc.UserRpcService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description
 */
@Log4j2
@Service
@Excutor(ModuleEnum.MOUDLE_NAME)
public class NameExcutor extends AbstractExcutor {

    @Resource
    private UserRpcService userRpcService;

    public void excute(User user) {
        user.setName("yl");
        String echoStr = userRpcService.processUser(user);
        user.setEchoStr(echoStr);
    }
}
