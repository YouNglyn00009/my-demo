package com.lyn.demo.design.pattern.template.excutor.sex;

import com.lyn.demo.design.pattern.annonation.Excutor;
import com.lyn.demo.design.pattern.annonation.ChooseSexType;
import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import com.lyn.demo.design.pattern.template.enums.SexTypeEnum;
import com.lyn.demo.design.pattern.template.param.User;
import org.springframework.stereotype.Service;

/**
 * @Description
 */
@Service
@Excutor(ModuleEnum.MOUDLE_SEX)
@ChooseSexType(SexTypeEnum.WOMEN)
public class WomenSexExcutor extends SexExcutor {

    @Override
    protected void excute(User user) {
        if (SexTypeEnum.WOMEN.getCode().equals(user.getSex())) {
            user.setBehavior("女人～～～");
        }
    }
}
