package com.fdmgroup.uml;

public abstract class BankAccount implements iBanking {
	protected double balance;
	private int uniqueId;

	public BankAccount() {
		super();

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

}
