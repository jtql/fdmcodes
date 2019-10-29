package com.fdmgroup.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExampleApp {
	private static void doStringPredicateExample(int choice) {
		Predicate<String> isEmpty = null;
		switch (choice) {
		case 0:
			isEmpty = new Predicate<String>() {
				@Override
				public boolean test(String t) {
					return t.isEmpty();
				}
			};
			break;
		case 1:
			isEmpty = (value) -> value.isEmpty();
			break;
		case 2:
			isEmpty = String::isEmpty;
			break;
		}

		System.out.println("The given choice is: " + choice);
		System.out.println(isEmpty);
		System.out.println(isEmpty.test(""));
		System.out.println(isEmpty.test("josh"));
	}

	private static void doUserPredicateExample(int choice) {

		Predicate<User> overThirty = null;
		switch (choice) {
		case 0:
			overThirty = new Predicate<User>() {
				@Override
				public boolean test(User u) {
					return u.overThirty();
				}
			};
			break;
		case 1:
			overThirty = u -> u.overThirty();
			break;
		case 2:
			overThirty = User::overThirty;
			break;
		}

		System.out.println("The given choice is: " + choice);
		System.out.println(overThirty);
		User young = new User(20);
		User old = new User(40);
		System.out.println(overThirty.test(young));
		System.out.println(overThirty.test(old));
	}

	private static void doPredicateWithTwoTypes() {
		PredicateOf<String, User> predicate = (first, second) -> first.isEmpty() && second.overThirty();

		System.out.println(predicate.test("", new User(32)));
		System.out.println(predicate.test("fox", new User(29)));
	}

	private static void doLambdaWithUserCollectionStream() {
		int numUser = 10;
		// Creating Users
		List<User> userList = new ArrayList<>();
		for (int i = 0; i < numUser; i++) {
			userList.add(new User(i * 10));
		}
		// Filter using overThirty with stream
		Stream<User> stream = userList.stream();
		stream = stream.filter(User::overThirty);
		System.out.println(stream.collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		// doStringPredicateExample(0);
		// doStringPredicateExample(1);
		// doStringPredicateExample(2);
		//
		// doUserPredicateExample(0);
		// doUserPredicateExample(1);
		// doUserPredicateExample(2);

		doPredicateWithTwoTypes();
		doLambdaWithUserCollectionStream();

	}

}
