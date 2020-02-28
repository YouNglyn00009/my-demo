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
@Excutor(ModuleEnum.MOUDLE_AGE)
public class AgeExcutor extends AbstractExcutor {

    public void excute(User user) {
        user.setAge(11);
    }
}
