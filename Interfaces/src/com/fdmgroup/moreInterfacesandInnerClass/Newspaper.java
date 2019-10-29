package com.fdmgroup.moreInterfacesandInnerClass;

public class Newspaper extends toPrint {
	private String nName;

	public String getnName() {
		return nName;
	}

	public void setnName(String nName) {
		this.nName = nName;
	}

	public Newspaper(String nName) {
		super();
		this.nName = nName;
	}

}
