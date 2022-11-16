package com.example.kritika.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer book_id;
	private String book_title;
	private String isbn;
	private Integer publisher_id;
	private String book_file_name;
	private Integer borrow_duration;
	private Double borrow_price;
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(Integer publisher_id) {
		this.publisher_id = publisher_id;
	}
	public String getBook_file_name() {
		return book_file_name;
	}
	public void setBook_file_name(String book_file_name) {
		this.book_file_name = book_file_name;
	}
	public Integer getBorrow_duration() {
		return borrow_duration;
	}
	public void setBorrow_duration(Integer borrow_duration) {
		this.borrow_duration = borrow_duration;
	}
	public Double getBorrow_price() {
		return borrow_price;
	}
	public void setBorrow_price(Double borrow_price) {
		this.borrow_price = borrow_price;
	}
	
}
