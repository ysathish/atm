 package com.in.exceptionHandling;

//import java.util.Scanner;

public class CarUser {
	

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter your input:");
//		String stop=sc.next();
//		System.out.println("enter your input:");
//		String puncture=sc.next();
//		
//		System.out.println("enter your input:");
//		int heat=sc.nextInt();
		
		try
		{
//			CarTest.stop("go");
			//CarTest.pucture("not punctured");
			CarTest.carHeat(40);
			CarTest.stop("stop");
			CarTest.pucture("punctured");
//			CarTest.carHeat(60);
		}
		
		catch(CarStoppedException e)
		{
			System.err.println(e);
		}
		catch(CarPunctureException e)
		{
			
		}
		catch(CarHeatException e)
		{
			System.err.println(e);
		}
		
		
		
		
		
	}

}
