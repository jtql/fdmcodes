package com.fdmgroup.threading;

import java.util.Vector;

public class ThreadOrganiser {

	public static void main(String[] args) throws InterruptedException {
		Counter count = new Counter();
		myRunnable runnable = new myRunnable(count);

		Vector<Thread> allThreads = new Vector<Thread>();
		for (int i = 0; i < 6; i++) {
			// each thread will get a runnable object and a name
			allThreads.add(new Thread(runnable, "thread" + i));

		}
		// Start thread using start() and move threads to runnable state
		for (Thread t : allThreads)
			t.start();
		for (Thread t : allThreads)
			t.join();

		// at the end of thread execution, display the total
		System.out.println("The number of times the counter object was incremented: " + runnable.counter.getCount());
		System.out.println("Sum of all counter: " + runnable.total);
		System.out.println("The math value is: " + runnable.math);

	}

}
