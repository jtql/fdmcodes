package com.fdmgroup.STREAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilterReduceApp {

	public static void main(String[] args) {
		// Mapping
		// convert List<String> to List<Integer>

		List<String> listOfString = Arrays.asList("10", "100", "1000", "10000");
		List<Integer> listOfInteger = listOfString.stream().map(Integer::valueOf).collect(Collectors.toList());
		// printing listOfInteger elements
//		listOfInteger.forEach(System.out::println);
		// printing value of listOfString elements
//		listOfString.stream().map(Integer::valueOf).forEach(System.out::println);
		// Created Employees
		List<employee> employeeList = new ArrayList<>();
		employeeList.add(new employee(1, "John", 80000));
		employeeList.add(new employee(1, "James", 90000));
		employeeList.add(new employee(1, "Josh", 60000));
		employeeList.add(new employee(1, "Alex", 100000));
		employeeList.add(new employee(1, "Megos", 50000));

		List<Double> salaryList = employeeList.stream().map(employee::getSalary).collect(Collectors.toList());
		
//		salaryList.forEach(System.out::println);
		salaryList.stream().filter(salary -> salary >80000).forEach(System.out::println);
		System.out.println(salaryList.stream().filter(salary -> salary >80000).count());
		employeeList.stream().map(employee::getSalary).filter(n->n>80000).forEach(System.out::println);
	}

}
