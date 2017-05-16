package com.github.zhangyanwei.hibernate.cache.redis.strategy;

import com.github.zhangyanwei.hibernate.cache.redis.regions.RedisCollectionRegion;
import com.github.zhangyanwei.hibernate.cache.redis.regions.RedisEntityRegion;
import com.github.zhangyanwei.hibernate.cache.redis.regions.RedisNaturalIdRegion;
import org.hibernate.cache.spi.access.AccessType;
import org.hibernate.cache.spi.access.CollectionRegionAccessStrategy;
import org.hibernate.cache.spi.access.EntityRegionAccessStrategy;
import org.hibernate.cache.spi.access.NaturalIdRegionAccessStrategy;

public interface RedisAccessStrategyFactory {

    /**
     * Create {@link EntityRegionAccessStrategy}
     * for the input {@link RedisEntityRegion} and {@link AccessType}
     *
     * @return the created {@link EntityRegionAccessStrategy}
     */
    EntityRegionAccessStrategy createEntityRegionAccessStrategy(RedisEntityRegion entityRegion, AccessType accessType);

    /**
     * Create {@link CollectionRegionAccessStrategy}
     * for the input {@link RedisCollectionRegion} and {@link AccessType}
     *
     * @return the created {@link RedisCollectionRegion}
     */
    CollectionRegionAccessStrategy createCollectionRegionAccessStrategy(RedisCollectionRegion collectionRegion, AccessType accessType);

    /**
     * Create {@link CollectionRegionAccessStrategy}
     * for the input {@link RedisNaturalIdRegion} and {@link AccessType}
     *
     * @return the created {@link RedisNaturalIdRegion}
     */
    NaturalIdRegionAccessStrategy createNaturalIdRegionAccessStrategy(RedisNaturalIdRegion naturalIdRegion, AccessType accessType);

}
