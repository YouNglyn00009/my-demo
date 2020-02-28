package com.lyn.demo.design.pattern.enums;

/**
 * @Description
 */
public enum MarkEnum {

    IS_RELIEVED_SEND_0(40, '0', "不支持", "relievedSend"),
    IS_RELIEVED_SEND_1(40, '1', "支持但未使用", "relievedSend"),
    IS_RELIEVED_SEND_2(40, '2', "鸡毛信器", "relievedSend"),
    IS_RELIEVED_SEND_3(40, '3', "鸡毛信箱", "relievedSend"),
    ;

    private final String name;
    private final char key;
    private final int index;
    private final String fieldName;

    MarkEnum(int index, char key, String name, String fieldName) {
        this.index = index;
        this.name = name;
        this.key = key;
        this.fieldName = fieldName;
    }

    public String getName() {
        return name;
    }

    public char getKey() {
        return key;
    }

    public int getIndex() {
        return index;
    }

    public String getFieldName() {
        return fieldName;
    }
}
