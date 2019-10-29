package com.fdmgroup.DesignPatternExercise;

public class UserManager {

	public static void main(String[] args) {
		IStorage userStorage = StorageFactory.getStorage();
		userStorage.delete(1001);
		userStorage.create(new User("joshua", "tan", 123, "gmail"));
		userStorage.create(new User("kevin", "cheng", 122, "gmail"));
		userStorage.create(new User("sidra", "haider", 121, "gmail"));
		System.out.println(userStorage.readAll());
		System.out.println(userStorage.read(123));
		userStorage.delete(121);
		System.out.println(userStorage.readAll());
		userStorage.update(new User("josh","was", 123, "yahoo"));
		System.out.println(userStorage.readAll());

	}

}
