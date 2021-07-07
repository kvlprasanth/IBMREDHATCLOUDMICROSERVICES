package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Book;
@Repository
@EnableTransactionManagement
public class BookDaoImpl implements BookDao{
	
	private EntityManager entityManager;
	

	@Autowired
	public BookDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public Book createBook(Book book) {
		entityManager.persist(book);
	      
		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBook() {
	
		Query query=entityManager.createQuery("SELECT B FROM Book B",Book.class);
		
		return query.getResultList();
	}

	@Override
	@Transactional
	public Book findById(Integer id) {
		Book book1=entityManager.find(Book.class, id);
		if(book1==null) {
			throw new BookNotFoundException("Book not found for the given id");
		}
		return book1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Book findByBookId(String id) {
		Query query=entityManager.createQuery("SELECT B FROM Book B WHERE B.bookId=:bId",Book.class);
		query.setParameter("bId", id);
		List<Book> list=query.getResultList();
		if(list.isEmpty()) {
			throw new BookNotFoundException("Book not found for the given book_id");
		}
		
		return list.get(0);
	}

	@Override
	@Transactional
	public Book updateBookByBookId(String bookId, Book book) {
		Book book1=findByBookId(bookId);
		book1.setBookName(book.getBookName());
		book1.setBookPrice(book.getBookPrice());
		entityManager.merge(book1);
		
		return book1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Book findByBookName(String bookName) {
		Query query1=entityManager.createQuery("SELECT B FROM Book B WHERE B.bookName=:bName",Book.class);
		query1.setParameter("bName", bookName);
		List<Book> list1=query1.getResultList();
		if(list1.isEmpty()) {
			throw new BookNotFoundException("Book not found for the given book_id");
			
		}
		
		return list1.get(0);
	}

	@Override
	@Transactional
	public String deleteBookByBookId(String bookId) {
		Book book=findByBookId(bookId);
		entityManager.remove(book);
		return "deleted";
	}

}