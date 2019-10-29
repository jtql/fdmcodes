package fundamentals;

import fundamentals.Coffee.BeanType;

public class CoffeeMaker {

	public static void main(String[] args) {
		Coffee decaf = new Coffee();
		// BeanType bean=new BeanType(23);

//		decaf.setName("Decaf");
//		decaf.setSize(CoffeeSize.TALL);
//		decaf.setBean(BeanType.JAVA);
//		System.out.println(decaf.getBean().getPrice());

//		Coffee.BeanType[] beans = Coffee.BeanType.values();
//		System.out.println("\nBeanType Values\n");
//		for (int j = 0; j < beans.length; j++)
//			System.out.println(beans[j]);
		
		Coffee newCoffee=new Coffee();
		newCoffee.setName("Hazelnut Americano");
		newCoffee.setSize(CoffeeSize.TALL);
		newCoffee.setBean(BeanType.JAVA);
		newCoffee.setFlavor(flavor.Hazelnut);
		System.out.println(newCoffee.getName());
		System.out.println(newCoffee.getBean().getPrice()+newCoffee.getFlavor().getPrice());

	}

}
