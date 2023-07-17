package com.citibank.domain;

public class BlockDemo {
	private static int x =1;
	{
		System.out.println("non-static block called");
		System.out.println("");
	}
	public BlockDemo() {
		System.out.println("Default constructor called");
	}
	static {
		System.out.println("Static Block called");
	}
	public static void show() {
		System.out.println("Staic method called");
	}
	public static void display() {
		System.out.println("Non-Staic method called");
	}
}
