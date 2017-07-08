package com.walking.techie.secondary.repository;


import com.walking.techie.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
