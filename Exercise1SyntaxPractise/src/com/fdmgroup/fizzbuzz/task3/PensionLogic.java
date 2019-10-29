package com.fdmgroup.fizzbuzz.task3;

public class PensionLogic {
	public PensionLogic() {
	}
	public boolean isPensionable(Person person, String year) {
		String dateOfBirth[] = person.getDateOfBirth().split("/");
		int yearOfBirth = Integer.parseInt(dateOfBirth[2]);
		int givenYear = Integer.parseInt(year);
		if ( givenYear-yearOfBirth >= 65) {
			return true;
		} 
		return false;
	}
}
