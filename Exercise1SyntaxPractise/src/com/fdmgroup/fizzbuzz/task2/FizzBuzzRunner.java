package com.fdmgroup.fizzbuzz.task2;

public class FizzBuzzRunner {

	private boolean fizz(int num) {
		if (num % 3 == 0) {
			return true;
		}
		return false;
	}

	private boolean buzz(int num) {
		if (num % 5 == 0) {
			return true;
		}
		return false;
	}

	private boolean fizzbuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return true;
		}
		return false;
	}

	public void fizzBuzz(int number) {
		for (int i = 1; i <= number; i++)
			if (fizzbuzz(i)) {
				System.out.println("FizzBuzz");
			} else if (fizz(i)) {
				System.out.println("Fizz");
			} else if (buzz(i)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
	}

}
