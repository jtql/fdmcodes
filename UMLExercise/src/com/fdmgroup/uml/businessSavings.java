package com.fdmgroup.uml;

public class businessSavings extends SavingsAccount {
	
	private String companyName;
	
	public businessSavings(String companyName) {
		super();
		this.companyName = companyName;
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
