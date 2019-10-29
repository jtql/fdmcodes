package com.fdmgroup.Collection;

public class Book implements Comparable<Book> {

	private String isbn;
	private String title;
	private double price;
	
	
	public Book(String isbn, String title, double price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		if(o==null)
			throw new NullPointerException("Null object passed to compareTo");
		return isbn.compareTo(o.isbn);
	}
	
}
