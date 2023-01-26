package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;
import com.example.demo.model.BookRequestModel;

public interface BookService {
	
	
	public int AddBook(BookRequestModel book);
	
	public Book getBook(Long id);
	
	public List<Book> getAllBook();
	
	public void removeBook(Long id);
	

}
