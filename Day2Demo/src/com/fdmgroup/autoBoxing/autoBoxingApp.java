package com.fdmgroup.autoBoxing;

public class autoBoxingApp {
	
	public static void printValues(Integer... test){
		for(Integer t:test)
			System.out.println(t);
	}
	public static void printValues2(int... test){
		for(int t:test)
			System.out.println(t);
	}
	
		public static void main(String[] args) {
		
		//definitions for variables
		int mySize = 10_000_000;
		long start = 0;
		long end = 0;
		
		//int Array
		int[] intArray = new int[mySize];
		start = System.currentTimeMillis();
		for (int j=0; j <intArray.length;j++) {
			intArray[j] = j;
		}
		end = System.currentTimeMillis();
		System.out.println("int array: took" + (end -start) + "ms");
		
		//Integer array
		Integer[] integers=new Integer[mySize];
		start = System.currentTimeMillis();
		for (int j=0; j <intArray.length;j++) {
			integers[j] = j;
		}
		end = System.currentTimeMillis();
		System.out.println("Integer array: took" + (end -start) + "ms");
		
		int[] test1 = new int[mySize];
		start = System.currentTimeMillis();
		for (int j=0; j <intArray.length;j++) {
			test1[j] = new Integer(j);
		}
		end = System.currentTimeMillis();
		System.out.println("Integer to int: took" + (end -start) + "ms");
		
		Integer[] test2 = new Integer[mySize];
		start = System.currentTimeMillis();
		for (int j=0; j <intArray.length;j++) {
			test2[j] = new Integer(j);
		}
		end = System.currentTimeMillis();
		System.out.println("Integer to integer: took" + (end -start) + "ms");
		
		printValues(test2);
		//printValues2(test1);
		
		}
}
