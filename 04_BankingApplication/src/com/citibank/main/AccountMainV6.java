package com.citibank.main;
import com.citibank.domain.*;

import java.util.Scanner;

public class AccountMainV6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CurrentAccount account = null;
		int number, choice;
		String name, salAccChoice, proceed;
		double balance, amount, overdraftLim;
		boolean isSalary = false;
		System.out.println(" Enter Account Number");
		number = scanner.nextInt();
		scanner.nextLine();
		System.out.println(" Enter Account Name");
		name = scanner.nextLine();
		System.out.println(" Enter Account balance");
		balance = scanner.nextDouble();
		System.out.println("Enter overdraft limit");
		overdraftLim = scanner.nextDouble();
		
		account = new CurrentAccount(number, name, balance, overdraftLim);
		// Give Menu
		do {
			System.out.println("Menu");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Display Balance");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		switch(choice){
		case 1:
			System.out.println("You have selected withdraw");
			System.out.println("Enter amount");
			amount = scanner.nextDouble();
			if(account.withdraw(amount)) {
				System.out.println("Succ tran");
				System.out.println("balance - " + account.getBalance() + "Overdraft - " + account.getOverdraftbalance());}
			else {
				System.out.println("Fail tran");
				System.out.println("balance - " + account.getBalance() + "Overdraft - " + account.getOverdraftbalance());}
			break;
		case 2:
			System.out.println("You have selected deposit");
			System.out.println("Enter amount");
			amount = scanner.nextDouble();
			if(account.deposit(amount)) {
				System.out.println("Succ tran");
				System.out.println("balance - " + account.getBalance() + "Overdraft - " + account.getOverdraftbalance());}
			else
			{ System.out.println("Fail tran");
				System.out.println("balance - " + account.getBalance() + "Overdraft - " + account.getOverdraftbalance());
			}
			break;
		case 3:
			System.out.println("balance - " + account.getBalance() + "Overdraft - " + account.getOverdraftbalance());
			break;
		default:
			System.out.println("Select correct choice");
		}
		System.out.println("Do you want continue : Select Yes or No");
		proceed = scanner.next();
		}while(proceed.equalsIgnoreCase("yes"));
		if (proceed.equalsIgnoreCase("no"))
			System.out.println("You have selected " + proceed);
		System.out.println("Thanks for visiting");

	}

}
