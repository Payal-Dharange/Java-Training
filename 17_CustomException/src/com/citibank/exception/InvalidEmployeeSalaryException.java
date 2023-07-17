package com.citibank.exception;

//public class InvalidEmployeeSalaryException extends RuntimeException{
public class InvalidEmployeeSalaryException extends Throwable {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Salary must be > 0";
	}
}
