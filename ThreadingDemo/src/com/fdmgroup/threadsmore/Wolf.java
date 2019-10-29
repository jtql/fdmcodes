package com.fdmgroup.threadsmore;

public class Wolf implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		startBlowing();
	}

	House house;

	public Wolf(House house) {
		super();
		this.house = house;
	}

	public void startBlowing() {
		synchronized (house) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Wolf is looking to do damage");
				System.out.println("Wolf sees a pig in house " + house.getHouseNum());
				house.blowHouse();
				house.notify();
				try {
					house.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Wolf did not succeed");

			}
		}
	}

}
