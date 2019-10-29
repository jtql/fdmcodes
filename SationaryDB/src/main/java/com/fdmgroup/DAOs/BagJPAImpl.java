package com.fdmgroup.DAOs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import com.fdmgroup.items.SchoolBag;

public class BagJPAImpl implements itemDao<SchoolBag> {

	private EntityManagerFactory emf;
	// private static final Logger logger = LogManager.getLogger(PenJPAImpl.class);

	public BagJPAImpl(EntityManagerFactory emfPassed) {
		this.emf = emfPassed;
	}

	public void addItem(SchoolBag item) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
		em.close();
		// logger to inform add item accomplished

	}

	public void removeItem(SchoolBag item) {
		EntityManager em = emf.createEntityManager();
		SchoolBag b = em.find(SchoolBag.class, item.getId());
		em.getTransaction().begin();
		em.remove(b);
		em.getTransaction().commit();
		em.close();

	}

	public void updateItem(SchoolBag item) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(item);
		em.getTransaction().commit();
		em.close();

	}

	public SchoolBag getItem(SchoolBag item) {
		EntityManager em = emf.createEntityManager();
		SchoolBag b = em.find(SchoolBag.class, item.getId());
		em.close();
		return b;
	}

	public List<SchoolBag> returnAllItems() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<SchoolBag> query = em.createQuery("Select b from SchoolBag b", SchoolBag.class);
		List<SchoolBag> addAllBags = query.getResultList();
		em.close();
		return addAllBags;
	}

	public List<SchoolBag> returnByBrand(String brandPassed) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<SchoolBag> query = em.createQuery("Select b from SchoolBag b where b.brand=:brandPassed",
				SchoolBag.class);
		query.setParameter("brand", brandPassed);
		List<SchoolBag> returnAllBags = query.getResultList();
		return returnAllBags;

	}

}
