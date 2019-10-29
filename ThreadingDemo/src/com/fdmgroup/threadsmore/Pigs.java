package com.fdmgroup.threadsmore;

public class Pigs implements Runnable {

	@Override
	public void run() { // put the method u wan to process here
		// TODO Auto-generated method stub
		storyBegins();
	}

	House house;

	public Pigs(House house) {
		this.house = house;
	}

	public void storyBegins() {
		synchronized (house) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Pig " + house.getHouseNum() + "building house.");
				house.buildHouse();
				try {
					house.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (house.getHouseNum() == 3) {
					System.out.println("Pigs are safe in their strong house");
				} else {
					house.fallDown();
					System.out.println("Pig from house " + house.getHouseNum() + " runs to brother");
				}
				System.out.println();
				house.incrementHouseNum();
				house.notify();
			}
		}
	}

}
