package com.fdmgroup.passbyvalue;

public class pbv {

	public static int add(int i, int j) {
		int temp;
		j = 80;
		temp = i + j;
		return temp;
	}

	public static void main(String[] args) {
		int i = 36;
		int j = i;
		String s1, s2;
		s1 = "tom";
		s2 = "tim";
		System.out.println(add(i, j));
		System.out.println("j is: " + j);
		j = 89;
		swap(i, j);
		swapString(s1, s2);
		System.out.println("i is: " + i);
		System.out.println("j is: " + j);
		System.out.println("s1 is: " + s1);
		System.out.println("s2 is: " + s2);
	}

	private static void swap(int i, int j) {
		int temp;
		temp = i;
		i = j;
		j = temp;

	}

	private static void swapString(String i, String j) {
		String temp;
		temp = i;
		i = j;
		j = temp;

	}
}
