package com.khan.vaquar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khan.vaquar.repository.MongoConnectRepository;

/**
 * 
 * @author vaquar khan
 *
 */
@Service
public class BookStoreService {

	@Autowired
	private MongoConnectRepository repo;

	public String getBooks() {
		return repo.getBooks();
	}
}