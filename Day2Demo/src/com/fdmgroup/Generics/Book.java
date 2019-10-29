package com.fdmgroup.Generics;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private double price;
	private int numOfPages;
	private String uniqueId;

	public Book(String isbn, String title, String author, double price, int numOfPages, String uniqueId) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.numOfPages = numOfPages;
		this.uniqueId = uniqueId;
	}

	public Book() {
		super();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", numOfPages="
				+ numOfPages + ", uniqueId=" + uniqueId + "]";
	}

}
