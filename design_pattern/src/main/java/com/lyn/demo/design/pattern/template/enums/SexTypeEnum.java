package com.lyn.demo.design.pattern.template.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 */
public enum SexTypeEnum {

    MEN(Byte.valueOf("1"), "男性"),
    WOMEN(Byte.valueOf("2"), "女性"),

    ;

    private Byte code;
    private String desc;

    SexTypeEnum(Byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Byte getCode() {
        return code;
    }

    public void setCode(Byte code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private static final Map<Byte, SexTypeEnum> enumMap = new HashMap<Byte, SexTypeEnum>();

    static {
        for (SexTypeEnum typeEnum : SexTypeEnum.values()) {
            enumMap.put(typeEnum.getCode(), typeEnum);
        }
    }

    public static SexTypeEnum getSexTypeEnum(Byte key) {
        return enumMap.get(key);
    }
}



