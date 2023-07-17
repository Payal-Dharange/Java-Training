package com.citibank.main;
import java.util.Scanner;
import com.citibank.domain.*;
import com.citibank.factory.ShapesFactory;
import com.citibank.factory.*;

public class ShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shape = null;
		ShapesFactory shapesfactory = null;
		Scanner scanner = new Scanner(System.in);
		int shapeschoice;
		System.out.println("Menu");
		System.out.println("1. Circle");
		System.out.println("1. Triangle");
		System.out.println("1. Line");
		System.out.println("Enter your choice");
		shapeschoice = scanner.nextInt();
		shapesfactory = new ShapesFactory();
		shape = shapesfactory.createShape(shapeschoice);
		if (shape != null)
			shape.draw();
		else
			System.out.println("Invalid choice of shape");
	}

}
