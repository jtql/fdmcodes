package com.fdmgroup.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class BookApp {

	public static void demoUnsortedCollection(Book... bookArray) {
		List<Book> bookList = new ArrayList<Book>();
		for (Book b : bookArray)
			bookList.add(b);
		System.out.println("Unsorted");
		printBooks(bookList);
		Collections.sort(bookList); //sorts by isbn - first attribute
		printBooks(bookList);
		Collections.sort(bookList, new BookTitleComparator());
		System.out.println("\n Order by Title");
		printBooks(bookList);
		Collections.sort(bookList, new BookPriceComparator());
		System.out.println("\n Order by Price");
		printBooks(bookList);

	}

	private static void printBooks(Collection<Book> bookList) {
		for (Book b : bookList)
			System.out.println(b);

	}

	public static void main(String[] args) {
		Book b1 = new Book("1234", "King Lion", 123.23);
		Book b2 = new Book("2344", "Taming of the Shrew", 34.5);
		Book b3 = new Book("1234", "Merchant of Venice", 45.23);
		Book b4 = new Book("23456", "King Lion", 2.34);

		System.out.println("Comparision of b1 and b2: " + b1.compareTo(b2));
		System.out.println("Comparision of b1 and b3: " + b1.compareTo(b3));// comparable
		System.out.println("Comparision of b1 and b4: " + b1.compareTo(b4));
		System.out.println("Comparision of b2 and b4: " + b2.compareTo(b4));

		BookTitleComparator comparator = new BookTitleComparator();
		System.out.println(comparator.compare(b1, b4));

		BookPriceComparator pComparator = new BookPriceComparator();
		System.out.println(pComparator.compare(b1, b4));

		demoUnsortedCollection(b1, b2, b3, b4);
		demoSortedCollection(b1, b2, b3, b4);

	}

	private static void demoSortedCollection(Book... bookArray) {
		
		TreeSet<Book> bookSet = new TreeSet<Book>();
		for (Book b : bookArray)
			bookSet.add(b);
		System.out.println("Sorted");
		printBooks(bookSet);
		
	}

}
