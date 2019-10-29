package com.fdmgroup.UserSystemRegistration;

import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RegistrationController rc = new RegistrationController();
		Counter counter = new Counter();
		
//		rc.registerNewUser("josh.tan", "1234", "trainee");
		rc.registerNewUser("kevin.sidra", "555", "trainee");
		rc.registerNewUser("Tim.Yeo", "55566", "Trainee");
//		System.out.println(rc.readUser(Tim));
		System.out.println(counter.countObj());
	}

}
