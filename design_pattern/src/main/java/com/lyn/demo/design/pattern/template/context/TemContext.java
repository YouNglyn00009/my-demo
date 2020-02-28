package com.lyn.demo.design.pattern.template.context;

import com.lyn.demo.design.pattern.template.enums.SexTypeEnum;
import com.lyn.demo.design.pattern.template.model.IAM;
import com.lyn.demo.design.pattern.template.model.IAMContext;
import com.lyn.demo.design.pattern.template.param.User;
import lombok.Data;

/**
 * @Description
 */
@Data
public class TemContext extends IAMContext {

    private User user;

    public static TemContext create(User user) {
        if (user == null) {
            throw new NullPointerException("user can not be null");
        }
        TemContext temContext = new TemContext();
        temContext.setUser(user);
        IAM iam = new IAM();
        iam.setSexTypeEnum(SexTypeEnum.getSexTypeEnum(user.getSex()));
        temContext.setIam(iam);
        return temContext;
    }

}
