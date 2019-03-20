package com.itea.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ClassName MutliMongoProperties
 * @Describe
 * @create 2019-03-20 20:30
 * @Version 1.0
 **/
@Configuration
public class MutliMongoProperties {

    @Bean(name="primaryMongoProperties")
    @Primary
    @ConfigurationProperties(prefix="spring.data.mongodb.primary")
    public MongoProperties primaryMongoProperties() {
        System.out.println("-------------------- primaryMongoProperties init ---------------------");
        return new MongoProperties();
    }

    @Bean(name="secondaryMongoProperties")
    @ConfigurationProperties(prefix="spring.data.mongodb.secondary")
    public MongoProperties secondaryMongoProperties() {
        System.out.println("-------------------- secondaryMongoProperties init ---------------------");
        return new MongoProperties();
    }
}
