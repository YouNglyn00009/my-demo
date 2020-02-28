package com.lyn.demo.design.pattern.template.excutor.sex;

import com.lyn.demo.design.pattern.annonation.Excutor;
import com.lyn.demo.design.pattern.template.abstracts.AbstractExcutor;
import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import com.lyn.demo.design.pattern.template.enums.SexTypeEnum;
import com.lyn.demo.design.pattern.template.param.User;
import org.springframework.stereotype.Service;

/**
 * @Description
 */
@Service
@Excutor(ModuleEnum.MOUDLE_SEX)
public class SexExcutor extends AbstractExcutor {

    protected void excute(User user) {
        if (SexTypeEnum.MEN.equals(user.getSex()) || user.getSex() == null) {
            user.setBehavior("男人～～～");
        }
    }
}
