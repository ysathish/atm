package com.nt.bank;

//Business Logic Class

public class BankAccount {
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE="SBIN000408";
	
	public BankAccount() 
	{
		
	}
	public BankAccount(String accountHolderName, String accountNumber, double balance) 
	{
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void calculateInterest()
	{
		System.out.println("interest rate is 10%");
	}
	public void displayAccountDetails()
	{
		System.out.println("test 1");
	}
	
    
}
