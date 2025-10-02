package com.dp.test;

import com.dp.factory.PaymentFactory;
import com.dp.strategy.PaymentStrategy;

public class StrategyDpTest {

	public static void main(String[] args) {
		
		PaymentStrategy payment = PaymentFactory.MakePayment("wallet");
		payment.pay(15.2);
	}
}
