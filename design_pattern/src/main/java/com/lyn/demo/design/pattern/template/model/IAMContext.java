package com.lyn.demo.design.pattern.template.model;

import java.io.Serializable;

/**
 * @Description
 */
public class IAMContext implements Serializable {

    private IAM iam;

    public IAM getIam() {
        return iam;
    }

    public void setIam(IAM iam) {
        this.iam = iam;
    }
}
