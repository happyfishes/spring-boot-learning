package com.itea.config;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @ClassName PrimaryMongoTemplate
 * @Describe
 * @create 2019-03-20 20:32
 * @Version 1.0
 **/
@Configuration
@EnableMongoRepositories(basePackages = "com.itea.repository.primary",mongoTemplateRef = "primaryMongo")
public class PrimaryMongoTemplate {

    @Autowired
    @Qualifier("primaryMongoProperties")
    private MongoProperties mongoProperties;

    @Primary
    @Bean(name = "primaryMongo")
    public MongoTemplate primaryMongoTemplate() throws Exception {
        return new MongoTemplate(primaryFactory(this.mongoProperties));
    }

    @Bean
    @Primary
    public MongoDbFactory primaryFactory(MongoProperties mongoProperties) throws Exception {
        ServerAddress serverAdress = new ServerAddress(mongoProperties.getUri());
        return new SimpleMongoDbFactory(new MongoClient(serverAdress), mongoProperties.getDatabase());

    }
}
