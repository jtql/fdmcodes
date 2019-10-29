package com.fdmgroup.moreInterfacesandInnerClass;

public class toPrint implements Printable {

	@Override
	public void printAll(String name) {
		System.out.println("name is: " + name);

	}

	@Override
	public void printWithDeco() {
		// TODO Auto-generated method stub

	}

	// innerclass of toPrint
	class Book {
		private String bName;

		public Book(String bName) {
			super();
			this.bName = bName;
		}

		public String getbName() {
			return bName;
		}

		public void setbName(String bName) {
			this.bName = bName;
		}
	}

	class Magazine {
		private String mName;

		public Magazine(String mName) {
			super();
			this.mName = mName;
		}

		public String getmName() {
			return mName;
		}

		public void setmName(String mName) {
			this.mName = mName;
		}

	}

	public static void main(String[] args) {
		toPrint tp = new toPrint();
		Printable pr; // interface reference pointing to null

		// Initialising sub class
		Newspaper np = new Newspaper("Today");

		toPrint.Book book = tp.new Book("Java"); // Initialising inner class
		toPrint.Magazine mag = tp.new Magazine("8days"); // Initialising inner class

		pr = new toPrint(); // interface is referencing toPrint

		pr.printAll(book.getbName());
		pr.printAll(mag.getmName());
		pr.printAll(np.getnName());

	}
}
