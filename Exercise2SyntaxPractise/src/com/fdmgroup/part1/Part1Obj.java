package com.fdmgroup.part1;

public class Part1Obj extends Part1{
	// #7 if comment out methods, there will be errors
	public void talk() {
		System.out.println("talk");
	}
	// #8 comment out take and there will be errors
	public void take() {
		System.out.println("take");
	}
	public void give() {
		System.out.println("give");
	}
	// #15 if comment out, will produce an error
	@Override
	public void count() {
		System.out.println("count");
		
	}
	int s = 3;
	// #9 no-arg constructor
	public Part1Obj() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Part1Obj(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//# 13 cannot be overriden
	@Override
	protected int s = 2;

}
