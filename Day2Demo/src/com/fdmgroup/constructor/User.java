package com.fdmgroup.constructor;

public class User implements iUser {
	private String firstname;
	private String lastname;

	public User(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@Override
	public void visitUser() { 
		System.out.println("\n Visited: " + this);
	}
	
	public void go(long x) {
		System.out.println("long");
	}
	public void go(short x) {
		System.out.println("short");
	}

}
