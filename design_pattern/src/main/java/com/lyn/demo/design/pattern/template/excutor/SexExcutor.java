package com.lyn.demo.design.pattern.template.excutor;

import com.lyn.demo.design.pattern.annonation.Excutor;
import com.lyn.demo.design.pattern.template.abstracts.AbstractExcutor;
import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import com.lyn.demo.design.pattern.template.param.User;
import org.springframework.stereotype.Service;

/**
 * @Description
 */
@Service
@Excutor(moduleName = ModuleEnum.MOUDLE_SEX)
public class SexExcutor extends AbstractExcutor {

    public User excute(User user) {
        user.setSex((byte) 1);
        return user;
    }
}
