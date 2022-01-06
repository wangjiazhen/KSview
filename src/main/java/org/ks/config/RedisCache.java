package org.ks.config;

import org.apache.ibatis.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author yu3
 */
public class RedisCache implements Cache {

    private static final Logger log = LoggerFactory.getLogger(RedisCache.class);

    private final String id;
    private static final long EXPIRE_TIME = 300;
    private RedisTemplate<String, Object> redisTemplate;


    public RedisTemplate getRedisTemplate() {
        this.redisTemplate = ApplicationContextHolder.getBean("redisTemplate");
        return redisTemplate;
    }

    public RedisCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {

        RedisTemplate redisTemplate = getRedisTemplate();
        redisTemplate.boundHashOps(getId()).put(key, value);
        redisTemplate.boundHashOps(getId()).expire(EXPIRE_TIME, TimeUnit.MINUTES);
        log.info("{}结果放入到缓存中: {} = {} ", getId(), key, value);

    }

    @Override
    public Object getObject(Object key) {
        RedisTemplate redisTemplate = getRedisTemplate();
        Object value = redisTemplate.boundHashOps(getId()).get(key);
        log.info("从缓存中获取了: {} = {}", key, value);
        return value;
    }

    @Override
    public Object removeObject(Object key) {
        RedisTemplate redisTemplate = getRedisTemplate();
        Object value = redisTemplate.boundHashOps(getId()).delete(key);
        log.info("从缓存中删除了: {} = {}", key, value);
        return value;
    }

    @Override
    public void clear() {
        RedisTemplate redisTemplate = getRedisTemplate();
        redisTemplate.delete(getId());
        log.info("{}清空缓存!!!", getId());
    }

    @Override
    public int getSize() {
        RedisTemplate redisTemplate = getRedisTemplate();
        Long size = redisTemplate.boundHashOps(getId()).size();
        return size == null ? 0 : size.intValue();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return new ReentrantReadWriteLock();
    }
}
