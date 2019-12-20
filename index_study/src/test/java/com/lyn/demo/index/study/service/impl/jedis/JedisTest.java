package com.lyn.demo.index.study.service.impl.jedis;

import com.lyn.common.enums.JedisTimeUnit;
import com.lyn.demo.index.study.jedis.JedisClient;
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
public class JedisTest {

    @Resource
    private JedisClient jedisClient;

    @Test
    public void jedisTest() {
        System.out.println(jedisClient.set("firstKey", "hello"));
        System.out.println(jedisClient.get("firstKey"));
    }

    @Test
    public void jedisSetNx() {
        System.out.println(jedisClient.setNx("firstKey", "hello"));
    }

    @Test
    public void setEx() {
        jedisClient.setExpire("secondKey", "hello", 3, JedisTimeUnit.SECONDS);
    }

    @Test
    public void delete() {
        boolean isDelete = jedisClient.delete("firstKey");
        System.out.println(isDelete);
    }

    @Test
    public void set() {
        jedisClient.set("TABLE_NAME_LYN_USER", "44181120191");
    }

    @Test
    public void get() {
        System.out.println(jedisClient.get("TABLE_NAME_LYN_USER"));
    }


    @Test
    public void incr() {
        Long id = jedisClient.incr("TABLE_NAME_LYN_USER");
        System.out.println(id);
    }

}
