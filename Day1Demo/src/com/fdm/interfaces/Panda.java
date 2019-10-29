package com.fdm.interfaces;

public final class Panda implements iTalkingAnimal {
	private String pandaName;

	@Override
	public void setName(String name) {
		this.pandaName = name;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return pandaName;
	}

	@Override
	public void talk() {
		System.out.println("tut");

	}

}
