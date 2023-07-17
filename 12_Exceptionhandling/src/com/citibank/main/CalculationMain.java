package com.citibank.main;

import com.citibank.domain.Calculations;

public class CalculationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations cal = new Calculations();
//		cal.accept();
		int result = cal.acceptandcalculate();
		System.out.println(result);
//		cal.display();
	}

}
