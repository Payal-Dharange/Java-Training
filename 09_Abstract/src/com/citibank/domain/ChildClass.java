package com.citibank.domain;

public class ChildClass extends MyClass{
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("default constrauctor of ChildClass");
	}
	public void show() {
		super.show();
		System.out.println("In ChildClass show");
	}
}
