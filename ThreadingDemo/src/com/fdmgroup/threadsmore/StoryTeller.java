package com.fdmgroup.threadsmore;

public class StoryTeller {

	public static void main(String[] args) {
		House house = new House();
		house.setHouseNum(101);

		Pigs pig = new Pigs(house);
		Wolf wolf = new Wolf(house);

		Thread thread1 = new Thread(pig);
		Thread thread2 = new Thread(wolf);

		thread1.start();
		thread2.start();

	}

}
