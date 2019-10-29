package com.fdmgroup.DAOs;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;

import com.fdmgroup.items.Pen;

public class PenJPAImpl implements itemDao<Pen> {

	private EntityManagerFactory emf;
	// private static final Logger logger = LogManager.getLogger(PenJPAImpl.class);

	public PenJPAImpl(EntityManagerFactory emfPassed) {
		this.emf = emfPassed;
	}

	public void addItem(Pen item) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
		em.close();
		// logger to inform add item accomplished

	}

	public void removeItem(Pen item) {
		EntityManager em = emf.createEntityManager();
		Pen p = em.find(Pen.class, item.getId());
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		em.close();

	}

	public void updateItem(Pen item) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(item);
		em.getTransaction().commit();
		em.close();

	}

	public Pen getItem(Pen item) {
		EntityManager em = emf.createEntityManager();
		Pen p = em.find(Pen.class, item.getId());
		em.close();
		return p;
	}

	public List<Pen> returnAllItems() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Pen> query = em.createQuery("Select p from Pen p", Pen.class);
		List<Pen> addAllPens = query.getResultList();
		em.close();
		return addAllPens;
	}

	public List<Pen> returnByBrand(String brandPassed) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<Pen> query = em.createQuery("Select p from Pen p where p.brand=:brand", Pen.class);
		query.setParameter("brand", brandPassed);
		List<Pen> returnAllPens = query.getResultList();
		return returnAllPens;

	}

}
