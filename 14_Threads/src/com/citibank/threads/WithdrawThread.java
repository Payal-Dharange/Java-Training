package com.citibank.threads;

import com.citibank.domain.Account;

public class WithdrawThread implements Runnable{
	private Account account;
	private double amount;
	private Thread thread;
	
	public WithdrawThread(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;	
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		account.withdraw(amount);
	}

}
