package com.lyn.demo.design.pattern.annonation.aspect;

import com.lyn.common.json.FastJsonUtil;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Description
 */
@Log4j2
@Aspect
@Component
@Order(1)
public class MyLogAspect {

    @Around("@annotation(com.lyn.demo.design.pattern.annonation.MyLog)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        long startTime = System.nanoTime();
        String url = String.format("%s.%s", pjp.getSignature().getDeclaringTypeName(), pjp.getSignature().getName());

        try {
            if (log.isInfoEnabled()) {
                log.info("{},调用开始:{},入参为:{}", startTime, url, FastJsonUtil.toJson(pjp.getArgs()));
            }
            Object result = pjp.proceed();
            if (log.isInfoEnabled()) {
                log.info("{},调用结束:{},出参为:{}，总耗时:{}", startTime, url, FastJsonUtil.toJson(result), (System.nanoTime() - startTime) / 1e6);
            }
            return result;
        } catch (Throwable throwable) {
            log.error(String.format("%s,调用失败:%s,耗时:%s,原因为:%s", startTime, url, (System.nanoTime() - startTime) / 1e6, throwable.getMessage()), throwable);
            throw throwable;
        }

    }

}
