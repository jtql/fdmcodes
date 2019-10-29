package com.fdmgroup.UserSystemRegistration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileWriteCommand implements WriteCommand {

	public void writeUser(User user) {

		final Logger programmerLog = LogManager.getLogger();
		final Logger managerLog = LogManager.getLogger("managerLogs");
		final Logger testerLog = LogManager.getLogger("testerLogs");
		File file = new File("users.txt");

		try {
			ObjectOutputStream oos = null;

			if (file.exists()) {
				FileOutputStream fos = new FileOutputStream("users.txt", true);
				oos = new AppendingObjectOutputStream(fos);
//				fos.close();
			} else {
				FileOutputStream fos = new FileOutputStream("users.txt", true);
				oos = new ObjectOutputStream(fos);
//				fos.close();
			}
			oos.writeObject(user);
			oos.close();

		} catch (IOException e) {
			programmerLog.warn( "De-serialization failed", e);
			managerLog.warn( "De-serialization failed", e);
			testerLog.warn( "De-serialization failed", e);
		}

	}

	class AppendingObjectOutputStream extends ObjectOutputStream {

		public AppendingObjectOutputStream(OutputStream out) throws IOException {
			super(out);
		}

		@Override
		protected void writeStreamHeader() throws IOException {
			// do not write a header, but reset:
			// this line added after another question
			// showed a problem with the original
			reset();
		}

	}
}
