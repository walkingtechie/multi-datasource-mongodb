package com.walking.techie.mongo.config;

import com.mongodb.MongoClient;
import lombok.Data;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Data
public abstract class AbstractMongoConfig {

  //Mongo DB Properties
  private String host, database;
  private int port;

  /*
   * Method that creates MongoDbFactory
   * Common to both of the MongoDb connections
   */
  public MongoDbFactory mongoDbFactory() {
    return new SimpleMongoDbFactory(getMongoClient(), database);
  }

  /*
   * Method that creates MongoClient
   */
  private MongoClient getMongoClient() {
    return new MongoClient(host, port);
  }

  /*
   * Factory method to create the MongoTemplate
   */
  abstract public MongoTemplate getMongoTemplate();
}