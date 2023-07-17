package com.citibank.main;
import com.citibank.domain.*;

import java.util.Scanner;

public class AccountmainV5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input Details
				Scanner scanner = new Scanner(System.in);
				SavingsAccount account = null;
				int number, choice;
				String name, salAccChoice, proceed;
				double balance, amount;
				boolean isSalary = false;
				System.out.println(" Enter Account Number");
				number = scanner.nextInt();
				scanner.nextLine();
				System.out.println(" Enter Account Name");
				name = scanner.nextLine();
				System.out.println(" Enter Account balance");
				balance = scanner.nextDouble();
				System.out.println("Do you want to open Salary Account");
				salAccChoice = scanner.next();
				if(salAccChoice.equalsIgnoreCase("yes")) {
					isSalary = true;
					System.out.println("You are opening Salary Account");
				}
				account = new SavingsAccount(number, name, balance, isSalary);
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


