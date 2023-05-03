package com.ciq.models;

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
		BankCard bankCard = new DebitCard();
		ShoppingMall pvrMall = new ShoppingMall(bankCard);
		pvrMall.doTransaction(2000l);

	}

}
