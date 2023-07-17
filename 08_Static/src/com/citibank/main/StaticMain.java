package com.citibank.main;

import com.citibank.domain.MyClass;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass = new MyClass();
		myclass.display();
		System.out.println("--------------------------");
		MyClass myclass2 = new MyClass();
		myclass2.display();
		System.out.println("Class - " + MyClass.number2);
		myclass.number2 += myclass2.number2;
		System.out.println("Object - " + myclass2.number2);
	}

}
