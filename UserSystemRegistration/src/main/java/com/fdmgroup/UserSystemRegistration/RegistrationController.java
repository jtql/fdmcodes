package com.fdmgroup.UserSystemRegistration;

import java.io.File;
import java.io.IOException;

/**
 * Allows registration of new users and read the users in the database.
 * 
 * @author Joshua.Tan
 *
 */
public class RegistrationController {
	/**
	 * Initialise interfaces and external classes
	 */
	ReadCommand readCommand = new FileReadCommand();
	WriteCommand writeCommand = new FileWriteCommand();
	UserFactory userFactory = new UserFactory();
	Counter counter = new Counter();

	/**
	 * Constructor for RegistrationController with parameters:
	 * 
	 * @param readCommand
	 * @param writeCommand
	 */
	public RegistrationController(ReadCommand readCommand, WriteCommand writeCommand) {
		super();
		this.readCommand = readCommand;
		this.writeCommand = writeCommand;
	}

	public RegistrationController() {
	}

	/**
	 * registerNewUser method with parameters username, password and role Method
	 * creates new user and serializes users in users.txt. Existing users will not
	 * be created. Usernames cannot be duplicated.
	 * 
	 * @param username
	 *            user id
	 * @param password
	 *            user password
	 * @param role
	 *            role of user
	 * @throws IOException
	 *             from FileReadCommand and FileWriteCommand
	 */
	public void registerNewUser(String username, String password, String role) throws IOException {
		User newUser = userFactory.createUser();
		newUser.setUsername(username);
		newUser.setPassword(password);
		newUser.setRole(role);

		File file = new File("users.txt");
		File cFile = new File("counter.txt");

		if (file.exists()) {

			if (readCommand.readUser(username) != null) {
				System.out.println("User already exists!");
			} else {
				writeCommand.writeUser(newUser);
				counter.updateCount();
			}
		} else {
			if (cFile.exists()) {
				cFile.delete();
			}
			writeCommand.writeUser(newUser);
			counter.updateCount();
		}

	}

	/**
	 * readUser method
	 * 
	 * @param username
	 * @return User object with corresponding username.
	 */
	public User readUser(String username) {
		User currUser = readCommand.readUser(username);
		return currUser;
	}
}
