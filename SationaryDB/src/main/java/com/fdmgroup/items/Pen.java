package com.fdmgroup.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PenT")

public class Pen extends Item implements ReOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String color;
	private double price;
	private String brand;
	

	public Pen() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void reorderItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + ", brand=" + brand + "]";
	}

	public int getId() {
		return id;
	}


}
