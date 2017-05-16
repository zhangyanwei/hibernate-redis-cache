**How to configure the hibernate L2 cache ?**

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

    @Bean
    @Override
    public CacheManager cacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
        redisCacheManager.setUsePrefix(true);
        return redisCacheManager;
    }
}
```