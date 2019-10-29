package com.fdmgroup.SerializationEx;

public class HealthPack {
	private int healthPoints;
	private int id;

	public HealthPack() {
		super();
	}

	public HealthPack(int healthPoints, int id) {
		super();
		this.healthPoints = healthPoints;
		this.id = id;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
