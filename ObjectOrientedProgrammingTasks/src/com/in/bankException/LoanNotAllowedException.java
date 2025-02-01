package com.in.bankException;

@SuppressWarnings("serial")
public class LoanNotAllowedException extends Exception {
    public LoanNotAllowedException()
    {
    	super();
    }
    public LoanNotAllowedException(String errorMessage)
    {
    	super(errorMessage);
    	
    	
    }
}
