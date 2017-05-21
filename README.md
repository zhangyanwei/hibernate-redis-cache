**How to configure the hibernate L2 cache ?**

#### step 1
specify the redis template
```java
@Configuration
@EnableCaching
public class CacheConfiguration extends CachingConfigurerSupport {

    @Autowired
    private SerializableValueRedisTemplate<Serializable> redisTemplate;

    @PostConstruct
    private void init() {
        HibernateL2CacheTemplate.redisTemplate(redisTemplate);
    }
}
```

#### step 2
configure the spring as following
```yaml
spring.jpa:
  hibernate.ddl-auto: update
  properties:
    javax.persistence.sharedCache.mode: ALL
    hibernate.cache.use_second_level_cache: true
    hibernate.cache.use_query_cache: true
    hibernate.cache.region.factory_class: com.github.zhangyanwei.hibernate.cache.redis.RedisRegionFactory
```