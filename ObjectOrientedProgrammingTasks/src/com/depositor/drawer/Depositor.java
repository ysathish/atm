package com.depositor.drawer;

import java.util.Scanner;

//BLC class
public class Depositor extends Thread
{
	 private final Account account;

	    public Depositor(Account account) {
	        this.account = account;
	    }

	    @Override
	    public void run() {
	        int[] deposits = {500, 1000, 2000, 3000};
	        for (int amount : deposits) {
	            account.deposit(amount);
	            try {
	                Thread.sleep(1000); // Simulate delay
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }
	}