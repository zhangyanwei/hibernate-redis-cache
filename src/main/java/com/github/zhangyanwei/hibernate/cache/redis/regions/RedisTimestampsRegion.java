package com.github.zhangyanwei.hibernate.cache.redis.regions;

import com.github.zhangyanwei.hibernate.cache.redis.strategy.RedisAccessStrategyFactory;
import org.hibernate.cache.spi.TimestampsRegion;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTimestampsRegion extends RedisGeneralDataRegion implements TimestampsRegion {

    public RedisTimestampsRegion(RedisAccessStrategyFactory accessStrategyFactory,
                                 RedisTemplate<String, Object> template,
                                 String regionName) {
        super(accessStrategyFactory, template, regionName);
    }
}
