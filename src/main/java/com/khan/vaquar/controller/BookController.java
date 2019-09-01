package com.khan.vaquar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khan.vaquar.service.BookStoreService;
/**
 * 
 * @author vaquar khan
 *
 */
@RestController
@RequestMapping(value = "/books")

public class BookController {

	@Autowired
	private BookStoreService bookService ;

	@GetMapping("/test")
	public String  books() {
		return bookService.getBooks();
	}
	
	//@PostMapping("/upsertBrand")

}
