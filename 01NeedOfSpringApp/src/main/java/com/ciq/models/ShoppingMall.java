package com.ciq.models;

import com.ciq.container.CardContainer;

public class ShoppingMall {

	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doTransaction(long amount) {
		bankCard.doPayment(amount);
	}

	public static void main(String[] args) {
//		new CreditCard();
//		BankCard bankCard = new DebitCard();
		CardContainer container = new CardContainer();
		BankCard bankCard = (BankCard) container.getContainer("debit");

		ShoppingMall pvrMall = new ShoppingMall(bankCard);
		pvrMall.doTransaction(2000l);

	}

}
