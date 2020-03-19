package com.lyn.portal.controller;

import com.lyn.common.common.ApiResponse;
import com.lyn.portal.param.TestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @Description
 */
@RestController
public class UserController {

    @PostMapping("user/addUser")
    public ApiResponse addUser(@Valid @RequestBody TestParam testParam) {

        return ApiResponse.ofSuccess();

    }

}
