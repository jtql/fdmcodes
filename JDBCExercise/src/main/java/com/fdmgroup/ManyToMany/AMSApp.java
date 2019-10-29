package com.fdmgroup.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AMSApp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ManyToMany");
		EntityManager em = emf.createEntityManager();

		// create list of courses
		em.getTransaction().begin();
		for (Course course : createCourses()) {
			em.persist(course);
		}
		em.getTransaction().commit();

		// create list of Trainers
		em.getTransaction().begin();
		for (Trainer t : createTrainers()) {
			em.persist(t);
		}
		em.getTransaction().commit();

		Course java = em.find(Course.class, 100);
		Course testing = em.find(Course.class, 102);
		List<Trainer> trainers = em.createQuery("select s from Trainer s").getResultList();
		em.getTransaction().begin();
		for (Trainer t : trainers) {
			// adding course to trainer
			t.getCourses().add(java);
			// assigning course to trainer
			t.getCourses().add(testing);
			// assign trainer to the course
			testing.getTrainers().add(t);
		}
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	private static List<Trainer> createTrainers() {
		List<Trainer> trainers = new ArrayList<>();
		trainers.add(new Trainer("Joshua", "789798"));
		trainers.add(new Trainer("Hamsi", "32789798"));
		trainers.add(new Trainer("Briand", "73389798"));
		return trainers;
	}

	private static List<Course> createCourses() {
		List<Course> courses = new ArrayList<>();
		courses.add(new Course(100, "Developer Stream", 3000.00));
		courses.add(new Course(101, "DevOps Stream", 4000.00));
		courses.add(new Course(102, "Big Data Stream", 5000.00));
		return courses;
	}

}
