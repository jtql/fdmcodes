package com.fdmgroup.DesignPatternExercise;

import java.util.ArrayList;
import java.util.List;

public class UserArrayListStorage implements IStorage {

	List<User> users = new ArrayList<User>();

	public void create(User user) {
		// TODO Auto-generated method stub
		users.add(user);
	}

	public User read(int id) {
		// TODO Auto-generated method stub
		for (User u : users) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}

	public List<User> readAll() {
		// TODO Auto-generated method stub
		return users;
	}

	public void update(User updatedUser) {
		for (User u : users) {
			if (u.getId() == updatedUser.getId()) {
				u.setEmail(updatedUser.getEmail());
				u.setId(updatedUser.getId());
				u.setPassword(updatedUser.getPassword());
				u.setUsername(updatedUser.getUsername());
			}
		}

	}

	public void delete(int id) {
		for (User u : users) {
			if (u.getId() == id) {
				users.remove(u);
				break;
			}	
		}

	}

}
