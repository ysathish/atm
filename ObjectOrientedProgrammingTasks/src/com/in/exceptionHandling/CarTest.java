package com.in.exceptionHandling;

public class CarTest {
	
	public static  void  stop(String stop) throws CarStoppedException
	{
		if(stop=="stop") {
		throw new CarStoppedException("Car stopped for some reason.");
		}
		else {
			System.out.println("car not started");
		}
	}

	public static void  pucture(String pucture) throws CarPunctureException
	{
		if(pucture=="puncture")
		{
		throw new CarPunctureException("Car is punctured"); 
		}
		else 
		{
			System.out.println("car not punctured");
		}

	}

	public static void carHeat(int heat)throws CarHeatException
	{
		if(heat==60)
		{
			throw new CarHeatException("Car is heated more than 50 degrees Celsius");
		}
		else
		{
			System.out.println("car temperature is normal");
		}
		
	}
}





