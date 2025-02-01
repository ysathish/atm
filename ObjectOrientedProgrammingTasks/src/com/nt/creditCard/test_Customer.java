package com.nt.creditCard;

import java.util.Scanner;

public class test_Customer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name:");
		String name=sc.next();
		System.out.println("enter points:");
		int points=sc.nextInt();
		
		Customer customer=new Customer(name,points);
		CardType cards=CardsOnOffer.getOfferedCard(customer);
		System.out.println(cards);
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
