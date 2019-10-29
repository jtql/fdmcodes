package com.fdmgroup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MammalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal m1 = new Mammal("Horse",true,false);
		System.out.println("Pre-Serialization Animal" +m1);
		Mammal m2 = null;
		
		try {
			FileOutputStream fos = new FileOutputStream("Mammals.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(m1);
			os.close();
			
			FileInputStream fis = new FileInputStream("Mammals.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			m2 = (Mammal)ois.readObject();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Deserialzed Mammal: "+ m2);
	}
	


}
