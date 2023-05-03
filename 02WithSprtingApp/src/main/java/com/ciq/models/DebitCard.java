package com.ciq.models;

public class DebitCard implements BankCard {

	public void doPayment(long amount) {
		System.out.println("paying amount using Debit Card... " + amount);
	}

}
