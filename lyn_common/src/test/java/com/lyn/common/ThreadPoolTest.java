package com.lyn.common;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @Description
 */
public class ThreadPoolTest {

    @Test
    public void threadPoolTest1() {
        ExecutorService executorService = Executors.newScheduledThreadPool(3);

        executorService.execute();
    }
}
