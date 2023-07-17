package com.citibank.domain;

public class B extends A{
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor of B");
	}
	
	public B(int x) {
		// TODO Auto-generated constructor stub
		super(x);
		System.out.println("Default constructor of B " + x);
		
	}
	
}
