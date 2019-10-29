package com.fdmgroup.exception;

import java.util.Scanner;

public class myExceptionApp {
	
	private static void demoNumberFormatException() {
		System.out.println("Demo on NumberFormat Exception");
		String myString = "exception 1";
		Integer.parseInt(myString);
	}
	
	private static void demoClassCastException() {
		System.out.println("Demo on ClassCast Exception");
		Exception except = new Exception("raw Exception");
		
		@SuppressWarnings("unused")
		FirstExceptionType firstexceptiontype = (FirstExceptionType)except;
	}
	
	@SuppressWarnings("null")
	private static void nullPointerException() {
		System.out.println("Demo on NullPointer Exception");
		FirstExceptionType firstexceptiontype=null;
		firstexceptiontype.getMessage();
	}
	
	@SuppressWarnings("unused")
	private static void demoArithmeticException() {
		System.out.println("demo on Arithmetic Exception");
		int i=42;
		int result=i/0;
	}
	
	@SuppressWarnings("unused")
	private static void demoIndexOutOfBoundsException() {
		System.out.println("demo on IndexOutOfBounds Exception");
		int[] intArray = new int[3];
		int result = intArray[4];
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Exception Tester");
		System.out.println("Key in Options from 1 to 9:");
		System.out.println("1 - FirstExceptionType");
		System.out.println("2 - SecondExceptionType");
		System.out.println("3 - ThirdExceptionType");
		System.out.println("4 - NumberExceptionType");
		System.out.println("5 - ClassCastExceptionType");
		System.out.println("6 - NullPointerExceptionType");
		System.out.println("7 - ArithmeticExceptionType");
		System.out.println("8 - IndexOutOfExceptionType");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			if(scanner.hasNext()) {
				String option = scanner.nextLine();
				if(option.equals("q")) {
					System.out.println("Done with Exceptions");
					break;
				}
				else if(option.matches("\\d+")) {
					int selection = Integer.parseInt(option);
					handle_it(selection);
					Thread.sleep(25); //ms
					
				}
			}
			
		}
		scanner.close();
	}

	private static void handle_it(int selection) {
		try {
			tester(selection);
			
		}
		catch(FirstExceptionType | SecondExceptionType e1) {
			System.out.println("My Exception message: "+e1.getMessage());
		}
		catch(ThirdExceptionType e2) {
			System.out.println("My Exception message: "+e2.getMessage());
		}
		catch(RuntimeException re) {
			System.out.println("My Exception message: "+re.getMessage());
		}
		finally {
			
		}
		
	}

	private static void tester(int selection) throws FirstExceptionType, SecondExceptionType, ThirdExceptionType{
		switch(selection) {
		case 1:
			System.out.println("Throwing First Exception");
			throw new FirstExceptionType("Error : FirstExceptionType");
		case 2:
			System.out.println("Throwing Second Exception");
			throw new SecondExceptionType("Error : SecondExceptionType");
		case 3:
			System.out.println("Throwing Third Exception");
			throw new FirstExceptionType("Error : ThirdExceptionType");
		case 4:
			demoNumberFormatException();
			break;
		case 5:
			demoClassCastException();
			break;
		case 6:
			nullPointerException();
			break;
		case 7:
			demoArithmeticException();
			break;
		case 8:
			demoIndexOutOfBoundsException();
			break;
		default:
			System.out.println("Unknown exception triggered");
			break;
		}
		
	}
}
