package com.fdmgroup.task8;

import java.util.Collections;
import java.util.PriorityQueue;

public class task8 {

	public static PriorityQueue<Double> doubleToPQ(double... Numbers) {
		PriorityQueue<Double> doublePQ = new PriorityQueue<Double>(Collections.reverseOrder());
		for (double Number : Numbers) {
			doublePQ.offer(Number);
		}
		return doublePQ;
	}

	public static void main(String[] args) {
		
		System.out.println("\nQuestion 8\n");
		PriorityQueue<Double> Question8 = new PriorityQueue<Double>();
		Question8 = doubleToPQ(2.4, 6.6, 12.6, 1.5, 3.9, 15.9, 44.6);
		System.out.println("Elements in Priority Queue: " + Question8);
		System.out.println("Polling from Priority Queue in descending order :");
		for (int i = Question8.size(); i > 0; i--) {
			System.out.println(Question8.poll());
//			System.out.println(Question8);
		}
	}

}
