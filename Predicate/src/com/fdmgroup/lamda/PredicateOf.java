package com.fdmgroup.lamda;

public interface PredicateOf <F,S> {
	boolean test(F first, S second);
	
	default String getName() {
		return "PredicateOf";
	}
}
