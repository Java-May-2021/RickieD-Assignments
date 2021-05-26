package com.rickied.books.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.rickied.books.models.Book;
import com.rickied.books.services.BookService;

@RestController
public class BookApiController {
	private BookService bookService;
	
    public BookApiController(BookService service){
        this.bookService = service;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return this.bookService.getAllBooks();
    }
  //Get One Book (Read)
  	@RequestMapping("/{id}")  //Get Request
  	public Book getBook(@PathVariable("id") Long id) {
  		return this.bookService.getSingleBook(id);
  	}
  	
  	//Create A Book
  	@RequestMapping(value="/", method=RequestMethod.POST) //Post Request
  	public Book create(Book book) {
  		return this.bookService.createBook(book);
  	}
}
