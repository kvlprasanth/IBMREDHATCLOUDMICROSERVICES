package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Book;

public interface BookDao {
	
	public Book createBook(Book book);
	public List<Book> getAllBook();
	public Book findById(Integer id);
	public Book findByBookId(String id);
	public Book findByBookName(String bookName);
	public Book updateBookByBookId(String bookId,Book book);
	public String deleteBookByBookId(String bookId);
	

}
