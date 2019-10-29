package com.fdmgroup.DesignPatternExercise;

public class StorageFactory {
	public static IStorage getStorage() {
		return new UserArrayListStorage();
	}
}
