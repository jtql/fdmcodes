package com.fdmgroup.IOExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterIO {
	public void writeLineToFile(String Line) {
		String file_name = "register.txt";
		try {
			Writer writer = new FileWriter(file_name, true);

			BufferedWriter bufferedwriter = new BufferedWriter(writer);
			bufferedwriter.write(Line);
			bufferedwriter.newLine();
			bufferedwriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
