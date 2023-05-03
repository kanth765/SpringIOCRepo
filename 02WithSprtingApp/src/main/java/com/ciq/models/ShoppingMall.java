package com.ciq.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		BankCard bankCard = (BankCard) container.getBean("debit");

		ShoppingMall pvrMall = new ShoppingMall(bankCard);
		pvrMall.doTransaction(2000l);

	}

}
