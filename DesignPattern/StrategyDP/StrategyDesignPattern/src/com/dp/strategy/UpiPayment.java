package com.dp.strategy;

public class UpiPayment implements PaymentStrategy {
	
	private String upiId;
	
	public UpiPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	@Override
	public boolean validateDetails() {
		return upiId.contains("@upi");
	}

	@Override
	public void pay(double ammount) {
		if(validateDetails())
		{
			System.out.println("Processing UPI payment of $"+ ammount+ " for UPI Id "+ upiId);
		}	
		else
		{
			System.out.println("Invalid UPI ID");
		}
	}
}
