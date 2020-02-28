package com.lyn.demo.design.pattern.annonation;

import com.lyn.demo.design.pattern.template.enums.SexTypeEnum;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ChooseSexType {

    SexTypeEnum[] value();

}
