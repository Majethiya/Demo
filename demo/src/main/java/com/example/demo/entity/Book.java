package com.example.demo.entity;

import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="book")
public class Book {
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	private Long id;
	private Long isbn;
	private Long publisher_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		id = id;
	}
	private String book_file_name;
	private String borrow_duration;
	private Double borrow_price;
	

	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public Long getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(Long publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getBook_file_name() {
		return book_file_name;
	}
	public void setBook_file_name(String book_file_name) {
		this.book_file_name = book_file_name;
	}
	public String getBorrow_duration() {
		return borrow_duration;
	}
	public void setBorrow_duration(String borrow_duration) {
		this.borrow_duration = borrow_duration;
	}
	public Double getBorrow_price() {
		return borrow_price;
	}
	public void setBorrow_price(Double borrow_price) {
		this.borrow_price = borrow_price;
	}
	

}
