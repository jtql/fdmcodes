package com.fdmgroup.UserSystemRegistration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Counter {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Counter() {
	}

	public Integer countObj() {
		int currentCount = 0;

		try {
			FileInputStream fis = new FileInputStream("counter.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			currentCount = (Integer) ois.readObject();
			// System.out.println(currentUser);

			ois.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return currentCount;
	}

	public void updateCount() {
		File file = new File("counter.txt");
		int count = 0;
		try {
			if (file.exists()) {
				count = countObj();
			} else {
				count = 0;
			}
			ObjectOutputStream oos = null;
			FileOutputStream fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(count + 1);
			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
