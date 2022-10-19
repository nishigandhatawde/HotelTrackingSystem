package com.yash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.BookTable;

import com.yash.service.BookTableService;

@RestController
@CrossOrigin("*")
public class BookTableController {
	@Autowired
	BookTableService bts;
	
	@PostMapping("/booktable")
	public BookTable booktable(@RequestBody BookTable booktable)
	{
	
		
		return bts.save(booktable);
		
	}
	


	
	
}
