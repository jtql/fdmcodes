package com.fdmgroup.part1;

public class Part1App {

	public static void main(String[] args) {
		Part1Obj part1 = new Part1Obj();
		part1.count();
		// #3 abstract class can implement an interface
		part1.give();
		// #6 interface can extend another interface
		part1.take();
		// #12 methods can be inherited
		part1.talk();
		part1.name="James";
		System.out.println(part1.name);
		// #14 sub class constructor can call its super class constructor
		Part1Obj part11 = new Part1Obj("Josh");
		System.out.println(part11.name);
//		part1.s = 2;
//		System.out.println(part1.s);
	}

}
