package com.fdmgroup.lamda;

public class User {
	int age;

	public User(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [age=" + age + "]";
	}

	public boolean overThirty() {
		if (this.age < 30) {
			return false;
		} else {
			return true;
		}
	}

}
