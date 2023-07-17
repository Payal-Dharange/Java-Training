package com.citibank.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculations {
	private int num1, num2, result;
	
	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("accept() start");
		
		System.out.println("Enter num1");
		num1 = scanner.nextInt();
		System.out.println("Enter num2");
		num2 = scanner.nextInt();
		System.out.println("accept() end");
		}
		catch(InputMismatchException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Input from user");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("I am here");
			scanner.close();
		}
	}
	
	public int acceptandcalculate() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("accept() start");
			System.out.println("Enter num1");
			num1 = scanner.nextInt();
			System.out.println("Enter num2");
			num2 = scanner.nextInt();
			System.out.println("accept() end");
			System.out.println("calculate() start");
			result = num1 + num2;
			System.out.println("calculate() end");
			return result;
			}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input from user");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
			scanner.close();
		}
		return 0;
	}
	public void display() {
		System.out.println("display() start");
		System.out.println("Reult is :: " + result);
		System.out.println("display() end");
	}
}
