package com.fdmgroup.part1;

//abstract class can implement an interface
public abstract class Part1 implements iPart1 {
	// #1 abstract class can contain both abstract and non-abstract methods
	public abstract void count();

	public void talk() {
		System.out.println("hi");
	}
	

	// #2 abstract class can have member variable
	protected String name;
	protected int s = 5;

	// public void give();
	// #4 abstract class can have a constructor
	public Part1() {
	}

	// #10 overload constructor Part1Obj
	public Part1(String name) {
		super();
		this.name = name;
	}

	// public void take();

	public static void main(String[] args) {
		// // #5 variables in an interface are final
		// iPart1.myName = "Pan";
		// System.out.println(iPart1.myName);

	}

}
