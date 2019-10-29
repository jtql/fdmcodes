package com.fdmgroup.CurrencyConverter;

public class CurrencyNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id;

	public CurrencyNotFoundException(String id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "CurrencyNotFoundException [id=" + id + "]";
	}

}
