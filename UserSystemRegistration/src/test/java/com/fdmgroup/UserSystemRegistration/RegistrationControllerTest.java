package com.fdmgroup.UserSystemRegistration;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class RegistrationControllerTest {

	ReadCommand mockReader = mock(FileReadCommand.class);
	WriteCommand mockWriter = mock(FileWriteCommand.class);
	String username = "josh.tan";
	RegistrationController rc = new RegistrationController(mockReader, mockWriter);

	@Test
	public void readUser_CallsReadUserMethodOfFileReaderExactlyOnceWhenCalled() {

		// Act
		rc.readUser(username);

		// Assert
		verify(mockReader, times(1)).readUser(anyString()); // Method 1

	}

}
