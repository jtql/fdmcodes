package com.fdmgroup;

import java.io.Serializable;

public class Animal implements Serializable {

	/**
	 * This class is for serialization 
	 * 
	 * @author Joshua.Tan
	 * @category Serialization Demo
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	/**
	 * 
	 * @param name retrieves name of animal
	 * @param age retrieves age of animal
	 */
	
	public Animal(String name, int age) {
		super();
		this.setName(name);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

}
