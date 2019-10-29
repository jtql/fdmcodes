package com.fdmgroup.uml;

public class CurrentAccount extends BankAccount {

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amt) {
		balance -= amt;
		
	}

	@Override
	public void deposit(double amt) {
		balance += amt;
		
	}

}
