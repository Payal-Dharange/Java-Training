package com.citibank.main;

public class ProcessStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		int count;
		ProcessString upperCase = ((inputString) -> inputString.toUpperCase());
		result = upperCase.doProcess("hi");
		System.out.println(result);
		
//		ProcessString lengthOfString = (inputString -> inputString);
//		count = (int) (lengthOfString.doProcess("lambdaExpression")).length();
//		System.out.println("Length of supplied string is " + count);
		ProcessString lengthOfString = (inputString -> "Length of Supplied string is " + inputString.length());
		System.out.println(lengthOfString.doProcess("LambdaExpression"));
		
		ProcessString printData = ((inputString) -> inputString.repeat(4));
		result = printData.doProcess("Hi");
		System.out.println(result);
	}

}
