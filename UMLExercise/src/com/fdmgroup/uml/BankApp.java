package com.fdmgroup.uml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BankApp<T, E> {

	private List<T> customers = new ArrayList<>();
	private HashMap<T, E> customersToAcc = new HashMap<>();

	private void updateList(T c) {
		customers.add(c);

	}

	private void updateHash(T c, E a) {
		customersToAcc.put(c, a);
	}

	private int genAccId() {
		if (customers.size() == 0)
			return 1000;
		else
			return 1000 + 5 * customers.size();
	}

	private int genBankId() {
		if (customersToAcc.size() == 0)
			return 2_000_000;
		else
			return 2_000_000 + 4 * customersToAcc.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
