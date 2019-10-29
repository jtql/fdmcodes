package fundamentals;

public class DatatypesDemo {

	public static void main(String[] args) {
		System.out.println("Primitives");

		// Literals
		boolean result = true;
		char capitalC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 90000;

		// integer values
		int decVal = 26;
		int hexVal = 0x1a;
		int binVal = 0b110101;

		// floating iterals
		float f1 = 123.4f;
		float f2 = 123.4F;
		float f3 = 0.1234e3f;

		double d1 = 1234.5d;
		double d2 = 123.4D;
		double d3 = 0.123e4d;

		// character and string literals
		char backspace = '\b';
		char tab = '\t';
		char carriageReturn = '\r';
		char linefeed = '\n';
		char backslash = '\\';

		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

//		System.out.println("Literals");
//		System.out.println("result: " + result);
//		System.out.println("char capitalC: " + capitalC);
//		System.out.println("byte b and short s: " + b + s);
//		System.out.println("i: " + i);
//		System.out.println("f1, f2 , f3: "+f1 +"," +f2 +"," +f3);
//		System.out.println("f1, f2 , f3: "+decVal +"," +hexVal +"," +binVal);
//		System.out.println("d1, d2 , d3: "+d1 +"," +d2 +"," +d3);
//		System.out.println("backspace: "+backspace);
//		System.out.println("tab: "+tab);
//		System.out.println("carriageReturn: "+carriageReturn);
//		System.out.println("linefeed: "+linefeed);
//		System.out.println("backslash: "+backslash);
		//System.out.println("s1, s2: "+s1 /+"," +s2);
	}

}
