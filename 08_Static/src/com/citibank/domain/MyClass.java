package com.citibank.domain;

import java.lang.constant.Constable;

public class MyClass {
	private int number1 = 10;
	public static int number2 = 10;
	
	public void display() {
		 System.out.println("No - Static " + number1);
		 System.out.println("static " + number2);
		 number1 = number1 + 10;
		 number2 = number2 + 10;
		 System.out.println("No - Static " + number1);
		 System.out.println("static " + number2);
	}
}
