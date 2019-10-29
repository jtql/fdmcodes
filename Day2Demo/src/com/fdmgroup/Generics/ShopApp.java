package com.fdmgroup.Generics;

public class ShopApp {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setUniqueId("123456");
		b1.setTitle("Java");
		b1.setPrice(678);
		b1.setIsbn("asd345");
		b1.setAuthor("Kevin");

		Book b2 = new Book();
		b2.setUniqueId("3456");
		b2.setTitle("Ja");
		b2.setPrice(6782);
		b2.setIsbn("a45");
		b2.setAuthor("Levin");

		Book b3 = new Book();
		b3.setUniqueId("456789");
		b3.setTitle("Javfaa");
		b3.setPrice(67238);
		b3.setIsbn("asd3dsd45");
		b3.setAuthor("Ksdevin");

		Catalogue<Book> bookCatalogue = new Catalogue<Book>();
		bookCatalogue.addItem(b1);
		bookCatalogue.addItem(b2);
		bookCatalogue.addItem(b3);
//		bookCatalogue.removeItem("123456");
		bookCatalogue.removeItem("456789");

		System.out.println(bookCatalogue.getAllItems());

		allCatalogue<Book> ac1 = new allCatalogue<Book>();
		ac1.addItem(b1);
		ac1.addItem(b2);
		ac1.addItem(b3);

		dvd d1 = new dvd("Harry Potter", 5, 25, "dvd1234");

		allCatalogue<dvd> ac2 = new allCatalogue<dvd>();
		ac2.addItem(d1);

//		System.out.println(ac1.getAllItems());
		

	}

}
