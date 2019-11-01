package com.fdmgroup.servlets;

public class User {

	private String fname;
	private String lname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public User(String fname, String lname) {
		// super();
		this.fname = fname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + "]";
	}

}
