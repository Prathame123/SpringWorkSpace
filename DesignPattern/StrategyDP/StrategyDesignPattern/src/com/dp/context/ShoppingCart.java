package com.dp.context;

import com.dp.strategy.PaymentStrategy;

public class ShoppingCart {
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void checkOut(double ammount)
	{
		if(paymentStrategy != null)
		{
			paymentStrategy.pay(ammount);
		}
		else
		{
			System.out.println("No payment method selected");
		}
	}
}
