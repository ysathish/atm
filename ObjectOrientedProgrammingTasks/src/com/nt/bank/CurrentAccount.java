package com.nt.bank;

public class CurrentAccount extends BankAccount 
{
	
	protected double overdraftLimit = 5000.0;

	public CurrentAccount(String accountHolderName, String accountNumber, double balance)
	{
		super(accountHolderName, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateInterest()
	{
		// TODO Auto-generated method stub
		super.calculateInterest();
		System.out.println("Current accounts do not earn interest");
	}
	public void checkOverdraftLimit()
	{
		System.out.println("over draft amount:"+overdraftLimit);
	}
	
}
