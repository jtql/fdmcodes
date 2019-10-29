package com.fdmgroup.SerializationEx;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

	List<HealthPack> backpack = new ArrayList<HealthPack>();

	public Backpack() {
		super();
	}

	public void addHealthPack(HealthPack hp) {
		backpack.add(hp);
	}

	public HealthPack useHealthPack() {
		HealthPack tempHp = backpack.get(1);
		backpack.remove(1);
		return tempHp;
	}

	public int getNumPacks() {
		return backpack.size();
	}

}
