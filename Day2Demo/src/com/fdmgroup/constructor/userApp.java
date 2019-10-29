package com.fdmgroup.constructor;

public class userApp {


	public static void main(String[] args) {
		System.out.println("User Management System");
		AdminUser a1 = new AdminUser("Stephen", "Haeking");
		Trainee t1 = new Trainee("Gary", "Larson");
		System.out.println(a1);
		System.out.println(t1);

		User a2 = new AdminUser("Allan", "Gerry");
		User t2 = new Trainee("Daniel", "Tay");
		System.out.println(a2);
		System.out.println(t2);
		a2.visitUser();
		a1.visitUser();
		a1.sayHello();

	}

}
