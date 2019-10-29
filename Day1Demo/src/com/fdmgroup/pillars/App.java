package com.fdmgroup.pillars;

public class App {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle("R1"); //invokes constructor 1 of Rectangle
		r1.setBreadth(5.5);
		r1.setLength(3.4);
		System.out.println("Area of R1: "+r1.getArea());
		System.out.println("Area of R1: "+r1.getPerimeter());
		
		Rectangle r2 = new Rectangle("R2",4.5,10.0); //involves contructor 2
		System.out.println("Area of R1: "+r2.getArea());
		System.out.println("Area of R1: "+r2.getPerimeter());
		
		Circle c1 = new Circle("c1");
		c1.setRadius(4);
		System.out.println("Area of c1: "+c1.getArea());
		System.out.println("Area of c1: "+c1.getPerimeter());
		
		Circle c2 = new Circle("c2", 3);
		System.out.println("Area of c2: "+c2.getArea());
		System.out.println("Area of c2: "+c2.getPerimeter());
	}

}
