package com.fdmgroup.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMSApp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ManyToOne");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		for (Department dept : createDepartment()) {
			em.persist(dept);
		}
		em.getTransaction().commit();

		// Enrol employees into department
		Department dept = (Department) em.createQuery("Select d from Department d where d.depName=:dName").setParameter("dName", "Dev").getSingleResult();
		
		
		//Create employee and set department reference from query result
		Employee e1 = new Employee(1, "John", dept);
		em.getTransaction().begin();
		em.persist(e1);
		dept.getEmp().add(e1); //Bidirectional Mapping
		em.getTransaction().commit();
		
		Employee e2 = new Employee(2, "Johnson", dept);
		em.getTransaction().begin();
		em.persist(e2);
		dept.getEmp().add(e2); //Bidirectional Mapping
		em.getTransaction().commit();
		
		Employee e3 = new Employee(3, "Jackson", dept);
		em.getTransaction().begin();
		em.persist(e3);
		dept.getEmp().add(e3); //Bidirectional Mapping
		em.getTransaction().commit();
		
		Department dept2 = new Department(106, "Test");
		Employee e4 = new Employee(4, "Jackson", dept2);
		em.getTransaction().begin();
		em.persist(dept2);
		em.persist(e4);
		dept.getEmp().add(e4); //Bidirectional Mapping
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

	private static List<Department> createDepartment() {
		List<Department> dList = new ArrayList<Department>();
		dList.add(new Department(101, "HR"));
		dList.add(new Department(102, "Dev"));
		dList.add(new Department(103, "DevOps"));
		dList.add(new Department(104, "BA_BI"));
		dList.add(new Department(105, "PR"));
		return dList;
	}

}
