package com.fdmgroup.CurrencyConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	static String[] currency;
	static String enteredCurrency;
	static double amount;

	public static void main(String[] args) throws CurrencyNotFoundException {
		Parser parse = new Parser();
		CurrenyConverter cc = new CurrenyConverter();
		currency = parse.getCurrency();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < currency.length; i++) {
			System.out.println(i + 1 + ". " + currency[i]);
		}
		boolean correct = false;
		boolean aCorrect = false;
		while (!correct) {
			try {
				System.out.print("Enter Currency: ");
				enteredCurrency = scan.nextLine().toUpperCase();
				for (int i = 0; i < currency.length; i++) {
					if (enteredCurrency.equalsIgnoreCase(currency[i])) {
						correct = true;
					}
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}
		while (!aCorrect) {
			try {
				System.out.println("Entered " + enteredCurrency);
				System.out.print("Enter amount: ");
				String amt = scan.nextLine();

				if (amt.matches("\\d+")) {
					amount = Double.parseDouble(amt);
					aCorrect = true;
				}
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Amount: " + amount);
		double convertedAmount = cc.convertCurrency(enteredCurrency, amount);
		System.out.println(enteredCurrency + ": " + convertedAmount);
	}
}
