package com.fdmgroup.constructor;

public class AdminUser extends User {

	public AdminUser(String firstname, String lastname) {
		super(firstname, lastname);
		System.out.println("Admin constructor called");
	}
	
	public void sayHello() {
		System.out.println("Admin greets Hello");
	}
	
}
