package com.fdmgroup.BookShop;

import java.util.List;

public class CheckOut {
	double totalPrice;
	double bookPrice;
	int bookQty;
	double discount;
	
	public double calculatePrice(List<Book> booksInCatalog) {
		
		Book book = new Book();
		bookQty=booksInCatalog.size();
		book.setBookPrice(25.50);
		bookPrice=book.getBookPrice();
		
		discount=(100-(bookQty/3))/100;
		totalPrice = bookPrice*bookQty*discount;
		totalPrice = Math.round(totalPrice*100)/100;
		
		return totalPrice;
	}
	
}
