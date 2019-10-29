package com.fdmgroup.BookShop;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Book book = new Book();
		Catalog cat = new Catalog();
		cat.addBook(book);
		System.out.println(cat.getAllBook());
	}
}
