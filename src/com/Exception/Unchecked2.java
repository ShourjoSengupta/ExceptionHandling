package com.Exception;

public class Unchecked2 {

	public static void main(String[] args) {
		try {
			int x =10/0;
			System.out.println("Division Result is : "+x);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Something went wrong.Please check the exception"+ e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}

	}

}
