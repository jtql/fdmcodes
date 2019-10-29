package com.fdmgroup.SerializationEx;

public class A implements iA {
	private int x;

	public void add(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	class A1 {
		private int y=0;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = 55;
		}

		public A1() {
			super();
			this.y = 55;
		}
		
	}
	
	private A1 a1;

	public A1 getA1() {
		return a1;
	}

	public void setA1(A1 a1) {
		this.a1.y = 56;
	}

	public static void main(String[] args) {
		A a = new A();
//		A.A1 a1 = a.new A1();
//		a.a1.setY(3);
		a.getA1().setY(3);
		
		System.out.println(a.getA1().getY());
	}
}
