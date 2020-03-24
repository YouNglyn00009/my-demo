package com.lyn.lyn.aop;

import com.lyn.common.common.ApiRequest;
import com.lyn.common.common.ApiResponse;
import com.lyn.lyn.aop.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LynAopApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void contextLoads() {
        ApiRequest apiRequest = new ApiRequest();
        apiRequest.setFromApp("lyn-1");
//        apiRequest.setUserName("yk");
        ApiResponse apiResponse = orderService.queryOrder(apiRequest);
        System.out.println(apiResponse.isSuccss());
    }

}
