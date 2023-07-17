package com.citibank.main;

public class CalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation divideCal = (double n1, double n2) -> {return n1/n2;};
		double result = divideCal.doCalculation(10, 2);
		System.out.println("Result is " + result);
		Calculation addCal = ((n1, n2) -> n1+n2);
		result = addCal.doCalculation(20, 40);
		System.out.println("Result is " + result);
		Calculation subCal = ((x, y) -> x-y);
		result = subCal.doCalculation(60, 40);
		System.out.println("Result is " + result);
		
	}

//	@Override
//	public double doCalculation(double n1, double n2) {
//		// TODO Auto-generated method stub
//		
//	}

}
