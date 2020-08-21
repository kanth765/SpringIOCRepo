package com.vidvaan.network.bean;

public class Xoami {
	private Network network;

	public void setNetwork(Network network) {
		this.network = network;
	}

	public void connectNetwork() {
		network.calls();
		network.data();
		network.sms();
	}

}
