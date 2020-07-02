package com.gilsontsc.helpDesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gilsontsc.helpDesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
	
}