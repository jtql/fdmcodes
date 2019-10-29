package com.fdmgroup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AnimalApp { //serializing 1 object - Animal

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Animal animal = new Animal("Zebra", 5);
		Animal a1 = null;
		try {
			// Serialize Object
			FileOutputStream fs = new FileOutputStream("animal.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(animal);
			os.close();

			FileInputStream fis = new FileInputStream("animal.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			a1 = (Animal) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Deserialized value from a1: " + a1.getName());

	}

}
