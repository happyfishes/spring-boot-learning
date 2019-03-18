package com.itea.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @ClassName SessionConfig
 * @Describe
 * @create 2019-03-18 15:06
 * @Version 1.0
 **/
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
public class SessionConfig {
}
