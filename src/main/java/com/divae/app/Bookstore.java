package com.divae.app;

import java.util.Hashtable;

public class Bookstore {

	private Hashtable<String,Book> allBooks;

	public Bookstore() {
		allBooks = new Hashtable<String,Book>();
	}
	
	public void loadBooks() {
		
		addBook("ISBN1", "Amoz Oz"," Eine Geschichte von Liebe und Finsternis");
		
		addBook("ISBN2", "Jan Weiler"," Das Pubertier");
		
		addBook("ISBN3", "Douglas Adams","Per Anhalter durch die Galaxis");
		
	}
	
	public void addBook(String isbn, String author, String title) {
		Book book = new Book(isbn, author, title);
		allBooks.put(book.getIsbn(), book);
	}
	
	public Book getBookByISBN(String isbn) {
		return allBooks.get(isbn);
	}
}
