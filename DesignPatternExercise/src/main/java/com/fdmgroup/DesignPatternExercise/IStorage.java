package com.fdmgroup.DesignPatternExercise;

import java.util.List;

public interface IStorage {
	public void create(User user);
	public User read(int id);
	public List<User> readAll();
	public void update(User user);
	public void delete(int id);
	
}
