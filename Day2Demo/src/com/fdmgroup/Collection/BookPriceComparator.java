package com.fdmgroup.Collection;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if(o1==null)
			return -1;
		if(o2==null)
			return 1;
		
		double p1 = o1.getPrice();
		double p2 = o2.getPrice();
		
		return Double.compare(p1, p2);
	}
	
}
