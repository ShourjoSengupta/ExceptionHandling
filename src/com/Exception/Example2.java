package com.Exception;

public class Example2 {
	int x=143;
	public void m1() {
		System.out.println(x);
	}

	public static void main(String[] args) throws InterruptedException{
		Example2 obj = new Example2();
		obj.m1();
		Thread.sleep(0);
	}

}
