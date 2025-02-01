package com.in.bankException;

import java.util.Scanner;

//ELC
public class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BankAccount account1=new BankAccount(62223190188L,5000.00);
		BankAccount account2=new BankAccount(92223190188L,5094000.00);
		Customer sathish=new Customer("sathish",account2);
//		Customer shiva=new Customer("shiva",account2);
		BankAccount activeAccount1=sathish.getAccount();
//		BankAccount activeAccount2=shiva.getAccount();
		while (true) {
			System.out.println("\nSelect an option:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Transfer");
			System.out.println("4. Loan Application");
			System.out.println("5. Check Balance");
			System.out.println("6. Exit");
			System.out.print("Enter your option: ");

			int choice = sc.nextInt();
			try
			{
				switch(choice)
				{
				case 1:
					System.out.print("Enter deposit amount: ");
					double depositAmount = sc.nextDouble();
					activeAccount1.deposit(depositAmount);
					System.out.println("Deposit successful. New balance: " + activeAccount1.getBalance());
					break;
				case 2:
					System.out.println("Enter Withdraw: ");
					double withdraw=sc.nextDouble();
					activeAccount1.withdraw(withdraw);
					System.out.println("withdraw successful new balance:"+activeAccount1.getBalance());
					break;
				case 3:
					System.out.println("Enter Transfer amount:");
					double transfer=sc.nextDouble();
					activeAccount1.transfer(activeAccount1, transfer);
					System.out.println("Transaction is completed new balance:"+activeAccount1.getBalance());
					break;
				case 4: // Loan Application
                    System.out.print("Enter loan amount: ");
                    double loanAmount = sc.nextDouble();
                    activeAccount1.applyForLoan(loanAmount);
                    System.out.println("Loan approved. New balance: " + activeAccount1.getBalance());
                    break;

                case 5: // Check Balance
                    System.out.println("Current balance: " + activeAccount1.getBalance());
                    break;

                case 6: // Exit
                    System.out.println("Thank you for using the bank application!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

				}
			

				catch (InvalidAmountException | InsufficientFundsException | AccountNotFoundException | LoanNotAllowedException e)
				{
					System.out.println("Error: " + e.getMessage());

				}
			
		}
	}
}






