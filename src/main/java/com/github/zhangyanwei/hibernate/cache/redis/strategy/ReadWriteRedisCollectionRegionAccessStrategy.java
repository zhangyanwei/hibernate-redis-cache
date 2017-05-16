package com.github.zhangyanwei.hibernate.cache.redis.strategy;

import com.github.zhangyanwei.hibernate.cache.redis.regions.RedisCollectionRegion;
import org.hibernate.cache.spi.CollectionRegion;
import org.hibernate.cache.spi.access.CollectionRegionAccessStrategy;
import org.hibernate.cfg.Settings;

class ReadWriteRedisCollectionRegionAccessStrategy
        extends AbstractReadWriteRedisAccessStrategy<RedisCollectionRegion>
        implements CollectionRegionAccessStrategy {

    ReadWriteRedisCollectionRegionAccessStrategy(RedisCollectionRegion region, Settings settings) {
        super(region, settings);
    }

    @Override
    public CollectionRegion getRegion() {
        return region;
    }
}
