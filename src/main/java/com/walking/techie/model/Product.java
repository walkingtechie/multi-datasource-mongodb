package com.walking.techie.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Data
public class Product {

  @Id
  private String id;

  private String name;
  @Indexed
  private int price;
}