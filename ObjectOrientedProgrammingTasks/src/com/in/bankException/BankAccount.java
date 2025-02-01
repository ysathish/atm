package com.in.bankException;

public class BankAccount implements Bank
{
	@SuppressWarnings("unused")
	private long accountNumber;
	private double amount;

	public BankAccount() 
	{
		super();
	}
	public BankAccount(long accountNumber, double amount)
	{
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;

	}
	@Override
	public void deposit(double amount)
	{

		if(amount<=0)
		{
			throw new InvalidAmountException("\"Amount must be greater than zero.\"");
		}
		this.amount+=amount;
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount must be greater than zero.");
		}
		if(amount>this.amount)
		{
			throw new InsufficientFundsException("Insufficient balance");
		}
		this.amount-=amount;


	}
	@Override
	public void transfer(BankAccount toAccount, double amount)
			throws InsufficientFundsException, AccountNotFoundException
	{
		if(toAccount==null)
		{
			throw new AccountNotFoundException("Target account not found");
		}
		if(amount<=0)
		{
			throw new InvalidAmountException("\"Amount must be greater than zero.\"");
		}
		if(amount>this.amount)
		{
			throw new InsufficientFundsException("Insufficient balance");
		}
		this.withdraw(amount);
		toAccount.deposit(amount);  
		
		
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException
	{
		 if(this.amount<5000 || amount<50000)
		{
			throw new LoanNotAllowedException("your not eligible for loan");

		}
		 if(amount<=0)
			{
				throw new InvalidAmountException("\"Loan Amount must be greater than zero.\"");
			}
		 this.amount+=amount;
		

	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return amount;
	}
}
