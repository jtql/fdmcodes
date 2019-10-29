package com.fdmgroup.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SchoolBag")

public class SchoolBag extends Item implements ReOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String brand;
	private double price;
	private String color;

	public SchoolBag() {

	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void reorderItem() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "SchoolBag [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

}
