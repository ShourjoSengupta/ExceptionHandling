package com.Exception;

public class Example1 {
	int a=10;
	public void m1() {
		System.out.println("a="+a);
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.m1();
		
		try {
			Thread.sleep(1000);
			
		} catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}
