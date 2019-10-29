package com.fdmgroup.IOExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderIO {

	public int countCharacter(String file, char c) {
		String filename = file;
		List<String> lines = new ArrayList<String>();
		int counter = 0;

		try {
			Reader reader = new FileReader(filename);
			BufferedReader bufferedreader = new BufferedReader(reader);
			String line = bufferedreader.readLine();
			while (line != null) {
				lines.add(line);
				line = bufferedreader.readLine();
			}
			bufferedreader.close();
			Object[] linesArray = lines.toArray();
			for (int i = 0; i < linesArray.length; i++) {
				String str = linesArray[i].toString();
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == c) {
						counter++;
					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return counter;
	}
	public List<String> readWholeFileasList(String file) {
		String filename = file;
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
