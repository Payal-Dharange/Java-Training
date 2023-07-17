package com.citibank.main;

import com.citibank.domain.Account;
import com.citibank.threads.DepositThread;
import com.citibank.threads.WithdrawThread;

public class TransactioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		WithdrawThread withdrawthread = new WithdrawThread(account, 15000);
		System.out.println("-----");
		DepositThread depositthread = new DepositThread(account, 3000);
		
	}

}
