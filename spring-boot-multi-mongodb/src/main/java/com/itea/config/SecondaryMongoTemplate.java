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
@EnableMongoRepositories(basePackages = "com.itea.repository.secondary",mongoTemplateRef = "secondaryMongo")
public class SecondaryMongoTemplate {

    @Autowired
    @Qualifier("secondaryMongoProperties")
    private MongoProperties mongoProperties;

    @Bean(name = "secondaryMongo")
    public MongoTemplate secondaryMongoTemplate() throws Exception {
        return new MongoTemplate(secondaryFactory(this.mongoProperties));
    }

    @Bean
    public MongoDbFactory secondaryFactory(MongoProperties mongoProperties) throws Exception {
        ServerAddress serverAdress = new ServerAddress(mongoProperties.getUri());
        return new SimpleMongoDbFactory(new MongoClient(serverAdress), mongoProperties.getDatabase());

    }
}
