package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.model.BookRequestModel;
import com.example.demo.service.BookService;

@RestController
@CrossOrigin
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/add")
	public String addBook(@RequestBody BookRequestModel model) {

		int status = bookService.AddBook(model);
		if (status > 0) {
			return "Book Add SuccessFully...!";
		} else {
			return "Book Not Added";

		}
	}

	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable Long id) {
		return bookService.getBook(id);
	}
	
	@GetMapping("/getAllBook")
	public List<Book> getBookAll() {
		return bookService.getAllBook();
	}
	


}
