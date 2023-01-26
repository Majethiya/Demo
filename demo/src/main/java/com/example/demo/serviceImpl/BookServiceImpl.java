package com.example.demo.serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.model.BookRequestModel;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	
	
	@Resource
	BookRepository bookRepository;

	@Override
	public int AddBook(BookRequestModel book) {
		// TODO Auto-generated method stub
		Book book1=new Book();
		book1.setBook_file_name(book.getBook_file_name());
		book1.setBorrow_duration(book.getBorrow_duration());
		book1.setBorrow_price(book.getBorrow_price());
		book1.setIsbn(book.getIsbn());
		book1.setPublisher_id(book.getPublisher_id());
		return bookRepository.save(book1).hashCode();
	}

	@Override
	public Book getBook(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findByid(id);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public void removeBook(Long id) {
		// TODO Auto-generated method stub
		 bookRepository.deleteById(id);
		 
	}

}
