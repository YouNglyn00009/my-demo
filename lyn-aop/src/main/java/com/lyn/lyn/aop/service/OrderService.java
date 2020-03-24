package com.lyn.lyn.aop.service;

import com.lyn.common.common.ApiRequest;
import com.lyn.common.common.ApiResponse;
import com.lyn.common.json.FastJsonUtil;
import com.lyn.lyn.aop.annonation.Verify;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description
 */
@Service
@Slf4j
public class OrderService {

    @Verify
    public ApiResponse queryOrder(ApiRequest apiRequest) {
        log.info("queryOrder request:{}", FastJsonUtil.toJson(apiRequest));
        return ApiResponse.ofSuccess();
    }

}
