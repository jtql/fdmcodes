package com.fdmgroup;

import java.io.Serializable;

public class Mammal extends Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean land;
	private boolean sea;

	public Mammal(String name, boolean land, boolean sea) {
		super(name, 5); // Animal Constructor
		this.setLand(land);
		this.setSea(sea);
	}

	public boolean isSea() {
		return sea;
	}

	public void setSea(boolean sea) {
		this.sea = sea;
	}

	public boolean isLand() {
		return land;
	}

	public void setLand(boolean land) {
		this.land = land;
	}

	@Override
	public String toString() {
		return "Mammal [land=" + land + ", sea=" + sea + ", age=" + getAge() + getName() +"]";
	}

}
