package com.fdmgroup.tasks;

public class Names implements Comparable<Names> {
	private String fName;
	private String lName;

	public Names() {
		super();
	}

	public Names(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Names [fName=" + fName + ", lName=" + lName + "]";
	}

	@Override
	public int compareTo(Names o) {
		if (o == null)
			throw new NullPointerException("Null object passed to compareTo");
		return fName.compareTo(o.fName);
	}

}
