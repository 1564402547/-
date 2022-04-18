package com.wangzg.community.shiro.cache;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

/**
 * @Auther: wangzg
 * @Date: 2022-2-14 09:51
 * @Description:自定义shiro缓存管理器
 */
public class RedisCacheManager implements CacheManager {

    //cacheName是认证或者授权缓存的统一名称
    @Override
    public <K, V> Cache<K, V> getCache(String cacheName) throws CacheException {
        //把cacheName是认证或者授权缓存的统一名称丢进RedisCache类中
        return new RedisCache<K,V>(cacheName);
    }
}
