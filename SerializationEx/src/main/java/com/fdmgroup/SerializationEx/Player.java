package com.fdmgroup.SerializationEx;

import java.io.Serializable;

public class Player implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int healthPoints;
	private String name;

	public Player(String name) {
		super();
		this.healthPoints = 1000;
		this.name = name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [healthPoints=" + healthPoints + ", name=" + name + "]";
	}

}
