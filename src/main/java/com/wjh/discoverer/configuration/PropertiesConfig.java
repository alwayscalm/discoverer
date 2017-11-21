package com.wjh.discoverer.configuration;

import com.wjh.discoverer.model.ResponseMessage;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.OxmSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 集中配置
 * @author 一直很低调(1223271200@qq.com) on 2017/11/21
 * @since 1.0
 */
@Configuration
public class PropertiesConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

  /*  @Resource
    private JedisConnectionFactory jedisConnectionFactory;
    @Bean
    @ConfigurationProperties(prefix = "spring.redis")
    public RedisTemplate<String, ResponseMessage> redisTemplate(){
        RedisTemplate<String, ResponseMessage> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        return template;
    }
*/
}
