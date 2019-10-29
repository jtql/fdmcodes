package com.fdmgroup.task5;

import java.util.HashMap;

public class task5 {

	private static HashMap<String, Integer> wordSort = new HashMap<String, Integer>();

	static void genWordWithFreq(String[] str, int n) {

		for (int i = 0; i < n; i++) {

			Integer j = wordSort.get(str[i]);

			if (j == null)
				wordSort.put(str[i], 1);

			else
				wordSort.put(str[i], j + 1);
		}
	}
		// System.out.println(charSort.keySet());
		// charSort.remove(' ');
	static void printWordFreq(HashMap<String, Integer> wordHash) {
		for (String w : wordHash.keySet())
			System.out.print("" + w + wordHash.get(w) + " ");
	}

	private static HashMap<Character, Integer> charSort = new HashMap<Character, Integer>();

	static HashMap<Character, Integer> genCharWithFreq(String str, int n) {

		for (int i = 0; i < n; i++) {

			Integer j = charSort.get(str.charAt(i));

			if (j == null)
				charSort.put(str.charAt(i), 1);

			else
				charSort.put(str.charAt(i), j + 1);
		}
		return charSort;
		// System.out.println(charSort.keySet());
		// charSort.remove(' ');
	}

	static <T, E> void printCharFreq(HashMap<T, E> charHash) {
		for (T c : charHash.keySet())
			System.out.print("" + c + charHash.get(c) + " ");
	}

	static String[] breakSentence(String str) {
		String[] res = str.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		return res;
	}

	public static void main(String[] args) {
		String[] res = breakSentence("hi! my name is JOshua tan :-)");
		int n = res.length;
		genWordWithFreq(res, n);
		for (int i = 0; i < n; i++) {
			int N = res[i].length();
			genCharWithFreq(res[i], N);
		}
		printWordFreq(wordSort);	
		printCharFreq(charSort);
		// System.out.println(res[0]);

	}

}
