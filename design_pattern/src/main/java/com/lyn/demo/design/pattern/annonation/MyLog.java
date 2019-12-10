package com.lyn.demo.design.pattern.annonation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MyLog {

    String businessName() default "";

}
