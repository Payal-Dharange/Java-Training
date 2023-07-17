package com.citibank.main;
import com.citibank.domain.Account;

public class AccountMain {
  public static void main(String args[]) {
	  System.out.println("Main Start");
	  Account account = new Account();
	  account.setAccountNumber(101);
	  account.setName("Payal");
	  account.setBalance(1000);
	  
	  System.out.println("Account Number" + account.getAccountNumber());
	  System.out.println("Account Name" + account.getName());
	  System.out.println("Account balance" + account.getBalance());
	  
	  Account account2 = new Account();
	  account2.setBalance(2000);
	  account2.setName("payal Dharange");
	  account2.setAccountNumber(100);
	  
	  System.out.println("Account Number" + account2.getAccountNumber());
	  System.out.println("Account Name" + account2.getName());
	  System.out.println("Account balance" + account2.getBalance());
	  
	  	  
	  System.out.println("Main End");
}
}
