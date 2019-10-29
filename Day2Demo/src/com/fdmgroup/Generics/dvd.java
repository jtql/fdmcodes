package com.fdmgroup.Generics;

public class dvd {
	private String title;
	private int rating;
	private double price;
	private String uniqueId;

	public dvd(String title, int rating, double price, String uniqueId) {
		super();
		this.title = title;
		this.rating = rating;
		this.price = price;
		this.uniqueId = uniqueId;
	}
	

	public dvd() {
		super();
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	@Override
	public String toString() {
		return "dvd [title=" + title + ", rating=" + rating + ", price=" + price + ", uniqueId=" + uniqueId + "]";
	}

}
