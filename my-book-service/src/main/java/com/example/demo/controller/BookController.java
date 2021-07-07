package com.example.demo.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.ui.BookErrorResponse;

import lombok.Delegate;
@RestController
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@ExceptionHandler
	public ResponseEntity<BookErrorResponse> handleBookNotFoundException(BookNotFoundException e) {
		BookErrorResponse response = new BookErrorResponse();
		response.setMessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	
	@ExceptionHandler
	public ResponseEntity<BookErrorResponse> handleTypeMisMatchedException(Exception e) {
		BookErrorResponse response = new BookErrorResponse();
		response.setMessage(e.getMessage());
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setErrorReportingTime(System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
	

	@GetMapping("/api/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBook());
	}
	
	@PostMapping("/api/book")
	public ResponseEntity<Book> createBook(@RequestBody Book book){
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.createBook(book));
	}
	
	@GetMapping("/api/book/{id}")
	public ResponseEntity<Book> findBookById(@PathVariable("id") Integer id){
		
		return ResponseEntity.status(HttpStatus.OK).body(bookService.findById(id));
	}
	@GetMapping("/api/book/find/{bookId}")
	public ResponseEntity<Book> findByBookId(@PathVariable("bookId") String bookId){
		
		return ResponseEntity.status(HttpStatus.OK).body(bookService.findByBookId(bookId));
	}
	@PutMapping("/api/book/update/{bookId}")
	public ResponseEntity<Book> updateBookByBookId(@PathVariable("bookId") String bookId,@RequestBody Book book){
		
		return ResponseEntity.status(HttpStatus.OK).body(bookService.updateBookByBookId(bookId, book));
	}
	
	@DeleteMapping("/api/book/delete/{bookId}")
	public ResponseEntity<String> deleteBookByBookId(@PathVariable("bookId") String bookId){
		
		return ResponseEntity.status(HttpStatus.OK).body(bookService.deleteBookByBookId(bookId));
	}
	
	

}
