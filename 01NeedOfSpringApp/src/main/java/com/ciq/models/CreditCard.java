package com.ciq.models;

public class CreditCard implements BankCard {

	public void doPayment(long amount) {
		System.out.println("paying amount using Credit Card... " + amount);

	}

}
