package com.fdmgroup.uml;

public class businessCurrent extends CurrentAccount {

	private String companyName;

	public businessCurrent(String companyName) {
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
