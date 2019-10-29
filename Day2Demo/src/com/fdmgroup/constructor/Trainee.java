package com.fdmgroup.constructor;

public class Trainee extends User {

	public Trainee(String firstname, String lastname) {
		super(firstname, lastname);
		System.out.println("Trainee constructor called");
	}

}
