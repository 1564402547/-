package com.wangzg.community.shiro.cache;

import com.wangzg.community.utils.ApplicationContextUtils;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.util.Collection;
import java.util.Set;

/**
 * @Auther: wangzg
 * @Date: 2022-2-14 10:06
 * @Description:自定义RedisCache的实现
 */
public class RedisCache<K,V> implements Cache<K,V> {

    private String cacheName;


    public RedisCache() {

    }

    public RedisCache(String cacheName) {
        this.cacheName = cacheName;
    }

    //查询缓存
    @Override
    public V get(K k) throws CacheException {

        return (V) getredisTemplate().opsForHash().get(this.cacheName,k.toString());
    }

    //存放缓存
    @Override
    public V put(K k, V v) throws CacheException {
        //获取
        getredisTemplate().opsForHash().put(this.cacheName,k.toString(),v);
        return null;
    }

    //清除缓存
    @Override
    public V remove(K k) throws CacheException {
        System.out.println("111111111111111111111111111111");
        return (V) getredisTemplate().opsForHash().delete(this.cacheName,k.toString());
    }
    //清除缓存
    @Override
    public void clear() throws CacheException {
        System.out.println("22222222222222222222222");
        getredisTemplate().delete(this.cacheName);
    }

    @Override
    public int size() {
        return getredisTemplate().opsForHash().size(this.cacheName).intValue();
    }

    @Override
    public Set<K> keys() {
        return getredisTemplate().opsForHash().keys(this.cacheName);
    }

    @Override
    public Collection<V> values() {
        return getredisTemplate().opsForHash().values(this.cacheName);
    }

    private RedisTemplate getredisTemplate(){
        RedisTemplate redisTemplate = (RedisTemplate) ApplicationContextUtils.getBean("redisTemplate");
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }


}
