package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.BookEntity;
import com.example.demo.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired 
	public BookRepository brepo;
	
	@PostMapping("/addbookm")
	public BookEntity addbookm(@RequestBody BookEntity book) {
		try {
			brepo.save(book);
			return book;
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}
	
	@PutMapping("/updatebookm")
	public BookEntity updatebookm(@RequestBody BookEntity book) {
		try {
			brepo.save(book);
			return book;
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}
	
	@GetMapping("/getbookm")
	public List<BookEntity> getbookm() {
		try {
			return brepo.findAll();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}
	
	@DeleteMapping("/deletebookm/{id}")
	public  String deletebookm(@PathVariable int Id) {
		try {
			BookEntity book = brepo.getOne(Id);
			brepo.delete(book);
			return "book deleted"; 
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}
	

}
