package com.fdmgroup.predicate;

import java.util.function.Predicate;

public class PredicateApp {

	public static void main(String[] args) {

		System.out.println("Creating an 'isFour' object, of an anonymous inner class"
				+ "that implements \n a predicate method - functional interface");

		Predicate<Integer> isFour = (i) -> i == 4;
		System.out.println("isFour = " + isFour); // hashcode

		Boolean result = isFour.test(4);
		System.out.println(result);

		result = isFour.test(3);
		System.out.println(result);

		System.out.println("Creating an 'isEven' object, an anonymous inner class"
				+ "\n that implements predicate method- functional interface Predicate<Integer>");

		Predicate<Integer> isEven = i -> i % 2 == 0;
		Boolean result1 = isEven.test(4);
		System.out.println(result1);

		Boolean results = isFour.and(isEven).test(4);
		System.out.println(results);

		results = isFour.or(isEven).test(24);
		System.out.println(results);

		Boolean result2 = Predicate.isEqual(4).test(4);
		System.out.println(result2);

		Predicate<Integer> isOdd = i -> i % 2 != 0;
		Boolean result3 = isOdd.test(66);	
		System.out.println(result3);
		
	}

}
