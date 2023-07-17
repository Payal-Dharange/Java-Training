package com.citibank.domain;

public class CurrentAccount extends Account {
	double overdraftbalance, curOverBalLim;
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
		System.out.println("Current class default constructor");
	}
	public CurrentAccount(int accountNumber, String name, double balance, double overdraftbalance) {
		super(accountNumber, name, balance);
		this.overdraftbalance = overdraftbalance;
		curOverBalLim = overdraftbalance;
	}
	public double getOverdraftbalance() {
		return overdraftbalance;
	}
	public void setOverdraftbalance(double overdraftbalance) {
		this.overdraftbalance = overdraftbalance;
	}
     
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount <= getBalance() && amount > 0)
		{
			setBalance(getBalance() - amount);
			return true;
		}
		if ( amount > getBalance() && amount < getBalance() + overdraftbalance)
		{
			amount -= getBalance();
			setBalance(0);
			overdraftbalance -= amount;
			return true;
		}
		return false;
	}
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if ((amount > 0 ) && (overdraftbalance < curOverBalLim )) {
			overdraftbalance += amount;
			if (overdraftbalance > curOverBalLim )
			{
				amount = overdraftbalance - curOverBalLim;
				overdraftbalance -= amount;
				setBalance(getBalance() + amount);
			}
			return true;
		}
		if ((amount > 0 ) && (overdraftbalance == curOverBalLim ))
		{
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
	
	

}
