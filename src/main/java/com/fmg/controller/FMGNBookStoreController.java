package com.fmg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.fmg.dto.FMGNBookStoreDTO;
import com.fmg.serviceImpl.FMGNBookStoreService;

@RestController
@RequestMapping("/book")
public class FMGNBookStoreController {
	
	@Autowired
	FMGNBookStoreService service;
	
	@GetMapping("/getBooks")
	public List<FMGNBookStoreDTO> getAllBooks(){
		return service.getAllBooks();
		
	}
	@GetMapping("/id/{bookId}")
	public List<FMGNBookStoreDTO> getAllBooksById(@PathVariable long bookId){
		return service.getAllBookById(bookId);
		
	}
	@PutExchange("/update/{bookId}")
	public String updateBookById(@PathVariable long bookId){
		return service.updateBookById(bookId);
		
	}
}
