package com.depositor.drawer;

//import java.util.ArrayList;
//import java.util.List;

public class Account 
{
	private int balance = 0;
//	private static final Logger logger=Logger.getLogger(Account.class.getName());
//	private List<String> transactionHistory=new ArrayList<>();
	private final String username;
	private final String password;
	public Account(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	 public boolean authenticate(String username, String password) {
	        return this.username.equals(username) && (password.isEmpty() || this.password.equals(password));
	    }
    
	public synchronized void withdraw(int amount)
	{
		
		
		while(balance<amount)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
                Thread.currentThread().interrupt();
			}
			
		}
		balance=balance-amount;
//		String transaction="Withdrew: ₹" + amount + " | Remaining Balance: ₹" + balance;
//		transactionHistory.add(transaction);
//		System.out.println(transaction);
		notifyAll();
	}
	public synchronized void deposit(int amount)
	{
		
		balance+=amount;
//		String transaction="Deposited: ₹" + amount + " | Total Balance: ₹" + balance;
//		transactionHistory.add(transaction);
//		System.out.println(transaction);
		notify();
	}
	public synchronized int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
//	public synchronized List<String> getTransactionHistory() {
//		return new ArrayList<>(transactionHistory);
//	}
	public String getUsername() {
	    return username; // Assuming `username` is a field in the `Account` class
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	
	
}
