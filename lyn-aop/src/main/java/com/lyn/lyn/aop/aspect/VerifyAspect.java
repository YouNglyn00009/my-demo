package com.lyn.lyn.aop.aspect;

import com.lyn.common.common.ApiRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description
 */
@Component
@Aspect
@Slf4j
public class VerifyAspect {


    @Before("@annotation(com.lyn.lyn.aop.annonation.Verify)")
    public void verifyRequest(JoinPoint pj) throws Throwable {
        Object[] args = pj.getArgs();
        for (Object arg : args) {
            if (arg instanceof ApiRequest) {
                ApiRequest apiRequest = (ApiRequest) arg;
                if (StringUtils.isBlank(apiRequest.getFromApp())) {
                    throw new IllegalArgumentException("fromApp cannot blank");
                }
                if (StringUtils.isBlank(apiRequest.getUserName())) {
                    throw new IllegalArgumentException("userName cannot blank");
                }
            }
        }
    }

}
