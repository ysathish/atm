package com.in.bankException;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception {
    public AccountNotFoundException()
    {
    	super();
    }
    public AccountNotFoundException(String errorMessage)
    {
    	super(errorMessage);
    }
}
