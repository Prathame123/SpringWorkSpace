package com.dp.factory;

import com.dp.strategy.CreditCardPayment;
import com.dp.strategy.DebitCardPayment;
import com.dp.strategy.PaymentStrategy;
import com.dp.strategy.UpiPayment;
import com.dp.strategy.WalletPayment;

public class PaymentFactory {
	public static PaymentStrategy MakePayment(String type)
	{
		switch (type.toLowerCase()) 
		{
			case "credit": 
			{
				return new CreditCardPayment("7894563217418529", "125");
			}
			case "debit": 
			{
				return new DebitCardPayment("9876543217418529", "825");
			}
			case "upi": 
			{
				return new UpiPayment("7507854563@upi");
			}
			case "wallet": 
			{
				return new WalletPayment("456321789963",785.2);
			}
		default:	
			throw new IllegalArgumentException("Unexpected value: " + type.toLowerCase());
		}
	}
	
}
