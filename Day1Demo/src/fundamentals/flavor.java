package fundamentals;

public enum flavor {
	Hazelnut(5),Caramel(3),Vanilla(2);
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private flavor(int price) {
		this.price = price;
	}
	
	
}
