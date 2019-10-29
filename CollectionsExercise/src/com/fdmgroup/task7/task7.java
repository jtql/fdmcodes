package com.fdmgroup.task7;

import java.util.TreeSet;

public class task7 {

	private static TreeSet<String> tokenizedSet = new TreeSet<>();

	public static String[] splitString(String str) {
		String[] res = str.split(" ");
		return res;
	}

	public static void main(String[] args) {
		String[] res = splitString("Hi how are you");
		int n = res.length;
		for (int i = 0; i < n; i++) {
			tokenizedSet.add(res[i]);

		}
		System.out.println(tokenizedSet);
	}

}
