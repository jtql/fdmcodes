package com.fdmgroup.tasks3;

import java.awt.Color;
import java.util.HashMap;

public class colorHash {
	private static HashMap<String, Color> colors = new HashMap<>();

	public colorHash() {

		colors.put("yellow", Color.YELLOW);
		colors.put("blue", Color.BLUE);
		colors.put("red", Color.RED);
		colors.put("orange", Color.ORANGE);
		colors.put("yellow", Color.YELLOW);
		colors.put("green", Color.GREEN);
		colors.put("pink", Color.PINK);
		colors.put("black", Color.BLACK);
		colors.put("GREY", Color.GRAY);
		colors.put("magenta", Color.MAGENTA);
		colors.put("cyan", Color.CYAN);
		colors.put("dark grey", Color.darkGray);
		colors.put("white", Color.WHITE);

	}

	public HashMap<String, Color> returnColors() {
		return colors;
	}

	public static void main(String[] args) {
		colorHash example = new colorHash();
		System.out.println(example.returnColors());
	}
}
