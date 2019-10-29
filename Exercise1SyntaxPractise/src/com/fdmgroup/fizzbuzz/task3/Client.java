package com.fdmgroup.fizzbuzz.task3;

public class Client {
	
	public static void main(String[] args) {
		PensionController controller= new PensionController();
		Person p1 = new Person();
		p1.setFirstname("John");
		p1.setLastname("Smith");
		p1.setDateOfBirth("28/06/1993");
		
		Person p2 = new Person();
		p2.setFirstname("Jane");
		p2.setLastname("Doe");
		p2.setDateOfBirth("05/01/1950");
		
		Person p3 = new Person();
		p3.setFirstname("Fred");
		p3.setLastname("Bloggs");
		p3.setDateOfBirth("12/12/1949");
		
		Person[] Person = new Person[3];
		Person[0]=p1;
		Person[1]=p2;
		Person[2]=p3;
		
		controller.handlePensions(Person);
	}
	
}
