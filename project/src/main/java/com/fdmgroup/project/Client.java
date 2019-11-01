package com.fdmgroup.project;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.jpa.AdminJPAImpl;
import com.fdmgroup.jpa.BagJPAImpl;
import com.fdmgroup.jpa.CartJPAImpl;
import com.fdmgroup.jpa.CustomerJPAImpl;
import com.fdmgroup.jpa.OrderJPA;
import com.fdmgroup.payment.Cart;
import com.fdmgroup.payment.Order;
import com.fdmgroup.products.Bag;
import com.fdmgroup.users.Admin;
import com.fdmgroup.users.Customer;

public class Client {

	public static void main(String[] args) {
		Admin u1 = new AdminJPAImpl(Persistence.createEntityManagerFactory("Admin")).getItem(91);
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Admin");
//		AdminJPAImpl aJPA = new AdminJPAImpl(emf);
//		aJPA.addItem(u1);

//		u1.login();
		System.out.println(u1.toString());
		
		Bag b = new Bag();
		b.setDescription("Puma");
		b.setPrice(121.99);
		b.setStock(12);
		
		u1.addBag(b);

	}

}
