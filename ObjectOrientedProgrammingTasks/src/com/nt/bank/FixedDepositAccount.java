package com.nt.bank;

public class FixedDepositAccount extends BankAccount {
	protected double interestRate = 6.5;
	protected int depositTerm  ;
	public FixedDepositAccount(String accountHolderName,
			String accountNumber, 
			double balance,
			int depositTerm) {
		super(accountHolderName, accountNumber, balance);
		System.out.println("depoist can't be negative");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		super.calculateInterest();
		double annualInterestRate=(balance*(interestRate/100)*depositTerm);
		System.out.println("fixed interset rate for:"+balance+" years of interest is "+annualInterestRate);
	}
	public void dispayAcountDetails() {
		System.out.println("accountHolderName is :"+accountHolderName);
		System.out.println("accountNumber:"+accountNumber);
		System.out.println("balance:"+balance);
		calculateInterest();
		
	}
	

	
	
	  

}
