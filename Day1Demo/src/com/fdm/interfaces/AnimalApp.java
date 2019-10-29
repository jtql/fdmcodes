package com.fdm.interfaces;

public class AnimalApp {

	public static void main(String[] args) {
//		iAnimal fox = new fox();
//		iAnimal panda=new Panda();
		
		fox fox = new fox();
		System.out.println(fox.getName());
//		fox.move();
		fox.doSomething();
		fox.talk();
//		fox.imove.move();
		
		
		Panda panda = new Panda();
		panda.setName("panda1");
		System.out.println(panda.getName());
		panda.talk();
		
	}

}
