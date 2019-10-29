package com.fdmgroup.items;

public abstract class Item {

	public String itemNumber;

	public Item() {
		super();
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	public abstract double getPrice();

}
