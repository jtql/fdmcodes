package com.fdmgroup.task1;

public class loans implements iCommon {

	private int uniqueId;
	private String loanBy;

	public loans(int uniqueId) {
		super();
		this.uniqueId = uniqueId;
	}

	public String getLoanBy() {
		return loanBy;
	}

	public void setLoanBy(String loanBy) {
		this.loanBy = loanBy;
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
		return "loans [uniqueId=" + uniqueId + ", loanBy=" + loanBy + "]";
	}

}
