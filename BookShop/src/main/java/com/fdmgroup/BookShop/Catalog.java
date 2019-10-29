package com.fdmgroup.BookShop;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

	private List<Book>catalog=new ArrayList<Book>();
	
	public List<Book> getAllBook(){
		return catalog;
	}
	
	public void addBook(Book book) {
		catalog.add(book);
	}
}
