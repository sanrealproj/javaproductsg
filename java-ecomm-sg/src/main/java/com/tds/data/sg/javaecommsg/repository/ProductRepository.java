package com.tds.data.sg.javaecommsg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tds.data.sg.javaecommsg.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

}
