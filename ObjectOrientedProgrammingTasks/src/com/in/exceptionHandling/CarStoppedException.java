package com.in.exceptionHandling;

@SuppressWarnings("serial")
public class CarStoppedException extends Exception {
	public CarStoppedException() {

	}

	public CarStoppedException(String errorMessage) 
	{
		super(errorMessage);


	}
}


