package com.walking.techie.mongo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.walking.techie.common.repository",
    "com.walking.techie.primary.repository"}, mongoTemplateRef = "primaryMongoTemplate")
@ConfigurationProperties(prefix = "primary.mongodb")
public class PrimaryMongoConnection extends AbstractMongoConfig {

  /**
   * Implementation of the MongoTemplate factory method
   *
   * @Bean gives a name (primaryMongoTemplate) to the created MongoTemplate instance
   * @Primary declares that if MongoTemplate is autowired without providing a specific name, this is
   * the instance which will be mapped by default
   */

  @Primary
  @Override
  @Bean(name = "primaryMongoTemplate")
  public MongoTemplate getMongoTemplate() {
    return new MongoTemplate(mongoDbFactory());
  }
}
