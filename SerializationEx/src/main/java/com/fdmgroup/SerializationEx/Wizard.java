package com.fdmgroup.SerializationEx;

import java.io.Serializable;

public class Wizard extends Player implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Wizard(String name) {
		super(name);
		this.setHealthPoints(1500);
		// TODO Auto-generated constructor stub
	}
	
	public void shield(Wizard w) {
		w.setHealthPoints(getHealthPoints()+100);
	}
	public void power(Wizard w) {
		w.setHealthPoints(getHealthPoints()-100);
	}

}
