package com.lyn.demo.design.pattern.launcher;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @Description
 */
@Log4j2
public class DesignPatternLauncher {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-main.xml");

        log.info("DesignPatternLauncher start successfully");

        CountDownLatch latch = new CountDownLatch(1);

        try {
            latch.await();
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }

    }

}
