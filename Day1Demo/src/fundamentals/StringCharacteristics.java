package fundamentals;

public class StringCharacteristics {

	public static void main(String[] args) {
		String firstString = "Hello";
		String secondString = "Hello";
		System.out.println(firstString == secondString);
		System.out.println(firstString.equals(secondString));

		firstString = new String("Hello");
		secondString = new String("Hello");
		System.out.println(firstString == secondString);
		System.out.println(firstString.equals(secondString));

		String immutableString = "September";
		System.out.println("Init Value:" + immutableString);
		immutableString.concat(" October");
		System.out.println(immutableString.toUpperCase());
		System.out.println("Curr Value:" + immutableString);

		StringBuilder mutableString = new StringBuilder("November");
		System.out.println("mutableString : " + mutableString);

		mutableString.append(" December");
		System.out.println("CUrr Value:"+mutableString);
		
		StringBuffer stringBuffer=new StringBuffer("2019 year");
		System.out.println("Init Value of stringBuffer:"+stringBuffer);
		
		stringBuffer.append("is a good year");
		System.out.println("curr Value:"+stringBuffer);
		
	}

}
