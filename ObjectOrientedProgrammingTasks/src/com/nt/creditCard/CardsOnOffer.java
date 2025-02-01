package com.nt.creditCard;

public class CardsOnOffer {
	public static CardType getOfferedCard(Customer customer) {
		int points=customer.getCreditPoints();
		String cardType;
		
		if(points<100) {
			cardType="emi";
		}
		else if(points>=100 &&points<=500) {
			cardType="silver";
		}
		else if(points>=500 && points<=1000) {
			cardType="gold";
			
		}
		else  {
			cardType="platinum";
		}
		
		return new CardType(customer,cardType);
		
	}

}
