package com.fdmgroup.users;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

public class UserJPA {
	private EntityManagerFactory emf;
	// private static final Logger logger = LogManager.getLogger(PenJPAImpl.class);

	public UserJPA(EntityManagerFactory emfPassed) {
		emf = emfPassed;
	}

	public void addItem(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		// logger to inform add item accomplished

	}

	public void removeItem(User user) {
		EntityManager em = emf.createEntityManager();
		User u = em.find(User.class, user.getId());
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		em.close();

	}

	public void updateItem(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		em.close();

	}

	public User getItem(User item) {
		EntityManager em = emf.createEntityManager();
		User u = em.find(User.class, item.getId());
		em.close();
		return u;
	}

	public List<User> returnAllItems() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<User> query = em.createQuery("Select u from User u", User.class);
		List<User> addAllBooks = query.getResultList();
		em.close();
		return addAllBooks;
	}

}