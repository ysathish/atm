package com.depositor.drawer;

import java.util.Scanner;

public class ATMMachine {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial account balance: ");
        int initialBalance = scanner.nextInt();

//        Account account = new Account();
//        account.deposit(initialBalance); // Set initial balance

        // Create depositor and drawer threads
     /*   Depositor depositor = new Depositor(account, scanner);
        Drawer drawer = new Drawer(account, scanner);

        // Naming the threads
        depositor.setName("Depositor-Thread");
        drawer.setName("Drawer-Thread");

        // Start both threads
        depositor.start();
        drawer.start();

        // Wait for threads to finish
        try {
            depositor.join();
            drawer.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All transactions are complete!");
        scanner.close();*/
    }
}
