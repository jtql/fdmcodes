package fundamentals;

public class Coffee {
	
	enum BeanType {
		ARABICA(105), JAVA(95), JAMAICA(89);
		private int price;

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		private BeanType(int price) {
			this.price = price;
		}
	}

	private String name;
	private BeanType bean;
	private CoffeeSize size;
	private flavor flavor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BeanType getBean() {
		return bean;
	}

	public void setBean(BeanType bean) {
		this.bean = bean;
	}

	public CoffeeSize getSize() {
		return size;
	}

	public void setSize(CoffeeSize size) {
		this.size = size;
	}
	
	public flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(flavor flavor) {
		this.flavor = flavor;
	}
}
