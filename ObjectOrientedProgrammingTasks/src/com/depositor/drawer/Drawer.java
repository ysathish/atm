package com.depositor.drawer;

import java.util.Scanner;

//BLC class
public class Drawer extends Thread
{
	 private final Account account;

	    public Drawer(Account account) {
	        this.account = account;
	    }

	    @Override
	    public void run() {
	        int[] withdrawals = {300, 700, 1200, 500};
	        for (int amount : withdrawals) {
	            account.withdraw(amount);
	            try {
	                Thread.sleep(1000); // Simulate delay
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }
	}