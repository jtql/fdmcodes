package com.fdmgroup.task1;

public class ShopApp {

	public static void main(String[] args) {
		Books b1 = new Books(123456);
		b1.setTitle("Harry Potter");
		Books b2 = new Books(123567);
		
		Catalog<Books> bc = new Catalog<Books>();
		bc.addItem(b1);
		bc.addItem(b2);
		
		loans l1 = new loans(456789);
		l1.setLoanBy("Kevin");
		
		Catalog<loans> lc = new Catalog<loans>();
		lc.addItem(l1);
		
		System.out.println(bc.getItem(123456));
		System.out.println(lc.getItem(456789));

	}

}
