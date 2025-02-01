package com.nt.bank;

import java.util.Scanner;

//Execute Level Class
public class BankApplication {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please select the Account Type :");
		System.out.println("1) Saving Account\r\n"
				+ "        2) Current Account\r\n"
				+ "        3) Fixed Deposit Account\r\n"
				+ "");
		
		int number=sc.nextInt();
		System.out.println("Enter account Holder Name :");
		String name=sc.next();
		System.out.println("Enter account Number :");
		String acNumber=sc.next();
		System.out.println("Enter the Amount");
		double amount=sc.nextDouble();
		
		switch(number) {
		case 1:
			SavingsAccount savings=new SavingsAccount(name,acNumber,amount);
			               savings.dispayAcountDetails();   
			
			
		}
		
		
	}

}
