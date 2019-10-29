package com.fdmgroup.IOExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BufferedWriterIO filewriter = new BufferedWriterIO();
		
		 BufferedReaderIO filereader = new BufferedReaderIO();
		
		 

		Scanner myObj = new Scanner(System.in);
		String name,address,email;

		 //Enter username and press Enter
		System.out.println("Enter name");
		name = myObj.nextLine();
		System.out.println("Enter address");
		address = myObj.nextLine();
		System.out.println("Enter email");
		email = myObj.nextLine();
		
		filewriter.writeLineToFile(name +","+address+","+email);
		List<String> userObjects = filereader.readWholeFileasList("register.txt");
		List<User> users = new ArrayList<User>();
		for(String s:userObjects) {
			String[] tempUser = s.split(",");
			User u = new User(tempUser[0],tempUser[1],tempUser[2]);
			users.add(u);
		}
		
		System.out.println(userObjects);
		
		
	}
}