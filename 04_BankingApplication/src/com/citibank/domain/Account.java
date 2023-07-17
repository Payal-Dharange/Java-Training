package com.citibank.domain;

public class Account {
	// Variables
	
	private int accountNumber;
	private String name;
	private double balance;
	public Account() {
		System.out.println("contrsuctor called");
	}
	public Account(int accountNumber, String name, double balance) {
		System.out.println("overloaded contrsuctor with 3 parms called");
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int accountNumber, String name) {
		System.out.println("overloaded contrsuctor with 2 parms called");
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}
}
