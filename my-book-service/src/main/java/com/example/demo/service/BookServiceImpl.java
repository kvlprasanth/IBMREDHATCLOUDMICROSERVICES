package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;
@Service
public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;
	
	
@Autowired
	public BookServiceImpl(BookDao bookDao) {
		
		this.bookDao = bookDao;
	}

	@Override
	public Book createBook(Book book) {
		book.setBookId(UUID.randomUUID().toString());
		return bookDao.createBook(book);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookDao.getAllBook();
	}

	@Override
	public Book findById(Integer id) {
		// TODO Auto-generated method stub
		return bookDao.findById(id);
	}

	@Override
	public Book findByBookId(String id) {
		// TODO Auto-generated method stub
		return bookDao.findByBookId(id);
	}

	@Override
	public Book updateBookByBookId(String bookId, Book book) {
		
		return bookDao.updateBookByBookId(bookId, book);
	}

	@Override
	public Book findByBookName(String bookName) {
		// TODO Auto-generated method stub
		return bookDao.findByBookName(bookName);
	}

	@Override
	public String deleteBookByBookId(String bookId) {
		// TODO Auto-generated method stub
		return bookDao.deleteBookByBookId(bookId);
	}

}
