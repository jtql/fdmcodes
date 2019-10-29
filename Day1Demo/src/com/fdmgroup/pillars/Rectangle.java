package com.fdmgroup.pillars;

public class Rectangle extends Shape {

	private double length;
	private double breadth;

	public Rectangle(String name) { //overloaded constructor 1
		super(name);//call to parent constructor
		length = 0.0;
		breadth = 0.0;
	}

	public Rectangle(String name, double length, double breadth) { //overloaded constructor 2
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * length + 2 * breadth;
	}

}
