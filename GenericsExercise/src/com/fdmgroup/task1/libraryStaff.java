package com.fdmgroup.task1;

public class libraryStaff implements iCommon {
	private int uniqueId;

	public libraryStaff(int uniqueId) {
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
		// TODO Auto-generated method stub
		this.uniqueId = uniqueId;
	}

	@Override
	public String toString() {
		return "libraryStaff [uniqueId=" + uniqueId + "]";
	}

}
