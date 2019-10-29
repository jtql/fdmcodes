package com.fdmgroup;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// BufferedWriterIO filewriter = new BufferedWriterIO();
		// filewriter.writeLineToFile("Welcome to IO handling Techniques");

		BufferedReaderIO filereader = new BufferedReaderIO();

		// try {
		// System.out.println(filereader.readFirstLineOfFile());
		// }
		// catch(IOException e) {
		// e.printStackTrace();
		// }

		System.out.println(filereader.readWholeFileasList());

	}

}
