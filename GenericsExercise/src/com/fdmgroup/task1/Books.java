package com.fdmgroup.task1;

public class Books implements iCommon {
	private int uniqueId;
	private String title;

	public Books(int uniqueId) {
		super();
		this.uniqueId = uniqueId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		return "Books [uniqueId=" + uniqueId + ", title=" + title + "]";
	}

}
