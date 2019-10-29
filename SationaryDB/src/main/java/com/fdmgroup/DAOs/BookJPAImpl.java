package com.fdmgroup.DAOs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.fdmgroup.items.Book;

public class BookJPAImpl implements itemDao<Book> {

	private EntityManagerFactory emf;
	// private static final Logger logger = LogManager.getLogger(PenJPAImpl.class);

	public BookJPAImpl(EntityManagerFactory emfPassed) {
		emf = emfPassed;
	}

	public void addItem(Book item) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
		em.close();
		// logger to inform add item accomplished

	}

	public void removeItem(Book item) {
		EntityManager em = emf.createEntityManager();
		Book findBook = em.find(Book.class, item.getTitle());
		em.getTransaction().begin();
		if (findBook.getTitle() == item.getTitle()) {
			em.remove(findBook);
		}
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();

	}

	public void updateItem(Book item) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(item);
		em.getTransaction().commit();
		em.close();

	}

	public Book getItem(Book item) {
		EntityManager em = emf.createEntityManager();
		Book b = em.find(Book.class, item.getIsbn());
		em.close();
		return b;
	}

	public List<Book> returnAllItems() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Book> query = em.createQuery("Select b from Book b", Book.class);
		List<Book> addAllBooks = query.getResultList();
		em.close();
		return addAllBooks;
	}

	public List<Book> returnByTitle(String titlePassed) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Book> query = em.createQuery("Select b from Book b where b.title=:title", Book.class);
		query.setParameter("title", titlePassed);
		List<Book> returnAllBooks = query.getResultList();
		return returnAllBooks;

	}

}
