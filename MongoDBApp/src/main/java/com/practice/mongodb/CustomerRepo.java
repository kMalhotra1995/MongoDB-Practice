package com.practice.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.mongodb.Model.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String>{

}
