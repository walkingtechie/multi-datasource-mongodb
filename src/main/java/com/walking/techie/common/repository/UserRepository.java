package com.walking.techie.common.repository;

import com.walking.techie.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}