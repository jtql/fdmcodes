package com.fdmgroup.pillars;

public abstract class Shape {
	private String name;

	public Shape(String name) {
		this.name = name;
	}
	
	public Shape() {
		this.name="";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//abstract methods
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
