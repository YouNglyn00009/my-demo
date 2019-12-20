package com.lyn.demo.index.study.jedis;

import com.lyn.common.enums.JedisTimeUnit;
import org.apache.commons.lang.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Description
 */
public class JedisClient {

    private static final int DAY_OF_MONTH = 30;

    private static final int HOUR_OF_DAY = 24;

    private static final int SIXTY = 60;

    private static final int MICROSECONDS_OF_SECOND = 1000;

    private Jedis jedis;

    public JedisClient(JedisPool jedisPool) {
        jedis = jedisPool.getResource();
    }

    public String ping() {
        return jedis.ping();
    }

    public boolean set(String key, String value) {
        if (StringUtils.isBlank(key)) {
            throw new NullPointerException("jedis key can not be null...");
        }
        return "true".equals(jedis.set(key, value)) ? true : false;
    }

    public String get(String key) {
        return jedis.get(key);
    }

    public boolean exists(String key) {
        return jedis.exists(key);
    }

    public boolean delete(String keys) {
        return jedis.del(keys) > 0 ? true : false;
    }

    public void expire(String key, long time, JedisTimeUnit timeUnit) {
        int expireTime = getTime(time, timeUnit);
        jedis.expire(key, expireTime);
    }

    public boolean setExpire(String key, String value, long time, JedisTimeUnit timeUnit) {
        int expireTime = getTime(time, timeUnit);
        return "true".equals(jedis.setex(key, expireTime, value)) ? true : false;
    }

    public boolean setNx(String key, String value) {
        if (StringUtils.isBlank(key)) {
            throw new NullPointerException("jedis key can not be null...");
        }
        return "true".equals(jedis.setnx(key, value)) ? true : false;
    }

    public void hSet(String key, String field, String value) {
        jedis.hset(key, field, value);
    }

    public String hGet(String key, String field) {
        return jedis.hget(key, field);
    }

    public Long incr(String key) {
        return jedis.incr(key);
    }

    public Long incrBy(String key, long i) {
        return jedis.incrBy(key, i);
    }

    private int getTime(long time, JedisTimeUnit timeUnit) {
        switch (timeUnit) {
            case MONTH:
                return (int) (time * DAY_OF_MONTH * HOUR_OF_DAY * SIXTY * SIXTY);
            case DAY:
                return (int) (time * HOUR_OF_DAY * SIXTY * SIXTY);
            case HOURS:
                return (int) (time * SIXTY * SIXTY);
            case MINUTES:
                return (int) (time * SIXTY);
            case SECONDS:
                return (int) time;
        }
        return (int) time;
    }

}
