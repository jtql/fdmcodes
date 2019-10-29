package com.fdmgroup.threading;

public class myRunnable implements Runnable {
	Counter counter;
	int total = 0;
	int math = 0;

	@Override
	public void run() {
		counting();

	}

	public myRunnable(Counter counter) {
		super();
		this.counter = counter;
	}

	public void counting() {
		for (int i = 0; i < 10; i++) {
			counter.incrementCount();
			total += counter.getCount();
			math = total * counter.getCount();
			String something = "Run Thread: " + Thread.currentThread().getName() + "Time: " + System.currentTimeMillis()
					+ "Count: " + counter.getCount();
			System.out.println(something);

			try {
				Thread.sleep(20); // sleep for 20ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
