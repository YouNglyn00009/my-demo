package com.lyn.demo.design.pattern.template.enums;

/**
 * @Description
 */
public enum ModuleEnum {

    MOUDLE_NAME("NAME", "姓名"),
    MOUDLE_AGE("AGE", "年龄"),
    MOUDLE_SEX("SEX", "性别"),

    ;

    private String moudleName;

    private String moudleDesc;

    ModuleEnum(String moudleName, String moudleDesc) {
        this.moudleName = moudleName;
        this.moudleDesc = moudleDesc;
    }

    public String getMoudleName() {
        return moudleName;
    }

    public void setMoudleName(String moudleName) {
        this.moudleName = moudleName;
    }

    public String getMoudleDesc() {
        return moudleDesc;
    }

    public void setMoudleDesc(String moudleDesc) {
        this.moudleDesc = moudleDesc;
    }}
