package com.example.kritika.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kritika.BookRepository;
import com.example.kritika.model.Book;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book)
	{
		bookRepository.save(book);
		return "Book added Sucessfully";
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> findAllBooks()
	{
		return bookRepository.findAll();
	}
	
	@GetMapping("/findBook/{id}")
	public Book findBook(@PathVariable Integer id)
	{
		Book book = new Book();
		Optional<Book> o = bookRepository.findById(id);
		if(!o.isEmpty())
		{
			book = o.get();
		}
		return book;
	}
	
	public String deleteBook(@RequestParam Integer id)
	{
		String message = "Book not found";
		Book book = findBook(id);
		if(book.getBook_id()!=null)
		{
			bookRepository.delete(book);
			message = "Book Deleted";
		}
		return message;
	}
	
	public Book updateBook(@RequestBody Book book)
	{
		Book b = findBook(book.getBook_id());
		if(b.getBook_id()==null)
		{
			return b;
		}
		return bookRepository.save(book);
	}
}
