package com.citibank.facory;
import com.citibank.domain.*;
import com.citibank.main.*;
import java.util.Scanner;

public class CurrentAccountFactory {
	public Account CreateAccount(int choice, int number, String name, double balance, boolean isSalary, double overdraftLim ) {
		switch (choice) {
		case 1:
			return new SavingsAccount(number, name, balance, isSalary);
		case 2:			
			return new CurrentAccount(number, name, balance, overdraftLim);
		default :
			return null;
		}
	   }
}

