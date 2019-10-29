package com.fdmgroup.threadsmore;

public class House {
	private int houseNum;

	public void buildHouse() {
		System.out.println("Finished Building House: " + houseNum);
	}

	public void blowHouse() {
		System.out.println("Blow on House: " + houseNum);
	}

	public void fallDown() {
		System.out.println("House number " + houseNum + " was blown down.");
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public void incrementHouseNum() {
		houseNum++;
	}
}
