package com.citibank.main;

import com.citibank.calc.Square;
import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//User Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		System.out.println("Number entered " + number);
		Square square = new Square();
		int ret = square.calculateSquare(number);
		System.out.println("Square of " + number + " is " + ret);
		
	}

}
