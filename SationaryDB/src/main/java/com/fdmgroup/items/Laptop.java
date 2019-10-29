package com.fdmgroup.items;

public class Laptop extends Item implements ReOrder {
	private String brand;
	private String productId;
	private double price;
	private String processor;
	private int storageSpace;

	public Laptop(String brand, String productId, double price, String processor, int storageSpace) {
		super();
		this.brand = brand;
		this.productId = productId;
		this.price = price;
		this.processor = processor;
		this.storageSpace = storageSpace;
	}

	public Laptop() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getStorageSpace() {
		return storageSpace;
	}

	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void reorderItem() {
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + storageSpace;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = (int) (prime * result + (int) temp ^ (temp >>> 32));
		result = prime * result + ((processor == null) ? 0 : processor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (storageSpace != other.storageSpace)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", productId=" + productId + ", price=" + price + ", processor=" + processor
				+ ", storageSpace=" + storageSpace + "]";
	}
}