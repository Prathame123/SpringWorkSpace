package com.dp.strategy;

public interface PaymentStrategy {
	boolean validateDetails();
	void pay(double ammount);
}
