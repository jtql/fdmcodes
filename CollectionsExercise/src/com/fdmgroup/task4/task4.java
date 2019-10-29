package com.fdmgroup.task4;

import java.util.HashMap;

public class task4 {
	static void printCharWithFreq(String str, int n) {

		HashMap<Character, Integer> charSort = new HashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {

			Integer j = charSort.get(str.charAt(i));

			if (j == null)
				charSort.put(str.charAt(i), 1);

			else
				charSort.put(str.charAt(i), j + 1);
		}
//		System.out.println(charSort.keySet());
		charSort.remove(' ');
		for (Character c : charSort.keySet())
			System.out.print("" + c + charSort.get(c) + " ");
	}

	public static void main(String[] args) {
		String str = "Hello World";
		String res = str.toLowerCase();
		int n = str.length();
		printCharWithFreq(res, n);

	}

}
