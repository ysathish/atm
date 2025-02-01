package com.in.bankException;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {
		super();
	}
	public InsufficientFundsException(String errorMessage) {
		super(errorMessage);
	}
	
	
	

}
