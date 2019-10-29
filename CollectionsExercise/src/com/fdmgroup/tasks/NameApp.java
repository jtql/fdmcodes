package com.fdmgroup.tasks;

import java.util.TreeSet;

public class NameApp {

	private static void demoSortedCollection(Names... nameArray) {

		TreeSet<Names> nameSet = new TreeSet<Names>();
		for (Names n : nameArray)
			nameSet.add(n);
		System.out.println("Sorted");
		printName(nameSet);

	}

	private static void printName(TreeSet<Names> nameSet) {
		for (Names n : nameSet)
			System.out.println(n);

	}

	public static void main(String[] args) {
		Names n1 = new Names();
		n1.setfName("Joshua");
		n1.setlName("Tan");
		Names n2 = new Names();
		n2.setfName("Phoebe");
		n2.setlName("Lim");
		Names n3 = new Names();
		n3.setfName("Joshua");
		n3.setlName("Lim");

		System.out.println("Comparision n1 and n2: " + n1.compareTo(n2));
		System.out.println("Comparision n1 and n3: " + n1.compareTo(n3));
		System.out.println("Comparision n2 and n3: " + n2.compareTo(n3));
		
		demoSortedCollection(n1,n2,n3);
		

	}

}
