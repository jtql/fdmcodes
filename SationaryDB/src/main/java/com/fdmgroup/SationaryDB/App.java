package com.fdmgroup.SationaryDB;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.DAOs.BagJPAImpl;
import com.fdmgroup.DAOs.BookDaoSqlImpl;
import com.fdmgroup.DAOs.BookJPAImpl;
import com.fdmgroup.DAOs.PenJPAImpl;
import com.fdmgroup.DAOs.itemDao;
import com.fdmgroup.factories.DBSingleton;
import com.fdmgroup.items.Book;
import com.fdmgroup.items.Pen;
import com.fdmgroup.items.SchoolBag;

/**
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		int pages = 100;
		Book b1 = new Book();
//		Book b2 = new Book();
//		Book b3 = new Book();

//		b1.setAuthor("Orielly");
//		b1.setTitle("Complete Java");
//		b1.setIsbn("AA1235");
//		b1.setNumOfPages(pages);
//		b1.setPrice(123.45);
//
//		b2.setAuthor("Rowling");
//		b2.setTitle("Harry Potter");
//		b2.setIsbn("AB1235");
//		b2.setNumOfPages(pages);
//		b2.setPrice(65.45);
//
//		b3.setAuthor("Orielly");
//		b3.setTitle("Complete Python");
//		b3.setIsbn("AA12d3d5");
//		b3.setNumOfPages(pages);
//		b3.setPrice(223.45);

//		List<Book> booklist = new ArrayList<Book>();
//		booklist.add(b1);
//		booklist.add(b2);
//		booklist.add(b3);

		itemDao<Book> bookDao = new BookDaoSqlImpl(DBSingleton.getInstance());
//		for (Book b : booklist) {
//			bookDao.addItem(b);
//		}

		List<Book> books = bookDao.returnAllItems();
		System.out.println(books);
		//tasks
		//List to print all books
		//use addAllItems(), removeItem(),updateItem(),getItem(),getAllItem()
		//Logger
		
		Pen p1 = new Pen();
		p1.setBrand("Pilot");
		p1.setColor("Black");
		p1.setPrice(20.10);
//		ORM to persist pen to PenT
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PenT");
		PenJPAImpl penJPA = new PenJPAImpl(emf);
		List<Pen> listP = penJPA.returnByBrand("Pilot");
		System.out.println(listP);
//		penJPA.addItem(p1);
		
		SchoolBag sb = new SchoolBag();
		sb.setBrand("Adidas");
		sb.setColor("Black");
		sb.setPrice(85);
		SchoolBag sb2 = new SchoolBag();
		sb2.setBrand("Nike");
		sb2.setColor("Black");
		sb2.setPrice(185);
		
		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("SchoolBag");
		BagJPAImpl bagJPA = new BagJPAImpl(emf2);
//		bagJPA.addItem(sb);
//		bagJPA.addItem(sb2);
//		
		EntityManagerFactory emf3 = Persistence.createEntityManagerFactory("Books");
		BookJPAImpl bookJPA = new BookJPAImpl(emf3);
//		bookJPA.addItem(b1);
//		bookJPA.addItem(b2);
//		bookJPA.addItem(b3);
		bookJPA.removeItem(b1);
//		System.out.println(bookJPA.returnAllItems());
//		System.out.println(bookJPA.returnByTitle("Complete Java"));
		
	}

}
