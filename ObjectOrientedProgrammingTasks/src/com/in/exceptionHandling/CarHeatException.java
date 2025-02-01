package com.in.exceptionHandling;

@SuppressWarnings("serial")
public class CarHeatException extends Exception {
	public CarHeatException() {
		
	}
	
	public CarHeatException(String number)
	{
		super(number);
	}

}
