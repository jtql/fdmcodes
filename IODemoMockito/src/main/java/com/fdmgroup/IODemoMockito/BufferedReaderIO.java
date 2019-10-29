package com.fdmgroup.IODemoMockito;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderIO {
	public String readFirstLineOfFile() throws IOException {
		String filename = "example.txt";
		String firstline = null;

		Reader reader = new FileReader(filename);
		BufferedReader bufferedreader = new BufferedReader(reader);
		firstline = bufferedreader.readLine();

		bufferedreader.close();

		return firstline;
	}

	public List<String> readWholeFileasList() {
		String filename = "example.txt";
		List<String> lines = new ArrayList<String>();

		try {
			Reader reader = new FileReader(filename);
			BufferedReader bufferedreader = new BufferedReader(reader);
			String line = bufferedreader.readLine();
			while (line != null) {
				lines.add(line);
				line = bufferedreader.readLine();
			}
			bufferedreader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return lines;
	}
}
