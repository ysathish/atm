package com.in.bankException;
//unchechecked exception
@SuppressWarnings("serial")
public class InvalidAmountException extends RuntimeException {
  public InvalidAmountException()
  {
	  super();
  }
  public InvalidAmountException(String errorMessage)
  {
	  
  }
}
