package com.neosilica.mongodb.repository;

import com.neosilica.mongodb.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
	
}
