package com.lyn.demo.index.study.service.impl.idgen;

import com.lyn.demo.index.study.idgen.IdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-main.xml"})
public class IdGeneratorTest {

    @Resource
    private IdGenerator idGenerator;

    @Test
    public void objectIdTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(idGenerator.snowflakeId());
        }

    }

}
