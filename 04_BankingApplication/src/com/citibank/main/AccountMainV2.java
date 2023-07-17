package com.citibank.main;

import com.citibank.domain.Account;
import java.util.Scanner;

public class AccountMainV2 {
	public static void main(String[] args) {
		// Input from user
		System.out.println("Main Start");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Account Number, name and balance");
//		int number = scanner.nextInt();
//		String name = scanner.next();
		double balance = scanner.nextDouble();

		Account account = new Account();
//		account.setAccountNumber(number);
//		account.setName(name);
		account.setBalance(balance);

//		System.out.println("Account Number" + account.getAccountNumber());
//		System.out.println("Account Name" + account.getName());
		System.out.println("Account balance" + account.getBalance());

//		System.out.println("Enter Account Number, name and balance");
//		int number1 = scanner.nextInt();
//		String name1 = scanner.next();
//		double balance1 = scanner.nextDouble();
		
//		Account account2 = new Account();
//		account2.setBalance(balance1);
//		account2.setName(name1);
//		account2.setAccountNumber(number1);
//
//		System.out.println("Account Number" + account2.getAccountNumber());
//		System.out.println("Account Name" + account2.getName());
//		System.out.println("Account balance" + account2.getBalance());
		if(account.deposit(balance))
			System.out.println("transaction succ - " + account.getBalance());
		else
			System.out.println("transaction failed - " + account.getBalance());
		
		double balance1 = scanner.nextDouble();
//		account.setBalance(balance1);

		System.out.println("Withdraw amount" + account.getBalance());
		
		if(account.withdraw(balance1))
			System.out.println("transaction succ - " + account.getBalance());
		else
			System.out.println("transaction failed - " + account.getBalance());
		System.out.println("Main End");
	}
}
