package com.Exception;

public class Unchecked {

	public static void main(String[] args) {
		System.out.println("Program Started");

	try {
		int x =10/0;
		System.out.println("Division Result is : "+x);
	}
	catch(ArithmeticException e) {
		System.out.println("Something went wrong.Please check the exception"+ e.getMessage());
	}
	System.out.println("Program End");
	}

}
