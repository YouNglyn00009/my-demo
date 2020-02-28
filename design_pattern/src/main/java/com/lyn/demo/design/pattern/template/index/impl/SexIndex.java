package com.lyn.demo.design.pattern.template.index.impl;

import com.lyn.common.utils.CommonUtils;
import com.lyn.demo.design.pattern.annonation.ChooseSexType;
import com.lyn.demo.design.pattern.template.abstracts.AbstractExcutor;
import com.lyn.demo.design.pattern.template.enums.SexTypeEnum;
import com.lyn.demo.design.pattern.template.index.AbstractIndexStrategy;
import com.lyn.demo.design.pattern.template.model.ChooseContext;
import com.lyn.demo.design.pattern.template.model.IAMContext;
import org.apache.commons.lang.ArrayUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 */
public class SexIndex extends AbstractIndexStrategy<IAMContext, AbstractExcutor> {
    @Override
    public String[] key(ChooseContext<AbstractExcutor> chooseAnnotationContext) {

        ChooseSexType chooseSexType = chooseAnnotationContext.getChooseSexType();
        if (chooseSexType == null) {
            return null;
        }

        SexTypeEnum[] sexTypeEnums = chooseSexType.value();


        if (ArrayUtils.isEmpty(sexTypeEnums)) {
            throw new IllegalArgumentException("验证服务【" + CommonUtils.formatClassName(chooseAnnotationContext.getService()) + "】使用了注解@ChooseSexType，但未指定value");
        }

        Set<String> resultSet = new HashSet<String>();

        for (SexTypeEnum enumValue : sexTypeEnums) {
            resultSet.add(enumValue.getCode() + "");
        }

        String[] result = new String[resultSet.size()];
        resultSet.toArray(result);
        return result;
    }

    @Override
    public String key(IAMContext context) {
        SexTypeEnum sexTypeEnum = context.getIam().getSexTypeEnum();
        return sexTypeEnum == null ? "" : String.valueOf(sexTypeEnum.getCode());
    }
}
