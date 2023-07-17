package com.citibank.domain;

public class SavingsAccount extends Account {
	private double minimumBal= 1500.00;
	private boolean isSalary;
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
		System.out.println("Savings class degfault constructor");
	}
	public SavingsAccount(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
	}
	public double getMinimumBal() {
		return minimumBal;
	}
	public void setMinimumBal(double minimumBal) {
		this.minimumBal = minimumBal;
	}
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(isSalary)
		{
			if (amount <= getBalance()) {
				setBalance(getBalance() - amount);
				return true;			
		} }
		else {
			System.out.println("No salaried");
			if (amount <= getBalance()){
				if ((getBalance()- amount) >= minimumBal) {
					setBalance(getBalance() - amount);
				    return true;
			}
		
		}
		}
			return false;	
	}
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
		setBalance(getBalance()+amount);
		return true;
		}
		return false;
	}
}
