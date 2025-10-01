package com.dp.strategy;

public class CreditCardPayment implements PaymentStrategy {

	private String cardNumber;
	private String cvv;
	
	public CreditCardPayment(String cardNumber, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}

	@Override
	public boolean validateDetails() {
		return cardNumber.length() == 16 && cvv.length() == 3;
	}
	
	@Override
	public void pay(double ammount) {
		if(validateDetails())
		{
			System.out.println("Processing credit card payment of $"+ ammount+ " for card "+ cardNumber);
		}	
		else
		{
			System.out.println("Invalid credit card number");
		}
	}
}