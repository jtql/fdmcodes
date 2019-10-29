package com.fdmgroup.UserSystemRegistration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileReadCommand implements ReadCommand {
	private final static Logger programmerLog = LogManager.getLogger();
	private final static Logger managerLog = LogManager.getLogger("managerLogs");
	private final static Logger testerLog = LogManager.getLogger("testerLogs");

	public User readUser(String username) {
		Counter counter = new Counter();
		User currentUser = null;
		int count = counter.countObj();

		try {
			FileInputStream fis = new FileInputStream("users.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			// System.out.println(currentUser);
			for (int i = 0; i < count; i++) {
				User tempUser = (User) ois.readObject();
				if (tempUser.getUsername().equals(username)) {
					currentUser = tempUser;
				}
			}

			ois.close();
			fis.close();

		} catch (IOException e) {
			programmerLog.trace("Exception called.");
			programmerLog.warn("De-serialization failed", e);
			managerLog.warn("De-serialization failed", e);
			testerLog.warn("De-serialization failed", e);
		} catch (ClassNotFoundException e) {
			programmerLog.warn("De-serialization failed", e);
			managerLog.warn("De-serialization failed", e);
			testerLog.warn("De-serialization failed", e);
		}

		return currentUser;
	}

}
