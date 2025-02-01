package com.nt.bank;

public class SavingsAccount extends BankAccount {
	protected double interestRate = 4.0;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	//blc logic
	public void calculateInterest() {
		// TODO Auto-generated method stub
		super.calculateInterest();
		double InterestRate=balance*(interestRate/100);
		System.out.println("savings interest rate is :"+InterestRate);
	}
	public void dispayAcountDetails() {
		System.out.println("accountHolderName is :"+accountHolderName);
		System.out.println("accountNumber:"+accountNumber);
		System.out.println("balance:"+balance);
		calculateInterest();
		
	}
	

}
