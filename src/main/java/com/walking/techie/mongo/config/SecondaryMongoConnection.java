package com.walking.techie.mongo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
    basePackages = {"com.walking.techie.secondary.repository"},
    mongoTemplateRef = "secondaryMongoTemplate"
)
@ConfigurationProperties(prefix = "secondary.mongodb")
public class SecondaryMongoConnection extends AbstractMongoConfig {

  /**
   * Implementation of the MongoTemplate factory method
   *
   * @Bean gives a name (secondaryMongoTemplate) to the created MongoTemplate instance Note that
   * this method doesn't have @Primary
   */

  @Override
  public
  @Bean(name = "secondaryMongoTemplate")
  MongoTemplate getMongoTemplate() {
    return new MongoTemplate(mongoDbFactory());
  }
}
