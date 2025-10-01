package com.dp.strategy;

public class WalletPayment implements PaymentStrategy {

	private String walletId;
	private double balance;
	
	
	public WalletPayment(String walletId, double balance) {
		super();
		this.walletId = walletId;
		this.balance = balance;
	}

	@Override
	public boolean validateDetails() {
		return balance > 0;
	}

	@Override
	public void pay(double ammount) {
		if(validateDetails() && balance<= ammount) 
		{
			balance -= ammount;
			System.out.println("Paid $ "+ ammount+" Using wallet ID: "+ walletId+ " Remaining Balance:$ "+balance);
		}
		else
		{
			System.out.println("Insufficient walllet balance");
		}
	}

}
