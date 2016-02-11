package com.divae.app;

public class Book {

	private String author;
	private String title;
	private String isbn;

	public Book(String isbn, String author, String title) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

}
