package com.fdmgroup.CurrencyConverter;

public class CurrenyConverter {
	Parser parse = new Parser();

	public double convertCurrency(String curr, double amt) {
		String[] currency = parse.getCurrency();
		double[] rate = parse.getRate();
		double result = 0;

		for (int i = 0; i < currency.length; i++) {
			if (currency[i].equalsIgnoreCase(curr)) {
				result = amt * rate[i];
			}
		}
		return result;
	}

	public boolean checkCurrency(String c) {
		boolean state = false;

		Parser parse = new Parser();
		String[] currency = parse.getCurrency();

		for (int i = 0; i < currency.length; i++) {
			if (c.equals(currency[i])) {
				state = true;
			}
		}

		return state;

	}
}
