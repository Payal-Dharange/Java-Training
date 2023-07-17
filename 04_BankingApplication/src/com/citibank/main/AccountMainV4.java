package com.citibank.main;
import com.citibank.domain.Account;
import java.util.Scanner;
public class AccountMainV4 {

	public static void main(String[] args) {
		// Input Details
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		int choice, number;
		String name, proceed;
		double amount;
		System.out.println(" Enter Account Number");
		number = scanner.nextInt();
		scanner.nextLine();
		System.out.println(" Enter Account Name");
		name = scanner.nextLine();
		
		// Call constructor to initialize variables
		account = new Account(number,name);
		System.out.println("Account Number - " + account.getAccountNumber());
		System.out.println("Account Name - " + account.getName());
		System.out.println("Account balance - " + account.getBalance());
		
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
			if(account.withdraw(amount))
				System.out.println("transaction succ - " + account.getBalance());
			else
				System.out.println("transaction failed - " + account.getBalance());
			break;
		case 2:
			System.out.println("You have selected deposit");
			System.out.println("Enter amount");
			amount = scanner.nextDouble();
			if(account.deposit(amount))
				System.out.println("transaction succ - " + account.getBalance());
			else
				System.out.println("transaction failed - " + account.getBalance());
			break;
		case 3:
			System.out.println("Account balance" + account.getBalance());
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