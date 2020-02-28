package com.lyn.demo.design.pattern.template.model;

import com.lyn.demo.design.pattern.template.enums.SexTypeEnum;

/**
 * @Description
 */
public class IAM {

    private SexTypeEnum sexTypeEnum;

    public SexTypeEnum getSexTypeEnum() {
        return sexTypeEnum;
    }

    public void setSexTypeEnum(SexTypeEnum sexTypeEnum) {
        this.sexTypeEnum = sexTypeEnum;
    }
}
