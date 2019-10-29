package com.fdm.interfaces;

public abstract class aAnimal implements iTalkingAnimal {
	protected String name;
	iMovingAnimal imove;
	
	public void talk() {
		iMovingAnimal.move();
		System.out.println("this " + name + " says" );
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public void move() {
//		System.out.println("This" + name + "moves by");
//	}

}
