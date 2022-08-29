package com.java.CrudUsingAtlas.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.java.CrudUsingAtlas.Model.Product;


public interface ProductRepository extends MongoRepository<Product, String> {

	
}
