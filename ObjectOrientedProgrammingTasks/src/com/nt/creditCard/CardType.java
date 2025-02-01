package com.nt.creditCard;

public class CardType {
	private Customer customer;
	private String cardType;
	public CardType(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CardType [the customer " + customer.toString() + ", Is eligible for " + cardType + "]";
	}
	

}
