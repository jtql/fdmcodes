package com.fdmgroup.task6;

import java.util.LinkedList;

public class reverseLinkedlist<T> {

	private static <T> LinkedList<T> createList() {
		LinkedList<T> reversedList = new LinkedList<>();
		return reversedList;
	}
	static <E> void printReverse(LinkedList<E> list, LinkedList<E> rList) {
		int n = list.size();
		for (int i = 1; i <= n; i++) {
			rList.add(list.get(n-i));

		}
		System.out.println(rList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> object = new LinkedList<String>(); 
		  
        object.add("A"); 
        object.add("B"); 
        object.addLast("C"); 
        object.addFirst("D"); 
        object.add(2, "E"); 
        object.add("F"); 
        object.add("G"); 
        System.out.println(object);
        
        LinkedList<String> rList = createList();
        printReverse(object, rList);
        
        
	}

}
