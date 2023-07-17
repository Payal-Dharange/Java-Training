package com.citibank.domain;

public class Account {
	private double balance = 10000.00;
	public synchronized void deposit(double amount) {
		if (amount > 0) {
			System.out.println("Balance before depositing " + amount + " is " + balance);
			balance += amount;
			System.out.println("Balance after depositing " + amount + " is " + balance);
			notify();
		}
		
	}
	public synchronized void withdraw(double amount) {
		if(amount > 0) {
			if (amount > balance) {
				try {
					System.out.println("Less balance waiting for deposit !!");
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Balance before withdrawing " + amount + " is " + balance);
			balance -= amount;
			System.out.println("Balance after withdrawing " + amount + " is " + balance);
		}
	}
}
