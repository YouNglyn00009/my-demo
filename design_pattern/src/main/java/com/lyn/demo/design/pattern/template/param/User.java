package com.lyn.demo.design.pattern.template.param;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Description
 */
@Getter
@Setter
public class User {

    private String name;

    private Integer age;

    private Byte sex;

    private String echoStr;

    private Date bir = new Date();

    @Override
    public String toString() {
        return "{"
                + "\"name\":\""
                + name + '\"'
                + ",\"age\":"
                + age
                + ",\"sex\":"
                + sex
                + ",\"echoStr\":\""
                + echoStr + '\"'
                + "}";

    }
}
