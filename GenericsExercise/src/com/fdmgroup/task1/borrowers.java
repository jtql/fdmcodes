package com.fdmgroup.task1;

public class borrowers implements iCommon {
	private int uniqueId;

	public borrowers(int uniqueId) {
		super();
		this.uniqueId = uniqueId;
	}

	@Override
	public int getUniqueId() {
		// TODO Auto-generated method stub
		return uniqueId;
	}

	@Override
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;

	}

	@Override
	public String toString() {
		return "borrowers [uniqueId=" + uniqueId + "]";
	}

}
