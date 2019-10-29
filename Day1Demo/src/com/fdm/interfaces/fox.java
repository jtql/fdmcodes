package com.fdm.interfaces;

public final class fox extends aAnimal {

	public fox() {
		name = "Fox";
		// TODO Auto-generated constructor stub
	}

	public void talk() {
		super.talk();
//		System.out.println("nenene");
	}

	public void move() {
//		super.move();
		System.out.println("pouncing");
	}

	public void doSomething() {
		System.out.println("I am a Fox doing something");
	}

}
