package com.lyn.portal.param;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

/**
 * @Description
 */
@Data
public class TestParam {

    @NotBlank(message = "姓名不能为空")
    @Max(value = 3, message = "用户名长度必须小于3")
    private String name;

    @NotBlank(message = "密码不能为空")
    private String pwd;

}
