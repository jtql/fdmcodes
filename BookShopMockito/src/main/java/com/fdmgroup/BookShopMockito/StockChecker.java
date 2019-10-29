package com.fdmgroup.BookShopMockito;

public class StockChecker {
	DatabaseReader reader; //reference to interface

	public StockChecker(DatabaseReader reader) {
		super();
		this.reader = reader;
	}
	
	public int numberInStock(String isbn) {
		return this.reader.readQuantity(isbn);
	}
	
}
